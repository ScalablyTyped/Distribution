package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompleteMultipartUploadRequest extends js.Object {
  /**
    * Name of the bucket to which the multipart upload was initiated.
    */
  var Bucket: BucketName = js.native
  /**
    * Object key for which the multipart upload was initiated.
    */
  var Key: ObjectKey = js.native
  /**
    * The container for the multipart upload request information.
    */
  var MultipartUpload: js.UndefOr[CompletedMultipartUpload] = js.native
  var RequestPayer: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestPayer] = js.native
  /**
    * ID for the initiated multipart upload.
    */
  var UploadId: MultipartUploadId = js.native
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
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
    if (MultipartUpload != null) __obj.updateDynamic("MultipartUpload")(MultipartUpload.asInstanceOf[js.Any])
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteMultipartUploadRequest]
  }
}

