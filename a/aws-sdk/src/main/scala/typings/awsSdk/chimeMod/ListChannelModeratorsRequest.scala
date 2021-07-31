package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelModeratorsRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The maximum number of moderators that you want returned.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.chimeMod.MaxResults] = js.undefined
  
  /**
    * The token passed by previous API calls until all requested moderators are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimeMod.NextToken] = js.undefined
}
object ListChannelModeratorsRequest {
  
  @scala.inline
  def apply(ChannelArn: ChimeArn): ListChannelModeratorsRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChannelModeratorsRequest]
  }
  
  @scala.inline
  implicit class ListChannelModeratorsRequestMutableBuilder[Self <: ListChannelModeratorsRequest] (val x: Self) extends AnyVal {
    
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
