package typings
package antdLib.libSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slider
  extends reactLib.reactMod.Component[SliderProps, SliderState, js.Any] {
  var handleWithTooltip: HandleGeneratorFn = js.native
  var rcSlider: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RcSlider */ js.Any = js.native
  def blur(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def renderSlider(hasGetPrefixCls: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def saveSlider(node: js.Any): scala.Unit = js.native
  def toggleTooltipVisible(index: scala.Double, visible: scala.Boolean): scala.Unit = js.native
}

