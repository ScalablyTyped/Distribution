package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bootstrap[T] extends js.Object {
  /** List of components to bootstrap. */
  var bootstrap: js.UndefOr[
    js.Array[atAngularCoreLib.atAngularCoreMod.Type[_]] | js.Function0[js.Array[atAngularCoreLib.atAngularCoreMod.Type[_]]]
  ] = js.undefined
  /** List of components, directives, and pipes declared by this module. */
  var declarations: js.UndefOr[
    js.Array[atAngularCoreLib.atAngularCoreMod.Type[_]] | js.Function0[js.Array[atAngularCoreLib.atAngularCoreMod.Type[_]]]
  ] = js.undefined
  /**
    * List of modules, `ModuleWithProviders`, components, directives, or pipes exported by this
    * module.
    */
  var exports: js.UndefOr[
    js.Array[atAngularCoreLib.atAngularCoreMod.Type[_]] | js.Function0[js.Array[atAngularCoreLib.atAngularCoreMod.Type[_]]]
  ] = js.undefined
  /** List of modules or `ModuleWithProviders` imported by this module. */
  var imports: js.UndefOr[
    js.Array[atAngularCoreLib.atAngularCoreMod.Type[_]] | js.Function0[js.Array[atAngularCoreLib.atAngularCoreMod.Type[_]]]
  ] = js.undefined
  /** The set of schemas that declare elements to be allowed in the NgModule. */
  var schemas: js.UndefOr[js.Array[atAngularCoreLib.atAngularCoreMod.SchemaMetadata] | scala.Null] = js.undefined
  /** Token representing the module. Used by DI. */
  var `type`: T
}

object Anon_Bootstrap {
  @scala.inline
  def apply[T](
    `type`: T,
    bootstrap: js.Array[atAngularCoreLib.atAngularCoreMod.Type[_]] | js.Function0[js.Array[atAngularCoreLib.atAngularCoreMod.Type[_]]] = null,
    declarations: js.Array[atAngularCoreLib.atAngularCoreMod.Type[_]] | js.Function0[js.Array[atAngularCoreLib.atAngularCoreMod.Type[_]]] = null,
    exports: js.Array[atAngularCoreLib.atAngularCoreMod.Type[_]] | js.Function0[js.Array[atAngularCoreLib.atAngularCoreMod.Type[_]]] = null,
    imports: js.Array[atAngularCoreLib.atAngularCoreMod.Type[_]] | js.Function0[js.Array[atAngularCoreLib.atAngularCoreMod.Type[_]]] = null,
    schemas: js.Array[atAngularCoreLib.atAngularCoreMod.SchemaMetadata] = null
  ): Anon_Bootstrap[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bootstrap != null) __obj.updateDynamic("bootstrap")(bootstrap.asInstanceOf[js.Any])
    if (declarations != null) __obj.updateDynamic("declarations")(declarations.asInstanceOf[js.Any])
    if (exports != null) __obj.updateDynamic("exports")(exports.asInstanceOf[js.Any])
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    if (schemas != null) __obj.updateDynamic("schemas")(schemas)
    __obj.asInstanceOf[Anon_Bootstrap[T]]
  }
}

