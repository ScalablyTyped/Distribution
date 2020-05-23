package typings.antdMobile.anon

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon extends js.Object {
  var icon: Element
  var mode: String
  var prefixCls: String
  def onClick(): Unit
}

object Icon {
  @scala.inline
  def apply(icon: Element, mode: String, onClick: () => Unit, prefixCls: String): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
}

