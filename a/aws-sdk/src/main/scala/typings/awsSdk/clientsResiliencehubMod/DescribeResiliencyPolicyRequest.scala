package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeResiliencyPolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:partition:resiliencehub:region:account:resiliency-policy/policy-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var policyArn: Arn
}
object DescribeResiliencyPolicyRequest {
  
  inline def apply(policyArn: Arn): DescribeResiliencyPolicyRequest = {
    val __obj = js.Dynamic.literal(policyArn = policyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResiliencyPolicyRequest]
  }
  
  extension [Self <: DescribeResiliencyPolicyRequest](x: Self) {
    
    inline def setPolicyArn(value: Arn): Self = StObject.set(x, "policyArn", value.asInstanceOf[js.Any])
  }
}
