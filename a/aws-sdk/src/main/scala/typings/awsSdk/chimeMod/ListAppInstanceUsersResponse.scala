package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAppInstanceUsersResponse extends js.Object {
  
  /**
    * The ARN of the app instance.
    */
  var AppInstanceArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The information for each of the requested app instance users.
    */
  var AppInstanceUsers: js.UndefOr[AppInstanceUserList] = js.native
  
  /**
    * The token passed by previous API calls until all requested users are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimeMod.NextToken] = js.native
}
object ListAppInstanceUsersResponse {
  
  @scala.inline
  def apply(): ListAppInstanceUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppInstanceUsersResponse]
  }
  
  @scala.inline
  implicit class ListAppInstanceUsersResponseOps[Self <: ListAppInstanceUsersResponse] (val x: Self) extends AnyVal {
    
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
    def setAppInstanceArn(value: ChimeArn): Self = this.set("AppInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppInstanceArn: Self = this.set("AppInstanceArn", js.undefined)
    
    @scala.inline
    def setAppInstanceUsersVarargs(value: AppInstanceUserSummary*): Self = this.set("AppInstanceUsers", js.Array(value :_*))
    
    @scala.inline
    def setAppInstanceUsers(value: AppInstanceUserList): Self = this.set("AppInstanceUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppInstanceUsers: Self = this.set("AppInstanceUsers", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
