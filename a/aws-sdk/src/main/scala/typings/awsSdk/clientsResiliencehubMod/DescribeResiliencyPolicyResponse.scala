package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeResiliencyPolicyResponse extends StObject {
  
  /**
    * Information about the specific resiliency policy, returned as an object. This object includes creation time, data location constraints, its name, description, tags, the recovery time objective (RTO) and recovery point objective (RPO) in seconds, and more.
    */
  var policy: ResiliencyPolicy
}
object DescribeResiliencyPolicyResponse {
  
  inline def apply(policy: ResiliencyPolicy): DescribeResiliencyPolicyResponse = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResiliencyPolicyResponse]
  }
  
  extension [Self <: DescribeResiliencyPolicyResponse](x: Self) {
    
    inline def setPolicy(value: ResiliencyPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
  }
}
