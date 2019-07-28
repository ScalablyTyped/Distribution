package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompleteMultipartUploadRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * 
    */
  var Key: ObjectKey
  /**
    * 
    */
  var MultipartUpload: js.UndefOr[CompletedMultipartUpload] = js.undefined
  var RequestPayer: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestPayer] = js.undefined
  /**
    * 
    */
  var UploadId: MultipartUploadId
}

object CompleteMultipartUploadRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Key: ObjectKey,
    UploadId: MultipartUploadId,
    MultipartUpload: CompletedMultipartUpload = null,
    RequestPayer: RequestPayer = null
  ): CompleteMultipartUploadRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Key = Key, UploadId = UploadId)
    if (MultipartUpload != null) __obj.updateDynamic("MultipartUpload")(MultipartUpload)
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteMultipartUploadRequest]
  }
}

