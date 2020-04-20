package typings.amplitudeJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReason extends js.Object {
  var reason: String
}

object AnonReason {
  @scala.inline
  def apply(reason: String): AnonReason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReason]
  }
}

