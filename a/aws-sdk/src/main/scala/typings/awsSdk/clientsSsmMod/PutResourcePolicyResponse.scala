package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyResponse extends StObject {
  
  /**
    * ID of the current policy version.
    */
  var PolicyHash: js.UndefOr[typings.awsSdk.clientsSsmMod.PolicyHash] = js.undefined
  
  /**
    * The policy ID. To update a policy, you must specify PolicyId and PolicyHash.
    */
  var PolicyId: js.UndefOr[typings.awsSdk.clientsSsmMod.PolicyId] = js.undefined
}
object PutResourcePolicyResponse {
  
  inline def apply(): PutResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutResourcePolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutResourcePolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setPolicyHash(value: PolicyHash): Self = StObject.set(x, "PolicyHash", value.asInstanceOf[js.Any])
    
    inline def setPolicyHashUndefined: Self = StObject.set(x, "PolicyHash", js.undefined)
    
    inline def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    inline def setPolicyIdUndefined: Self = StObject.set(x, "PolicyId", js.undefined)
  }
}
