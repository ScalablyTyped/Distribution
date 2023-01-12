package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteQueuedMessagesRequest extends StObject {
  
  /**
    * The ID of a given wireless device for which downlink messages will be deleted.
    */
  var Id: WirelessDeviceId
  
  /**
    * If message ID is "*", it cleares the entire downlink queue for a given device, specified by the wireless device ID. Otherwise, the downlink message with the specified message ID will be deleted.
    */
  var MessageId: typings.awsSdk.clientsIotwirelessMod.MessageId
  
  /**
    * The wireless device type, which can be either Sidewalk or LoRaWAN.
    */
  var WirelessDeviceType: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.WirelessDeviceType] = js.undefined
}
object DeleteQueuedMessagesRequest {
  
  inline def apply(Id: WirelessDeviceId, MessageId: MessageId): DeleteQueuedMessagesRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteQueuedMessagesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteQueuedMessagesRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: WirelessDeviceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setWirelessDeviceType(value: WirelessDeviceType): Self = StObject.set(x, "WirelessDeviceType", value.asInstanceOf[js.Any])
    
    inline def setWirelessDeviceTypeUndefined: Self = StObject.set(x, "WirelessDeviceType", js.undefined)
  }
}
