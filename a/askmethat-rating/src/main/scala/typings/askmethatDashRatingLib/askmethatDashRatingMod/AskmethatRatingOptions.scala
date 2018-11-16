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

