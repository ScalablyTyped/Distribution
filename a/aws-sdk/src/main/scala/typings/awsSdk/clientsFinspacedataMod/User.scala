package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  /**
    * Indicates whether the user can use the GetProgrammaticAccessCredentials API to obtain credentials that can then be used to access other FinSpace Data API operations.    ENABLED – The user has permissions to use the APIs.    DISABLED – The user does not have permissions to use any APIs.  
    */
  var apiAccess: js.UndefOr[ApiAccess] = js.undefined
  
  /**
    * The ARN identifier of an AWS user or role that is allowed to call the GetProgrammaticAccessCredentials API to obtain a credentials token for a specific FinSpace user. This must be an IAM role within your FinSpace account.
    */
  var apiAccessPrincipalArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The timestamp at which the user account was created in FinSpace. The value is determined as epoch time in milliseconds. 
    */
  var createTime: js.UndefOr[TimestampEpoch] = js.undefined
  
  /**
    * The email address of the user. The email address serves as a uniquer identifier for each user and cannot be changed after it's created.
    */
  var emailAddress: js.UndefOr[Email] = js.undefined
  
  /**
    * The first name of the user.
    */
  var firstName: js.UndefOr[FirstName] = js.undefined
  
  /**
    * Describes the last time the user account was disabled. The value is determined as epoch time in milliseconds.
    */
  var lastDisabledTime: js.UndefOr[TimestampEpoch] = js.undefined
  
  /**
    *  Describes the last time the user account was enabled. The value is determined as epoch time in milliseconds. 
    */
  var lastEnabledTime: js.UndefOr[TimestampEpoch] = js.undefined
  
  /**
    * Describes the last time that the user logged into their account. The value is determined as epoch time in milliseconds. 
    */
  var lastLoginTime: js.UndefOr[TimestampEpoch] = js.undefined
  
  /**
    * Describes the last time the user account was updated. The value is determined as epoch time in milliseconds. 
    */
  var lastModifiedTime: js.UndefOr[TimestampEpoch] = js.undefined
  
  /**
    *  The last name of the user.
    */
  var lastName: js.UndefOr[LastName] = js.undefined
  
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
object User {
  
  inline def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    inline def setApiAccess(value: ApiAccess): Self = StObject.set(x, "apiAccess", value.asInstanceOf[js.Any])
    
    inline def setApiAccessPrincipalArn(value: RoleArn): Self = StObject.set(x, "apiAccessPrincipalArn", value.asInstanceOf[js.Any])
    
    inline def setApiAccessPrincipalArnUndefined: Self = StObject.set(x, "apiAccessPrincipalArn", js.undefined)
    
    inline def setApiAccessUndefined: Self = StObject.set(x, "apiAccess", js.undefined)
    
    inline def setCreateTime(value: TimestampEpoch): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEmailAddress(value: Email): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setFirstName(value: FirstName): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    inline def setLastDisabledTime(value: TimestampEpoch): Self = StObject.set(x, "lastDisabledTime", value.asInstanceOf[js.Any])
    
    inline def setLastDisabledTimeUndefined: Self = StObject.set(x, "lastDisabledTime", js.undefined)
    
    inline def setLastEnabledTime(value: TimestampEpoch): Self = StObject.set(x, "lastEnabledTime", value.asInstanceOf[js.Any])
    
    inline def setLastEnabledTimeUndefined: Self = StObject.set(x, "lastEnabledTime", js.undefined)
    
    inline def setLastLoginTime(value: TimestampEpoch): Self = StObject.set(x, "lastLoginTime", value.asInstanceOf[js.Any])
    
    inline def setLastLoginTimeUndefined: Self = StObject.set(x, "lastLoginTime", js.undefined)
    
    inline def setLastModifiedTime(value: TimestampEpoch): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    inline def setLastName(value: LastName): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    inline def setStatus(value: UserStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: UserType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
