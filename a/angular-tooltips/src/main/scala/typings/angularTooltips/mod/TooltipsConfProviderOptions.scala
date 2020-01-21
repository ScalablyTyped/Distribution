package typings.angularTooltips.mod

import typings.angularTooltips.angularTooltipsStrings.`bottom left`
import typings.angularTooltips.angularTooltipsStrings.`bottom right`
import typings.angularTooltips.angularTooltipsStrings.`top left`
import typings.angularTooltips.angularTooltipsStrings.`top right`
import typings.angularTooltips.angularTooltipsStrings.bottom
import typings.angularTooltips.angularTooltipsStrings.fast
import typings.angularTooltips.angularTooltipsStrings.large
import typings.angularTooltips.angularTooltipsStrings.left
import typings.angularTooltips.angularTooltipsStrings.medium
import typings.angularTooltips.angularTooltipsStrings.right
import typings.angularTooltips.angularTooltipsStrings.slow
import typings.angularTooltips.angularTooltipsStrings.small
import typings.angularTooltips.angularTooltipsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipsConfProviderOptions extends js.Object {
  var `class`: js.UndefOr[String] = js.undefined
  var closeButton: js.UndefOr[Boolean] = js.undefined
  var hideTrigger: js.UndefOr[String] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var showTrigger: js.UndefOr[String] = js.undefined
  var side: js.UndefOr[
    left | right | top | bottom | (`top left`) | (`top right`) | (`bottom left`) | (`bottom right`)
  ] = js.undefined
  var size: js.UndefOr[small | medium | large] = js.undefined
  var smart: js.UndefOr[Boolean] = js.undefined
  var speed: js.UndefOr[slow | medium | fast] = js.undefined
  var tooltipTemplateUrlCache: js.UndefOr[Boolean] = js.undefined
}

object TooltipsConfProviderOptions {
  @scala.inline
  def apply(
    `class`: String = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    hideTrigger: String = null,
    show: js.UndefOr[Boolean] = js.undefined,
    showTrigger: String = null,
    side: left | right | top | bottom | (`top left`) | (`top right`) | (`bottom left`) | (`bottom right`) = null,
    size: small | medium | large = null,
    smart: js.UndefOr[Boolean] = js.undefined,
    speed: slow | medium | fast = null,
    tooltipTemplateUrlCache: js.UndefOr[Boolean] = js.undefined
  ): TooltipsConfProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (hideTrigger != null) __obj.updateDynamic("hideTrigger")(hideTrigger.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (showTrigger != null) __obj.updateDynamic("showTrigger")(showTrigger.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(smart)) __obj.updateDynamic("smart")(smart.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipTemplateUrlCache)) __obj.updateDynamic("tooltipTemplateUrlCache")(tooltipTemplateUrlCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipsConfProviderOptions]
  }
}

