package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserByPermissionGroup extends StObject {
  
  /**
    * Indicates whether the user can access FinSpace API operations.    ENABLED – The user has permissions to use the API operations.    DISABLED – The user does not have permissions to use any API operations.  
    */
  var apiAccess: js.UndefOr[ApiAccess] = js.undefined
  
  /**
    * The IAM ARN identifier that is attached to FinSpace API calls.
    */
  var apiAccessPrincipalArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The email address of the user. The email address serves as a unique identifier for each user and cannot be changed after it's created.
    */
  var emailAddress: js.UndefOr[Email] = js.undefined
  
  /**
    * The first name of the user.
    */
  var firstName: js.UndefOr[FirstName] = js.undefined
  
  /**
    * The last name of the user.
    */
  var lastName: js.UndefOr[LastName] = js.undefined
  
  /**
    * Indicates the status of the user account within a permission group.    ADDITION_IN_PROGRESS – The user account is currently being added to the permission group.    ADDITION_SUCCESS – The user account is successfully added to the permission group.    REMOVAL_IN_PROGRESS – The user is currently being removed from the permission group.  
    */
  var membershipStatus: js.UndefOr[PermissionGroupMembershipStatus] = js.undefined
  
  /**
    * The current status of the user account.     CREATING – The user account creation is in progress.    ENABLED – The user account is created and is currently active.    DISABLED – The user account is currently inactive.  
    */
  var status: js.UndefOr[UserStatus] = js.undefined
  
  /**
    *  Indicates the type of user.    SUPER_USER – A user with permission to all the functionality and data in FinSpace.    APP_USER – A user with specific permissions in FinSpace. The users are assigned permissions by adding them to a permission group.  
    */
  var `type`: js.UndefOr[UserType] = js.undefined
  
  /**
    * The unique identifier for the user.
    */
  var userId: js.UndefOr[UserId] = js.undefined
}
object UserByPermissionGroup {
  
  inline def apply(): UserByPermissionGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserByPermissionGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserByPermissionGroup] (val x: Self) extends AnyVal {
    
    inline def setApiAccess(value: ApiAccess): Self = StObject.set(x, "apiAccess", value.asInstanceOf[js.Any])
    
    inline def setApiAccessPrincipalArn(value: RoleArn): Self = StObject.set(x, "apiAccessPrincipalArn", value.asInstanceOf[js.Any])
    
    inline def setApiAccessPrincipalArnUndefined: Self = StObject.set(x, "apiAccessPrincipalArn", js.undefined)
    
    inline def setApiAccessUndefined: Self = StObject.set(x, "apiAccess", js.undefined)
    
    inline def setEmailAddress(value: Email): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setFirstName(value: FirstName): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    inline def setLastName(value: LastName): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    inline def setMembershipStatus(value: PermissionGroupMembershipStatus): Self = StObject.set(x, "membershipStatus", value.asInstanceOf[js.Any])
    
    inline def setMembershipStatusUndefined: Self = StObject.set(x, "membershipStatus", js.undefined)
    
    inline def setStatus(value: UserStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: UserType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
