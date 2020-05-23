package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonType extends js.Object {
  var buttonType: String
  var prefixCls: String
  def onButtonClick(): Unit
}

object ButtonType {
  @scala.inline
  def apply(buttonType: String, onButtonClick: () => Unit, prefixCls: String): ButtonType = {
    val __obj = js.Dynamic.literal(buttonType = buttonType.asInstanceOf[js.Any], onButtonClick = js.Any.fromFunction0(onButtonClick), prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonType]
  }
}

