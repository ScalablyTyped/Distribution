package typings.angularForms.anon

import typings.angularForms.mod.FormHooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateOn extends js.Object {
  var updateOn: js.UndefOr[FormHooks] = js.undefined
}

object UpdateOn {
  @scala.inline
  def apply(updateOn: FormHooks = null): UpdateOn = {
    val __obj = js.Dynamic.literal()
    if (updateOn != null) __obj.updateDynamic("updateOn")(updateOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOn]
  }
}

