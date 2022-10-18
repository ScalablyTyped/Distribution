package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserRequest extends StObject {
  
  /**
    * The option to indicate whether the user can use the GetProgrammaticAccessCredentials API to obtain credentials that can then be used to access other FinSpace Data API operations.    ENABLED – The user has permissions to use the APIs.    DISABLED – The user does not have permissions to use any APIs.  
    */
  var apiAccess: js.UndefOr[ApiAccess] = js.undefined
  
  /**
    * The ARN identifier of an AWS user or role that is allowed to call the GetProgrammaticAccessCredentials API to obtain a credentials token for a specific FinSpace user. This must be an IAM role within your FinSpace account.
    */
  var apiAccessPrincipalArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * A token that ensures idempotency. This token expires in 10 minutes.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The first name of the user.
    */
  var firstName: js.UndefOr[FirstName] = js.undefined
  
  /**
    * The last name of the user.
    */
  var lastName: js.UndefOr[LastName] = js.undefined
  
  /**
    * The option to indicate the type of user.    SUPER_USER– A user with permission to all the functionality and data in FinSpace.    APP_USER – A user with specific permissions in FinSpace. The users are assigned permissions by adding them to a permission group.  
    */
  var `type`: js.UndefOr[UserType] = js.undefined
  
  /**
    * The unique identifier for the user account to update.
    */
  var userId: UserId
}
object UpdateUserRequest {
  
  inline def apply(userId: UserId): UpdateUserRequest = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRequest]
  }
  
  extension [Self <: UpdateUserRequest](x: Self) {
    
    inline def setApiAccess(value: ApiAccess): Self = StObject.set(x, "apiAccess", value.asInstanceOf[js.Any])
    
    inline def setApiAccessPrincipalArn(value: RoleArn): Self = StObject.set(x, "apiAccessPrincipalArn", value.asInstanceOf[js.Any])
    
    inline def setApiAccessPrincipalArnUndefined: Self = StObject.set(x, "apiAccessPrincipalArn", js.undefined)
    
    inline def setApiAccessUndefined: Self = StObject.set(x, "apiAccess", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setFirstName(value: FirstName): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    inline def setLastName(value: LastName): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    inline def setType(value: UserType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
