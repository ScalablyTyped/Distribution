package typings.angularForms

import typings.angularForms.angularFormsStrings.always
import typings.angularForms.angularFormsStrings.never
import typings.angularForms.angularFormsStrings.once
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWarnOnNgModelWithFormControl extends js.Object {
  /** @deprecated as of v6 */ var warnOnNgModelWithFormControl: never | once | always
}

object AnonWarnOnNgModelWithFormControl {
  @scala.inline
  def apply(warnOnNgModelWithFormControl: never | once | always): AnonWarnOnNgModelWithFormControl = {
    val __obj = js.Dynamic.literal(warnOnNgModelWithFormControl = warnOnNgModelWithFormControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWarnOnNgModelWithFormControl]
  }
}

