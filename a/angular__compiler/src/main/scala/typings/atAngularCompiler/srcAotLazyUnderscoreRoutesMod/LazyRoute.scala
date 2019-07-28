package typings.atAngularCompiler.srcAotLazyUnderscoreRoutesMod

import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LazyRoute extends js.Object {
  var module: StaticSymbol
  var referencedModule: StaticSymbol
  var route: String
}

object LazyRoute {
  @scala.inline
  def apply(module: StaticSymbol, referencedModule: StaticSymbol, route: String): LazyRoute = {
    val __obj = js.Dynamic.literal(module = module, referencedModule = referencedModule, route = route)
  
    __obj.asInstanceOf[LazyRoute]
  }
}

