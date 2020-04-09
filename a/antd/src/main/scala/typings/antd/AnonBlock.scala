package typings.antd

import typings.antd.antdStrings.button
import typings.antd.antdStrings.reset
import typings.antd.antdStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlock extends js.Object {
  var block: Boolean
  var ghost: Boolean
  var htmlType: js.UndefOr[button | reset | submit] = js.undefined
  var loading: Boolean
}

object AnonBlock {
  @scala.inline
  def apply(block: Boolean, ghost: Boolean, loading: Boolean, htmlType: button | reset | submit = null): AnonBlock = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], ghost = ghost.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
    if (htmlType != null) __obj.updateDynamic("htmlType")(htmlType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlock]
  }
}

