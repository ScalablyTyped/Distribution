package typings.amapJsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timeout extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
}

object Timeout {
  @scala.inline
  def apply(timeout: js.UndefOr[Double] = js.undefined): Timeout = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeout]
  }
}

