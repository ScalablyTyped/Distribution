package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelBansResponse extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The information for each requested ban.
    */
  var ChannelBans: js.UndefOr[ChannelBanSummaryList] = js.undefined
  
  /**
    * The token passed by previous API calls until all requested bans are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.NextToken] = js.undefined
}
object ListChannelBansResponse {
  
  inline def apply(): ListChannelBansResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelBansResponse]
  }
  
  extension [Self <: ListChannelBansResponse](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    inline def setChannelBans(value: ChannelBanSummaryList): Self = StObject.set(x, "ChannelBans", value.asInstanceOf[js.Any])
    
    inline def setChannelBansUndefined: Self = StObject.set(x, "ChannelBans", js.undefined)
    
    inline def setChannelBansVarargs(value: ChannelBanSummary*): Self = StObject.set(x, "ChannelBans", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
