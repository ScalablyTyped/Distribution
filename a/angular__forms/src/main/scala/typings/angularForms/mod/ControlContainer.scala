package typings.angularForms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "ControlContainer")
@js.native
abstract class ControlContainer () extends AbstractControlDirective {
  /**
    * @description
    * The name for the control
    */
  var name: String | Double | Null = js.native
  /**
    * @description
    * The top-level form directive for the control.
    */
  def formDirective: Form | Null = js.native
}

