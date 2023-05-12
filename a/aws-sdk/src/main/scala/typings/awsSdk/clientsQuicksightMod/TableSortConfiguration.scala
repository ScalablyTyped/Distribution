package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableSortConfiguration extends StObject {
  
  /**
    * The pagination configuration (page size, page number) for the table.
    */
  var PaginationConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.PaginationConfiguration] = js.undefined
  
  /**
    * The field sort options for rows in the table.
    */
  var RowSort: js.UndefOr[RowSortList] = js.undefined
}
object TableSortConfiguration {
  
  inline def apply(): TableSortConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableSortConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableSortConfiguration] (val x: Self) extends AnyVal {
    
    inline def setPaginationConfiguration(value: PaginationConfiguration): Self = StObject.set(x, "PaginationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPaginationConfigurationUndefined: Self = StObject.set(x, "PaginationConfiguration", js.undefined)
    
    inline def setRowSort(value: RowSortList): Self = StObject.set(x, "RowSort", value.asInstanceOf[js.Any])
    
    inline def setRowSortUndefined: Self = StObject.set(x, "RowSort", js.undefined)
    
    inline def setRowSortVarargs(value: FieldSortOptions*): Self = StObject.set(x, "RowSort", js.Array(value*))
  }
}
