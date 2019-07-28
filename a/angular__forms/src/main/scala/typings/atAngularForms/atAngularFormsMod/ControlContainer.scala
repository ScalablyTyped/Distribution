package typings.atAngularForms.atAngularFormsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "ControlContainer")
@js.native
abstract class ControlContainer () extends AbstractControlDirective {
  /**
    * @description
    * The top-level form directive for the control.
    */
  val formDirective: Form | Null = js.native
  /**
    * @description
    * The name for the control
    */
  var name: String = js.native
}

