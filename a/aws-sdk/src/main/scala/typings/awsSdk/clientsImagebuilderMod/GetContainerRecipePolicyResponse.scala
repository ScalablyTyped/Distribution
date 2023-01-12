package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContainerRecipePolicyResponse extends StObject {
  
  /**
    * The container recipe policy object that is returned.
    */
  var policy: js.UndefOr[ResourcePolicyDocument] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object GetContainerRecipePolicyResponse {
  
  inline def apply(): GetContainerRecipePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContainerRecipePolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetContainerRecipePolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: ResourcePolicyDocument): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
