package typings.angularPlatformBrowser.mod

import typings.angularCore.mod.ImportedNgModuleProviders
import typings.angularCore.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationConfig extends StObject {
  
  /**
    * List of providers that should be available to the root component and all its children.
    */
  var providers: js.Array[Provider | ImportedNgModuleProviders]
}
object ApplicationConfig {
  
  inline def apply(providers: js.Array[Provider | ImportedNgModuleProviders]): ApplicationConfig = {
    val __obj = js.Dynamic.literal(providers = providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationConfig] (val x: Self) extends AnyVal {
    
    inline def setProviders(value: js.Array[Provider | ImportedNgModuleProviders]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersVarargs(value: (Provider | ImportedNgModuleProviders)*): Self = StObject.set(x, "providers", js.Array(value*))
  }
}
