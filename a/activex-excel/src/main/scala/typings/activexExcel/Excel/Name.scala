package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Name")
@js.native
class Name protected () extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  var Category: String = js.native
  var CategoryLocal: String = js.native
  var Comment: String = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.Name_typekey")
  var ExcelDotName_typekey: Name = js.native
  val Index: Double = js.native
  var MacroType: XlXLMMacroType = js.native
  var Name: String = js.native
  var NameLocal: String = js.native
  val Parent: js.Any = js.native
  var RefersTo: String = js.native
  var RefersToLocal: String = js.native
  var RefersToR1C1: String = js.native
  var RefersToR1C1Local: String = js.native
  @JSName("RefersToRange")
  val RefersToRange_Original: Range = js.native
  var ShortcutKey: String = js.native
  val ValidWorkbookParameter: Boolean = js.native
  var Value: String = js.native
  var Visible: Boolean = js.native
  var WorkbookParameter: Boolean = js.native
  val _Default: String = js.native
  def Delete(): Unit = js.native
  def RefersToRange(Address: String): Range = js.native
  def RefersToRange(RowIndex: Double): Range = js.native
  def RefersToRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
}

