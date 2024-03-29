package typings.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoadBalancerPolicyTypesOutput extends StObject {
  
  /**
    * Information about the policy types.
    */
  var PolicyTypeDescriptions: js.UndefOr[typings.awsSdk.clientsElbMod.PolicyTypeDescriptions] = js.undefined
}
object DescribeLoadBalancerPolicyTypesOutput {
  
  inline def apply(): DescribeLoadBalancerPolicyTypesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancerPolicyTypesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLoadBalancerPolicyTypesOutput] (val x: Self) extends AnyVal {
    
    inline def setPolicyTypeDescriptions(value: PolicyTypeDescriptions): Self = StObject.set(x, "PolicyTypeDescriptions", value.asInstanceOf[js.Any])
    
    inline def setPolicyTypeDescriptionsUndefined: Self = StObject.set(x, "PolicyTypeDescriptions", js.undefined)
    
    inline def setPolicyTypeDescriptionsVarargs(value: PolicyTypeDescription*): Self = StObject.set(x, "PolicyTypeDescriptions", js.Array(value*))
  }
}
