package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineChartSortConfiguration extends StObject {
  
  /**
    * The limit on the number of categories that are displayed in a line chart.
    */
  var CategoryItemsLimitConfiguration: js.UndefOr[ItemsLimitConfiguration] = js.undefined
  
  /**
    * The sort configuration of the category fields.
    */
  var CategorySort: js.UndefOr[FieldSortOptionsList] = js.undefined
  
  /**
    * The limit on the number of lines that are displayed in a line chart.
    */
  var ColorItemsLimitConfiguration: js.UndefOr[ItemsLimitConfiguration] = js.undefined
  
  /**
    * The limit on the number of small multiples panels that are displayed.
    */
  var SmallMultiplesLimitConfiguration: js.UndefOr[ItemsLimitConfiguration] = js.undefined
  
  /**
    * The sort configuration of the small multiples field.
    */
  var SmallMultiplesSort: js.UndefOr[FieldSortOptionsList] = js.undefined
}
object LineChartSortConfiguration {
  
  inline def apply(): LineChartSortConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineChartSortConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineChartSortConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCategoryItemsLimitConfiguration(value: ItemsLimitConfiguration): Self = StObject.set(x, "CategoryItemsLimitConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCategoryItemsLimitConfigurationUndefined: Self = StObject.set(x, "CategoryItemsLimitConfiguration", js.undefined)
    
    inline def setCategorySort(value: FieldSortOptionsList): Self = StObject.set(x, "CategorySort", value.asInstanceOf[js.Any])
    
    inline def setCategorySortUndefined: Self = StObject.set(x, "CategorySort", js.undefined)
    
    inline def setCategorySortVarargs(value: FieldSortOptions*): Self = StObject.set(x, "CategorySort", js.Array(value*))
    
    inline def setColorItemsLimitConfiguration(value: ItemsLimitConfiguration): Self = StObject.set(x, "ColorItemsLimitConfiguration", value.asInstanceOf[js.Any])
    
    inline def setColorItemsLimitConfigurationUndefined: Self = StObject.set(x, "ColorItemsLimitConfiguration", js.undefined)
    
    inline def setSmallMultiplesLimitConfiguration(value: ItemsLimitConfiguration): Self = StObject.set(x, "SmallMultiplesLimitConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSmallMultiplesLimitConfigurationUndefined: Self = StObject.set(x, "SmallMultiplesLimitConfiguration", js.undefined)
    
    inline def setSmallMultiplesSort(value: FieldSortOptionsList): Self = StObject.set(x, "SmallMultiplesSort", value.asInstanceOf[js.Any])
    
    inline def setSmallMultiplesSortUndefined: Self = StObject.set(x, "SmallMultiplesSort", js.undefined)
    
    inline def setSmallMultiplesSortVarargs(value: FieldSortOptions*): Self = StObject.set(x, "SmallMultiplesSort", js.Array(value*))
  }
}
