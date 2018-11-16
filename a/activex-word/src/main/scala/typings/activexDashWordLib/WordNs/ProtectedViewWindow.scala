package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ProtectedViewWindow")
@js.native
class ProtectedViewWindow protected () extends js.Object {
  val Active: scala.Boolean = js.native
  val Application: Application = js.native
  var Caption: java.lang.String = js.native
  val Creator: scala.Double = js.native
  val Document: Document = js.native
  var Height: scala.Double = js.native
  val Index: scala.Double = js.native
  var Left: scala.Double = js.native
  val Parent: js.Any = js.native
  val SourceName: java.lang.String = js.native
  val SourcePath: java.lang.String = js.native
  var Top: scala.Double = js.native
  var Visible: scala.Boolean = js.native
  var Width: scala.Double = js.native
  var WindowState: WdWindowState = js.native
  var `Word.ProtectedViewWindow_typekey`: ProtectedViewWindow = js.native
  def Activate(): scala.Unit = js.native
  def Close(): scala.Unit = js.native
  def Edit(): Document = js.native
  def Edit(PasswordTemplate: js.Any): Document = js.native
  def Edit(PasswordTemplate: js.Any, WritePasswordDocument: js.Any): Document = js.native
  def Edit(PasswordTemplate: js.Any, WritePasswordDocument: js.Any, WritePasswordTemplate: js.Any): Document = js.native
  def ToggleRibbon(): scala.Unit = js.native
}

