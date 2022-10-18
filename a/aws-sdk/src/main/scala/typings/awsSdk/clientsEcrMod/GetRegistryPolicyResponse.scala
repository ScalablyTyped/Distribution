package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRegistryPolicyResponse extends StObject {
  
  /**
    * The JSON text of the permissions policy for a registry.
    */
  var policyText: js.UndefOr[RegistryPolicyText] = js.undefined
  
  /**
    * The ID of the registry.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
}
object GetRegistryPolicyResponse {
  
  inline def apply(): GetRegistryPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRegistryPolicyResponse]
  }
  
  extension [Self <: GetRegistryPolicyResponse](x: Self) {
    
    inline def setPolicyText(value: RegistryPolicyText): Self = StObject.set(x, "policyText", value.asInstanceOf[js.Any])
    
    inline def setPolicyTextUndefined: Self = StObject.set(x, "policyText", js.undefined)
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
  }
}
