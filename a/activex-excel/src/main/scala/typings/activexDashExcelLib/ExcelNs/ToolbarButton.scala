package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ToolbarButton")
@js.native
class ToolbarButton protected () extends js.Object {
  val Application: Application = js.native
  val BuiltIn: scala.Boolean = js.native
  var BuiltInFace: scala.Boolean = js.native
  val Creator: XlCreator = js.native
  var Enabled: scala.Boolean = js.native
  var `Excel.ToolbarButton_typekey`: ToolbarButton = js.native
  var HelpContextID: scala.Double = js.native
  var HelpFile: java.lang.String = js.native
  val ID: scala.Double = js.native
  val IsGap: scala.Boolean = js.native
  var Name: java.lang.String = js.native
  var OnAction: java.lang.String = js.native
  val Parent: js.Any = js.native
  var Pushed: scala.Boolean = js.native
  var StatusBar: java.lang.String = js.native
  var Width: scala.Double = js.native
  def Copy(Toolbar: Toolbar, Before: scala.Double): scala.Unit = js.native
  def CopyFace(): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def Edit(): scala.Unit = js.native
  def Move(Toolbar: Toolbar, Before: scala.Double): scala.Unit = js.native
  def PasteFace(): scala.Unit = js.native
  def Reset(): scala.Unit = js.native
}

