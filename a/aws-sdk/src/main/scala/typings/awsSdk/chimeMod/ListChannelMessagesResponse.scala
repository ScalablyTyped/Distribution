package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListChannelMessagesResponse extends js.Object {
  
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
  implicit class ListChannelMessagesResponseOps[Self <: ListChannelMessagesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = this.set("ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelArn: Self = this.set("ChannelArn", js.undefined)
    
    @scala.inline
    def setChannelMessagesVarargs(value: ChannelMessageSummary*): Self = this.set("ChannelMessages", js.Array(value :_*))
    
    @scala.inline
    def setChannelMessages(value: ChannelMessageSummaryList): Self = this.set("ChannelMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelMessages: Self = this.set("ChannelMessages", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
