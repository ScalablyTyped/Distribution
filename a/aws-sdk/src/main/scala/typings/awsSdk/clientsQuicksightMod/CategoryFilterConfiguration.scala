package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoryFilterConfiguration extends StObject {
  
  /**
    * A custom filter that filters based on a single value. This filter can be partially matched.
    */
  var CustomFilterConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.CustomFilterConfiguration] = js.undefined
  
  /**
    * A list of custom filter values. In the Amazon QuickSight console, this filter type is called a custom filter list.
    */
  var CustomFilterListConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.CustomFilterListConfiguration] = js.undefined
  
  /**
    * A list of filter configurations. In the Amazon QuickSight console, this filter type is called a filter list.
    */
  var FilterListConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FilterListConfiguration] = js.undefined
}
object CategoryFilterConfiguration {
  
  inline def apply(): CategoryFilterConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoryFilterConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CategoryFilterConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCustomFilterConfiguration(value: CustomFilterConfiguration): Self = StObject.set(x, "CustomFilterConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCustomFilterConfigurationUndefined: Self = StObject.set(x, "CustomFilterConfiguration", js.undefined)
    
    inline def setCustomFilterListConfiguration(value: CustomFilterListConfiguration): Self = StObject.set(x, "CustomFilterListConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCustomFilterListConfigurationUndefined: Self = StObject.set(x, "CustomFilterListConfiguration", js.undefined)
    
    inline def setFilterListConfiguration(value: FilterListConfiguration): Self = StObject.set(x, "FilterListConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFilterListConfigurationUndefined: Self = StObject.set(x, "FilterListConfiguration", js.undefined)
  }
}
