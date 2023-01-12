package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePolicyResponse extends StObject {
  
  /**
    * A structure that contains details about the newly created policy.
    */
  var Policy: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.Policy] = js.undefined
}
object CreatePolicyResponse {
  
  inline def apply(): CreatePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
