package typings.askmethatRating.amtRatingPopoverMod

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
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontClass = fontClass.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AskmethatRatingPopoverOptions]
  }
}

