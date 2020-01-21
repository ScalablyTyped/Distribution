package typings.angularForms.mod

import typings.angularCore.mod.ModuleWithProviders
import typings.angularForms.AnonAlwaysNever
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "ReactiveFormsModule")
@js.native
class ReactiveFormsModule () extends js.Object

/* static members */
@JSImport("@angular/forms", "ReactiveFormsModule")
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
  def withConfig(opts: AnonAlwaysNever): ModuleWithProviders[ReactiveFormsModule] = js.native
}

