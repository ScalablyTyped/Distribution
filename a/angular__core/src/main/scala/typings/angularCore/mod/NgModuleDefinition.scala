package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.angularCoreStrings.platform
import typings.angularCore.angularCoreStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgModuleDefinition extends Definition[NgModuleDefinitionFactory] {
  var modules: js.Array[_]
  var providers: js.Array[NgModuleProviderDef]
  var providersByKey: StringDictionary[NgModuleProviderDef]
  var scope: root | platform | Null
}

object NgModuleDefinition {
  @scala.inline
  def apply(
    modules: js.Array[_],
    providers: js.Array[NgModuleProviderDef],
    providersByKey: StringDictionary[NgModuleProviderDef],
    factory: NgModuleDefinitionFactory = null,
    scope: root | platform = null
  ): NgModuleDefinition = {
    val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], providersByKey = providersByKey.asInstanceOf[js.Any], factory = factory.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgModuleDefinition]
  }
}

