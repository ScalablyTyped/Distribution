package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRegistryScanningConfigurationResponse extends StObject {
  
  /**
    * The scanning configuration for your registry.
    */
  var registryScanningConfiguration: js.UndefOr[RegistryScanningConfiguration] = js.undefined
}
object PutRegistryScanningConfigurationResponse {
  
  inline def apply(): PutRegistryScanningConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRegistryScanningConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutRegistryScanningConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setRegistryScanningConfiguration(value: RegistryScanningConfiguration): Self = StObject.set(x, "registryScanningConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRegistryScanningConfigurationUndefined: Self = StObject.set(x, "registryScanningConfiguration", js.undefined)
  }
}
