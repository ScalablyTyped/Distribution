package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarChartSortConfiguration extends StObject {
  
  /**
    * The limit on the number of categories displayed in a bar chart.
    */
  var CategoryItemsLimit: js.UndefOr[ItemsLimitConfiguration] = js.undefined
  
  /**
    * The sort configuration of category fields.
    */
  var CategorySort: js.UndefOr[FieldSortOptionsList] = js.undefined
  
  /**
    * The limit on the number of values displayed in a bar chart.
    */
  var ColorItemsLimit: js.UndefOr[ItemsLimitConfiguration] = js.undefined
  
  /**
    * The sort configuration of color fields in a bar chart.
    */
  var ColorSort: js.UndefOr[FieldSortOptionsList] = js.undefined
  
  /**
    * The limit on the number of small multiples panels that are displayed.
    */
  var SmallMultiplesLimitConfiguration: js.UndefOr[ItemsLimitConfiguration] = js.undefined
  
  /**
    * The sort configuration of the small multiples field.
    */
  var SmallMultiplesSort: js.UndefOr[FieldSortOptionsList] = js.undefined
}
object BarChartSortConfiguration {
  
  inline def apply(): BarChartSortConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarChartSortConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BarChartSortConfiguration] (val x: Self) extends AnyVal {
    
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
    
    inline def setSmallMultiplesLimitConfiguration(value: ItemsLimitConfiguration): Self = StObject.set(x, "SmallMultiplesLimitConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSmallMultiplesLimitConfigurationUndefined: Self = StObject.set(x, "SmallMultiplesLimitConfiguration", js.undefined)
    
    inline def setSmallMultiplesSort(value: FieldSortOptionsList): Self = StObject.set(x, "SmallMultiplesSort", value.asInstanceOf[js.Any])
    
    inline def setSmallMultiplesSortUndefined: Self = StObject.set(x, "SmallMultiplesSort", js.undefined)
    
    inline def setSmallMultiplesSortVarargs(value: FieldSortOptions*): Self = StObject.set(x, "SmallMultiplesSort", js.Array(value*))
  }
}
