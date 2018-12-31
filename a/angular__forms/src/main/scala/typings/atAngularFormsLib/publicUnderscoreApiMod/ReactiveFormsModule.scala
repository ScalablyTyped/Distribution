package typings
package atAngularFormsLib.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms/public_api", "ReactiveFormsModule")
@js.native
class ReactiveFormsModule ()
  extends atAngularFormsLib.srcFormsMod.ReactiveFormsModule

@JSImport("@angular/forms/public_api", "ReactiveFormsModule")
@js.native
object ReactiveFormsModule extends js.Object {
  /**
    * @description
    * Provides options for configuring the reactive forms module.
    *
    * @param opts An object of configuration options
    * * `warnOnNgModelWithFormControl` Configures when to emit a warning when an `ngModel`
    * binding is used with reactive form directives.
    */
  def withConfig(opts: atAngularFormsLib.Anon_WarnOnNgModelWithFormControl): atAngularCoreLib.srcMetadataNgUnderscoreModuleMod.ModuleWithProviders[atAngularFormsLib.srcFormUnderscoreProvidersMod.ReactiveFormsModule] = js.native
}

