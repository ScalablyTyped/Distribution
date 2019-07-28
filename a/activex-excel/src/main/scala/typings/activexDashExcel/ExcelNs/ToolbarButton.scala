package typings.activexDashExcel.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ToolbarButton")
@js.native
class ToolbarButton protected () extends js.Object {
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  val BuiltIn: Boolean = js.native
  var BuiltInFace: Boolean = js.native
  val Creator: XlCreator = js.native
  var Enabled: Boolean = js.native
  var `Excel.ToolbarButton_typekey`: ToolbarButton = js.native
  var HelpContextID: Double = js.native
  var HelpFile: String = js.native
  val ID: Double = js.native
  val IsGap: Boolean = js.native
  var Name: String = js.native
  var OnAction: String = js.native
  val Parent: js.Any = js.native
  var Pushed: Boolean = js.native
  var StatusBar: String = js.native
  var Width: Double = js.native
  def Copy(Toolbar: Toolbar, Before: Double): Unit = js.native
  def CopyFace(): Unit = js.native
  def Delete(): Unit = js.native
  def Edit(): Unit = js.native
  def Move(Toolbar: Toolbar, Before: Double): Unit = js.native
  def PasteFace(): Unit = js.native
  def Reset(): Unit = js.native
}

