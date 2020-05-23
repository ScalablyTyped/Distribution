package typings.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICallOptions extends js.Object {
  var disclose_me: js.UndefOr[Boolean] = js.undefined
  var receive_progress: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object ICallOptions {
  @scala.inline
  def apply(
    disclose_me: js.UndefOr[Boolean] = js.undefined,
    receive_progress: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): ICallOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disclose_me)) __obj.updateDynamic("disclose_me")(disclose_me.get.asInstanceOf[js.Any])
    if (!js.isUndefined(receive_progress)) __obj.updateDynamic("receive_progress")(receive_progress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICallOptions]
  }
}

