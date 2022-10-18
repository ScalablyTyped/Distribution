package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppInstanceUsersResponse extends StObject {
  
  /**
    * The ARN of the AppInstance.
    */
  var AppInstanceArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The information for each requested AppInstanceUser.
    */
  var AppInstanceUsers: js.UndefOr[AppInstanceUserList] = js.undefined
  
  /**
    * The token passed by previous API calls until all requested users are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsChimesdkidentityMod.NextToken] = js.undefined
}
object ListAppInstanceUsersResponse {
  
  inline def apply(): ListAppInstanceUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppInstanceUsersResponse]
  }
  
  extension [Self <: ListAppInstanceUsersResponse](x: Self) {
    
    inline def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceArnUndefined: Self = StObject.set(x, "AppInstanceArn", js.undefined)
    
    inline def setAppInstanceUsers(value: AppInstanceUserList): Self = StObject.set(x, "AppInstanceUsers", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceUsersUndefined: Self = StObject.set(x, "AppInstanceUsers", js.undefined)
    
    inline def setAppInstanceUsersVarargs(value: AppInstanceUserSummary*): Self = StObject.set(x, "AppInstanceUsers", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
