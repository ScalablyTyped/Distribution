package typings
package aliDashOssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeadersTimeout extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Anon_HeadersTimeout {
  @scala.inline
  def apply(headers: js.Object = null, timeout: scala.Int | scala.Double = null): Anon_HeadersTimeout = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeadersTimeout]
  }
}

