package typings.awsSdk.clientsDlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLifecyclePoliciesResponse extends StObject {
  
  /**
    * Summary information about the lifecycle policies.
    */
  var Policies: js.UndefOr[LifecyclePolicySummaryList] = js.undefined
}
object GetLifecyclePoliciesResponse {
  
  inline def apply(): GetLifecyclePoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLifecyclePoliciesResponse]
  }
  
  extension [Self <: GetLifecyclePoliciesResponse](x: Self) {
    
    inline def setPolicies(value: LifecyclePolicySummaryList): Self = StObject.set(x, "Policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "Policies", js.undefined)
    
    inline def setPoliciesVarargs(value: LifecyclePolicySummary*): Self = StObject.set(x, "Policies", js.Array(value*))
  }
}
