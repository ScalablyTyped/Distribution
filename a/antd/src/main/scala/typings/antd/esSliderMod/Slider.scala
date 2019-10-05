package typings.antd.esSliderMod

import typings.antd.esConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slider
  extends Component[SliderProps, SliderState, js.Any] {
  var handleWithTooltip: HandleGeneratorFn = js.native
  var rcSlider: js.Any = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def renderSlider(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def saveSlider(node: js.Any): Unit = js.native
  def toggleTooltipVisible(index: Double, visible: Boolean): Unit = js.native
}

