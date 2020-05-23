package typings.angularCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadAny extends js.Object {
  var read: js.UndefOr[js.Any] = js.undefined
}

object ReadAny {
  @scala.inline
  def apply(read: js.Any = null): ReadAny = {
    val __obj = js.Dynamic.literal()
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadAny]
  }
}

