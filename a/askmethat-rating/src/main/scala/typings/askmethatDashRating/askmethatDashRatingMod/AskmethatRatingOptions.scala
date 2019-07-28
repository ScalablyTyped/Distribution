package typings.askmethatDashRating.askmethatDashRatingMod

import typings.askmethatDashRating.distAmtDashRatingDashPopoverMod.AskmethatRatingPopoverOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AskmethatRatingOptions extends js.Object {
  /**
    * Color when the rating is not hovered
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * Class to display as rating (FontAwesome or Rating for exemple)
    */
  var fontClass: js.UndefOr[String] = js.undefined
  var hoverColor: js.UndefOr[String] = js.undefined
  /**
    * Input name (Default is AskmethatRating)
    */
  var inputName: js.UndefOr[String] = js.undefined
  /**
    * Maximum rating that the plugin display
    */
  var maxRating: js.UndefOr[Double] = js.undefined
  /**
    * Mininmum rating that the user can set
    */
  var minRating: js.UndefOr[Double] = js.undefined
  /**
    * options if popover is set. Put element as readonly
    */
  var popover: js.UndefOr[AskmethatRatingPopoverOptions] = js.undefined
  /**
    * Set the rating to readonly
    */
  var readonly: js.UndefOr[Boolean] = js.undefined
  /**
    * The stepping for the rating
    */
  var step: js.UndefOr[AskmethatRatingSteps] = js.undefined
}

object AskmethatRatingOptions {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    fontClass: String = null,
    hoverColor: String = null,
    inputName: String = null,
    maxRating: Int | Double = null,
    minRating: Int | Double = null,
    popover: AskmethatRatingPopoverOptions = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    step: AskmethatRatingSteps = null
  ): AskmethatRatingOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (fontClass != null) __obj.updateDynamic("fontClass")(fontClass)
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor)
    if (inputName != null) __obj.updateDynamic("inputName")(inputName)
    if (maxRating != null) __obj.updateDynamic("maxRating")(maxRating.asInstanceOf[js.Any])
    if (minRating != null) __obj.updateDynamic("minRating")(minRating.asInstanceOf[js.Any])
    if (popover != null) __obj.updateDynamic("popover")(popover)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (step != null) __obj.updateDynamic("step")(step)
    __obj.asInstanceOf[AskmethatRatingOptions]
  }
}

