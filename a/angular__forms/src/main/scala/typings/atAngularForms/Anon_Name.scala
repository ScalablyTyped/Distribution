package typings.atAngularForms

import typings.atAngularForms.atAngularFormsMod.FormHooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var standalone: js.UndefOr[Boolean] = js.undefined
  var updateOn: js.UndefOr[FormHooks] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(name: String = null, standalone: js.UndefOr[Boolean] = js.undefined, updateOn: FormHooks = null): Anon_Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    if (updateOn != null) __obj.updateDynamic("updateOn")(updateOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Name]
  }
}

