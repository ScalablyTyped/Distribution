package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAction extends js.Object {
  var action: String
  var inputPrefixCls: String
  var prefixCls: String
  var visibilityToggle: Boolean
}

object AnonAction {
  @scala.inline
  def apply(action: String, inputPrefixCls: String, prefixCls: String, visibilityToggle: Boolean): AnonAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], inputPrefixCls = inputPrefixCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], visibilityToggle = visibilityToggle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAction]
  }
}

