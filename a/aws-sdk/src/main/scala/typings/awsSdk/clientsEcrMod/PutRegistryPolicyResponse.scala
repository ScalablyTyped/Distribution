package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRegistryPolicyResponse extends StObject {
  
  /**
    * The JSON policy text for your registry.
    */
  var policyText: js.UndefOr[RegistryPolicyText] = js.undefined
  
  /**
    * The registry ID.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
}
object PutRegistryPolicyResponse {
  
  inline def apply(): PutRegistryPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRegistryPolicyResponse]
  }
  
  extension [Self <: PutRegistryPolicyResponse](x: Self) {
    
    inline def setPolicyText(value: RegistryPolicyText): Self = StObject.set(x, "policyText", value.asInstanceOf[js.Any])
    
    inline def setPolicyTextUndefined: Self = StObject.set(x, "policyText", js.undefined)
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
  }
}
