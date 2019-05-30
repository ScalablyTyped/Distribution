package typings
package atAngularFormsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var standalone: js.UndefOr[scala.Boolean] = js.undefined
  var updateOn: js.UndefOr[atAngularFormsLib.atAngularFormsMod.FormHooks] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    standalone: js.UndefOr[scala.Boolean] = js.undefined,
    updateOn: atAngularFormsLib.atAngularFormsMod.FormHooks = null
  ): Anon_Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone)
    if (updateOn != null) __obj.updateDynamic("updateOn")(updateOn)
    __obj.asInstanceOf[Anon_Name]
  }
}

