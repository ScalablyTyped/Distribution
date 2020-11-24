package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlicerCache extends js.Object {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  def ClearManualFilter(): Unit = js.native
  
  val Creator: XlCreator = js.native
  
  var CrossFilterType: XlSlicerCrossFilterType = js.native
  
  def Delete(): Unit = js.native
  
  @JSName("Excel.SlicerCache_typekey")
  var ExcelDotSlicerCache_typekey: SlicerCache = js.native
  
  val Index: Double = js.native
  
  var Name: String = js.native
  
  val OLAP: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  def PivotTables(Index: String): PivotTable = js.native
  def PivotTables(Index: Double): PivotTable = js.native
  @JSName("PivotTables")
  val PivotTables_Original: SlicerPivotTables = js.native
  
  var ShowAllItems: Boolean = js.native
  
  def SlicerCacheLevels(): SlicerCacheLevel = js.native
  def SlicerCacheLevels(Level: String): SlicerCacheLevel = js.native
  def SlicerCacheLevels(Level: Double): SlicerCacheLevel = js.native
  @JSName("SlicerCacheLevels")
  val SlicerCacheLevels_Original: SlicerCacheLevels = js.native
  
  def SlicerItems(Index: String): SlicerItem = js.native
  def SlicerItems(Index: Double): SlicerItem = js.native
  @JSName("SlicerItems")
  val SlicerItems_Original: SlicerItems = js.native
  
  def Slicers(Index: String): Slicer = js.native
  def Slicers(Index: Double): Slicer = js.native
  @JSName("Slicers")
  val Slicers_Original: Slicers = js.native
  
  var SortItems: XlSlicerSort = js.native
  
  var SortUsingCustomLists: Boolean = js.native
  
  val SourceName: String = js.native
  
  val SourceType: XlPivotTableSourceType = js.native
  
  def VisibleSlicerItems(Index: String): SlicerItem = js.native
  def VisibleSlicerItems(Index: Double): SlicerItem = js.native
  
  var VisibleSlicerItemsList: js.Any = js.native
  
  @JSName("VisibleSlicerItems")
  val VisibleSlicerItems_Original: SlicerItems = js.native
  
  val WorkbookConnection: typings.activexExcel.Excel.WorkbookConnection = js.native
}
