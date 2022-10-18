package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyResponse extends StObject {
  
  /**
    * The revision ID of the policy. Each time you modify a policy, Amazon Comprehend assigns a new revision ID, and it deletes the prior version of the policy.
    */
  var PolicyRevisionId: js.UndefOr[typings.awsSdk.clientsComprehendMod.PolicyRevisionId] = js.undefined
}
object PutResourcePolicyResponse {
  
  inline def apply(): PutResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutResourcePolicyResponse]
  }
  
  extension [Self <: PutResourcePolicyResponse](x: Self) {
    
    inline def setPolicyRevisionId(value: PolicyRevisionId): Self = StObject.set(x, "PolicyRevisionId", value.asInstanceOf[js.Any])
    
    inline def setPolicyRevisionIdUndefined: Self = StObject.set(x, "PolicyRevisionId", js.undefined)
  }
}
