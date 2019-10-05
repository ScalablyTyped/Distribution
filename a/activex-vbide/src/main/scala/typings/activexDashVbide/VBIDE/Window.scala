package typings.activexDashVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("VBIDE.Window")
@js.native
class Window protected () extends js.Object {
  val Caption: String = js.native
  @JSName("Collection")
  val Collection_Original: Windows = js.native
  val HWnd: Double = js.native
  var Height: Double = js.native
  var Left: Double = js.native
  val LinkedWindowFrame: Window = js.native
  @JSName("LinkedWindows")
  val LinkedWindows_Original: LinkedWindows = js.native
  var Top: Double = js.native
  val Type: vbext_WindowType = js.native
  val VBE: typings.activexDashVbide.VBIDE.VBE = js.native
  var `VBIDE.Window_typekey`: Window = js.native
  var Visible: Boolean = js.native
  var Width: Double = js.native
  var WindowState: vbext_WindowState = js.native
  def Close(): Unit = js.native
  def Collection(index: js.Any): Window = js.native
  def LinkedWindows(index: js.Any): Window = js.native
  def SetFocus(): Unit = js.native
}

