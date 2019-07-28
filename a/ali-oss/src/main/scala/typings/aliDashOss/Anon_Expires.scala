package typings.aliDashOss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expires extends js.Object {
  var expires: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[String] = js.undefined
}

object Anon_Expires {
  @scala.inline
  def apply(expires: String = null, timeout: String = null): Anon_Expires = {
    val __obj = js.Dynamic.literal()
    if (expires != null) __obj.updateDynamic("expires")(expires)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[Anon_Expires]
  }
}

