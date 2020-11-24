package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListChannelMembershipsForAppInstanceUserResponse extends js.Object {
  
  /**
    * The token passed by previous API calls until all requested users are returned.
    */
  var ChannelMemberships: js.UndefOr[ChannelMembershipForAppInstanceUserSummaryList] = js.native
  
  /**
    * The token passed by previous API calls until all requested users are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimeMod.NextToken] = js.native
}
object ListChannelMembershipsForAppInstanceUserResponse {
  
  @scala.inline
  def apply(): ListChannelMembershipsForAppInstanceUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelMembershipsForAppInstanceUserResponse]
  }
  
  @scala.inline
  implicit class ListChannelMembershipsForAppInstanceUserResponseOps[Self <: ListChannelMembershipsForAppInstanceUserResponse] (val x: Self) extends AnyVal {
    
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
    def setChannelMembershipsVarargs(value: ChannelMembershipForAppInstanceUserSummary*): Self = this.set("ChannelMemberships", js.Array(value :_*))
    
    @scala.inline
    def setChannelMemberships(value: ChannelMembershipForAppInstanceUserSummaryList): Self = this.set("ChannelMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelMemberships: Self = this.set("ChannelMemberships", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
