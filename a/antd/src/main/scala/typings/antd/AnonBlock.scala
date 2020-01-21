package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlock extends js.Object {
  var block: Boolean
  var ghost: Boolean
  var htmlType: String
  var loading: Boolean
}

object AnonBlock {
  @scala.inline
  def apply(block: Boolean, ghost: Boolean, htmlType: String, loading: Boolean): AnonBlock = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], ghost = ghost.asInstanceOf[js.Any], htmlType = htmlType.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBlock]
  }
}

