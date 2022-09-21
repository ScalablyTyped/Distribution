package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotLayout extends StObject {
  
  def AddFields(): Unit = js.native
  def AddFields(RowFields: Any): Unit = js.native
  def AddFields(RowFields: Any, ColumnFields: Any): Unit = js.native
  def AddFields(RowFields: Any, ColumnFields: Any, PageFields: Any): Unit = js.native
  def AddFields(RowFields: Any, ColumnFields: Any, PageFields: Any, AppendField: Any): Unit = js.native
  def AddFields(RowFields: Any, ColumnFields: Any, PageFields: Unit, AppendField: Any): Unit = js.native
  def AddFields(RowFields: Any, ColumnFields: Unit, PageFields: Any): Unit = js.native
  def AddFields(RowFields: Any, ColumnFields: Unit, PageFields: Any, AppendField: Any): Unit = js.native
  def AddFields(RowFields: Any, ColumnFields: Unit, PageFields: Unit, AppendField: Any): Unit = js.native
  def AddFields(RowFields: Unit, ColumnFields: Any): Unit = js.native
  def AddFields(RowFields: Unit, ColumnFields: Any, PageFields: Any): Unit = js.native
  def AddFields(RowFields: Unit, ColumnFields: Any, PageFields: Any, AppendField: Any): Unit = js.native
  def AddFields(RowFields: Unit, ColumnFields: Any, PageFields: Unit, AppendField: Any): Unit = js.native
  def AddFields(RowFields: Unit, ColumnFields: Unit, PageFields: Any): Unit = js.native
  def AddFields(RowFields: Unit, ColumnFields: Unit, PageFields: Any, AppendField: Any): Unit = js.native
  def AddFields(RowFields: Unit, ColumnFields: Unit, PageFields: Unit, AppendField: Any): Unit = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  def ColumnFields(): Any = js.native
  def ColumnFields(Index: Any): Any = js.native
  
  val Creator: XlCreator = js.native
  
  def CubeFields(Index: String): CubeField = js.native
  def CubeFields(Index: Double): CubeField = js.native
  @JSName("CubeFields")
  val CubeFields_Original: CubeFields = js.native
  
  def DataFields(): Any = js.native
  def DataFields(Index: Any): Any = js.native
  
  /* private */ @JSName("Excel.PivotLayout_typekey")
  var ExcelDotPivotLayout_typekey: PivotLayout = js.native
  
  def HiddenFields(): Any = js.native
  def HiddenFields(Index: Any): Any = js.native
  
  var InnerDetail: String = js.native
  
  def PageFields(): Any = js.native
  def PageFields(Index: Any): Any = js.native
  
  val Parent: Any = js.native
  
  val PivotCache: typings.activexExcel.Excel.PivotCache = js.native
  
  def PivotFields(): Any = js.native
  def PivotFields(Index: Any): Any = js.native
  
  val PivotTable: typings.activexExcel.Excel.PivotTable = js.native
  
  def RowFields(): Any = js.native
  def RowFields(Index: Any): Any = js.native
  
  def VisibleFields(): Any = js.native
  def VisibleFields(Index: Any): Any = js.native
}
