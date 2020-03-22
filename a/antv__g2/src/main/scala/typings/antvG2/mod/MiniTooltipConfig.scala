package typings.antvG2.mod

import typings.antvG2.AnonStyle
import typings.antvG2.antvG2Strings.bottom
import typings.antvG2.antvG2Strings.click
import typings.antvG2.antvG2Strings.left
import typings.antvG2.antvG2Strings.mini
import typings.antvG2.antvG2Strings.mousemove
import typings.antvG2.antvG2Strings.none
import typings.antvG2.antvG2Strings.right
import typings.antvG2.antvG2Strings.top
import typings.antvG2.mod.Styles.background
import typings.antvG2.mod.Styles.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiniTooltipConfig
  extends CommonTooltipConfig
     with TooltipConfig {
  var boardStyle: js.UndefOr[background] = js.undefined
  var triangleHeight: js.UndefOr[Double] = js.undefined
  var triangleWidth: js.UndefOr[Double] = js.undefined
  @JSName("type")
  var type_MiniTooltipConfig: mini
  var valueStyle: js.UndefOr[text] = js.undefined
}

object MiniTooltipConfig {
  @scala.inline
  def apply(
    `type`: mini,
    boardStyle: background = null,
    crosshairs: AnonStyle = null,
    follow: js.UndefOr[Boolean] = js.undefined,
    hideMarkers: js.UndefOr[Boolean] = js.undefined,
    inPlot: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    position: left | right | top | bottom = null,
    shared: js.UndefOr[Boolean] = js.undefined,
    showTitle: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    triangleHeight: Int | Double = null,
    triangleWidth: Int | Double = null,
    triggerOn: mousemove | click | none = null,
    useHtml: js.UndefOr[Boolean] = js.undefined,
    valueStyle: text = null
  ): MiniTooltipConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (boardStyle != null) __obj.updateDynamic("boardStyle")(boardStyle.asInstanceOf[js.Any])
    if (crosshairs != null) __obj.updateDynamic("crosshairs")(crosshairs.asInstanceOf[js.Any])
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (!js.isUndefined(hideMarkers)) __obj.updateDynamic("hideMarkers")(hideMarkers.asInstanceOf[js.Any])
    if (!js.isUndefined(inPlot)) __obj.updateDynamic("inPlot")(inPlot.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared.asInstanceOf[js.Any])
    if (!js.isUndefined(showTitle)) __obj.updateDynamic("showTitle")(showTitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (triangleHeight != null) __obj.updateDynamic("triangleHeight")(triangleHeight.asInstanceOf[js.Any])
    if (triangleWidth != null) __obj.updateDynamic("triangleWidth")(triangleWidth.asInstanceOf[js.Any])
    if (triggerOn != null) __obj.updateDynamic("triggerOn")(triggerOn.asInstanceOf[js.Any])
    if (!js.isUndefined(useHtml)) __obj.updateDynamic("useHtml")(useHtml.asInstanceOf[js.Any])
    if (valueStyle != null) __obj.updateDynamic("valueStyle")(valueStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiniTooltipConfig]
  }
}

