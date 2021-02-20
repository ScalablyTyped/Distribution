package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAppInstanceUsersResponse extends StObject {
  
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
  implicit class ListAppInstanceUsersResponseMutableBuilder[Self <: ListAppInstanceUsersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceArnUndefined: Self = StObject.set(x, "AppInstanceArn", js.undefined)
    
    @scala.inline
    def setAppInstanceUsers(value: AppInstanceUserList): Self = StObject.set(x, "AppInstanceUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceUsersUndefined: Self = StObject.set(x, "AppInstanceUsers", js.undefined)
    
    @scala.inline
    def setAppInstanceUsersVarargs(value: AppInstanceUserSummary*): Self = StObject.set(x, "AppInstanceUsers", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
