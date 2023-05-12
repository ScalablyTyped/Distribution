package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaterfallChartSortConfiguration extends StObject {
  
  /**
    * The limit on the number of bar groups that are displayed.
    */
  var BreakdownItemsLimit: js.UndefOr[ItemsLimitConfiguration] = js.undefined
  
  /**
    * The sort configuration of the category fields.
    */
  var CategorySort: js.UndefOr[FieldSortOptionsList] = js.undefined
}
object WaterfallChartSortConfiguration {
  
  inline def apply(): WaterfallChartSortConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaterfallChartSortConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WaterfallChartSortConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBreakdownItemsLimit(value: ItemsLimitConfiguration): Self = StObject.set(x, "BreakdownItemsLimit", value.asInstanceOf[js.Any])
    
    inline def setBreakdownItemsLimitUndefined: Self = StObject.set(x, "BreakdownItemsLimit", js.undefined)
    
    inline def setCategorySort(value: FieldSortOptionsList): Self = StObject.set(x, "CategorySort", value.asInstanceOf[js.Any])
    
    inline def setCategorySortUndefined: Self = StObject.set(x, "CategorySort", js.undefined)
    
    inline def setCategorySortVarargs(value: FieldSortOptions*): Self = StObject.set(x, "CategorySort", js.Array(value*))
  }
}
