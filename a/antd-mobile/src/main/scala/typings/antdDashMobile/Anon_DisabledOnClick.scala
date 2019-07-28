package typings.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledOnClick extends js.Object {
  var disabled: Boolean
  var prefixCls: String
  def onClick(): Unit
}

object Anon_DisabledOnClick {
  @scala.inline
  def apply(disabled: Boolean, onClick: () => Unit, prefixCls: String): Anon_DisabledOnClick = {
    val __obj = js.Dynamic.literal(disabled = disabled, onClick = js.Any.fromFunction0(onClick), prefixCls = prefixCls)
  
    __obj.asInstanceOf[Anon_DisabledOnClick]
  }
}

