package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgeRange extends js.Object {
  /**
    * The highest estimated age.
    */
  var High: js.UndefOr[UInteger] = js.undefined
  /**
    * The lowest estimated age.
    */
  var Low: js.UndefOr[UInteger] = js.undefined
}

object AgeRange {
  @scala.inline
  def apply(High: js.UndefOr[UInteger] = js.undefined, Low: js.UndefOr[UInteger] = js.undefined): AgeRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(High)) __obj.updateDynamic("High")(High)
    if (!js.isUndefined(Low)) __obj.updateDynamic("Low")(Low)
    __obj.asInstanceOf[AgeRange]
  }
}

