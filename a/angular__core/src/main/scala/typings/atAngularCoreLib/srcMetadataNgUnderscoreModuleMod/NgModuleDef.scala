package typings
package atAngularCoreLib.srcMetadataNgUnderscoreModuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgModuleDef[T] extends js.Object {
  /** List of components to bootstrap. */
  var bootstrap: js.Array[atAngularCoreLib.srcTypeMod.Type[_]]
  /** List of components, directives, and pipes declared by this module. */
  var declarations: js.Array[atAngularCoreLib.srcTypeMod.Type[_]]
  /**
    * List of modules, `ModuleWithProviders`, components, directives, or pipes exported by this
    * module.
    */
  var exports: js.Array[atAngularCoreLib.srcTypeMod.Type[_]]
  /** List of modules or `ModuleWithProviders` imported by this module. */
  var imports: js.Array[atAngularCoreLib.srcTypeMod.Type[_]]
  /**
    * Cached value of computed `transitiveCompileScopes` for this module.
    *
    * This should never be read directly, but accessed via `transitiveScopesFor`.
    */
  var transitiveCompileScopes: NgModuleTransitiveScopes | scala.Null
  /** Token representing the module. Used by DI. */
  var `type`: T
}

object NgModuleDef {
  @scala.inline
  def apply[T](
    bootstrap: js.Array[atAngularCoreLib.srcTypeMod.Type[_]],
    declarations: js.Array[atAngularCoreLib.srcTypeMod.Type[_]],
    exports: js.Array[atAngularCoreLib.srcTypeMod.Type[_]],
    imports: js.Array[atAngularCoreLib.srcTypeMod.Type[_]],
    `type`: T,
    transitiveCompileScopes: NgModuleTransitiveScopes = null
  ): NgModuleDef[T] = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("bootstrap")(bootstrap)
    __obj.updateDynamic("declarations")(declarations)
    __obj.updateDynamic("exports")(exports)
    __obj.updateDynamic("imports")(imports)
    if (transitiveCompileScopes != null) __obj.updateDynamic("transitiveCompileScopes")(transitiveCompileScopes)
    __obj.asInstanceOf[NgModuleDef[T]]
  }
}

