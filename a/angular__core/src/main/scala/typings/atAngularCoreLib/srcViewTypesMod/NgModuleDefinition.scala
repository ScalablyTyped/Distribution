package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgModuleDefinition extends Definition[NgModuleDefinitionFactory] {
  var isRoot: scala.Boolean
  var modules: js.Array[_]
  var providers: js.Array[NgModuleProviderDef]
  var providersByKey: org.scalablytyped.runtime.StringDictionary[NgModuleProviderDef]
}

object NgModuleDefinition {
  @scala.inline
  def apply(
    isRoot: scala.Boolean,
    modules: js.Array[_],
    providers: js.Array[NgModuleProviderDef],
    providersByKey: org.scalablytyped.runtime.StringDictionary[NgModuleProviderDef],
    factory: NgModuleDefinitionFactory = null
  ): NgModuleDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isRoot")(isRoot)
    __obj.updateDynamic("modules")(modules)
    __obj.updateDynamic("providers")(providers)
    __obj.updateDynamic("providersByKey")(providersByKey)
    if (factory != null) __obj.updateDynamic("factory")(factory)
    __obj.asInstanceOf[NgModuleDefinition]
  }
}

