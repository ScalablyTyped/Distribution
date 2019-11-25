package typings.atAngularForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnlySelf extends js.Object {
  var onlySelf: js.UndefOr[Boolean] = js.undefined
}

object Anon_OnlySelf {
  @scala.inline
  def apply(onlySelf: js.UndefOr[Boolean] = js.undefined): Anon_OnlySelf = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onlySelf)) __obj.updateDynamic("onlySelf")(onlySelf.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OnlySelf]
  }
}

