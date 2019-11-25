package typings.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AfterClose extends js.Object {
  var closable: Boolean
  var disabled: Boolean
  var prefixCls: String
  var selected: Boolean
  var small: Boolean
  def afterClose(): Unit
  def onChange(): Unit
  def onClose(): Unit
}

object Anon_AfterClose {
  @scala.inline
  def apply(
    afterClose: () => Unit,
    closable: Boolean,
    disabled: Boolean,
    onChange: () => Unit,
    onClose: () => Unit,
    prefixCls: String,
    selected: Boolean,
    small: Boolean
  ): Anon_AfterClose = {
    val __obj = js.Dynamic.literal(afterClose = js.Any.fromFunction0(afterClose), closable = closable.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onClose = js.Any.fromFunction0(onClose), prefixCls = prefixCls.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AfterClose]
  }
}

