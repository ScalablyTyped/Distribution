package typings.angularCompiler.lazyRoutesMod

import typings.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typings.angularCompiler.staticReflectorMod.StaticReflector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/lazy_routes", "listLazyRoutes")
@js.native
object listLazyRoutes extends js.Object {
  def apply(moduleMeta: CompileNgModuleMetadata, reflector: StaticReflector): js.Array[LazyRoute] = js.native
}

