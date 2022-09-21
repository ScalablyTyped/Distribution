package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlicerCache extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  def ClearManualFilter(): Unit
  
  val Creator: XlCreator
  
  var CrossFilterType: XlSlicerCrossFilterType
  
  def Delete(): Unit
  
  /* private */ @JSName("Excel.SlicerCache_typekey")
  var ExcelDotSlicerCache_typekey: SlicerCache
  
  val Index: Double
  
  var Name: String
  
  val OLAP: Boolean
  
  val Parent: Any
  
  def PivotTables(Index: String): PivotTable
  def PivotTables(Index: Double): PivotTable
  @JSName("PivotTables")
  val PivotTables_Original: SlicerPivotTables
  
  var ShowAllItems: Boolean
  
  def SlicerCacheLevels(): SlicerCacheLevel
  def SlicerCacheLevels(Level: String): SlicerCacheLevel
  def SlicerCacheLevels(Level: Double): SlicerCacheLevel
  @JSName("SlicerCacheLevels")
  val SlicerCacheLevels_Original: SlicerCacheLevels
  
  def SlicerItems(Index: String): SlicerItem
  def SlicerItems(Index: Double): SlicerItem
  @JSName("SlicerItems")
  val SlicerItems_Original: SlicerItems
  
  def Slicers(Index: String): Slicer
  def Slicers(Index: Double): Slicer
  @JSName("Slicers")
  val Slicers_Original: Slicers
  
  var SortItems: XlSlicerSort
  
  var SortUsingCustomLists: Boolean
  
  val SourceName: String
  
  val SourceType: XlPivotTableSourceType
  
  def VisibleSlicerItems(Index: String): SlicerItem
  def VisibleSlicerItems(Index: Double): SlicerItem
  
  var VisibleSlicerItemsList: Any
  
  @JSName("VisibleSlicerItems")
  val VisibleSlicerItems_Original: SlicerItems
  
  val WorkbookConnection: typings.activexExcel.Excel.WorkbookConnection
}
object SlicerCache {
  
  inline def apply(
    Application: Application,
    ClearManualFilter: () => Unit,
    Creator: XlCreator,
    CrossFilterType: XlSlicerCrossFilterType,
    Delete: () => Unit,
    ExcelDotSlicerCache_typekey: SlicerCache,
    Index: Double,
    Name: String,
    OLAP: Boolean,
    Parent: Any,
    PivotTables: SlicerPivotTables,
    ShowAllItems: Boolean,
    SlicerCacheLevels: SlicerCacheLevels,
    SlicerItems: SlicerItems,
    Slicers: Slicers,
    SortItems: XlSlicerSort,
    SortUsingCustomLists: Boolean,
    SourceName: String,
    SourceType: XlPivotTableSourceType,
    VisibleSlicerItems: SlicerItems,
    VisibleSlicerItemsList: Any,
    WorkbookConnection: WorkbookConnection
  ): SlicerCache = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ClearManualFilter = js.Any.fromFunction0(ClearManualFilter), Creator = Creator.asInstanceOf[js.Any], CrossFilterType = CrossFilterType.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OLAP = OLAP.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PivotTables = PivotTables.asInstanceOf[js.Any], ShowAllItems = ShowAllItems.asInstanceOf[js.Any], SlicerCacheLevels = SlicerCacheLevels.asInstanceOf[js.Any], SlicerItems = SlicerItems.asInstanceOf[js.Any], Slicers = Slicers.asInstanceOf[js.Any], SortItems = SortItems.asInstanceOf[js.Any], SortUsingCustomLists = SortUsingCustomLists.asInstanceOf[js.Any], SourceName = SourceName.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any], VisibleSlicerItems = VisibleSlicerItems.asInstanceOf[js.Any], VisibleSlicerItemsList = VisibleSlicerItemsList.asInstanceOf[js.Any], WorkbookConnection = WorkbookConnection.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SlicerCache_typekey")(ExcelDotSlicerCache_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlicerCache]
  }
  
  extension [Self <: SlicerCache](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClearManualFilter(value: () => Unit): Self = StObject.set(x, "ClearManualFilter", js.Any.fromFunction0(value))
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setCrossFilterType(value: XlSlicerCrossFilterType): Self = StObject.set(x, "CrossFilterType", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setExcelDotSlicerCache_typekey(value: SlicerCache): Self = StObject.set(x, "Excel.SlicerCache_typekey", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOLAP(value: Boolean): Self = StObject.set(x, "OLAP", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPivotTables(value: SlicerPivotTables): Self = StObject.set(x, "PivotTables", value.asInstanceOf[js.Any])
    
    inline def setShowAllItems(value: Boolean): Self = StObject.set(x, "ShowAllItems", value.asInstanceOf[js.Any])
    
    inline def setSlicerCacheLevels(value: SlicerCacheLevels): Self = StObject.set(x, "SlicerCacheLevels", value.asInstanceOf[js.Any])
    
    inline def setSlicerItems(value: SlicerItems): Self = StObject.set(x, "SlicerItems", value.asInstanceOf[js.Any])
    
    inline def setSlicers(value: Slicers): Self = StObject.set(x, "Slicers", value.asInstanceOf[js.Any])
    
    inline def setSortItems(value: XlSlicerSort): Self = StObject.set(x, "SortItems", value.asInstanceOf[js.Any])
    
    inline def setSortUsingCustomLists(value: Boolean): Self = StObject.set(x, "SortUsingCustomLists", value.asInstanceOf[js.Any])
    
    inline def setSourceName(value: String): Self = StObject.set(x, "SourceName", value.asInstanceOf[js.Any])
    
    inline def setSourceType(value: XlPivotTableSourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setVisibleSlicerItems(value: SlicerItems): Self = StObject.set(x, "VisibleSlicerItems", value.asInstanceOf[js.Any])
    
    inline def setVisibleSlicerItemsList(value: Any): Self = StObject.set(x, "VisibleSlicerItemsList", value.asInstanceOf[js.Any])
    
    inline def setWorkbookConnection(value: WorkbookConnection): Self = StObject.set(x, "WorkbookConnection", value.asInstanceOf[js.Any])
  }
}
