package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunnelChartSortConfiguration extends StObject {
  
  /**
    * The limit on the number of categories displayed.
    */
  var CategoryItemsLimit: js.UndefOr[ItemsLimitConfiguration] = js.undefined
  
  /**
    * The sort configuration of the category fields.
    */
  var CategorySort: js.UndefOr[FieldSortOptionsList] = js.undefined
}
object FunnelChartSortConfiguration {
  
  inline def apply(): FunnelChartSortConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunnelChartSortConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FunnelChartSortConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCategoryItemsLimit(value: ItemsLimitConfiguration): Self = StObject.set(x, "CategoryItemsLimit", value.asInstanceOf[js.Any])
    
    inline def setCategoryItemsLimitUndefined: Self = StObject.set(x, "CategoryItemsLimit", js.undefined)
    
    inline def setCategorySort(value: FieldSortOptionsList): Self = StObject.set(x, "CategorySort", value.asInstanceOf[js.Any])
    
    inline def setCategorySortUndefined: Self = StObject.set(x, "CategorySort", js.undefined)
    
    inline def setCategorySortVarargs(value: FieldSortOptions*): Self = StObject.set(x, "CategorySort", js.Array(value*))
  }
}
