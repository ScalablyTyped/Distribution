package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccountPasswordPolicyResponse extends StObject {
  
  /**
    * A structure that contains details about the account's password policy.
    */
  var PasswordPolicy: typings.awsSdk.clientsIamMod.PasswordPolicy
}
object GetAccountPasswordPolicyResponse {
  
  inline def apply(PasswordPolicy: PasswordPolicy): GetAccountPasswordPolicyResponse = {
    val __obj = js.Dynamic.literal(PasswordPolicy = PasswordPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccountPasswordPolicyResponse]
  }
  
  extension [Self <: GetAccountPasswordPolicyResponse](x: Self) {
    
    inline def setPasswordPolicy(value: PasswordPolicy): Self = StObject.set(x, "PasswordPolicy", value.asInstanceOf[js.Any])
  }
}
