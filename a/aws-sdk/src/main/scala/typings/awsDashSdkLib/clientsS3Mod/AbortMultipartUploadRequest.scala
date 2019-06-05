package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortMultipartUploadRequest extends js.Object {
  /**
    * Name of the bucket to which the multipart upload was initiated.
    */
  var Bucket: BucketName
  /**
    * Key of the object for which the multipart upload was initiated.
    */
  var Key: ObjectKey
  var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
  /**
    * Upload ID that identifies the multipart upload.
    */
  var UploadId: MultipartUploadId
}

object AbortMultipartUploadRequest {
  @scala.inline
  def apply(Bucket: BucketName, Key: ObjectKey, UploadId: MultipartUploadId, RequestPayer: RequestPayer = null): AbortMultipartUploadRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Key = Key, UploadId = UploadId)
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortMultipartUploadRequest]
  }
}

