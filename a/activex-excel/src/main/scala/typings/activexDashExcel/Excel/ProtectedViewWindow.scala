package typings.activexDashExcel.Excel

import typings.activexDashExcel.activexDashExcelNumbers.`0`
import typings.activexDashExcel.activexDashExcelNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ProtectedViewWindow")
@js.native
class ProtectedViewWindow protected () extends js.Object {
  var Caption: String = js.native
  var EnableResize: Boolean = js.native
  @JSName("Excel.ProtectedViewWindow_typekey")
  var ExcelDotProtectedViewWindow_typekey: ProtectedViewWindow = js.native
  var Height: Double = js.native
  var Left: Double = js.native
  val SourceName: String = js.native
  val SourcePath: String = js.native
  var Top: Double = js.native
  var Visible: Boolean = js.native
  var Width: Double = js.native
  var WindowState: XlProtectedViewWindowState = js.native
  val Workbook: typings.activexDashExcel.Excel.Workbook = js.native
  val _Default: String = js.native
  def Activate(): Unit = js.native
  def Close(): Boolean = js.native
  def Edit(): typings.activexDashExcel.Excel.Workbook = js.native
  def Edit(WriteResPassword: String): typings.activexDashExcel.Excel.Workbook = js.native
  @JSName("Edit")
  def Edit_0(WriteResPassword: String, UpdateLinks: `0`): typings.activexDashExcel.Excel.Workbook = js.native
  @JSName("Edit")
  def Edit_1(WriteResPassword: String, UpdateLinks: `1`): typings.activexDashExcel.Excel.Workbook = js.native
}

