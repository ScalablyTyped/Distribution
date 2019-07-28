package typings.atAngularCore.atAngularCoreMod

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
    val __obj = js.Dynamic.literal(isRoot = isRoot, modules = modules, providers = providers, providersByKey = providersByKey)
    if (factory != null) __obj.updateDynamic("factory")(factory)
    __obj.asInstanceOf[NgModuleDefinition]
  }
}

