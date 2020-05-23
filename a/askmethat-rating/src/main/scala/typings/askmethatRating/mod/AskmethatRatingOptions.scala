package typings.askmethatRating.mod

import typings.askmethatRating.amtRatingPopoverMod.AskmethatRatingPopoverOptions
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
    maxRating: js.UndefOr[Double] = js.undefined,
    minRating: js.UndefOr[Double] = js.undefined,
    popover: AskmethatRatingPopoverOptions = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    step: AskmethatRatingSteps = null
  ): AskmethatRatingOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (fontClass != null) __obj.updateDynamic("fontClass")(fontClass.asInstanceOf[js.Any])
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor.asInstanceOf[js.Any])
    if (inputName != null) __obj.updateDynamic("inputName")(inputName.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRating)) __obj.updateDynamic("maxRating")(maxRating.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minRating)) __obj.updateDynamic("minRating")(minRating.get.asInstanceOf[js.Any])
    if (popover != null) __obj.updateDynamic("popover")(popover.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.get.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[AskmethatRatingOptions]
  }
}

