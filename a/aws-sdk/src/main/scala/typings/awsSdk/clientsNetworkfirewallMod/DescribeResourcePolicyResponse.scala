package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeResourcePolicyResponse extends StObject {
  
  /**
    * The IAM policy for the resource. 
    */
  var Policy: js.UndefOr[PolicyString] = js.undefined
}
object DescribeResourcePolicyResponse {
  
  inline def apply(): DescribeResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeResourcePolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeResourcePolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: PolicyString): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
