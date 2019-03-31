package typings
package antdDashMobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AfterClose extends js.Object {
  var closable: scala.Boolean
  var disabled: scala.Boolean
  var prefixCls: java.lang.String
  var selected: scala.Boolean
  var small: scala.Boolean
  def afterClose(): scala.Unit
  def onChange(): scala.Unit
  def onClose(): scala.Unit
}

object Anon_AfterClose {
  @scala.inline
  def apply(
    afterClose: () => scala.Unit,
    closable: scala.Boolean,
    disabled: scala.Boolean,
    onChange: () => scala.Unit,
    onClose: () => scala.Unit,
    prefixCls: java.lang.String,
    selected: scala.Boolean,
    small: scala.Boolean
  ): Anon_AfterClose = {
    val __obj = js.Dynamic.literal(afterClose = js.Any.fromFunction0(afterClose), closable = closable, disabled = disabled, onChange = js.Any.fromFunction0(onChange), onClose = js.Any.fromFunction0(onClose), prefixCls = prefixCls, selected = selected, small = small)
  
    __obj.asInstanceOf[Anon_AfterClose]
  }
}

