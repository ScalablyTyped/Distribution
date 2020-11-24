package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListChannelsModeratedByAppInstanceUserResponse extends js.Object {
  
  /**
    * The moderated channels in the request.
    */
  var Channels: js.UndefOr[ChannelModeratedByAppInstanceUserSummaryList] = js.native
  
  /**
    * The token returned from previous API requests until the number of channels moderated by the user is reached.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimeMod.NextToken] = js.native
}
object ListChannelsModeratedByAppInstanceUserResponse {
  
  @scala.inline
  def apply(): ListChannelsModeratedByAppInstanceUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelsModeratedByAppInstanceUserResponse]
  }
  
  @scala.inline
  implicit class ListChannelsModeratedByAppInstanceUserResponseOps[Self <: ListChannelsModeratedByAppInstanceUserResponse] (val x: Self) extends AnyVal {
    
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
    def setChannelsVarargs(value: ChannelModeratedByAppInstanceUserSummary*): Self = this.set("Channels", js.Array(value :_*))
    
    @scala.inline
    def setChannels(value: ChannelModeratedByAppInstanceUserSummaryList): Self = this.set("Channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannels: Self = this.set("Channels", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
