package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ListColumn")
@js.native
class ListColumn protected () extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("DataBodyRange")
  val DataBodyRange_Original: Range = js.native
  var `Excel.ListColumn_typekey`: ListColumn = js.native
  val Index: scala.Double = js.native
  val ListDataFormat: activexDashExcelLib.ExcelNs.ListDataFormat = js.native
  var Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  @JSName("Range")
  val Range_Original: Range = js.native
  val SharePointFormula: java.lang.String = js.native
  @JSName("Total")
  val Total_Original: Range = js.native
  var TotalsCalculation: XlTotalsCalculation = js.native
  val XPath: activexDashExcelLib.ExcelNs.XPath = js.native
  val _Default: java.lang.String = js.native
  def DataBodyRange(Address: java.lang.String): Range = js.native
  def DataBodyRange(RowIndex: scala.Double): Range = js.native
  def DataBodyRange(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Delete(): scala.Unit = js.native
  def Range(Address: java.lang.String): activexDashExcelLib.ExcelNs.Range = js.native
  def Range(RowIndex: scala.Double): activexDashExcelLib.ExcelNs.Range = js.native
  def Range(RowIndex: scala.Double, ColumnIndex: scala.Double): activexDashExcelLib.ExcelNs.Range = js.native
  def Total(Address: java.lang.String): Range = js.native
  def Total(RowIndex: scala.Double): Range = js.native
  def Total(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
}

