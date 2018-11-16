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
  def handleWithTooltip(info: antdLib.Anon_Value): reactLib.reactMod.ReactNs.ReactElement[_] = js.native
  def saveSlider(node: js.Any): scala.Unit = js.native
  def toggleTooltipVisible(index: scala.Double, visible: scala.Boolean): scala.Unit = js.native
}

