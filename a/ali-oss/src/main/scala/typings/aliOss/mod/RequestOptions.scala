package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  // the operation timeout
  var timeout: js.UndefOr[Double] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(timeout: js.UndefOr[Double] = js.undefined): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

