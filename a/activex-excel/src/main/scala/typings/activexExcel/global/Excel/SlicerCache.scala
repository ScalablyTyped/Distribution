package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.SlicerCacheLevels
import typings.activexExcel.Excel.SlicerItems
import typings.activexExcel.Excel.SlicerPivotTables
import typings.activexExcel.Excel.Slicers
import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlPivotTableSourceType
import typings.activexExcel.Excel.XlSlicerCrossFilterType
import typings.activexExcel.Excel.XlSlicerSort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.SlicerCache")
@js.native
/* private */ class SlicerCache ()
  extends StObject
     with typings.activexExcel.Excel.SlicerCache {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override def ClearManualFilter(): Unit = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  var CrossFilterType: XlSlicerCrossFilterType = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.SlicerCache_typekey")
  var ExcelDotSlicerCache_typekey: typings.activexExcel.Excel.SlicerCache = js.native
  
  /* CompleteClass */
  override val Index: Double = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  override val OLAP: Boolean = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override def PivotTables(Index: String): typings.activexExcel.Excel.PivotTable = js.native
  /* CompleteClass */
  override def PivotTables(Index: Double): typings.activexExcel.Excel.PivotTable = js.native
  /* CompleteClass */
  @JSName("PivotTables")
  override val PivotTables_Original: SlicerPivotTables = js.native
  
  /* CompleteClass */
  var ShowAllItems: Boolean = js.native
  
  /* CompleteClass */
  override def SlicerCacheLevels(): typings.activexExcel.Excel.SlicerCacheLevel = js.native
  /* CompleteClass */
  override def SlicerCacheLevels(Level: String): typings.activexExcel.Excel.SlicerCacheLevel = js.native
  /* CompleteClass */
  override def SlicerCacheLevels(Level: Double): typings.activexExcel.Excel.SlicerCacheLevel = js.native
  /* CompleteClass */
  @JSName("SlicerCacheLevels")
  override val SlicerCacheLevels_Original: SlicerCacheLevels = js.native
  
  /* CompleteClass */
  override def SlicerItems(Index: String): typings.activexExcel.Excel.SlicerItem = js.native
  /* CompleteClass */
  override def SlicerItems(Index: Double): typings.activexExcel.Excel.SlicerItem = js.native
  /* CompleteClass */
  @JSName("SlicerItems")
  override val SlicerItems_Original: SlicerItems = js.native
  
  /* CompleteClass */
  override def Slicers(Index: String): typings.activexExcel.Excel.Slicer = js.native
  /* CompleteClass */
  override def Slicers(Index: Double): typings.activexExcel.Excel.Slicer = js.native
  /* CompleteClass */
  @JSName("Slicers")
  override val Slicers_Original: Slicers = js.native
  
  /* CompleteClass */
  var SortItems: XlSlicerSort = js.native
  
  /* CompleteClass */
  var SortUsingCustomLists: Boolean = js.native
  
  /* CompleteClass */
  override val SourceName: String = js.native
  
  /* CompleteClass */
  override val SourceType: XlPivotTableSourceType = js.native
  
  /* CompleteClass */
  override def VisibleSlicerItems(Index: String): typings.activexExcel.Excel.SlicerItem = js.native
  /* CompleteClass */
  override def VisibleSlicerItems(Index: Double): typings.activexExcel.Excel.SlicerItem = js.native
  
  /* CompleteClass */
  var VisibleSlicerItemsList: js.Any = js.native
  
  /* CompleteClass */
  @JSName("VisibleSlicerItems")
  override val VisibleSlicerItems_Original: SlicerItems = js.native
  
  /* CompleteClass */
  override val WorkbookConnection: typings.activexExcel.Excel.WorkbookConnection = js.native
}
