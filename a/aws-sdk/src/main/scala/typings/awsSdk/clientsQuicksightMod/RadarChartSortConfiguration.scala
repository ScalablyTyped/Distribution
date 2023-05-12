package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadarChartSortConfiguration extends StObject {
  
  /**
    * The category items limit for a radar chart.
    */
  var CategoryItemsLimit: js.UndefOr[ItemsLimitConfiguration] = js.undefined
  
  /**
    * The category sort options of a radar chart.
    */
  var CategorySort: js.UndefOr[FieldSortOptionsList] = js.undefined
  
  /**
    * The color items limit of a radar chart.
    */
  var ColorItemsLimit: js.UndefOr[ItemsLimitConfiguration] = js.undefined
  
  /**
    * The color sort configuration of a radar chart.
    */
  var ColorSort: js.UndefOr[FieldSortOptionsList] = js.undefined
}
object RadarChartSortConfiguration {
  
  inline def apply(): RadarChartSortConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadarChartSortConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RadarChartSortConfiguration] (val x: Self) extends AnyVal {
    
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
