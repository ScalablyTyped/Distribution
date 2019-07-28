package typings.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ButtonType extends js.Object {
  var buttonType: String
  var prefixCls: String
  def onButtonClick(): Unit
}

object Anon_ButtonType {
  @scala.inline
  def apply(buttonType: String, onButtonClick: () => Unit, prefixCls: String): Anon_ButtonType = {
    val __obj = js.Dynamic.literal(buttonType = buttonType, onButtonClick = js.Any.fromFunction0(onButtonClick), prefixCls = prefixCls)
  
    __obj.asInstanceOf[Anon_ButtonType]
  }
}

