package typings
package antdLib.libSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slider
  extends reactLib.reactMod.Component[SliderProps, SliderState, js.Any] {
  @JSName("handleWithTooltip")
  var handleWithTooltip_Original: HandleGeneratorFn = js.native
  var rcSlider: js.Any = js.native
  def blur(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def handleWithTooltip(tooltipPrefixCls: java.lang.String, info: HandleGeneratorInfo): reactLib.reactMod.ReactNs.ReactElement = js.native
  def renderSlider(hasGetPrefixCls: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def saveSlider(node: js.Any): scala.Unit = js.native
  def toggleTooltipVisible(index: scala.Double, visible: scala.Boolean): scala.Unit = js.native
}

