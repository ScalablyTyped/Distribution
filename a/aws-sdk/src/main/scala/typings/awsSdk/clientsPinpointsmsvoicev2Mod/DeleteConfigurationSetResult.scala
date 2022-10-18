package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConfigurationSetResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the deleted configuration set.
    */
  var ConfigurationSetArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the deleted configuration set.
    */
  var ConfigurationSetName: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.ConfigurationSetName] = js.undefined
  
  /**
    * The time that the deleted configuration set was created in UNIX epoch time format.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The default message type of the configuration set that was deleted.
    */
  var DefaultMessageType: js.UndefOr[MessageType] = js.undefined
  
  /**
    * The default Sender ID of the configuration set that was deleted.
    */
  var DefaultSenderId: js.UndefOr[SenderId] = js.undefined
  
  /**
    * An array of any EventDestination objects that were associated with the deleted configuration set.
    */
  var EventDestinations: js.UndefOr[EventDestinationList] = js.undefined
}
object DeleteConfigurationSetResult {
  
  inline def apply(): DeleteConfigurationSetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteConfigurationSetResult]
  }
  
  extension [Self <: DeleteConfigurationSetResult](x: Self) {
    
    inline def setConfigurationSetArn(value: String): Self = StObject.set(x, "ConfigurationSetArn", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetArnUndefined: Self = StObject.set(x, "ConfigurationSetArn", js.undefined)
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setDefaultMessageType(value: MessageType): Self = StObject.set(x, "DefaultMessageType", value.asInstanceOf[js.Any])
    
    inline def setDefaultMessageTypeUndefined: Self = StObject.set(x, "DefaultMessageType", js.undefined)
    
    inline def setDefaultSenderId(value: SenderId): Self = StObject.set(x, "DefaultSenderId", value.asInstanceOf[js.Any])
    
    inline def setDefaultSenderIdUndefined: Self = StObject.set(x, "DefaultSenderId", js.undefined)
    
    inline def setEventDestinations(value: EventDestinationList): Self = StObject.set(x, "EventDestinations", value.asInstanceOf[js.Any])
    
    inline def setEventDestinationsUndefined: Self = StObject.set(x, "EventDestinations", js.undefined)
    
    inline def setEventDestinationsVarargs(value: EventDestination*): Self = StObject.set(x, "EventDestinations", js.Array(value*))
  }
}
