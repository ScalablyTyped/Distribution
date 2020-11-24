package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchUsersResponse extends js.Object {
  
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
  
  /**
    * The total number of users returned.
    */
  var TotalCount: js.UndefOr[typings.awsSdk.alexaforbusinessMod.TotalCount] = js.native
  
  /**
    * The users that meet the specified set of filter criteria, in sort order.
    */
  var Users: js.UndefOr[UserDataList] = js.native
}
object SearchUsersResponse {
  
  @scala.inline
  def apply(): SearchUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchUsersResponse]
  }
  
  @scala.inline
  implicit class SearchUsersResponseOps[Self <: SearchUsersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setTotalCount(value: TotalCount): Self = this.set("TotalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCount: Self = this.set("TotalCount", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: UserData*): Self = this.set("Users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: UserDataList): Self = this.set("Users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsers: Self = this.set("Users", js.undefined)
  }
}
