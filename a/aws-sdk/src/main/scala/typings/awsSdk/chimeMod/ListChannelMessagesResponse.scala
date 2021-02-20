package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListChannelMessagesResponse extends StObject {
  
  /**
    * The ARN of the channel containing the requested messages.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The information about and content of each requested message.
    */
  var ChannelMessages: js.UndefOr[ChannelMessageSummaryList] = js.native
  
  /**
    * The token passed by previous API calls until all requested messages are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimeMod.NextToken] = js.native
}
object ListChannelMessagesResponse {
  
  @scala.inline
  def apply(): ListChannelMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelMessagesResponse]
  }
  
  @scala.inline
  implicit class ListChannelMessagesResponseMutableBuilder[Self <: ListChannelMessagesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    @scala.inline
    def setChannelMessages(value: ChannelMessageSummaryList): Self = StObject.set(x, "ChannelMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelMessagesUndefined: Self = StObject.set(x, "ChannelMessages", js.undefined)
    
    @scala.inline
    def setChannelMessagesVarargs(value: ChannelMessageSummary*): Self = StObject.set(x, "ChannelMessages", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
