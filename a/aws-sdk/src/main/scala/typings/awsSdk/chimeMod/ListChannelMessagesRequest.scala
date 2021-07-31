package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelMessagesRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The maximum number of messages that you want returned.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.chimeMod.MaxResults] = js.undefined
  
  /**
    * The token passed by previous API calls until all requested messages are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimeMod.NextToken] = js.undefined
  
  /**
    * The final or ending time stamp for your requested messages.
    */
  var NotAfter: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The initial or starting time stamp for your requested messages. 
    */
  var NotBefore: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The order in which you want messages sorted. Default is Descending, based on time created.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.chimeMod.SortOrder] = js.undefined
}
object ListChannelMessagesRequest {
  
  @scala.inline
  def apply(ChannelArn: ChimeArn): ListChannelMessagesRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChannelMessagesRequest]
  }
  
  @scala.inline
  implicit class ListChannelMessagesRequestMutableBuilder[Self <: ListChannelMessagesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setNotAfter(value: Timestamp): Self = StObject.set(x, "NotAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotAfterUndefined: Self = StObject.set(x, "NotAfter", js.undefined)
    
    @scala.inline
    def setNotBefore(value: Timestamp): Self = StObject.set(x, "NotBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotBeforeUndefined: Self = StObject.set(x, "NotBefore", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
