package typings.activexDashExcel.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.TableStyleElement")
@js.native
class TableStyleElement protected () extends js.Object {
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  @JSName("Borders")
  val Borders_Original: Borders = js.native
  val Creator: XlCreator = js.native
  var `Excel.TableStyleElement_typekey`: TableStyleElement = js.native
  val Font: typings.activexDashExcel.ExcelNs.Font = js.native
  val HasFormat: Boolean = js.native
  val Interior: typings.activexDashExcel.ExcelNs.Interior = js.native
  val Parent: js.Any = js.native
  var StripeSize: Double = js.native
  def Borders(Index: XlBordersIndex): Border = js.native
  def Clear(): Unit = js.native
}

