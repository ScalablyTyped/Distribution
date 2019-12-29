package typings.atAntvG2.atAntvG2Mod

import typings.atAntvG2.Anon_Cross
import typings.atAntvG2.atAntvG2Booleans.`false`
import typings.atAntvG2.atAntvG2Mod.Styles.background
import typings.atAntvG2.atAntvG2Mod.Styles.text
import typings.atAntvG2.atAntvG2Strings.bottom
import typings.atAntvG2.atAntvG2Strings.click
import typings.atAntvG2.atAntvG2Strings.default
import typings.atAntvG2.atAntvG2Strings.left
import typings.atAntvG2.atAntvG2Strings.mousemove
import typings.atAntvG2.atAntvG2Strings.none
import typings.atAntvG2.atAntvG2Strings.right
import typings.atAntvG2.atAntvG2Strings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasTooltipConfig
  extends CommonTooltipConfig
     with TooltipConfig {
  var boardStyle: js.UndefOr[background] = js.undefined
  var itemGap: js.UndefOr[Double] = js.undefined
  var nameStyle: js.UndefOr[text] = js.undefined
  var titleStyle: js.UndefOr[text] = js.undefined
  @JSName("type")
  var type_CanvasTooltipConfig: js.UndefOr[default] = js.undefined
  @JSName("useHtml")
  var useHtml_CanvasTooltipConfig: `false`
  var valueStyle: js.UndefOr[text] = js.undefined
}

object CanvasTooltipConfig {
  @scala.inline
  def apply(
    useHtml: `false`,
    boardStyle: background = null,
    crosshairs: Anon_Cross = null,
    follow: js.UndefOr[Boolean] = js.undefined,
    hideMarkers: js.UndefOr[Boolean] = js.undefined,
    inPlot: js.UndefOr[Boolean] = js.undefined,
    itemGap: Int | Double = null,
    nameStyle: text = null,
    offset: Int | Double = null,
    position: left | right | top | bottom = null,
    shared: js.UndefOr[Boolean] = js.undefined,
    showTitle: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    titleStyle: text = null,
    triggerOn: mousemove | click | none = null,
    `type`: default = null,
    valueStyle: text = null
  ): CanvasTooltipConfig = {
    val __obj = js.Dynamic.literal(useHtml = useHtml.asInstanceOf[js.Any])
    if (boardStyle != null) __obj.updateDynamic("boardStyle")(boardStyle.asInstanceOf[js.Any])
    if (crosshairs != null) __obj.updateDynamic("crosshairs")(crosshairs.asInstanceOf[js.Any])
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (!js.isUndefined(hideMarkers)) __obj.updateDynamic("hideMarkers")(hideMarkers.asInstanceOf[js.Any])
    if (!js.isUndefined(inPlot)) __obj.updateDynamic("inPlot")(inPlot.asInstanceOf[js.Any])
    if (itemGap != null) __obj.updateDynamic("itemGap")(itemGap.asInstanceOf[js.Any])
    if (nameStyle != null) __obj.updateDynamic("nameStyle")(nameStyle.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared.asInstanceOf[js.Any])
    if (!js.isUndefined(showTitle)) __obj.updateDynamic("showTitle")(showTitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (triggerOn != null) __obj.updateDynamic("triggerOn")(triggerOn.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (valueStyle != null) __obj.updateDynamic("valueStyle")(valueStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasTooltipConfig]
  }
}

