package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortField extends js.Object {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  var CustomOrder: js.Any = js.native
  
  var DataOption: XlSortDataOption = js.native
  
  def Delete(): Unit = js.native
  
  @JSName("Excel.SortField_typekey")
  var ExcelDotSortField_typekey: SortField = js.native
  
  def Key(Address: String): Range = js.native
  def Key(RowIndex: Double): Range = js.native
  def Key(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("Key")
  val Key_Original: Range = js.native
  
  def ModifyKey(Key: Range): Unit = js.native
  
  var Order: XlSortOrder = js.native
  
  val Parent: js.Any = js.native
  
  var Priority: Double = js.native
  
  def SetIcon(Icon: Icon): Unit = js.native
  
  var SortOn: XlSortOn = js.native
  
  val SortOnValue: js.Any = js.native
}
