package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabledOnClick extends js.Object {
  var disabled: Boolean
  var prefixCls: String
  def onClick(): Unit
}

object AnonDisabledOnClick {
  @scala.inline
  def apply(disabled: Boolean, onClick: () => Unit, prefixCls: String): AnonDisabledOnClick = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), prefixCls = prefixCls.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDisabledOnClick]
  }
}

