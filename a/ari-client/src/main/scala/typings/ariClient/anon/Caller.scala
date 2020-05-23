package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Caller extends js.Object {
  var caller: js.UndefOr[String] = js.undefined
  var channelId: String
  var timeout: js.UndefOr[Double] = js.undefined
}

object Caller {
  @scala.inline
  def apply(channelId: String, caller: String = null, timeout: js.UndefOr[Double] = js.undefined): Caller = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any])
    if (caller != null) __obj.updateDynamic("caller")(caller.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Caller]
  }
}

