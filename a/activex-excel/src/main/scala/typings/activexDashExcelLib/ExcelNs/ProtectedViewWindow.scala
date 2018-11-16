package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ProtectedViewWindow")
@js.native
class ProtectedViewWindow protected () extends js.Object {
  var Caption: java.lang.String = js.native
  var EnableResize: scala.Boolean = js.native
  var `Excel.ProtectedViewWindow_typekey`: ProtectedViewWindow = js.native
  var Height: scala.Double = js.native
  var Left: scala.Double = js.native
  val SourceName: java.lang.String = js.native
  val SourcePath: java.lang.String = js.native
  var Top: scala.Double = js.native
  var Visible: scala.Boolean = js.native
  var Width: scala.Double = js.native
  var WindowState: XlProtectedViewWindowState = js.native
  val Workbook: Workbook = js.native
  val _Default: java.lang.String = js.native
  def Activate(): scala.Unit = js.native
  def Close(): scala.Boolean = js.native
  def Edit(): Workbook = js.native
  def Edit(WriteResPassword: java.lang.String): Workbook = js.native
  def Edit(
    WriteResPassword: java.lang.String,
    UpdateLinks: activexDashExcelLib.activexDashExcelLibNumbers.`0`
  ): Workbook = js.native
  def Edit(
    WriteResPassword: java.lang.String,
    UpdateLinks: activexDashExcelLib.activexDashExcelLibNumbers.`1`
  ): Workbook = js.native
}

