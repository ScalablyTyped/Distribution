package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAccessPolicyRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier to ensure idempotency of the request.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The name of the policy to delete.
    */
  var name: PolicyName
  
  /**
    * The type of policy.
    */
  var `type`: AccessPolicyType
}
object DeleteAccessPolicyRequest {
  
  inline def apply(name: PolicyName, `type`: AccessPolicyType): DeleteAccessPolicyRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccessPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAccessPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setName(value: PolicyName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: AccessPolicyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
