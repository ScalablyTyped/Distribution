package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRegistryScanningConfigurationResponse extends StObject {
  
  /**
    * The ID of the registry.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The scanning configuration for the registry.
    */
  var scanningConfiguration: js.UndefOr[RegistryScanningConfiguration] = js.undefined
}
object GetRegistryScanningConfigurationResponse {
  
  inline def apply(): GetRegistryScanningConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRegistryScanningConfigurationResponse]
  }
  
  extension [Self <: GetRegistryScanningConfigurationResponse](x: Self) {
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setScanningConfiguration(value: RegistryScanningConfiguration): Self = StObject.set(x, "scanningConfiguration", value.asInstanceOf[js.Any])
    
    inline def setScanningConfigurationUndefined: Self = StObject.set(x, "scanningConfiguration", js.undefined)
  }
}
