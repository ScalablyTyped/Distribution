package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResiliencyPolicyResponse extends StObject {
  
  /**
    * The type of resiliency policy that was created, including the recovery time objective (RTO) and recovery point objective (RPO) in seconds.
    */
  var policy: ResiliencyPolicy
}
object CreateResiliencyPolicyResponse {
  
  inline def apply(policy: ResiliencyPolicy): CreateResiliencyPolicyResponse = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResiliencyPolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateResiliencyPolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: ResiliencyPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
  }
}
