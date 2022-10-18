package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEmailIdentityPoliciesRequest extends StObject {
  
  /**
    * The email identity.
    */
  var EmailIdentity: Identity
}
object GetEmailIdentityPoliciesRequest {
  
  inline def apply(EmailIdentity: Identity): GetEmailIdentityPoliciesRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEmailIdentityPoliciesRequest]
  }
  
  extension [Self <: GetEmailIdentityPoliciesRequest](x: Self) {
    
    inline def setEmailIdentity(value: Identity): Self = StObject.set(x, "EmailIdentity", value.asInstanceOf[js.Any])
  }
}
