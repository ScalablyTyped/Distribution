package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipartUpload extends js.Object {
  /**
    * Date and time at which the multipart upload was initiated.
    */
  var Initiated: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Initiated] = js.undefined
  /**
    * Identifies who initiated the multipart upload.
    */
  var Initiator: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Initiator] = js.undefined
  /**
    * Key of the object for which the multipart upload was initiated.
    */
  var Key: js.UndefOr[ObjectKey] = js.undefined
  /**
    * 
    */
  var Owner: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Owner] = js.undefined
  /**
    * The class of storage used to store the object.
    */
  var StorageClass: js.UndefOr[typings.awsDashSdk.clientsS3Mod.StorageClass] = js.undefined
  /**
    * Upload ID that identifies the multipart upload.
    */
  var UploadId: js.UndefOr[MultipartUploadId] = js.undefined
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
    if (Initiated != null) __obj.updateDynamic("Initiated")(Initiated)
    if (Initiator != null) __obj.updateDynamic("Initiator")(Initiator)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (UploadId != null) __obj.updateDynamic("UploadId")(UploadId)
    __obj.asInstanceOf[MultipartUpload]
  }
}

