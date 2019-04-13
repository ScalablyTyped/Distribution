package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPartsOutput extends js.Object {
  /**
    * The description of the archive that was specified in the Initiate Multipart Upload request.
    */
  var ArchiveDescription: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The UTC time at which the multipart upload was initiated.
    */
  var CreationDate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An opaque string that represents where to continue pagination of the results. You use the marker in a new List Parts request to obtain more jobs in the list. If there are no more parts, this value is null.
    */
  var Marker: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the upload to which the parts are associated.
    */
  var MultipartUploadId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The part size in bytes. This is the same value that you specified in the Initiate Multipart Upload request.
    */
  var PartSizeInBytes: js.UndefOr[long] = js.undefined
  /**
    * A list of the part sizes of the multipart upload. Each object in the array contains a RangeBytes and sha256-tree-hash name/value pair.
    */
  var Parts: js.UndefOr[PartList] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the vault to which the multipart upload was initiated.
    */
  var VaultARN: js.UndefOr[java.lang.String] = js.undefined
}

object ListPartsOutput {
  @scala.inline
  def apply(
    ArchiveDescription: java.lang.String = null,
    CreationDate: java.lang.String = null,
    Marker: java.lang.String = null,
    MultipartUploadId: java.lang.String = null,
    PartSizeInBytes: js.UndefOr[long] = js.undefined,
    Parts: PartList = null,
    VaultARN: java.lang.String = null
  ): ListPartsOutput = {
    val __obj = js.Dynamic.literal()
    if (ArchiveDescription != null) __obj.updateDynamic("ArchiveDescription")(ArchiveDescription)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MultipartUploadId != null) __obj.updateDynamic("MultipartUploadId")(MultipartUploadId)
    if (!js.isUndefined(PartSizeInBytes)) __obj.updateDynamic("PartSizeInBytes")(PartSizeInBytes)
    if (Parts != null) __obj.updateDynamic("Parts")(Parts)
    if (VaultARN != null) __obj.updateDynamic("VaultARN")(VaultARN)
    __obj.asInstanceOf[ListPartsOutput]
  }
}

