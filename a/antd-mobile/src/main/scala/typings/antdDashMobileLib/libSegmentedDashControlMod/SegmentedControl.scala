package typings
package antdDashMobileLib.libSegmentedDashControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentedControl
  extends reactLib.reactMod.Component[SegmentedControlProps, js.Any, js.Any] {
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSegmentedControl(nextProps: SegmentedControlProps): scala.Unit = js.native
  def onClick(
    e: reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent],
    index: js.Any,
    value: js.Any
  ): scala.Unit = js.native
  def renderSegmentItem(idx: scala.Double, value: java.lang.String, selected: scala.Boolean): reactLib.reactMod.Global.JSXNs.Element = js.native
}

