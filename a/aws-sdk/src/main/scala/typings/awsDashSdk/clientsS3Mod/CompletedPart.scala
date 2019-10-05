package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletedPart extends js.Object {
  /**
    * Entity tag returned when the part was uploaded.
    */
  var ETag: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ETag] = js.undefined
  /**
    * Part number that identifies the part. This is a positive integer between 1 and 10,000.
    */
  var PartNumber: js.UndefOr[typings.awsDashSdk.clientsS3Mod.PartNumber] = js.undefined
}

object CompletedPart {
  @scala.inline
  def apply(ETag: ETag = null, PartNumber: Int | Double = null): CompletedPart = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (PartNumber != null) __obj.updateDynamic("PartNumber")(PartNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletedPart]
  }
}

