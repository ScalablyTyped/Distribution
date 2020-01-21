package typings.aliOss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpires extends js.Object {
  var expires: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[String] = js.undefined
}

object AnonExpires {
  @scala.inline
  def apply(expires: String = null, timeout: String = null): AnonExpires = {
    val __obj = js.Dynamic.literal()
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpires]
  }
}

