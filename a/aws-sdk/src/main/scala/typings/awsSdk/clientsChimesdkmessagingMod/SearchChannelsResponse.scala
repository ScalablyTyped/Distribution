package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchChannelsResponse extends StObject {
  
  /**
    * A list of the channels in the request.
    */
  var Channels: js.UndefOr[ChannelSummaryList] = js.undefined
  
  /**
    * The token returned from previous API responses until the number of channels is reached.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.NextToken] = js.undefined
}
object SearchChannelsResponse {
  
  inline def apply(): SearchChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchChannelsResponse]
  }
  
  extension [Self <: SearchChannelsResponse](x: Self) {
    
    inline def setChannels(value: ChannelSummaryList): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    inline def setChannelsVarargs(value: ChannelSummary*): Self = StObject.set(x, "Channels", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
