package typings
package atAngularFormsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_UpdateOn extends js.Object {
  var updateOn: js.UndefOr[atAngularFormsLib.srcModelMod.FormHooks] = js.undefined
}

object Anon_UpdateOn {
  @scala.inline
  def apply(updateOn: atAngularFormsLib.srcModelMod.FormHooks = null): Anon_UpdateOn = {
    val __obj = js.Dynamic.literal()
    if (updateOn != null) __obj.updateDynamic("updateOn")(updateOn)
    __obj.asInstanceOf[Anon_UpdateOn]
  }
}

