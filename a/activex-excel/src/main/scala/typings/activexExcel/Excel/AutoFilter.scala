package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoFilter extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  def ApplyFilter(): Unit
  
  val Creator: XlCreator
  
  /* private */ @JSName("Excel.AutoFilter_typekey")
  var ExcelDotAutoFilter_typekey: AutoFilter
  
  val FilterMode: Boolean
  
  def Filters(Index: Double): Filter
  @JSName("Filters")
  val Filters_Original: Filters
  
  val Parent: Any
  
  def Range(Address: String): typings.activexExcel.Excel.Range
  def Range(RowIndex: Double): typings.activexExcel.Excel.Range
  def Range(RowIndex: Double, ColumnIndex: Double): typings.activexExcel.Excel.Range
  @JSName("Range")
  val Range_Original: Range
  
  def ShowAllData(): Unit
  
  val Sort: typings.activexExcel.Excel.Sort
}
object AutoFilter {
  
  inline def apply(
    Application: Application,
    ApplyFilter: () => Unit,
    Creator: XlCreator,
    ExcelDotAutoFilter_typekey: AutoFilter,
    FilterMode: Boolean,
    Filters: Filters,
    Parent: Any,
    Range: Range,
    ShowAllData: () => Unit,
    Sort: Sort
  ): AutoFilter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ApplyFilter = js.Any.fromFunction0(ApplyFilter), Creator = Creator.asInstanceOf[js.Any], FilterMode = FilterMode.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], ShowAllData = js.Any.fromFunction0(ShowAllData), Sort = Sort.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.AutoFilter_typekey")(ExcelDotAutoFilter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFilter]
  }
  
  extension [Self <: AutoFilter](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setApplyFilter(value: () => Unit): Self = StObject.set(x, "ApplyFilter", js.Any.fromFunction0(value))
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotAutoFilter_typekey(value: AutoFilter): Self = StObject.set(x, "Excel.AutoFilter_typekey", value.asInstanceOf[js.Any])
    
    inline def setFilterMode(value: Boolean): Self = StObject.set(x, "FilterMode", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setShowAllData(value: () => Unit): Self = StObject.set(x, "ShowAllData", js.Any.fromFunction0(value))
    
    inline def setSort(value: Sort): Self = StObject.set(x, "Sort", value.asInstanceOf[js.Any])
  }
}
