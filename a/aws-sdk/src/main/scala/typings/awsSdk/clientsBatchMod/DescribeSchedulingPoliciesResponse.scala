package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSchedulingPoliciesResponse extends StObject {
  
  /**
    * The list of scheduling policies.
    */
  var schedulingPolicies: js.UndefOr[SchedulingPolicyDetailList] = js.undefined
}
object DescribeSchedulingPoliciesResponse {
  
  inline def apply(): DescribeSchedulingPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSchedulingPoliciesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSchedulingPoliciesResponse] (val x: Self) extends AnyVal {
    
    inline def setSchedulingPolicies(value: SchedulingPolicyDetailList): Self = StObject.set(x, "schedulingPolicies", value.asInstanceOf[js.Any])
    
    inline def setSchedulingPoliciesUndefined: Self = StObject.set(x, "schedulingPolicies", js.undefined)
    
    inline def setSchedulingPoliciesVarargs(value: SchedulingPolicyDetail*): Self = StObject.set(x, "schedulingPolicies", js.Array(value*))
  }
}
