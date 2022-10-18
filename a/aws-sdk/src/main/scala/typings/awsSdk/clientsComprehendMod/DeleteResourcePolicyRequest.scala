package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourcePolicyRequest extends StObject {
  
  /**
    * The revision ID of the policy to delete.
    */
  var PolicyRevisionId: js.UndefOr[typings.awsSdk.clientsComprehendMod.PolicyRevisionId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the custom model version that has the policy to delete.
    */
  var ResourceArn: ComprehendModelArn
}
object DeleteResourcePolicyRequest {
  
  inline def apply(ResourceArn: ComprehendModelArn): DeleteResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourcePolicyRequest]
  }
  
  extension [Self <: DeleteResourcePolicyRequest](x: Self) {
    
    inline def setPolicyRevisionId(value: PolicyRevisionId): Self = StObject.set(x, "PolicyRevisionId", value.asInstanceOf[js.Any])
    
    inline def setPolicyRevisionIdUndefined: Self = StObject.set(x, "PolicyRevisionId", js.undefined)
    
    inline def setResourceArn(value: ComprehendModelArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
