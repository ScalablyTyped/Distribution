package typings.angularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object r3SymbolsMod {
  /**
    * An object literal of this type is used to represent the metadata of a constructor dependency.
    * The type itself is never referred to from generated code.
    */
  type CtorDependency = typings.angularCore.AnonAttribute | scala.Null
  /**
    * Describes how an `Injector` should be configured as static (that is, without reflection).
    * A static provider provides tokens to an injector for various types of dependencies.
    *
    * @see [Injector.create()](/api/core/Injector#create).
    * @see ["Dependency Injection Guide"](guide/dependency-injection-providers).
    *
    * @publicApi
    */
  /* Rewritten from type alias, can be one of: 
    - typings.angularCore.r3SymbolsMod.ValueProvider
    - typings.angularCore.r3SymbolsMod.ExistingProvider
    - typings.angularCore.r3SymbolsMod.StaticClassProvider
    - typings.angularCore.r3SymbolsMod.ConstructorProvider
    - typings.angularCore.r3SymbolsMod.FactoryProvider
    - js.Array[js.Any]
  */
  type StaticProvider = typings.angularCore.r3SymbolsMod._StaticProvider | js.Array[js.Any]
  type ɵɵFactoryDef[T, CtorDependencies /* <: js.Array[typings.angularCore.r3SymbolsMod.CtorDependency] */] = js.Function0[T]
  type ɵɵNgModuleDefWithMeta[T, Declarations, Imports, Exports] = typings.angularCore.r3SymbolsMod.NgModuleDef[T]
}
