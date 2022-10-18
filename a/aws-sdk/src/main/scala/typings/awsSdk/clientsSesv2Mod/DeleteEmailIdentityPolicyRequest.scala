package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEmailIdentityPolicyRequest extends StObject {
  
  /**
    * The email identity.
    */
  var EmailIdentity: Identity
  
  /**
    * The name of the policy. The policy name cannot exceed 64 characters and can only include alphanumeric characters, dashes, and underscores.
    */
  var PolicyName: typings.awsSdk.clientsSesv2Mod.PolicyName
}
object DeleteEmailIdentityPolicyRequest {
  
  inline def apply(EmailIdentity: Identity, PolicyName: PolicyName): DeleteEmailIdentityPolicyRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEmailIdentityPolicyRequest]
  }
  
  extension [Self <: DeleteEmailIdentityPolicyRequest](x: Self) {
    
    inline def setEmailIdentity(value: Identity): Self = StObject.set(x, "EmailIdentity", value.asInstanceOf[js.Any])
    
    inline def setPolicyName(value: PolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
  }
}
