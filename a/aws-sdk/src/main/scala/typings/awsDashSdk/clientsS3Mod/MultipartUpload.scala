package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipartUpload extends js.Object {
  /**
    * Date and time at which the multipart upload was initiated.
    */
  var Initiated: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Initiated] = js.native
  /**
    * Identifies who initiated the multipart upload.
    */
  var Initiator: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Initiator] = js.native
  /**
    * Key of the object for which the multipart upload was initiated.
    */
  var Key: js.UndefOr[ObjectKey] = js.native
  /**
    * Specifies the owner of the object that is part of the multipart upload. 
    */
  var Owner: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Owner] = js.native
  /**
    * The class of storage used to store the object.
    */
  var StorageClass: js.UndefOr[typings.awsDashSdk.clientsS3Mod.StorageClass] = js.native
  /**
    * Upload ID that identifies the multipart upload.
    */
  var UploadId: js.UndefOr[MultipartUploadId] = js.native
}

object MultipartUpload {
  @scala.inline
  def apply(
    Initiated: Initiated = null,
    Initiator: Initiator = null,
    Key: ObjectKey = null,
    Owner: Owner = null,
    StorageClass: StorageClass = null,
    UploadId: MultipartUploadId = null
  ): MultipartUpload = {
    val __obj = js.Dynamic.literal()
    if (Initiated != null) __obj.updateDynamic("Initiated")(Initiated.asInstanceOf[js.Any])
    if (Initiator != null) __obj.updateDynamic("Initiator")(Initiator.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (UploadId != null) __obj.updateDynamic("UploadId")(UploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipartUpload]
  }
}

