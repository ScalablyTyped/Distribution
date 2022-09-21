package typings.awsSdk.chimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChannelFlowResponse extends StObject {
  
  /**
    * The ARN of the channel flow.
    */
  var ChannelFlowArn: js.UndefOr[ChimeArn] = js.undefined
}
object CreateChannelFlowResponse {
  
  inline def apply(): CreateChannelFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChannelFlowResponse]
  }
  
  extension [Self <: CreateChannelFlowResponse](x: Self) {
    
    inline def setChannelFlowArn(value: ChimeArn): Self = StObject.set(x, "ChannelFlowArn", value.asInstanceOf[js.Any])
    
    inline def setChannelFlowArnUndefined: Self = StObject.set(x, "ChannelFlowArn", js.undefined)
  }
}
