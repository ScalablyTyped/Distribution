package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEventDestinationResult extends StObject {
  
  /**
    * The ARN of the configuration set.
    */
  var ConfigurationSetArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the configuration set.
    */
  var ConfigurationSetName: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.ConfigurationSetName] = js.undefined
  
  /**
    * The details of the destination where events are logged.
    */
  var EventDestination: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.EventDestination] = js.undefined
}
object CreateEventDestinationResult {
  
  inline def apply(): CreateEventDestinationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEventDestinationResult]
  }
  
  extension [Self <: CreateEventDestinationResult](x: Self) {
    
    inline def setConfigurationSetArn(value: String): Self = StObject.set(x, "ConfigurationSetArn", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetArnUndefined: Self = StObject.set(x, "ConfigurationSetArn", js.undefined)
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
    
    inline def setEventDestination(value: EventDestination): Self = StObject.set(x, "EventDestination", value.asInstanceOf[js.Any])
    
    inline def setEventDestinationUndefined: Self = StObject.set(x, "EventDestination", js.undefined)
  }
}
