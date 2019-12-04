package typings.atAngularCore

import typings.atAngularCore.srcR3UnderscoreSymbolsMod.SchemaMetadata
import typings.atAngularCore.srcR3UnderscoreSymbolsMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BootstrapDeclarations[T] extends js.Object {
  /** List of components to bootstrap. */
  var bootstrap: js.UndefOr[js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]] = js.undefined
  /** List of components, directives, and pipes declared by this module. */
  var declarations: js.UndefOr[js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]] = js.undefined
  /**
    * List of modules, `ModuleWithProviders`, components, directives, or pipes exported by this
    * module.
    */
  var exports: js.UndefOr[js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]] = js.undefined
  /** Unique ID for the module that is used with `getModuleFactory`. */
  var id: js.UndefOr[String | Null] = js.undefined
  /** List of modules or `ModuleWithProviders` imported by this module. */
  var imports: js.UndefOr[js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]] = js.undefined
  /** The set of schemas that declare elements to be allowed in the NgModule. */
  var schemas: js.UndefOr[js.Array[SchemaMetadata] | Null] = js.undefined
  /** Token representing the module. Used by DI. */
  var `type`: T
}

object Anon_BootstrapDeclarations {
  @scala.inline
  def apply[T](
    `type`: T,
    bootstrap: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]] = null,
    declarations: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]] = null,
    exports: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]] = null,
    id: String = null,
    imports: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]] = null,
    schemas: js.Array[SchemaMetadata] = null
  ): Anon_BootstrapDeclarations[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bootstrap != null) __obj.updateDynamic("bootstrap")(bootstrap.asInstanceOf[js.Any])
    if (declarations != null) __obj.updateDynamic("declarations")(declarations.asInstanceOf[js.Any])
    if (exports != null) __obj.updateDynamic("exports")(exports.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    if (schemas != null) __obj.updateDynamic("schemas")(schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BootstrapDeclarations[T]]
  }
}

