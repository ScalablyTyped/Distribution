package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelBansRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The maximum number of bans that you want returned.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.chimeMod.MaxResults] = js.undefined
  
  /**
    * The token passed by previous API calls until all requested bans are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimeMod.NextToken] = js.undefined
}
object ListChannelBansRequest {
  
  @scala.inline
  def apply(ChannelArn: ChimeArn): ListChannelBansRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChannelBansRequest]
  }
  
  @scala.inline
  implicit class ListChannelBansRequestMutableBuilder[Self <: ListChannelBansRequest] (val x: Self) extends AnyVal {
    
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
  }
}
