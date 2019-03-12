package typings
package atAngularCompilerLib.srcAotLazyUnderscoreRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/lazy_routes", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def listLazyRoutes(
    moduleMeta: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileNgModuleMetadata,
    reflector: atAngularCompilerLib.srcAotStaticUnderscoreReflectorMod.StaticReflector
  ): js.Array[LazyRoute] = js.native
  def parseLazyRoute(
    route: java.lang.String,
    reflector: atAngularCompilerLib.srcAotStaticUnderscoreReflectorMod.StaticReflector
  ): LazyRoute = js.native
  def parseLazyRoute(
    route: java.lang.String,
    reflector: atAngularCompilerLib.srcAotStaticUnderscoreReflectorMod.StaticReflector,
    module: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol
  ): LazyRoute = js.native
}

