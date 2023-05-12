package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVerifiedAccessGroupPolicyRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the Verified Access group.
    */
  var VerifiedAccessGroupId: typings.awsSdk.clientsEc2Mod.VerifiedAccessGroupId
}
object GetVerifiedAccessGroupPolicyRequest {
  
  inline def apply(VerifiedAccessGroupId: VerifiedAccessGroupId): GetVerifiedAccessGroupPolicyRequest = {
    val __obj = js.Dynamic.literal(VerifiedAccessGroupId = VerifiedAccessGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVerifiedAccessGroupPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVerifiedAccessGroupPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setVerifiedAccessGroupId(value: VerifiedAccessGroupId): Self = StObject.set(x, "VerifiedAccessGroupId", value.asInstanceOf[js.Any])
  }
}
