package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ProtectedViewWindow")
@js.native
class ProtectedViewWindow protected () extends js.Object {
  val Active: Boolean = js.native
  val Application: typings.activexDashWord.Word.Application = js.native
  var Caption: String = js.native
  val Creator: Double = js.native
  val Document: typings.activexDashWord.Word.Document = js.native
  var Height: Double = js.native
  val Index: Double = js.native
  var Left: Double = js.native
  val Parent: js.Any = js.native
  val SourceName: String = js.native
  val SourcePath: String = js.native
  var Top: Double = js.native
  var Visible: Boolean = js.native
  var Width: Double = js.native
  var WindowState: WdWindowState = js.native
  @JSName("Word.ProtectedViewWindow_typekey")
  var WordDotProtectedViewWindow_typekey: ProtectedViewWindow = js.native
  def Activate(): Unit = js.native
  def Close(): Unit = js.native
  def Edit(): typings.activexDashWord.Word.Document = js.native
  def Edit(PasswordTemplate: js.Any): typings.activexDashWord.Word.Document = js.native
  def Edit(PasswordTemplate: js.Any, WritePasswordDocument: js.Any): typings.activexDashWord.Word.Document = js.native
  def Edit(PasswordTemplate: js.Any, WritePasswordDocument: js.Any, WritePasswordTemplate: js.Any): typings.activexDashWord.Word.Document = js.native
  def ToggleRibbon(): Unit = js.native
}

