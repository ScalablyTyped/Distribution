package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetDefaultMessageTypeRequest extends StObject {
  
  /**
    * The configuration set to update with a new default message type. This field can be the ConsigurationSetName or ConfigurationSetArn.
    */
  var ConfigurationSetName: ConfigurationSetNameOrArn
  
  /**
    * The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and PROMOTIONAL for messages that aren't critical or time-sensitive.
    */
  var MessageType: typings.awsSdk.clientsPinpointsmsvoicev2Mod.MessageType
}
object SetDefaultMessageTypeRequest {
  
  inline def apply(ConfigurationSetName: ConfigurationSetNameOrArn, MessageType: MessageType): SetDefaultMessageTypeRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], MessageType = MessageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDefaultMessageTypeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetDefaultMessageTypeRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigurationSetName(value: ConfigurationSetNameOrArn): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setMessageType(value: MessageType): Self = StObject.set(x, "MessageType", value.asInstanceOf[js.Any])
  }
}
