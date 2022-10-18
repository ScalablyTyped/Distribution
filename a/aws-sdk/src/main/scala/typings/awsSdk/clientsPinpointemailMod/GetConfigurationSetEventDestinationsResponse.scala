package typings.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConfigurationSetEventDestinationsResponse extends StObject {
  
  /**
    * An array that includes all of the events destinations that have been configured for the configuration set.
    */
  var EventDestinations: js.UndefOr[typings.awsSdk.clientsPinpointemailMod.EventDestinations] = js.undefined
}
object GetConfigurationSetEventDestinationsResponse {
  
  inline def apply(): GetConfigurationSetEventDestinationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConfigurationSetEventDestinationsResponse]
  }
  
  extension [Self <: GetConfigurationSetEventDestinationsResponse](x: Self) {
    
    inline def setEventDestinations(value: EventDestinations): Self = StObject.set(x, "EventDestinations", value.asInstanceOf[js.Any])
    
    inline def setEventDestinationsUndefined: Self = StObject.set(x, "EventDestinations", js.undefined)
    
    inline def setEventDestinationsVarargs(value: EventDestination*): Self = StObject.set(x, "EventDestinations", js.Array(value*))
  }
}
