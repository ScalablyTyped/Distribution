package typings.activexDashExcel.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.SlicerCache")
@js.native
class SlicerCache protected () extends js.Object {
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  val Creator: XlCreator = js.native
  var CrossFilterType: XlSlicerCrossFilterType = js.native
  var `Excel.SlicerCache_typekey`: SlicerCache = js.native
  val Index: Double = js.native
  var Name: String = js.native
  val OLAP: Boolean = js.native
  val Parent: js.Any = js.native
  @JSName("PivotTables")
  val PivotTables_Original: SlicerPivotTables = js.native
  var ShowAllItems: Boolean = js.native
  @JSName("SlicerCacheLevels")
  val SlicerCacheLevels_Original: SlicerCacheLevels = js.native
  @JSName("SlicerItems")
  val SlicerItems_Original: SlicerItems = js.native
  @JSName("Slicers")
  val Slicers_Original: Slicers = js.native
  var SortItems: XlSlicerSort = js.native
  var SortUsingCustomLists: Boolean = js.native
  val SourceName: String = js.native
  val SourceType: XlPivotTableSourceType = js.native
  var VisibleSlicerItemsList: js.Any = js.native
  @JSName("VisibleSlicerItems")
  val VisibleSlicerItems_Original: SlicerItems = js.native
  val WorkbookConnection: typings.activexDashExcel.ExcelNs.WorkbookConnection = js.native
  def ClearManualFilter(): Unit = js.native
  def Delete(): Unit = js.native
  def PivotTables(Index: String): PivotTable = js.native
  def PivotTables(Index: Double): PivotTable = js.native
  def SlicerCacheLevels(): SlicerCacheLevel = js.native
  def SlicerCacheLevels(Level: String): SlicerCacheLevel = js.native
  def SlicerCacheLevels(Level: Double): SlicerCacheLevel = js.native
  def SlicerItems(Index: String): SlicerItem = js.native
  def SlicerItems(Index: Double): SlicerItem = js.native
  def Slicers(Index: String): Slicer = js.native
  def Slicers(Index: Double): Slicer = js.native
  def VisibleSlicerItems(Index: String): SlicerItem = js.native
  def VisibleSlicerItems(Index: Double): SlicerItem = js.native
}

