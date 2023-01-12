package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComponentPolicyResponse extends StObject {
  
  /**
    * The component policy.
    */
  var policy: js.UndefOr[ResourcePolicyDocument] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object GetComponentPolicyResponse {
  
  inline def apply(): GetComponentPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComponentPolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetComponentPolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: ResourcePolicyDocument): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
