package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  // the operation timeout
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(timeout: scala.Int | scala.Double = null): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

