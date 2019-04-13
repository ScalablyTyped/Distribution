package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Part extends js.Object {
  /**
    * Entity tag returned when the part was uploaded.
    */
  var ETag: js.UndefOr[ETag] = js.undefined
  /**
    * Date and time at which the part was uploaded.
    */
  var LastModified: js.UndefOr[LastModified] = js.undefined
  /**
    * Part number identifying the part. This is a positive integer between 1 and 10,000.
    */
  var PartNumber: js.UndefOr[PartNumber] = js.undefined
  /**
    * Size in bytes of the uploaded part data.
    */
  var Size: js.UndefOr[Size] = js.undefined
}

object Part {
  @scala.inline
  def apply(
    ETag: ETag = null,
    LastModified: LastModified = null,
    PartNumber: js.UndefOr[PartNumber] = js.undefined,
    Size: js.UndefOr[Size] = js.undefined
  ): Part = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified)
    if (!js.isUndefined(PartNumber)) __obj.updateDynamic("PartNumber")(PartNumber)
    if (!js.isUndefined(Size)) __obj.updateDynamic("Size")(Size)
    __obj.asInstanceOf[Part]
  }
}

