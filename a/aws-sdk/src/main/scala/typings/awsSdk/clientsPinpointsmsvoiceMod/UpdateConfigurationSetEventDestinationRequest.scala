package typings.awsSdk.clientsPinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConfigurationSetEventDestinationRequest extends StObject {
  
  /**
    * ConfigurationSetName
    */
  var ConfigurationSetName: _String
  
  var EventDestination: js.UndefOr[EventDestinationDefinition] = js.undefined
  
  /**
    * EventDestinationName
    */
  var EventDestinationName: _String
}
object UpdateConfigurationSetEventDestinationRequest {
  
  inline def apply(ConfigurationSetName: _String, EventDestinationName: _String): UpdateConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], EventDestinationName = EventDestinationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationSetEventDestinationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateConfigurationSetEventDestinationRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigurationSetName(value: _String): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setEventDestination(value: EventDestinationDefinition): Self = StObject.set(x, "EventDestination", value.asInstanceOf[js.Any])
    
    inline def setEventDestinationName(value: _String): Self = StObject.set(x, "EventDestinationName", value.asInstanceOf[js.Any])
    
    inline def setEventDestinationUndefined: Self = StObject.set(x, "EventDestination", js.undefined)
  }
}
