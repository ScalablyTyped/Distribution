package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListChannelMembershipsForAppInstanceUserRequest extends js.Object {
  
  /**
    * The ARN of the app instance users
    */
  var AppInstanceUserArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The maximum number of users that you want returned. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.chimeMod.MaxResults] = js.native
  
  /**
    * The token returned from previous API requests until the number of channel memberships is reached.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimeMod.NextToken] = js.native
}
object ListChannelMembershipsForAppInstanceUserRequest {
  
  @scala.inline
  def apply(): ListChannelMembershipsForAppInstanceUserRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelMembershipsForAppInstanceUserRequest]
  }
  
  @scala.inline
  implicit class ListChannelMembershipsForAppInstanceUserRequestOps[Self <: ListChannelMembershipsForAppInstanceUserRequest] (val x: Self) extends AnyVal {
    
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
    def setAppInstanceUserArn(value: ChimeArn): Self = this.set("AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppInstanceUserArn: Self = this.set("AppInstanceUserArn", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
