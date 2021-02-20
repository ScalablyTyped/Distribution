package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoFilter extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  def ApplyFilter(): Unit = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.AutoFilter_typekey")
  var ExcelDotAutoFilter_typekey: AutoFilter = js.native
  
  val FilterMode: Boolean = js.native
  
  def Filters(Index: Double): Filter = js.native
  @JSName("Filters")
  val Filters_Original: Filters = js.native
  
  val Parent: js.Any = js.native
  
  def Range(Address: String): typings.activexExcel.Excel.Range = js.native
  def Range(RowIndex: Double): typings.activexExcel.Excel.Range = js.native
  def Range(RowIndex: Double, ColumnIndex: Double): typings.activexExcel.Excel.Range = js.native
  @JSName("Range")
  val Range_Original: Range = js.native
  
  def ShowAllData(): Unit = js.native
  
  val Sort: typings.activexExcel.Excel.Sort = js.native
}
