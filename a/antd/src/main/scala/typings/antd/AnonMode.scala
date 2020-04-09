package typings.antd

import typings.antd.antdStrings.alternate
import typings.antd.antdStrings.left
import typings.antd.antdStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMode extends js.Object {
  var mode: js.UndefOr[alternate | left | right] = js.undefined
  var reverse: Boolean
}

object AnonMode {
  @scala.inline
  def apply(reverse: Boolean, mode: alternate | left | right = null): AnonMode = {
    val __obj = js.Dynamic.literal(reverse = reverse.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMode]
  }
}

