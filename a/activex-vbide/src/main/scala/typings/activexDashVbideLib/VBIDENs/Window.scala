package typings
package activexDashVbideLib.VBIDENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("VBIDE.Window")
@js.native
class Window protected () extends js.Object {
  val Caption: java.lang.String = js.native
  @JSName("Collection")
  val Collection_Original: Windows = js.native
  val HWnd: scala.Double = js.native
  var Height: scala.Double = js.native
  var Left: scala.Double = js.native
  val LinkedWindowFrame: Window = js.native
  @JSName("LinkedWindows")
  val LinkedWindows_Original: LinkedWindows = js.native
  var Top: scala.Double = js.native
  val Type: vbext_WindowType = js.native
  val VBE: VBE = js.native
  var `VBIDE.Window_typekey`: Window = js.native
  var Visible: scala.Boolean = js.native
  var Width: scala.Double = js.native
  var WindowState: vbext_WindowState = js.native
  def Close(): scala.Unit = js.native
  def Collection(index: js.Any): Window = js.native
  def LinkedWindows(index: js.Any): Window = js.native
  def SetFocus(): scala.Unit = js.native
}

