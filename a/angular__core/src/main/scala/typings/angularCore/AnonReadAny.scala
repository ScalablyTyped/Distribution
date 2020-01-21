package typings.angularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReadAny extends js.Object {
  var read: js.UndefOr[js.Any] = js.undefined
}

object AnonReadAny {
  @scala.inline
  def apply(read: js.Any = null): AnonReadAny = {
    val __obj = js.Dynamic.literal()
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReadAny]
  }
}

