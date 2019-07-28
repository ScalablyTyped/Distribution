package typings.activexDashExcel.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.SmartTag")
@js.native
class SmartTag protected () extends js.Object {
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  val Creator: XlCreator = js.native
  val DownloadURL: String = js.native
  var `Excel.SmartTag_typekey`: SmartTag = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("Properties")
  val Properties_Original: CustomProperties = js.native
  @JSName("Range")
  val Range_Original: Range = js.native
  @JSName("SmartTagActions")
  val SmartTagActions_Original: SmartTagActions = js.native
  val XML: String = js.native
  val _Default: String = js.native
  def Delete(): Unit = js.native
  def Properties(Index: String): CustomProperty = js.native
  def Properties(Index: Double): CustomProperty = js.native
  def Range(Address: String): typings.activexDashExcel.ExcelNs.Range = js.native
  def Range(RowIndex: Double): typings.activexDashExcel.ExcelNs.Range = js.native
  def Range(RowIndex: Double, ColumnIndex: Double): typings.activexDashExcel.ExcelNs.Range = js.native
  def SmartTagActions(Index: js.Any): SmartTagAction = js.native
}

