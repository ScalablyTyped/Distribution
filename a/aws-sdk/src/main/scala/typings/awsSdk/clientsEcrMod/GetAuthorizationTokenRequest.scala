package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAuthorizationTokenRequest extends StObject {
  
  /**
    * A list of Amazon Web Services account IDs that are associated with the registries for which to get AuthorizationData objects. If you do not specify a registry, the default registry is assumed.
    */
  var registryIds: js.UndefOr[GetAuthorizationTokenRegistryIdList] = js.undefined
}
object GetAuthorizationTokenRequest {
  
  inline def apply(): GetAuthorizationTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAuthorizationTokenRequest]
  }
  
  extension [Self <: GetAuthorizationTokenRequest](x: Self) {
    
    inline def setRegistryIds(value: GetAuthorizationTokenRegistryIdList): Self = StObject.set(x, "registryIds", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdsUndefined: Self = StObject.set(x, "registryIds", js.undefined)
    
    inline def setRegistryIdsVarargs(value: RegistryId*): Self = StObject.set(x, "registryIds", js.Array(value*))
  }
}
