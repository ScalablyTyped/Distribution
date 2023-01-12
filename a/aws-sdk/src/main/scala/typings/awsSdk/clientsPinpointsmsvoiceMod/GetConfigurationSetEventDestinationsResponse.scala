package typings.awsSdk.clientsPinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConfigurationSetEventDestinationsResponse extends StObject {
  
  var EventDestinations: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoiceMod.EventDestinations] = js.undefined
}
object GetConfigurationSetEventDestinationsResponse {
  
  inline def apply(): GetConfigurationSetEventDestinationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConfigurationSetEventDestinationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetConfigurationSetEventDestinationsResponse] (val x: Self) extends AnyVal {
    
    inline def setEventDestinations(value: EventDestinations): Self = StObject.set(x, "EventDestinations", value.asInstanceOf[js.Any])
    
    inline def setEventDestinationsUndefined: Self = StObject.set(x, "EventDestinations", js.undefined)
    
    inline def setEventDestinationsVarargs(value: EventDestination*): Self = StObject.set(x, "EventDestinations", js.Array(value*))
  }
}
