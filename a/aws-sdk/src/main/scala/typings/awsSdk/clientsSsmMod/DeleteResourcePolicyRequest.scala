package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourcePolicyRequest extends StObject {
  
  /**
    * ID of the current policy version. The hash helps to prevent multiple calls from attempting to overwrite a policy.
    */
  var PolicyHash: typings.awsSdk.clientsSsmMod.PolicyHash
  
  /**
    * The policy ID.
    */
  var PolicyId: typings.awsSdk.clientsSsmMod.PolicyId
  
  /**
    * Amazon Resource Name (ARN) of the resource to which the policies are attached.
    */
  var ResourceArn: ResourceArnString
}
object DeleteResourcePolicyRequest {
  
  inline def apply(PolicyHash: PolicyHash, PolicyId: PolicyId, ResourceArn: ResourceArnString): DeleteResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyHash = PolicyHash.asInstanceOf[js.Any], PolicyId = PolicyId.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourcePolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResourcePolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setPolicyHash(value: PolicyHash): Self = StObject.set(x, "PolicyHash", value.asInstanceOf[js.Any])
    
    inline def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: ResourceArnString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
