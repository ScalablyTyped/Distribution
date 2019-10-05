package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Part extends js.Object {
  /**
    * Entity tag returned when the part was uploaded.
    */
  var ETag: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ETag] = js.undefined
  /**
    * Date and time at which the part was uploaded.
    */
  var LastModified: js.UndefOr[typings.awsDashSdk.clientsS3Mod.LastModified] = js.undefined
  /**
    * Part number identifying the part. This is a positive integer between 1 and 10,000.
    */
  var PartNumber: js.UndefOr[typings.awsDashSdk.clientsS3Mod.PartNumber] = js.undefined
  /**
    * Size in bytes of the uploaded part data.
    */
  var Size: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Size] = js.undefined
}

object Part {
  @scala.inline
  def apply(
    ETag: ETag = null,
    LastModified: LastModified = null,
    PartNumber: Int | Double = null,
    Size: Int | Double = null
  ): Part = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified)
    if (PartNumber != null) __obj.updateDynamic("PartNumber")(PartNumber.asInstanceOf[js.Any])
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Part]
  }
}

