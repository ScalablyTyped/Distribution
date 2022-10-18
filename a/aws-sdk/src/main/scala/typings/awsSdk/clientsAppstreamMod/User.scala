package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  /**
    * The ARN of the user.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsAppstreamMod.Arn] = js.undefined
  
  /**
    * The authentication type for the user.
    */
  var AuthenticationType: typings.awsSdk.clientsAppstreamMod.AuthenticationType
  
  /**
    * The date and time the user was created in the user pool.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies whether the user in the user pool is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The first name, or given name, of the user.
    */
  var FirstName: js.UndefOr[UserAttributeValue] = js.undefined
  
  /**
    * The last name, or surname, of the user.
    */
  var LastName: js.UndefOr[UserAttributeValue] = js.undefined
  
  /**
    * The status of the user in the user pool. The status can be one of the following:   UNCONFIRMED – The user is created but not confirmed.   CONFIRMED – The user is confirmed.   ARCHIVED – The user is no longer active.   COMPROMISED – The user is disabled because of a potential security threat.   UNKNOWN – The user status is not known.  
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The email address of the user.  Users' email addresses are case-sensitive. 
    */
  var UserName: js.UndefOr[Username] = js.undefined
}
object User {
  
  inline def apply(AuthenticationType: AuthenticationType): User = {
    val __obj = js.Dynamic.literal(AuthenticationType = AuthenticationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAuthenticationType(value: AuthenticationType): Self = StObject.set(x, "AuthenticationType", value.asInstanceOf[js.Any])
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setFirstName(value: UserAttributeValue): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "FirstName", js.undefined)
    
    inline def setLastName(value: UserAttributeValue): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "LastName", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUserName(value: Username): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
