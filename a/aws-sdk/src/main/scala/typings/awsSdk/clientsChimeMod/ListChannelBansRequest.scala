package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelBansRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The AppInstanceUserArn of the user that makes the API call.
    */
  var ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The maximum number of bans that you want returned.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsChimeMod.MaxResults] = js.undefined
  
  /**
    * The token passed by previous API calls until all requested bans are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsChimeMod.NextToken] = js.undefined
}
object ListChannelBansRequest {
  
  inline def apply(ChannelArn: ChimeArn): ListChannelBansRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChannelBansRequest]
  }
  
  extension [Self <: ListChannelBansRequest](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
    
    inline def setChimeBearerUndefined: Self = StObject.set(x, "ChimeBearer", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
