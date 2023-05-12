package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatMapSortConfiguration extends StObject {
  
  /**
    * The limit on the number of columns that are displayed in a heat map.
    */
  var HeatMapColumnItemsLimitConfiguration: js.UndefOr[ItemsLimitConfiguration] = js.undefined
  
  /**
    * The column sort configuration for heat map for columns that aren't a part of a field well.
    */
  var HeatMapColumnSort: js.UndefOr[FieldSortOptionsList] = js.undefined
  
  /**
    * The limit on the number of rows that are displayed in a heat map.
    */
  var HeatMapRowItemsLimitConfiguration: js.UndefOr[ItemsLimitConfiguration] = js.undefined
  
  /**
    * The field sort configuration of the rows fields.
    */
  var HeatMapRowSort: js.UndefOr[FieldSortOptionsList] = js.undefined
}
object HeatMapSortConfiguration {
  
  inline def apply(): HeatMapSortConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeatMapSortConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeatMapSortConfiguration] (val x: Self) extends AnyVal {
    
    inline def setHeatMapColumnItemsLimitConfiguration(value: ItemsLimitConfiguration): Self = StObject.set(x, "HeatMapColumnItemsLimitConfiguration", value.asInstanceOf[js.Any])
    
    inline def setHeatMapColumnItemsLimitConfigurationUndefined: Self = StObject.set(x, "HeatMapColumnItemsLimitConfiguration", js.undefined)
    
    inline def setHeatMapColumnSort(value: FieldSortOptionsList): Self = StObject.set(x, "HeatMapColumnSort", value.asInstanceOf[js.Any])
    
    inline def setHeatMapColumnSortUndefined: Self = StObject.set(x, "HeatMapColumnSort", js.undefined)
    
    inline def setHeatMapColumnSortVarargs(value: FieldSortOptions*): Self = StObject.set(x, "HeatMapColumnSort", js.Array(value*))
    
    inline def setHeatMapRowItemsLimitConfiguration(value: ItemsLimitConfiguration): Self = StObject.set(x, "HeatMapRowItemsLimitConfiguration", value.asInstanceOf[js.Any])
    
    inline def setHeatMapRowItemsLimitConfigurationUndefined: Self = StObject.set(x, "HeatMapRowItemsLimitConfiguration", js.undefined)
    
    inline def setHeatMapRowSort(value: FieldSortOptionsList): Self = StObject.set(x, "HeatMapRowSort", value.asInstanceOf[js.Any])
    
    inline def setHeatMapRowSortUndefined: Self = StObject.set(x, "HeatMapRowSort", js.undefined)
    
    inline def setHeatMapRowSortVarargs(value: FieldSortOptions*): Self = StObject.set(x, "HeatMapRowSort", js.Array(value*))
  }
}
