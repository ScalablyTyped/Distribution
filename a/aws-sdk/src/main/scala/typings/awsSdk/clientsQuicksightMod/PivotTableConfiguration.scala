package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotTableConfiguration extends StObject {
  
  /**
    * The field options for a pivot table visual.
    */
  var FieldOptions: js.UndefOr[PivotTableFieldOptions] = js.undefined
  
  /**
    * The field wells of the visual.
    */
  var FieldWells: js.UndefOr[PivotTableFieldWells] = js.undefined
  
  /**
    * The paginated report options for a pivot table visual.
    */
  var PaginatedReportOptions: js.UndefOr[PivotTablePaginatedReportOptions] = js.undefined
  
  /**
    * The sort configuration for a PivotTableVisual.
    */
  var SortConfiguration: js.UndefOr[PivotTableSortConfiguration] = js.undefined
  
  /**
    * The table options for a pivot table visual.
    */
  var TableOptions: js.UndefOr[PivotTableOptions] = js.undefined
  
  /**
    * The total options for a pivot table visual.
    */
  var TotalOptions: js.UndefOr[PivotTableTotalOptions] = js.undefined
}
object PivotTableConfiguration {
  
  inline def apply(): PivotTableConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotTableConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFieldOptions(value: PivotTableFieldOptions): Self = StObject.set(x, "FieldOptions", value.asInstanceOf[js.Any])
    
    inline def setFieldOptionsUndefined: Self = StObject.set(x, "FieldOptions", js.undefined)
    
    inline def setFieldWells(value: PivotTableFieldWells): Self = StObject.set(x, "FieldWells", value.asInstanceOf[js.Any])
    
    inline def setFieldWellsUndefined: Self = StObject.set(x, "FieldWells", js.undefined)
    
    inline def setPaginatedReportOptions(value: PivotTablePaginatedReportOptions): Self = StObject.set(x, "PaginatedReportOptions", value.asInstanceOf[js.Any])
    
    inline def setPaginatedReportOptionsUndefined: Self = StObject.set(x, "PaginatedReportOptions", js.undefined)
    
    inline def setSortConfiguration(value: PivotTableSortConfiguration): Self = StObject.set(x, "SortConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSortConfigurationUndefined: Self = StObject.set(x, "SortConfiguration", js.undefined)
    
    inline def setTableOptions(value: PivotTableOptions): Self = StObject.set(x, "TableOptions", value.asInstanceOf[js.Any])
    
    inline def setTableOptionsUndefined: Self = StObject.set(x, "TableOptions", js.undefined)
    
    inline def setTotalOptions(value: PivotTableTotalOptions): Self = StObject.set(x, "TotalOptions", value.asInstanceOf[js.Any])
    
    inline def setTotalOptionsUndefined: Self = StObject.set(x, "TotalOptions", js.undefined)
  }
}
