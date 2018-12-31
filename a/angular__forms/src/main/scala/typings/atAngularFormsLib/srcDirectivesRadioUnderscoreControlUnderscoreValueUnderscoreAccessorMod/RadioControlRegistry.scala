package typings
package atAngularFormsLib.srcDirectivesRadioUnderscoreControlUnderscoreValueUnderscoreAccessorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms/src/directives/radio_control_value_accessor", "RadioControlRegistry")
@js.native
class RadioControlRegistry () extends js.Object {
  var _accessors: js.Any = js.native
  var _isSameGroup: js.Any = js.native
  /**
    * @description
    * Adds a control to the internal registry. For internal use only.
    */
  def add(
    control: atAngularFormsLib.srcDirectivesNgUnderscoreControlMod.NgControl,
    accessor: RadioControlValueAccessor
  ): scala.Unit = js.native
  /**
    * @description
    * Removes a control from the internal registry. For internal use only.
    */
  def remove(accessor: RadioControlValueAccessor): scala.Unit = js.native
  /**
    * @description
    * Selects a radio button. For internal use only.
    */
  def select(accessor: RadioControlValueAccessor): scala.Unit = js.native
}

