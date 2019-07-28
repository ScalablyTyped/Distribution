package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadListElement extends js.Object {
  /**
    * The description of the archive that was specified in the Initiate Multipart Upload request.
    */
  var ArchiveDescription: js.UndefOr[String] = js.undefined
  /**
    * The UTC time at which the multipart upload was initiated.
    */
  var CreationDate: js.UndefOr[String] = js.undefined
  /**
    * The ID of a multipart upload.
    */
  var MultipartUploadId: js.UndefOr[String] = js.undefined
  /**
    * The part size, in bytes, specified in the Initiate Multipart Upload request. This is the size of all the parts in the upload except the last part, which may be smaller than this size.
    */
  var PartSizeInBytes: js.UndefOr[long] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the vault that contains the archive.
    */
  var VaultARN: js.UndefOr[String] = js.undefined
}

object UploadListElement {
  @scala.inline
  def apply(
    ArchiveDescription: String = null,
    CreationDate: String = null,
    MultipartUploadId: String = null,
    PartSizeInBytes: js.UndefOr[long] = js.undefined,
    VaultARN: String = null
  ): UploadListElement = {
    val __obj = js.Dynamic.literal()
    if (ArchiveDescription != null) __obj.updateDynamic("ArchiveDescription")(ArchiveDescription)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (MultipartUploadId != null) __obj.updateDynamic("MultipartUploadId")(MultipartUploadId)
    if (!js.isUndefined(PartSizeInBytes)) __obj.updateDynamic("PartSizeInBytes")(PartSizeInBytes)
    if (VaultARN != null) __obj.updateDynamic("VaultARN")(VaultARN)
    __obj.asInstanceOf[UploadListElement]
  }
}

