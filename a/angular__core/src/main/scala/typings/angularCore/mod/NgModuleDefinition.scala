package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.angularCoreStrings.platform
import typings.angularCore.angularCoreStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgModuleDefinition
  extends StObject
     with Definition[NgModuleDefinitionFactory] {
  
  var modules: js.Array[js.Any]
  
  var providers: js.Array[NgModuleProviderDef]
  
  var providersByKey: StringDictionary[NgModuleProviderDef]
  
  var scope: root | platform | Null
}
object NgModuleDefinition {
  
  inline def apply(
    modules: js.Array[js.Any],
    providers: js.Array[NgModuleProviderDef],
    providersByKey: StringDictionary[NgModuleProviderDef]
  ): NgModuleDefinition = {
    val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], providersByKey = providersByKey.asInstanceOf[js.Any], factory = null, scope = null)
    __obj.asInstanceOf[NgModuleDefinition]
  }
  
  extension [Self <: NgModuleDefinition](x: Self) {
    
    inline def setModules(value: js.Array[js.Any]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesVarargs(value: js.Any*): Self = StObject.set(x, "modules", js.Array(value :_*))
    
    inline def setProviders(value: js.Array[NgModuleProviderDef]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersByKey(value: StringDictionary[NgModuleProviderDef]): Self = StObject.set(x, "providersByKey", value.asInstanceOf[js.Any])
    
    inline def setProvidersVarargs(value: NgModuleProviderDef*): Self = StObject.set(x, "providers", js.Array(value :_*))
    
    inline def setScope(value: root | platform): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeNull: Self = StObject.set(x, "scope", null)
  }
}
