package typings
package angularDashTooltipsLib.angularDashTooltipsMod.AngularTooltipsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipsConfProviderOptions extends js.Object {
  var `class`: js.UndefOr[java.lang.String] = js.undefined
  var closeButton: js.UndefOr[scala.Boolean] = js.undefined
  var hideTrigger: js.UndefOr[java.lang.String] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var showTrigger: js.UndefOr[java.lang.String] = js.undefined
  var side: js.UndefOr[
    angularDashTooltipsLib.angularDashTooltipsLibStrings.left | angularDashTooltipsLib.angularDashTooltipsLibStrings.right | angularDashTooltipsLib.angularDashTooltipsLibStrings.top | angularDashTooltipsLib.angularDashTooltipsLibStrings.bottom | (angularDashTooltipsLib.angularDashTooltipsLibStrings.`top left`) | (angularDashTooltipsLib.angularDashTooltipsLibStrings.`top right`) | (angularDashTooltipsLib.angularDashTooltipsLibStrings.`bottom left`) | (angularDashTooltipsLib.angularDashTooltipsLibStrings.`bottom right`)
  ] = js.undefined
  var size: js.UndefOr[
    angularDashTooltipsLib.angularDashTooltipsLibStrings.small | angularDashTooltipsLib.angularDashTooltipsLibStrings.medium | angularDashTooltipsLib.angularDashTooltipsLibStrings.large
  ] = js.undefined
  var smart: js.UndefOr[scala.Boolean] = js.undefined
  var speed: js.UndefOr[
    angularDashTooltipsLib.angularDashTooltipsLibStrings.slow | angularDashTooltipsLib.angularDashTooltipsLibStrings.medium | angularDashTooltipsLib.angularDashTooltipsLibStrings.fast
  ] = js.undefined
  var tooltipTemplateUrlCache: js.UndefOr[scala.Boolean] = js.undefined
}

object TooltipsConfProviderOptions {
  @scala.inline
  def apply(
    `class`: java.lang.String = null,
    closeButton: js.UndefOr[scala.Boolean] = js.undefined,
    hideTrigger: java.lang.String = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    showTrigger: java.lang.String = null,
    side: angularDashTooltipsLib.angularDashTooltipsLibStrings.left | angularDashTooltipsLib.angularDashTooltipsLibStrings.right | angularDashTooltipsLib.angularDashTooltipsLibStrings.top | angularDashTooltipsLib.angularDashTooltipsLibStrings.bottom | (angularDashTooltipsLib.angularDashTooltipsLibStrings.`top left`) | (angularDashTooltipsLib.angularDashTooltipsLibStrings.`top right`) | (angularDashTooltipsLib.angularDashTooltipsLibStrings.`bottom left`) | (angularDashTooltipsLib.angularDashTooltipsLibStrings.`bottom right`) = null,
    size: angularDashTooltipsLib.angularDashTooltipsLibStrings.small | angularDashTooltipsLib.angularDashTooltipsLibStrings.medium | angularDashTooltipsLib.angularDashTooltipsLibStrings.large = null,
    smart: js.UndefOr[scala.Boolean] = js.undefined,
    speed: angularDashTooltipsLib.angularDashTooltipsLibStrings.slow | angularDashTooltipsLib.angularDashTooltipsLibStrings.medium | angularDashTooltipsLib.angularDashTooltipsLibStrings.fast = null,
    tooltipTemplateUrlCache: js.UndefOr[scala.Boolean] = js.undefined
  ): TooltipsConfProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton)
    if (hideTrigger != null) __obj.updateDynamic("hideTrigger")(hideTrigger)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (showTrigger != null) __obj.updateDynamic("showTrigger")(showTrigger)
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(smart)) __obj.updateDynamic("smart")(smart)
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipTemplateUrlCache)) __obj.updateDynamic("tooltipTemplateUrlCache")(tooltipTemplateUrlCache)
    __obj.asInstanceOf[TooltipsConfProviderOptions]
  }
}

