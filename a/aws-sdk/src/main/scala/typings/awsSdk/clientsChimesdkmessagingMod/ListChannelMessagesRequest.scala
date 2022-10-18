package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelMessagesRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The AppInstanceUserArn of the user that makes the API call.
    */
  var ChimeBearer: ChimeArn
  
  /**
    * The maximum number of messages that you want returned.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.MaxResults] = js.undefined
  
  /**
    * The token passed by previous API calls until all requested messages are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.NextToken] = js.undefined
  
  /**
    * The final or ending time stamp for your requested messages.
    */
  var NotAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The initial or starting time stamp for your requested messages.
    */
  var NotBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The order in which you want messages sorted. Default is Descending, based on time created.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.SortOrder] = js.undefined
  
  /**
    * The ID of the SubChannel in the request.  Only required when listing the messages in a SubChannel that the user belongs to. 
    */
  var SubChannelId: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.SubChannelId] = js.undefined
}
object ListChannelMessagesRequest {
  
  inline def apply(ChannelArn: ChimeArn, ChimeBearer: ChimeArn): ListChannelMessagesRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], ChimeBearer = ChimeBearer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChannelMessagesRequest]
  }
  
  extension [Self <: ListChannelMessagesRequest](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setNotAfter(value: js.Date): Self = StObject.set(x, "NotAfter", value.asInstanceOf[js.Any])
    
    inline def setNotAfterUndefined: Self = StObject.set(x, "NotAfter", js.undefined)
    
    inline def setNotBefore(value: js.Date): Self = StObject.set(x, "NotBefore", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeUndefined: Self = StObject.set(x, "NotBefore", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
    
    inline def setSubChannelId(value: SubChannelId): Self = StObject.set(x, "SubChannelId", value.asInstanceOf[js.Any])
    
    inline def setSubChannelIdUndefined: Self = StObject.set(x, "SubChannelId", js.undefined)
  }
}
