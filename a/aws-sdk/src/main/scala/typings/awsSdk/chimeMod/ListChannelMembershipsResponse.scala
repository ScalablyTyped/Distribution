package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListChannelMembershipsResponse extends js.Object {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The information for the requested channel memberships.
    */
  var ChannelMemberships: js.UndefOr[ChannelMembershipSummaryList] = js.native
  
  /**
    * The token passed by previous API calls until all requested channel memberships are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimeMod.NextToken] = js.native
}
object ListChannelMembershipsResponse {
  
  @scala.inline
  def apply(): ListChannelMembershipsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelMembershipsResponse]
  }
  
  @scala.inline
  implicit class ListChannelMembershipsResponseOps[Self <: ListChannelMembershipsResponse] (val x: Self) extends AnyVal {
    
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
    def setChannelMembershipsVarargs(value: ChannelMembershipSummary*): Self = this.set("ChannelMemberships", js.Array(value :_*))
    
    @scala.inline
    def setChannelMemberships(value: ChannelMembershipSummaryList): Self = this.set("ChannelMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelMemberships: Self = this.set("ChannelMemberships", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
