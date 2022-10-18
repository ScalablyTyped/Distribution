package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberFabricConfiguration extends StObject {
  
  /**
    * The password for the member's initial administrative user. The AdminPassword must be at least eight characters long and no more than 32 characters. It must contain at least one uppercase letter, one lowercase letter, and one digit. It cannot have a single quotation mark (‘), a double quotation marks (“), a forward slash(/), a backward slash(\), @, or a space.
    */
  var AdminPassword: PasswordString
  
  /**
    * The user name for the member's initial administrative user.
    */
  var AdminUsername: UsernameString
}
object MemberFabricConfiguration {
  
  inline def apply(AdminPassword: PasswordString, AdminUsername: UsernameString): MemberFabricConfiguration = {
    val __obj = js.Dynamic.literal(AdminPassword = AdminPassword.asInstanceOf[js.Any], AdminUsername = AdminUsername.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberFabricConfiguration]
  }
  
  extension [Self <: MemberFabricConfiguration](x: Self) {
    
    inline def setAdminPassword(value: PasswordString): Self = StObject.set(x, "AdminPassword", value.asInstanceOf[js.Any])
    
    inline def setAdminUsername(value: UsernameString): Self = StObject.set(x, "AdminUsername", value.asInstanceOf[js.Any])
  }
}
