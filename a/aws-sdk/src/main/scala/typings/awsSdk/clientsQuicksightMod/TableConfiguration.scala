package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableConfiguration extends StObject {
  
  /**
    * The field options for a table visual.
    */
  var FieldOptions: js.UndefOr[TableFieldOptions] = js.undefined
  
  /**
    * The field wells of the visual.
    */
  var FieldWells: js.UndefOr[TableFieldWells] = js.undefined
  
  /**
    * The paginated report options for a table visual.
    */
  var PaginatedReportOptions: js.UndefOr[TablePaginatedReportOptions] = js.undefined
  
  /**
    * The sort configuration for a TableVisual.
    */
  var SortConfiguration: js.UndefOr[TableSortConfiguration] = js.undefined
  
  /**
    * A collection of inline visualizations to display within a chart.
    */
  var TableInlineVisualizations: js.UndefOr[TableInlineVisualizationList] = js.undefined
  
  /**
    * The table options for a table visual.
    */
  var TableOptions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TableOptions] = js.undefined
  
  /**
    * The total options for a table visual.
    */
  var TotalOptions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TotalOptions] = js.undefined
}
object TableConfiguration {
  
  inline def apply(): TableConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFieldOptions(value: TableFieldOptions): Self = StObject.set(x, "FieldOptions", value.asInstanceOf[js.Any])
    
    inline def setFieldOptionsUndefined: Self = StObject.set(x, "FieldOptions", js.undefined)
    
    inline def setFieldWells(value: TableFieldWells): Self = StObject.set(x, "FieldWells", value.asInstanceOf[js.Any])
    
    inline def setFieldWellsUndefined: Self = StObject.set(x, "FieldWells", js.undefined)
    
    inline def setPaginatedReportOptions(value: TablePaginatedReportOptions): Self = StObject.set(x, "PaginatedReportOptions", value.asInstanceOf[js.Any])
    
    inline def setPaginatedReportOptionsUndefined: Self = StObject.set(x, "PaginatedReportOptions", js.undefined)
    
    inline def setSortConfiguration(value: TableSortConfiguration): Self = StObject.set(x, "SortConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSortConfigurationUndefined: Self = StObject.set(x, "SortConfiguration", js.undefined)
    
    inline def setTableInlineVisualizations(value: TableInlineVisualizationList): Self = StObject.set(x, "TableInlineVisualizations", value.asInstanceOf[js.Any])
    
    inline def setTableInlineVisualizationsUndefined: Self = StObject.set(x, "TableInlineVisualizations", js.undefined)
    
    inline def setTableInlineVisualizationsVarargs(value: TableInlineVisualization*): Self = StObject.set(x, "TableInlineVisualizations", js.Array(value*))
    
    inline def setTableOptions(value: TableOptions): Self = StObject.set(x, "TableOptions", value.asInstanceOf[js.Any])
    
    inline def setTableOptionsUndefined: Self = StObject.set(x, "TableOptions", js.undefined)
    
    inline def setTotalOptions(value: TotalOptions): Self = StObject.set(x, "TotalOptions", value.asInstanceOf[js.Any])
    
    inline def setTotalOptionsUndefined: Self = StObject.set(x, "TotalOptions", js.undefined)
  }
}
