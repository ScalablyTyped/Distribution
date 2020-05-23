package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timeout extends js.Object {
  var caller: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Timeout {
  @scala.inline
  def apply(caller: String = null, timeout: js.UndefOr[Double] = js.undefined): Timeout = {
    val __obj = js.Dynamic.literal()
    if (caller != null) __obj.updateDynamic("caller")(caller.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeout]
  }
}

