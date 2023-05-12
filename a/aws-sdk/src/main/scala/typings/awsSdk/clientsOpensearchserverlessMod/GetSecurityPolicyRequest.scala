package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSecurityPolicyRequest extends StObject {
  
  /**
    * The name of the security policy.
    */
  var name: PolicyName
  
  /**
    * The type of security policy.
    */
  var `type`: SecurityPolicyType
}
object GetSecurityPolicyRequest {
  
  inline def apply(name: PolicyName, `type`: SecurityPolicyType): GetSecurityPolicyRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecurityPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSecurityPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: PolicyName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: SecurityPolicyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
