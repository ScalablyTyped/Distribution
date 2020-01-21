package typings.antdMobile

import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIcon extends js.Object {
  var icon: Element
  var mode: String
  var prefixCls: String
  def onClick(): Unit
}

object AnonIcon {
  @scala.inline
  def apply(icon: Element, mode: String, onClick: () => Unit, prefixCls: String): AnonIcon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), prefixCls = prefixCls.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIcon]
  }
}

