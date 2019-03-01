package typings
package askmethatDashRatingLib.askmethatDashRatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AskmethatRatingOptions extends js.Object {
  /**
    * Color when the rating is not hovered
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Class to display as rating (FontAwesome or Rating for exemple)
    */
  var fontClass: js.UndefOr[java.lang.String] = js.undefined
  var hoverColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Input name (Default is AskmethatRating)
    */
  var inputName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Maximum rating that the plugin display
    */
  var maxRating: js.UndefOr[scala.Double] = js.undefined
  /**
    * Mininmum rating that the user can set
    */
  var minRating: js.UndefOr[scala.Double] = js.undefined
  /**
    * options if popover is set. Put element as readonly
    */
  var popover: js.UndefOr[
    askmethatDashRatingLib.distAmtDashRatingDashPopoverMod.AskmethatRatingPopoverOptions
  ] = js.undefined
  /**
    * Set the rating to readonly
    */
  var readonly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The stepping for the rating
    */
  var step: js.UndefOr[AskmethatRatingSteps] = js.undefined
}

object AskmethatRatingOptions {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    fontClass: java.lang.String = null,
    hoverColor: java.lang.String = null,
    inputName: java.lang.String = null,
    maxRating: scala.Int | scala.Double = null,
    minRating: scala.Int | scala.Double = null,
    popover: askmethatDashRatingLib.distAmtDashRatingDashPopoverMod.AskmethatRatingPopoverOptions = null,
    readonly: js.UndefOr[scala.Boolean] = js.undefined,
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

