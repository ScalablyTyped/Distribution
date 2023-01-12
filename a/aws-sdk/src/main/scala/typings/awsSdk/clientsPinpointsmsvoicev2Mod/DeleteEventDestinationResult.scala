package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEventDestinationResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the configuration set.
    */
  var ConfigurationSetArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the configuration set the event destination was deleted from.
    */
  var ConfigurationSetName: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.ConfigurationSetName] = js.undefined
  
  /**
    * The event destination object that was deleted.
    */
  var EventDestination: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.EventDestination] = js.undefined
}
object DeleteEventDestinationResult {
  
  inline def apply(): DeleteEventDestinationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteEventDestinationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteEventDestinationResult] (val x: Self) extends AnyVal {
    
    inline def setConfigurationSetArn(value: String): Self = StObject.set(x, "ConfigurationSetArn", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetArnUndefined: Self = StObject.set(x, "ConfigurationSetArn", js.undefined)
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
    
    inline def setEventDestination(value: EventDestination): Self = StObject.set(x, "EventDestination", value.asInstanceOf[js.Any])
    
    inline def setEventDestinationUndefined: Self = StObject.set(x, "EventDestination", js.undefined)
  }
}
