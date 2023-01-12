package typings.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoadBalancerPolicyTypesInput extends StObject {
  
  /**
    * The names of the policy types. If no names are specified, describes all policy types defined by Elastic Load Balancing.
    */
  var PolicyTypeNames: js.UndefOr[typings.awsSdk.clientsElbMod.PolicyTypeNames] = js.undefined
}
object DescribeLoadBalancerPolicyTypesInput {
  
  inline def apply(): DescribeLoadBalancerPolicyTypesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancerPolicyTypesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLoadBalancerPolicyTypesInput] (val x: Self) extends AnyVal {
    
    inline def setPolicyTypeNames(value: PolicyTypeNames): Self = StObject.set(x, "PolicyTypeNames", value.asInstanceOf[js.Any])
    
    inline def setPolicyTypeNamesUndefined: Self = StObject.set(x, "PolicyTypeNames", js.undefined)
    
    inline def setPolicyTypeNamesVarargs(value: PolicyTypeName*): Self = StObject.set(x, "PolicyTypeNames", js.Array(value*))
  }
}
