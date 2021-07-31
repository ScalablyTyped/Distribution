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
  
  @scala.inline
  def apply(
    modules: js.Array[js.Any],
    providers: js.Array[NgModuleProviderDef],
    providersByKey: StringDictionary[NgModuleProviderDef]
  ): NgModuleDefinition = {
    val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], providersByKey = providersByKey.asInstanceOf[js.Any], factory = null, scope = null)
    __obj.asInstanceOf[NgModuleDefinition]
  }
  
  @scala.inline
  implicit class NgModuleDefinitionMutableBuilder[Self <: NgModuleDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModules(value: js.Array[js.Any]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulesVarargs(value: js.Any*): Self = StObject.set(x, "modules", js.Array(value :_*))
    
    @scala.inline
    def setProviders(value: js.Array[NgModuleProviderDef]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersByKey(value: StringDictionary[NgModuleProviderDef]): Self = StObject.set(x, "providersByKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersVarargs(value: NgModuleProviderDef*): Self = StObject.set(x, "providers", js.Array(value :_*))
    
    @scala.inline
    def setScope(value: root | platform): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeNull: Self = StObject.set(x, "scope", null)
  }
}
