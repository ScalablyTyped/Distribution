package typings.angularCompiler.lazyRoutesMod

import typings.angularCompiler.staticReflectorMod.StaticReflector
import typings.angularCompiler.staticSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/aot/lazy_routes", "parseLazyRoute")
@js.native
object parseLazyRoute extends js.Object {
  
  def apply(route: String, reflector: StaticReflector): LazyRoute = js.native
  def apply(route: String, reflector: StaticReflector, module: StaticSymbol): LazyRoute = js.native
}
