package typings.angularForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnlySelf extends js.Object {
  var onlySelf: js.UndefOr[Boolean] = js.undefined
}

object AnonOnlySelf {
  @scala.inline
  def apply(onlySelf: js.UndefOr[Boolean] = js.undefined): AnonOnlySelf = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onlySelf)) __obj.updateDynamic("onlySelf")(onlySelf.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnlySelf]
  }
}

