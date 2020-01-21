package typings.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscribeOptions extends js.Object {
  var get_retained: js.UndefOr[Boolean] = js.undefined
  var `match`: js.UndefOr[String] = js.undefined
}

object ISubscribeOptions {
  @scala.inline
  def apply(get_retained: js.UndefOr[Boolean] = js.undefined, `match`: String = null): ISubscribeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(get_retained)) __obj.updateDynamic("get_retained")(get_retained.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscribeOptions]
  }
}

