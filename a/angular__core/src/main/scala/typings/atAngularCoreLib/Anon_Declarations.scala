package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Declarations extends js.Object {
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
}

object Anon_Declarations {
  @scala.inline
  def apply(
    declarations: js.Array[atAngularCoreLib.atAngularCoreMod.Type[_]] | js.Function0[js.Array[atAngularCoreLib.atAngularCoreMod.Type[_]]] = null,
    exports: js.Array[atAngularCoreLib.atAngularCoreMod.Type[_]] | js.Function0[js.Array[atAngularCoreLib.atAngularCoreMod.Type[_]]] = null,
    imports: js.Array[atAngularCoreLib.atAngularCoreMod.Type[_]] | js.Function0[js.Array[atAngularCoreLib.atAngularCoreMod.Type[_]]] = null
  ): Anon_Declarations = {
    val __obj = js.Dynamic.literal()
    if (declarations != null) __obj.updateDynamic("declarations")(declarations.asInstanceOf[js.Any])
    if (exports != null) __obj.updateDynamic("exports")(exports.asInstanceOf[js.Any])
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Declarations]
  }
}

