package typings.antdMobile.segmentedControlMod

import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentedControl
  extends Component[SegmentedControlProps, js.Any, js.Any] {
  
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSegmentedControl(nextProps: SegmentedControlProps): Unit = js.native
  
  def onClick(e: MouseEvent[HTMLDivElement, NativeMouseEvent], index: js.Any, value: js.Any): Unit = js.native
  
  def renderSegmentItem(idx: Double, value: String, selected: Boolean): Element = js.native
}
