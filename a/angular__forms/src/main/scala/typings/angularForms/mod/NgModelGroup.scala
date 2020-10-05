package typings.angularForms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "NgModelGroup")
@js.native
class NgModelGroup protected () extends AbstractFormGroupDirective {
  def this(parent: ControlContainer, validators: js.Array[_], asyncValidators: js.Array[_]) = this()
  /**
    * @description
    * Tracks the name of the `NgModelGroup` bound to the directive. The name corresponds
    * to a key in the parent `NgForm`.
    */
  @JSName("name")
  var name_NgModelGroup: String = js.native
}

