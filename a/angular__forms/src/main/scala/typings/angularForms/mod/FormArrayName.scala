package typings.angularForms.mod

import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.OnInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "FormArrayName")
@js.native
class FormArrayName protected ()
  extends ControlContainer
     with OnInit
     with OnDestroy {
  def this(parent: ControlContainer, validators: js.Array[_], asyncValidators: js.Array[_]) = this()
  var _checkParentType: js.Any = js.native
  /**
    * @description
    * Async validator function composed of all the async validators registered with this directive.
    */
  def asyncValidator: AsyncValidatorFn | Null = js.native
  /**
    * @description
    * Synchronous validator function composed of all the synchronous validators registered with this
    * directive.
    */
  def validator: ValidatorFn | Null = js.native
}

