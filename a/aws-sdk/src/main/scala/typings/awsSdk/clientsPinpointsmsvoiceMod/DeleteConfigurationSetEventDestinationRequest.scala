package typings.awsSdk.clientsPinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConfigurationSetEventDestinationRequest extends StObject {
  
  /**
    * ConfigurationSetName
    */
  var ConfigurationSetName: _String
  
  /**
    * EventDestinationName
    */
  var EventDestinationName: _String
}
object DeleteConfigurationSetEventDestinationRequest {
  
  inline def apply(ConfigurationSetName: _String, EventDestinationName: _String): DeleteConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], EventDestinationName = EventDestinationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigurationSetEventDestinationRequest]
  }
  
  extension [Self <: DeleteConfigurationSetEventDestinationRequest](x: Self) {
    
    inline def setConfigurationSetName(value: _String): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setEventDestinationName(value: _String): Self = StObject.set(x, "EventDestinationName", value.asInstanceOf[js.Any])
  }
}
