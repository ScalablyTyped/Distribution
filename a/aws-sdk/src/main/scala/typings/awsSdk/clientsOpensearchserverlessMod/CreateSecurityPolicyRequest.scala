package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSecurityPolicyRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier to ensure idempotency of the request.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * A description of the policy. Typically used to store information about the permissions defined in the policy.
    */
  var description: js.UndefOr[PolicyDescription] = js.undefined
  
  /**
    * The name of the policy.
    */
  var name: PolicyName
  
  /**
    * The JSON policy document to use as the content for the new policy.
    */
  var policy: PolicyDocument
  
  /**
    * The type of security policy.
    */
  var `type`: SecurityPolicyType
}
object CreateSecurityPolicyRequest {
  
  inline def apply(name: PolicyName, policy: PolicyDocument, `type`: SecurityPolicyType): CreateSecurityPolicyRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSecurityPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSecurityPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDescription(value: PolicyDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: PolicyName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: PolicyDocument): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setType(value: SecurityPolicyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
