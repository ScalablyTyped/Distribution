package typings.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConfigurationSetEventDestinationRequest extends StObject {
  
  /**
    * The name of the configuration set that contains the event destination that you want to delete.
    */
  var ConfigurationSetName: typings.awsSdk.clientsPinpointemailMod.ConfigurationSetName
  
  /**
    * The name of the event destination that you want to delete.
    */
  var EventDestinationName: typings.awsSdk.clientsPinpointemailMod.EventDestinationName
}
object DeleteConfigurationSetEventDestinationRequest {
  
  inline def apply(ConfigurationSetName: ConfigurationSetName, EventDestinationName: EventDestinationName): DeleteConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], EventDestinationName = EventDestinationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigurationSetEventDestinationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteConfigurationSetEventDestinationRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setEventDestinationName(value: EventDestinationName): Self = StObject.set(x, "EventDestinationName", value.asInstanceOf[js.Any])
  }
}
