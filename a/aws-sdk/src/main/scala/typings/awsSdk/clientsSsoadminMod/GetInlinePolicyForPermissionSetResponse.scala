package typings.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInlinePolicyForPermissionSetResponse extends StObject {
  
  /**
    * The inline policy that is attached to the permission set.
    */
  var InlinePolicy: js.UndefOr[PermissionSetPolicyDocument] = js.undefined
}
object GetInlinePolicyForPermissionSetResponse {
  
  inline def apply(): GetInlinePolicyForPermissionSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInlinePolicyForPermissionSetResponse]
  }
  
  extension [Self <: GetInlinePolicyForPermissionSetResponse](x: Self) {
    
    inline def setInlinePolicy(value: PermissionSetPolicyDocument): Self = StObject.set(x, "InlinePolicy", value.asInstanceOf[js.Any])
    
    inline def setInlinePolicyUndefined: Self = StObject.set(x, "InlinePolicy", js.undefined)
  }
}
