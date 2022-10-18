package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelFlowCallbackResponse extends StObject {
  
  /**
    * The call back ID passed in the request.
    */
  var CallbackId: js.UndefOr[CallbackIdType] = js.undefined
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.undefined
}
object ChannelFlowCallbackResponse {
  
  inline def apply(): ChannelFlowCallbackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelFlowCallbackResponse]
  }
  
  extension [Self <: ChannelFlowCallbackResponse](x: Self) {
    
    inline def setCallbackId(value: CallbackIdType): Self = StObject.set(x, "CallbackId", value.asInstanceOf[js.Any])
    
    inline def setCallbackIdUndefined: Self = StObject.set(x, "CallbackId", js.undefined)
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
  }
}
