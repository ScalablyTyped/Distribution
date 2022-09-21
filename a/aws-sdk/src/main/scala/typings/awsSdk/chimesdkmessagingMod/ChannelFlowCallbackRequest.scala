package typings.awsSdk.chimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelFlowCallbackRequest extends StObject {
  
  /**
    * The identifier passed to the processor by the service when invoked. Use the identifier to call back the service.
    */
  var CallbackId: CallbackIdType
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn
  
  /**
    * Stores information about the processed message.
    */
  var ChannelMessage: ChannelMessageCallback
  
  /**
    * When a processor determines that a message needs to be DENIED, pass this parameter with a value of true.
    */
  var DeleteResource: js.UndefOr[NonNullableBoolean] = js.undefined
}
object ChannelFlowCallbackRequest {
  
  inline def apply(CallbackId: CallbackIdType, ChannelArn: ChimeArn, ChannelMessage: ChannelMessageCallback): ChannelFlowCallbackRequest = {
    val __obj = js.Dynamic.literal(CallbackId = CallbackId.asInstanceOf[js.Any], ChannelArn = ChannelArn.asInstanceOf[js.Any], ChannelMessage = ChannelMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelFlowCallbackRequest]
  }
  
  extension [Self <: ChannelFlowCallbackRequest](x: Self) {
    
    inline def setCallbackId(value: CallbackIdType): Self = StObject.set(x, "CallbackId", value.asInstanceOf[js.Any])
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelMessage(value: ChannelMessageCallback): Self = StObject.set(x, "ChannelMessage", value.asInstanceOf[js.Any])
    
    inline def setDeleteResource(value: NonNullableBoolean): Self = StObject.set(x, "DeleteResource", value.asInstanceOf[js.Any])
    
    inline def setDeleteResourceUndefined: Self = StObject.set(x, "DeleteResource", js.undefined)
  }
}
