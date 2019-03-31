package typings
package antdDashMobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledOnClick extends js.Object {
  var disabled: scala.Boolean
  var prefixCls: java.lang.String
  def onClick(): scala.Unit
}

object Anon_DisabledOnClick {
  @scala.inline
  def apply(disabled: scala.Boolean, onClick: () => scala.Unit, prefixCls: java.lang.String): Anon_DisabledOnClick = {
    val __obj = js.Dynamic.literal(disabled = disabled, onClick = js.Any.fromFunction0(onClick), prefixCls = prefixCls)
  
    __obj.asInstanceOf[Anon_DisabledOnClick]
  }
}

