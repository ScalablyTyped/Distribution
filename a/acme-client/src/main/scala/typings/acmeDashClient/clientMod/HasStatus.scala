package typings.acmeDashClient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasStatus extends js.Object {
  var status: js.UndefOr[String] = js.undefined
}

object HasStatus {
  @scala.inline
  def apply(status: String = null): HasStatus = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasStatus]
  }
}

