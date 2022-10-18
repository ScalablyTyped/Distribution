package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImagePolicyResponse extends StObject {
  
  /**
    * The image policy object.
    */
  var policy: js.UndefOr[ResourcePolicyDocument] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object GetImagePolicyResponse {
  
  inline def apply(): GetImagePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetImagePolicyResponse]
  }
  
  extension [Self <: GetImagePolicyResponse](x: Self) {
    
    inline def setPolicy(value: ResourcePolicyDocument): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
