package typings.angularCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Read extends js.Object {
  var read: js.UndefOr[js.Any] = js.undefined
  var static: js.UndefOr[Boolean] = js.undefined
}

object Read {
  @scala.inline
  def apply(read: js.Any = null, static: js.UndefOr[Boolean] = js.undefined): Read = {
    val __obj = js.Dynamic.literal()
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Read]
  }
}

