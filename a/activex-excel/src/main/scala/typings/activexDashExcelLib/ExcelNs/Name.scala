package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Name")
@js.native
class Name protected () extends js.Object {
  val Application: Application = js.native
  var Category: java.lang.String = js.native
  var CategoryLocal: java.lang.String = js.native
  var Comment: java.lang.String = js.native
  val Creator: XlCreator = js.native
  var `Excel.Name_typekey`: Name = js.native
  val Index: scala.Double = js.native
  var MacroType: XlXLMMacroType = js.native
  var Name: java.lang.String = js.native
  var NameLocal: java.lang.String = js.native
  val Parent: js.Any = js.native
  var RefersTo: java.lang.String = js.native
  var RefersToLocal: java.lang.String = js.native
  var RefersToR1C1: java.lang.String = js.native
  var RefersToR1C1Local: java.lang.String = js.native
  @JSName("RefersToRange")
  val RefersToRange_Original: Range = js.native
  var ShortcutKey: java.lang.String = js.native
  val ValidWorkbookParameter: scala.Boolean = js.native
  var Value: java.lang.String = js.native
  var Visible: scala.Boolean = js.native
  var WorkbookParameter: scala.Boolean = js.native
  val _Default: java.lang.String = js.native
  def Delete(): scala.Unit = js.native
  def RefersToRange(Address: java.lang.String): Range = js.native
  def RefersToRange(RowIndex: scala.Double): Range = js.native
  def RefersToRange(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
}

