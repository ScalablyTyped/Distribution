package typings
package atAngularFormsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnlySelf extends js.Object {
  var onlySelf: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_OnlySelf {
  @scala.inline
  def apply(onlySelf: js.UndefOr[scala.Boolean] = js.undefined): Anon_OnlySelf = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onlySelf)) __obj.updateDynamic("onlySelf")(onlySelf)
    __obj.asInstanceOf[Anon_OnlySelf]
  }
}

