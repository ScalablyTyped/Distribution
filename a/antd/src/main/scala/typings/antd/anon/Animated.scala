package typings.antd.anon

import typings.antd.antdStrings.`editable-card`
import typings.antd.antdStrings.card
import typings.antd.antdStrings.line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animated extends js.Object {
  var animated: Boolean
  var `type`: js.UndefOr[line | card | `editable-card`] = js.undefined
}

object Animated {
  @scala.inline
  def apply(animated: Boolean, `type`: line | card | `editable-card` = null): Animated = {
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animated]
  }
}

