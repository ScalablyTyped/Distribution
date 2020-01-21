package typings.angularForms

import typings.angularForms.mod.FormHooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUpdateOn extends js.Object {
  var updateOn: js.UndefOr[FormHooks] = js.undefined
}

object AnonUpdateOn {
  @scala.inline
  def apply(updateOn: FormHooks = null): AnonUpdateOn = {
    val __obj = js.Dynamic.literal()
    if (updateOn != null) __obj.updateDynamic("updateOn")(updateOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUpdateOn]
  }
}

