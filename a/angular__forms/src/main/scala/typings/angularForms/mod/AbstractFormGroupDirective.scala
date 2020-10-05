package typings.angularForms.mod

import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.OnInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "AbstractFormGroupDirective")
@js.native
class AbstractFormGroupDirective ()
  extends ControlContainer
     with OnInit
     with OnDestroy {
  /**
    * @description
    * The async validators registered with this group.
    */
  def asyncValidator: AsyncValidatorFn | Null = js.native
  /**
    * @description
    * The synchronous validators registered with this group.
    */
  def validator: ValidatorFn | Null = js.native
}

