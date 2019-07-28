package typings.atAngularCompiler.srcAotLazyUnderscoreRoutesMod

import typings.atAngularCompiler.srcAotStaticUnderscoreReflectorMod.StaticReflector
import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileNgModuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/lazy_routes", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def listLazyRoutes(moduleMeta: CompileNgModuleMetadata, reflector: StaticReflector): js.Array[LazyRoute] = js.native
  def parseLazyRoute(route: String, reflector: StaticReflector): LazyRoute = js.native
  def parseLazyRoute(route: String, reflector: StaticReflector, module: StaticSymbol): LazyRoute = js.native
}

