package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchUsersResponse extends StObject {
  
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.undefined
  
  /**
    * The total number of users returned.
    */
  var TotalCount: js.UndefOr[typings.awsSdk.alexaforbusinessMod.TotalCount] = js.undefined
  
  /**
    * The users that meet the specified set of filter criteria, in sort order.
    */
  var Users: js.UndefOr[UserDataList] = js.undefined
}
object SearchUsersResponse {
  
  @scala.inline
  def apply(): SearchUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchUsersResponse]
  }
  
  @scala.inline
  implicit class SearchUsersResponseMutableBuilder[Self <: SearchUsersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTotalCount(value: TotalCount): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
    
    @scala.inline
    def setUsers(value: UserDataList): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "Users", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: UserData*): Self = StObject.set(x, "Users", js.Array(value :_*))
  }
}
