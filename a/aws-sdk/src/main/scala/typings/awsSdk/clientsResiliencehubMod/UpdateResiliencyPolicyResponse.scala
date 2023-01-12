package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResiliencyPolicyResponse extends StObject {
  
  /**
    * The type of resiliency policy that was updated, including the recovery time objective (RTO) and recovery point objective (RPO) in seconds.
    */
  var policy: ResiliencyPolicy
}
object UpdateResiliencyPolicyResponse {
  
  inline def apply(policy: ResiliencyPolicy): UpdateResiliencyPolicyResponse = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResiliencyPolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateResiliencyPolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: ResiliencyPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
  }
}
