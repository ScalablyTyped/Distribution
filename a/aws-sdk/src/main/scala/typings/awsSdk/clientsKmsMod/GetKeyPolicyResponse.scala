package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKeyPolicyResponse extends StObject {
  
  /**
    * A key policy document in JSON format.
    */
  var Policy: js.UndefOr[PolicyType] = js.undefined
}
object GetKeyPolicyResponse {
  
  inline def apply(): GetKeyPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKeyPolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetKeyPolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: PolicyType): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
