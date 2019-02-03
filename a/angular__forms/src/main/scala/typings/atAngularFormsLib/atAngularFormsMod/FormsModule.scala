package typings
package atAngularFormsLib.atAngularFormsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "FormsModule")
@js.native
class FormsModule ()
  extends atAngularFormsLib.publicUnderscoreApiMod.FormsModule

/* static members */
@JSImport("@angular/forms", "FormsModule")
@js.native
object FormsModule extends js.Object {
  /**
    * @description
    * Provides options for configuring the template-driven forms module.
    *
    * @param opts An object of configuration options
    * * `warnOnDeprecatedNgFormSelector` Configures when to emit a warning when the deprecated
    * `ngForm` selector is used.
    */
  def withConfig(opts: atAngularFormsLib.Anon_Always): atAngularCoreLib.srcMetadataNgUnderscoreModuleMod.ModuleWithProviders[atAngularFormsLib.srcFormUnderscoreProvidersMod.FormsModule] = js.native
}

