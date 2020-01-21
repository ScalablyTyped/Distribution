package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButtonType extends js.Object {
  var buttonType: String
  var prefixCls: String
  def onButtonClick(): Unit
}

object AnonButtonType {
  @scala.inline
  def apply(buttonType: String, onButtonClick: () => Unit, prefixCls: String): AnonButtonType = {
    val __obj = js.Dynamic.literal(buttonType = buttonType.asInstanceOf[js.Any], onButtonClick = js.Any.fromFunction0(onButtonClick), prefixCls = prefixCls.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonButtonType]
  }
}

