package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.RecentFile")
@js.native
class RecentFile protected () extends js.Object {
  val Application: Application = js.native
  val Creator: XlCreator = js.native
  var `Excel.RecentFile_typekey`: RecentFile = js.native
  val Index: scala.Double = js.native
  val Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  val Path: java.lang.String = js.native
  def Delete(): scala.Unit = js.native
  def Open(): Workbook = js.native
}

