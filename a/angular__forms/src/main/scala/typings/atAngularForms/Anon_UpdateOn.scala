package typings.atAngularForms

import typings.atAngularForms.atAngularFormsMod.FormHooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_UpdateOn extends js.Object {
  var updateOn: js.UndefOr[FormHooks] = js.undefined
}

object Anon_UpdateOn {
  @scala.inline
  def apply(updateOn: FormHooks = null): Anon_UpdateOn = {
    val __obj = js.Dynamic.literal()
    if (updateOn != null) __obj.updateDynamic("updateOn")(updateOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_UpdateOn]
  }
}

