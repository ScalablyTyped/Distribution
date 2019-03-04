package typings
package askmethatDashRatingLib.distAmtDashRatingDashPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AskmethatRatingPopoverOptions extends js.Object {
  /**
    * Color used by the font & progress bar inside popover
    */
  var color: java.lang.String
  /**
    * Display popover at bottom or top
    */
  var direction: js.UndefOr[AskmethatRatingPopoverDirection] = js.undefined
  /**
    * fontClass used by the rating element inside popover
    */
  var fontClass: java.lang.String
  /**
    * Array of percentage to display
    */
  var values: js.Array[scala.Double]
}

object AskmethatRatingPopoverOptions {
  @scala.inline
  def apply(
    color: java.lang.String,
    fontClass: java.lang.String,
    values: js.Array[scala.Double],
    direction: AskmethatRatingPopoverDirection = null
  ): AskmethatRatingPopoverOptions = {
    val __obj = js.Dynamic.literal(color = color, fontClass = fontClass, values = values)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    __obj.asInstanceOf[AskmethatRatingPopoverOptions]
  }
}

