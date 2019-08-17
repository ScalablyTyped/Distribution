package typings.amapDashJsDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Timeout extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
}

object Anon_Timeout {
  @scala.inline
  def apply(timeout: Int | Double = null): Anon_Timeout = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Timeout]
  }
}

