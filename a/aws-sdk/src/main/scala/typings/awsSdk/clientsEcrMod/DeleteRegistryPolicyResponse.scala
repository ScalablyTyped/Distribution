package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRegistryPolicyResponse extends StObject {
  
  /**
    * The contents of the registry permissions policy that was deleted.
    */
  var policyText: js.UndefOr[RegistryPolicyText] = js.undefined
  
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
}
object DeleteRegistryPolicyResponse {
  
  inline def apply(): DeleteRegistryPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRegistryPolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRegistryPolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setPolicyText(value: RegistryPolicyText): Self = StObject.set(x, "policyText", value.asInstanceOf[js.Any])
    
    inline def setPolicyTextUndefined: Self = StObject.set(x, "policyText", js.undefined)
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
  }
}
