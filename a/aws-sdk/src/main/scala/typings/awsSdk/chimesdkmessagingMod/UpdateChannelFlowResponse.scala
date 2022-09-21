package typings.awsSdk.chimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateChannelFlowResponse extends StObject {
  
  /**
    * The ARN of the channel flow.
    */
  var ChannelFlowArn: js.UndefOr[ChimeArn] = js.undefined
}
object UpdateChannelFlowResponse {
  
  inline def apply(): UpdateChannelFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateChannelFlowResponse]
  }
  
  extension [Self <: UpdateChannelFlowResponse](x: Self) {
    
    inline def setChannelFlowArn(value: ChimeArn): Self = StObject.set(x, "ChannelFlowArn", value.asInstanceOf[js.Any])
    
    inline def setChannelFlowArnUndefined: Self = StObject.set(x, "ChannelFlowArn", js.undefined)
  }
}
