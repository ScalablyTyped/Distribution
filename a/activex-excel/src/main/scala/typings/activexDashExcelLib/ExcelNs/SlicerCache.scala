package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.SlicerCache")
@js.native
class SlicerCache protected () extends js.Object {
  val Application: Application = js.native
  val Creator: XlCreator = js.native
  var CrossFilterType: XlSlicerCrossFilterType = js.native
  var `Excel.SlicerCache_typekey`: SlicerCache = js.native
  val Index: scala.Double = js.native
  var Name: java.lang.String = js.native
  val OLAP: scala.Boolean = js.native
  val Parent: js.Any = js.native
  @JSName("PivotTables")
  val PivotTables_Original: SlicerPivotTables = js.native
  var ShowAllItems: scala.Boolean = js.native
  @JSName("SlicerCacheLevels")
  val SlicerCacheLevels_Original: SlicerCacheLevels = js.native
  @JSName("SlicerItems")
  val SlicerItems_Original: SlicerItems = js.native
  @JSName("Slicers")
  val Slicers_Original: Slicers = js.native
  var SortItems: XlSlicerSort = js.native
  var SortUsingCustomLists: scala.Boolean = js.native
  val SourceName: java.lang.String = js.native
  val SourceType: XlPivotTableSourceType = js.native
  var VisibleSlicerItemsList: js.Any = js.native
  @JSName("VisibleSlicerItems")
  val VisibleSlicerItems_Original: SlicerItems = js.native
  val WorkbookConnection: WorkbookConnection = js.native
  def ClearManualFilter(): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def PivotTables(Index: java.lang.String): PivotTable = js.native
  def PivotTables(Index: scala.Double): PivotTable = js.native
  def SlicerCacheLevels(): SlicerCacheLevel = js.native
  def SlicerCacheLevels(Level: java.lang.String): SlicerCacheLevel = js.native
  def SlicerCacheLevels(Level: scala.Double): SlicerCacheLevel = js.native
  def SlicerItems(Index: java.lang.String): SlicerItem = js.native
  def SlicerItems(Index: scala.Double): SlicerItem = js.native
  def Slicers(Index: java.lang.String): Slicer = js.native
  def Slicers(Index: scala.Double): Slicer = js.native
  def VisibleSlicerItems(Index: java.lang.String): SlicerItem = js.native
  def VisibleSlicerItems(Index: scala.Double): SlicerItem = js.native
}

