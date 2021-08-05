package typings.angularForms.mod

import typings.angularCore.mod.ModuleWithProviders
import typings.angularForms.anon.WarnOnNgModelWithFormControl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "ReactiveFormsModule")
@js.native
class ReactiveFormsModule () extends StObject
/* static members */
object ReactiveFormsModule {
  
  @JSImport("@angular/forms", "ReactiveFormsModule")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @description
    * Provides options for configuring the reactive forms module.
    *
    * @param opts An object of configuration options
    * * `warnOnNgModelWithFormControl` Configures when to emit a warning when an `ngModel`
    * binding is used with reactive form directives.
    */
  inline def withConfig(opts: WarnOnNgModelWithFormControl): ModuleWithProviders[ReactiveFormsModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("withConfig")(opts.asInstanceOf[js.Any]).asInstanceOf[ModuleWithProviders[ReactiveFormsModule]]
}
