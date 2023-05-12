package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComboChartSortConfiguration extends StObject {
  
  /**
    * The item limit configuration for the category field well of a combo chart.
    */
  var CategoryItemsLimit: js.UndefOr[ItemsLimitConfiguration] = js.undefined
  
  /**
    * The sort configuration of the category field well in a combo chart.
    */
  var CategorySort: js.UndefOr[FieldSortOptionsList] = js.undefined
  
  /**
    * The item limit configuration of the color field well in a combo chart.
    */
  var ColorItemsLimit: js.UndefOr[ItemsLimitConfiguration] = js.undefined
  
  /**
    * The sort configuration of the color field well in a combo chart.
    */
  var ColorSort: js.UndefOr[FieldSortOptionsList] = js.undefined
}
object ComboChartSortConfiguration {
  
  inline def apply(): ComboChartSortConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComboChartSortConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComboChartSortConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCategoryItemsLimit(value: ItemsLimitConfiguration): Self = StObject.set(x, "CategoryItemsLimit", value.asInstanceOf[js.Any])
    
    inline def setCategoryItemsLimitUndefined: Self = StObject.set(x, "CategoryItemsLimit", js.undefined)
    
    inline def setCategorySort(value: FieldSortOptionsList): Self = StObject.set(x, "CategorySort", value.asInstanceOf[js.Any])
    
    inline def setCategorySortUndefined: Self = StObject.set(x, "CategorySort", js.undefined)
    
    inline def setCategorySortVarargs(value: FieldSortOptions*): Self = StObject.set(x, "CategorySort", js.Array(value*))
    
    inline def setColorItemsLimit(value: ItemsLimitConfiguration): Self = StObject.set(x, "ColorItemsLimit", value.asInstanceOf[js.Any])
    
    inline def setColorItemsLimitUndefined: Self = StObject.set(x, "ColorItemsLimit", js.undefined)
    
    inline def setColorSort(value: FieldSortOptionsList): Self = StObject.set(x, "ColorSort", value.asInstanceOf[js.Any])
    
    inline def setColorSortUndefined: Self = StObject.set(x, "ColorSort", js.undefined)
    
    inline def setColorSortVarargs(value: FieldSortOptions*): Self = StObject.set(x, "ColorSort", js.Array(value*))
  }
}
