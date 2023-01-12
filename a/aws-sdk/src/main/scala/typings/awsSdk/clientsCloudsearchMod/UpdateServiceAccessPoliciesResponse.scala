package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceAccessPoliciesResponse extends StObject {
  
  /**
    * The access rules configured for the domain.
    */
  var AccessPolicies: AccessPoliciesStatus
}
object UpdateServiceAccessPoliciesResponse {
  
  inline def apply(AccessPolicies: AccessPoliciesStatus): UpdateServiceAccessPoliciesResponse = {
    val __obj = js.Dynamic.literal(AccessPolicies = AccessPolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceAccessPoliciesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateServiceAccessPoliciesResponse] (val x: Self) extends AnyVal {
    
    inline def setAccessPolicies(value: AccessPoliciesStatus): Self = StObject.set(x, "AccessPolicies", value.asInstanceOf[js.Any])
  }
}
