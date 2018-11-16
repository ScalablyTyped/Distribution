package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Task")
@js.native
class Task protected () extends js.Object {
  val Application: Application = js.native
  val Creator: scala.Double = js.native
  var Height: scala.Double = js.native
  var Left: scala.Double = js.native
  val Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  var Top: scala.Double = js.native
  var Visible: scala.Boolean = js.native
  var Width: scala.Double = js.native
  var WindowState: WdWindowState = js.native
  var `Word.Task_typekey`: Task = js.native
  def Activate(): scala.Unit = js.native
  def Activate(Wait: js.Any): scala.Unit = js.native
  def Close(): scala.Unit = js.native
  def Move(Left: scala.Double, Top: scala.Double): scala.Unit = js.native
  def Resize(Width: scala.Double, Height: scala.Double): scala.Unit = js.native
  def SendWindowMessage(Message: scala.Double, wParam: scala.Double, lParam: scala.Double): scala.Unit = js.native
}

