package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Task")
@js.native
class Task protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var Height: Double = js.native
  var Left: Double = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  var Top: Double = js.native
  var Visible: Boolean = js.native
  var Width: Double = js.native
  var WindowState: WdWindowState = js.native
  @JSName("Word.Task_typekey")
  var WordDotTask_typekey: Task = js.native
  def Activate(): Unit = js.native
  def Activate(Wait: js.Any): Unit = js.native
  def Close(): Unit = js.native
  def Move(Left: Double, Top: Double): Unit = js.native
  def Resize(Width: Double, Height: Double): Unit = js.native
  def SendWindowMessage(Message: Double, wParam: Double, lParam: Double): Unit = js.native
}

