package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgModuleDefinition extends Definition[NgModuleDefinitionFactory] {
  var isRoot: Boolean
  var modules: js.Array[_]
  var providers: js.Array[NgModuleProviderDef]
  var providersByKey: StringDictionary[NgModuleProviderDef]
}

object NgModuleDefinition {
  @scala.inline
  def apply(
    isRoot: Boolean,
    modules: js.Array[_],
    providers: js.Array[NgModuleProviderDef],
    providersByKey: StringDictionary[NgModuleProviderDef],
    factory: NgModuleDefinitionFactory = null
  ): NgModuleDefinition = {
    val __obj = js.Dynamic.literal(isRoot = isRoot.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], providersByKey = providersByKey.asInstanceOf[js.Any])
    if (factory != null) __obj.updateDynamic("factory")(factory.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgModuleDefinition]
  }
}

