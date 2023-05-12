package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserIdentity extends StObject {
  
  /**
    * The Amazon Web Services account number of the user in Amazon Web Services, if any.
    */
  var awsAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * 
    */
  var principalId: String
  
  /**
    * The display name of the user in Amazon CodeCatalyst.
    */
  var userName: js.UndefOr[String] = js.undefined
  
  /**
    * The role assigned to the user in a Amazon CodeCatalyst space or project when the event occurred.
    */
  var userType: UserType
}
object UserIdentity {
  
  inline def apply(principalId: String, userType: UserType): UserIdentity = {
    val __obj = js.Dynamic.literal(principalId = principalId.asInstanceOf[js.Any], userType = userType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIdentity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserIdentity] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: String): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountIdUndefined: Self = StObject.set(x, "awsAccountId", js.undefined)
    
    inline def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    
    inline def setUserType(value: UserType): Self = StObject.set(x, "userType", value.asInstanceOf[js.Any])
  }
}
