package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnClick extends js.Object {
  var disabled: Boolean
  var prefixCls: String
  def onClick(): Unit
}

object AnonOnClick {
  @scala.inline
  def apply(disabled: Boolean, onClick: () => Unit, prefixCls: String): AnonOnClick = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), prefixCls = prefixCls.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOnClick]
  }
}

