package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThingIndexingConfiguration extends StObject {
  
  /**
    * Contains custom field names and their data type.
    */
  var customFields: js.UndefOr[Fields] = js.undefined
  
  /**
    * Device Defender indexing mode. Valid values are:   VIOLATIONS – Your thing index contains Device Defender violations. To enable Device Defender indexing, deviceDefenderIndexingMode must not be set to OFF.   OFF - Device Defender indexing is disabled.   For more information about Device Defender violations, see Device Defender Detect. 
    */
  var deviceDefenderIndexingMode: js.UndefOr[DeviceDefenderIndexingMode] = js.undefined
  
  /**
    * Provides additional filters for specific data sources. Named shadow is the only data source that currently supports and requires a filter. To add named shadows to your fleet indexing configuration, set namedShadowIndexingMode to be ON and specify your shadow names in filter.
    */
  var filter: js.UndefOr[IndexingFilter] = js.undefined
  
  /**
    * Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
    */
  var managedFields: js.UndefOr[Fields] = js.undefined
  
  /**
    * Named shadow indexing mode. Valid values are:   ON – Your thing index contains named shadow. To enable thing named shadow indexing, namedShadowIndexingMode must not be set to OFF.   OFF - Named shadow indexing is disabled.   For more information about Shadows, see IoT Device Shadow service. 
    */
  var namedShadowIndexingMode: js.UndefOr[NamedShadowIndexingMode] = js.undefined
  
  /**
    * Thing connectivity indexing mode. Valid values are:    STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing, thingIndexMode must not be set to OFF.   OFF - Thing connectivity status indexing is disabled.  
    */
  var thingConnectivityIndexingMode: js.UndefOr[ThingConnectivityIndexingMode] = js.undefined
  
  /**
    * Thing indexing mode. Valid values are:   REGISTRY – Your thing index contains registry data only.   REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.   OFF - Thing indexing is disabled.  
    */
  var thingIndexingMode: ThingIndexingMode
}
object ThingIndexingConfiguration {
  
  inline def apply(thingIndexingMode: ThingIndexingMode): ThingIndexingConfiguration = {
    val __obj = js.Dynamic.literal(thingIndexingMode = thingIndexingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingIndexingConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThingIndexingConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCustomFields(value: Fields): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    inline def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
    
    inline def setCustomFieldsVarargs(value: Field*): Self = StObject.set(x, "customFields", js.Array(value*))
    
    inline def setDeviceDefenderIndexingMode(value: DeviceDefenderIndexingMode): Self = StObject.set(x, "deviceDefenderIndexingMode", value.asInstanceOf[js.Any])
    
    inline def setDeviceDefenderIndexingModeUndefined: Self = StObject.set(x, "deviceDefenderIndexingMode", js.undefined)
    
    inline def setFilter(value: IndexingFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setManagedFields(value: Fields): Self = StObject.set(x, "managedFields", value.asInstanceOf[js.Any])
    
    inline def setManagedFieldsUndefined: Self = StObject.set(x, "managedFields", js.undefined)
    
    inline def setManagedFieldsVarargs(value: Field*): Self = StObject.set(x, "managedFields", js.Array(value*))
    
    inline def setNamedShadowIndexingMode(value: NamedShadowIndexingMode): Self = StObject.set(x, "namedShadowIndexingMode", value.asInstanceOf[js.Any])
    
    inline def setNamedShadowIndexingModeUndefined: Self = StObject.set(x, "namedShadowIndexingMode", js.undefined)
    
    inline def setThingConnectivityIndexingMode(value: ThingConnectivityIndexingMode): Self = StObject.set(x, "thingConnectivityIndexingMode", value.asInstanceOf[js.Any])
    
    inline def setThingConnectivityIndexingModeUndefined: Self = StObject.set(x, "thingConnectivityIndexingMode", js.undefined)
    
    inline def setThingIndexingMode(value: ThingIndexingMode): Self = StObject.set(x, "thingIndexingMode", value.asInstanceOf[js.Any])
  }
}
