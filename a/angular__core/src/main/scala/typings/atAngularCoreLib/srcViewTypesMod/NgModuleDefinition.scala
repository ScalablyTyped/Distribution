package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NgModuleDefinition extends Definition[NgModuleDefinitionFactory] {
  var isRoot: scala.Boolean
  var modules: js.Array[_]
  var providers: js.Array[NgModuleProviderDef]
  var providersByKey: ScalablyTyped.runtime.StringDictionary[NgModuleProviderDef]
}

