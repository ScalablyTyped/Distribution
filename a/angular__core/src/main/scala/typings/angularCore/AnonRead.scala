package typings.angularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRead extends js.Object {
  var read: js.UndefOr[js.Any] = js.undefined
  var static: Boolean
}

object AnonRead {
  @scala.inline
  def apply(static: Boolean, read: js.Any = null): AnonRead = {
    val __obj = js.Dynamic.literal(static = static.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRead]
  }
}

