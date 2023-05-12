package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessPolicyRequest extends StObject {
  
  /**
    * The name of the access policy.
    */
  var name: PolicyName
  
  /**
    * Tye type of policy. Currently the only supported value is data.
    */
  var `type`: AccessPolicyType
}
object GetAccessPolicyRequest {
  
  inline def apply(name: PolicyName, `type`: AccessPolicyType): GetAccessPolicyRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAccessPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: PolicyName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: AccessPolicyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
