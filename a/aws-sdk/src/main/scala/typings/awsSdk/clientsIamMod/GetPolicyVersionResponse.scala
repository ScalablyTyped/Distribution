package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPolicyVersionResponse extends StObject {
  
  /**
    * A structure containing details about the policy version.
    */
  var PolicyVersion: js.UndefOr[typings.awsSdk.clientsIamMod.PolicyVersion] = js.undefined
}
object GetPolicyVersionResponse {
  
  inline def apply(): GetPolicyVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPolicyVersionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPolicyVersionResponse] (val x: Self) extends AnyVal {
    
    inline def setPolicyVersion(value: PolicyVersion): Self = StObject.set(x, "PolicyVersion", value.asInstanceOf[js.Any])
    
    inline def setPolicyVersionUndefined: Self = StObject.set(x, "PolicyVersion", js.undefined)
  }
}
