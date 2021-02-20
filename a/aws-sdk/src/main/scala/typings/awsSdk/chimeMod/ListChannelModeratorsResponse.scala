package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListChannelModeratorsResponse extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The information about and names of each moderator.
    */
  var ChannelModerators: js.UndefOr[ChannelModeratorSummaryList] = js.native
  
  /**
    * The token passed by previous API calls until all requested moderators are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimeMod.NextToken] = js.native
}
object ListChannelModeratorsResponse {
  
  @scala.inline
  def apply(): ListChannelModeratorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelModeratorsResponse]
  }
  
  @scala.inline
  implicit class ListChannelModeratorsResponseMutableBuilder[Self <: ListChannelModeratorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    @scala.inline
    def setChannelModerators(value: ChannelModeratorSummaryList): Self = StObject.set(x, "ChannelModerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelModeratorsUndefined: Self = StObject.set(x, "ChannelModerators", js.undefined)
    
    @scala.inline
    def setChannelModeratorsVarargs(value: ChannelModeratorSummary*): Self = StObject.set(x, "ChannelModerators", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
