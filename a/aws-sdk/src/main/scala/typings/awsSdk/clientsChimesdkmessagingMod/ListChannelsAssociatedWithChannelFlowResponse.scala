package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelsAssociatedWithChannelFlowResponse extends StObject {
  
  /**
    * The information about each channel.
    */
  var Channels: js.UndefOr[ChannelAssociatedWithFlowSummaryList] = js.undefined
  
  /**
    * The token passed by previous API calls until all requested channels are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.NextToken] = js.undefined
}
object ListChannelsAssociatedWithChannelFlowResponse {
  
  inline def apply(): ListChannelsAssociatedWithChannelFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelsAssociatedWithChannelFlowResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListChannelsAssociatedWithChannelFlowResponse] (val x: Self) extends AnyVal {
    
    inline def setChannels(value: ChannelAssociatedWithFlowSummaryList): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    inline def setChannelsVarargs(value: ChannelAssociatedWithFlowSummary*): Self = StObject.set(x, "Channels", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
