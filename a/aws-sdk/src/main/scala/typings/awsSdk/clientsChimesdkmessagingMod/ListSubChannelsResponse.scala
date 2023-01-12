package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSubChannelsResponse extends StObject {
  
  /**
    * The ARN of elastic channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The token passed by previous API calls until all requested sub-channels are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.NextToken] = js.undefined
  
  /**
    * The information about each sub-channel.
    */
  var SubChannels: js.UndefOr[SubChannelSummaryList] = js.undefined
}
object ListSubChannelsResponse {
  
  inline def apply(): ListSubChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSubChannelsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSubChannelsResponse] (val x: Self) extends AnyVal {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSubChannels(value: SubChannelSummaryList): Self = StObject.set(x, "SubChannels", value.asInstanceOf[js.Any])
    
    inline def setSubChannelsUndefined: Self = StObject.set(x, "SubChannels", js.undefined)
    
    inline def setSubChannelsVarargs(value: SubChannelSummary*): Self = StObject.set(x, "SubChannels", js.Array(value*))
  }
}
