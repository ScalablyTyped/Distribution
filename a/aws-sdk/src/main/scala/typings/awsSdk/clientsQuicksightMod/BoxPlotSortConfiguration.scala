package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxPlotSortConfiguration extends StObject {
  
  /**
    * The sort configuration of a group by fields.
    */
  var CategorySort: js.UndefOr[FieldSortOptionsList] = js.undefined
  
  /**
    * The pagination configuration of a table visual or box plot.
    */
  var PaginationConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.PaginationConfiguration] = js.undefined
}
object BoxPlotSortConfiguration {
  
  inline def apply(): BoxPlotSortConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxPlotSortConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoxPlotSortConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCategorySort(value: FieldSortOptionsList): Self = StObject.set(x, "CategorySort", value.asInstanceOf[js.Any])
    
    inline def setCategorySortUndefined: Self = StObject.set(x, "CategorySort", js.undefined)
    
    inline def setCategorySortVarargs(value: FieldSortOptions*): Self = StObject.set(x, "CategorySort", js.Array(value*))
    
    inline def setPaginationConfiguration(value: PaginationConfiguration): Self = StObject.set(x, "PaginationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPaginationConfigurationUndefined: Self = StObject.set(x, "PaginationConfiguration", js.undefined)
  }
}
