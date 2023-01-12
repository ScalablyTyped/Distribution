package typings.awsSdk.clientsDlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLifecyclePolicyResponse extends StObject {
  
  /**
    * Detailed information about the lifecycle policy.
    */
  var Policy: js.UndefOr[LifecyclePolicy] = js.undefined
}
object GetLifecyclePolicyResponse {
  
  inline def apply(): GetLifecyclePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLifecyclePolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLifecyclePolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: LifecyclePolicy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
