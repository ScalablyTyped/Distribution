package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.angularCoreStrings.platform
import typings.angularCore.angularCoreStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NgModuleDefinition extends Definition[NgModuleDefinitionFactory] {
  var modules: js.Array[_] = js.native
  var providers: js.Array[NgModuleProviderDef] = js.native
  var providersByKey: StringDictionary[NgModuleProviderDef] = js.native
  var scope: root | platform | Null = js.native
}

object NgModuleDefinition {
  @scala.inline
  def apply(
    modules: js.Array[_],
    providers: js.Array[NgModuleProviderDef],
    providersByKey: StringDictionary[NgModuleProviderDef]
  ): NgModuleDefinition = {
    val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], providersByKey = providersByKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgModuleDefinition]
  }
  @scala.inline
  implicit class NgModuleDefinitionOps[Self <: NgModuleDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setModulesVarargs(value: js.Any*): Self = this.set("modules", js.Array(value :_*))
    @scala.inline
    def setModules(value: js.Array[_]): Self = this.set("modules", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvidersVarargs(value: NgModuleProviderDef*): Self = this.set("providers", js.Array(value :_*))
    @scala.inline
    def setProviders(value: js.Array[NgModuleProviderDef]): Self = this.set("providers", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvidersByKey(value: StringDictionary[NgModuleProviderDef]): Self = this.set("providersByKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: root | platform): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeNull: Self = this.set("scope", null)
  }
  
}

