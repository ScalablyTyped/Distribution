package typings.atAngularCore.srcR3UnderscoreSymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgModuleDef[T] extends js.Object {
  /** List of components to bootstrap. */
  var bootstrap: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]
  /** List of components, directives, and pipes declared by this module. */
  var declarations: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]
  /**
    * List of modules, `ModuleWithProviders`, components, directives, or pipes exported by this
    * module.
    */
  var exports: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]
  /** Unique ID for the module with which it should be registered.  */
  var id: String | Null
  /** List of modules or `ModuleWithProviders` imported by this module. */
  var imports: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]
  /** The set of schemas that declare elements to be allowed in the NgModule. */
  var schemas: js.Array[SchemaMetadata] | Null
  /**
    * Cached value of computed `transitiveCompileScopes` for this module.
    *
    * This should never be read directly, but accessed via `transitiveScopesFor`.
    */
  var transitiveCompileScopes: NgModuleTransitiveScopes | Null
  /** Token representing the module. Used by DI. */
  var `type`: T
}

object NgModuleDef {
  @scala.inline
  def apply[T](
    bootstrap: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]],
    declarations: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]],
    exports: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]],
    imports: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]],
    `type`: T,
    id: String = null,
    schemas: js.Array[SchemaMetadata] = null,
    transitiveCompileScopes: NgModuleTransitiveScopes = null
  ): NgModuleDef[T] = {
    val __obj = js.Dynamic.literal(bootstrap = bootstrap.asInstanceOf[js.Any], declarations = declarations.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (schemas != null) __obj.updateDynamic("schemas")(schemas.asInstanceOf[js.Any])
    if (transitiveCompileScopes != null) __obj.updateDynamic("transitiveCompileScopes")(transitiveCompileScopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgModuleDef[T]]
  }
}

