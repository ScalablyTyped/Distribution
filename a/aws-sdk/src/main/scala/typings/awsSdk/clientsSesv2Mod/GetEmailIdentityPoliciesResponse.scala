package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEmailIdentityPoliciesResponse extends StObject {
  
  /**
    * A map of policy names to policies.
    */
  var Policies: js.UndefOr[PolicyMap] = js.undefined
}
object GetEmailIdentityPoliciesResponse {
  
  inline def apply(): GetEmailIdentityPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEmailIdentityPoliciesResponse]
  }
  
  extension [Self <: GetEmailIdentityPoliciesResponse](x: Self) {
    
    inline def setPolicies(value: PolicyMap): Self = StObject.set(x, "Policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "Policies", js.undefined)
  }
}
