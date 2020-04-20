package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPending extends js.Object {
  var pending: Boolean
}

object AnonPending {
  @scala.inline
  def apply(pending: Boolean): AnonPending = {
    val __obj = js.Dynamic.literal(pending = pending.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPending]
  }
}

