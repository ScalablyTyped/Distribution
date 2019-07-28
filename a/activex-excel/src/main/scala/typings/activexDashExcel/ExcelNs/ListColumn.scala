package typings.activexDashExcel.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ListColumn")
@js.native
class ListColumn protected () extends js.Object {
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("DataBodyRange")
  val DataBodyRange_Original: Range = js.native
  var `Excel.ListColumn_typekey`: ListColumn = js.native
  val Index: Double = js.native
  val ListDataFormat: typings.activexDashExcel.ExcelNs.ListDataFormat = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("Range")
  val Range_Original: Range = js.native
  val SharePointFormula: String = js.native
  @JSName("Total")
  val Total_Original: Range = js.native
  var TotalsCalculation: XlTotalsCalculation = js.native
  val XPath: typings.activexDashExcel.ExcelNs.XPath = js.native
  val _Default: String = js.native
  def DataBodyRange(Address: String): Range = js.native
  def DataBodyRange(RowIndex: Double): Range = js.native
  def DataBodyRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def Delete(): Unit = js.native
  def Range(Address: String): typings.activexDashExcel.ExcelNs.Range = js.native
  def Range(RowIndex: Double): typings.activexDashExcel.ExcelNs.Range = js.native
  def Range(RowIndex: Double, ColumnIndex: Double): typings.activexDashExcel.ExcelNs.Range = js.native
  def Total(Address: String): Range = js.native
  def Total(RowIndex: Double): Range = js.native
  def Total(RowIndex: Double, ColumnIndex: Double): Range = js.native
}

