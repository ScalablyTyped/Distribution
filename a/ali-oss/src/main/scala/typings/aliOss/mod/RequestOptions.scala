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
  def apply(timeout: Int | Double = null): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

