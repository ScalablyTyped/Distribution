package typings.atAngularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcR3UnderscoreSymbolsMod {
  /**
    * Describes how the `Injector` should be configured as static (that is, without reflection).
    * @see ["Dependency Injection Guide"](guide/dependency-injection).
    *
    * @publicApi
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atAngularCore.srcR3UnderscoreSymbolsMod.ValueProvider
    - typings.atAngularCore.srcR3UnderscoreSymbolsMod.ExistingProvider
    - typings.atAngularCore.srcR3UnderscoreSymbolsMod.StaticClassProvider
    - typings.atAngularCore.srcR3UnderscoreSymbolsMod.ConstructorProvider
    - typings.atAngularCore.srcR3UnderscoreSymbolsMod.FactoryProvider
    - js.Array[js.Any]
  */
  type StaticProvider = _StaticProvider | js.Array[js.Any]
  type ɵɵNgModuleDefWithMeta[T, Declarations, Imports, Exports] = NgModuleDef[T]
}
