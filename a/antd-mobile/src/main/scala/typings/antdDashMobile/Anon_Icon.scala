package typings.antdDashMobile

import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Icon extends js.Object {
  var icon: Element
  var mode: String
  var prefixCls: String
  def onClick(): Unit
}

object Anon_Icon {
  @scala.inline
  def apply(icon: Element, mode: String, onClick: () => Unit, prefixCls: String): Anon_Icon = {
    val __obj = js.Dynamic.literal(icon = icon, mode = mode, onClick = js.Any.fromFunction0(onClick), prefixCls = prefixCls)
  
    __obj.asInstanceOf[Anon_Icon]
  }
}

