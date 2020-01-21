package typings.apn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReason extends js.Object {
  var reason: String
  var timestamp: js.UndefOr[String] = js.undefined
}

object AnonReason {
  @scala.inline
  def apply(reason: String, timestamp: String = null): AnonReason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReason]
  }
}

