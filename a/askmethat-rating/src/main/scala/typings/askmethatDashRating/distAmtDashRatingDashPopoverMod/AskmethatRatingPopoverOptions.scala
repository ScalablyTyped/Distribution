package typings.askmethatDashRating.distAmtDashRatingDashPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AskmethatRatingPopoverOptions extends js.Object {
  /**
    * Color used by the font & progress bar inside popover
    */
  var color: String
  /**
    * Display popover at bottom or top
    */
  var direction: js.UndefOr[AskmethatRatingPopoverDirection] = js.undefined
  /**
    * fontClass used by the rating element inside popover
    */
  var fontClass: String
  /**
    * Array of percentage to display
    */
  var values: js.Array[Double]
}

object AskmethatRatingPopoverOptions {
  @scala.inline
  def apply(
    color: String,
    fontClass: String,
    values: js.Array[Double],
    direction: AskmethatRatingPopoverDirection = null
  ): AskmethatRatingPopoverOptions = {
    val __obj = js.Dynamic.literal(color = color, fontClass = fontClass, values = values)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    __obj.asInstanceOf[AskmethatRatingPopoverOptions]
  }
}

