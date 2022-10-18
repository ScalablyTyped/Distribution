package typings.awsSdk.clientsPinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConfigurationSetEventDestinationRequest extends StObject {
  
  /**
    * ConfigurationSetName
    */
  var ConfigurationSetName: _String
  
  var EventDestination: js.UndefOr[EventDestinationDefinition] = js.undefined
  
  /**
    * A name that identifies the event destination.
    */
  var EventDestinationName: js.UndefOr[NonEmptyString] = js.undefined
}
object CreateConfigurationSetEventDestinationRequest {
  
  inline def apply(ConfigurationSetName: _String): CreateConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationSetEventDestinationRequest]
  }
  
  extension [Self <: CreateConfigurationSetEventDestinationRequest](x: Self) {
    
    inline def setConfigurationSetName(value: _String): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setEventDestination(value: EventDestinationDefinition): Self = StObject.set(x, "EventDestination", value.asInstanceOf[js.Any])
    
    inline def setEventDestinationName(value: NonEmptyString): Self = StObject.set(x, "EventDestinationName", value.asInstanceOf[js.Any])
    
    inline def setEventDestinationNameUndefined: Self = StObject.set(x, "EventDestinationName", js.undefined)
    
    inline def setEventDestinationUndefined: Self = StObject.set(x, "EventDestination", js.undefined)
  }
}
