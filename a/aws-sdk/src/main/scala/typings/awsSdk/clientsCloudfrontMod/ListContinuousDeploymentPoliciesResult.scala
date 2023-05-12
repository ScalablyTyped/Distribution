package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContinuousDeploymentPoliciesResult extends StObject {
  
  /**
    * A list of continuous deployment policies.
    */
  var ContinuousDeploymentPolicyList: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.ContinuousDeploymentPolicyList] = js.undefined
}
object ListContinuousDeploymentPoliciesResult {
  
  inline def apply(): ListContinuousDeploymentPoliciesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContinuousDeploymentPoliciesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListContinuousDeploymentPoliciesResult] (val x: Self) extends AnyVal {
    
    inline def setContinuousDeploymentPolicyList(value: ContinuousDeploymentPolicyList): Self = StObject.set(x, "ContinuousDeploymentPolicyList", value.asInstanceOf[js.Any])
    
    inline def setContinuousDeploymentPolicyListUndefined: Self = StObject.set(x, "ContinuousDeploymentPolicyList", js.undefined)
  }
}
