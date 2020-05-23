package typings.angularForms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnlySelf extends js.Object {
  var onlySelf: js.UndefOr[Boolean] = js.undefined
}

object OnlySelf {
  @scala.inline
  def apply(onlySelf: js.UndefOr[Boolean] = js.undefined): OnlySelf = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onlySelf)) __obj.updateDynamic("onlySelf")(onlySelf.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnlySelf]
  }
}

