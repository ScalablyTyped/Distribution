package typings.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckedDisabled extends js.Object {
  var checked: Boolean
  var disabled: Boolean
  var name: String
  var platform: String
  var prefixCls: String
  def onChange(): Unit
  def onClick(): Unit
}

object Anon_CheckedDisabled {
  @scala.inline
  def apply(
    checked: Boolean,
    disabled: Boolean,
    name: String,
    onChange: () => Unit,
    onClick: () => Unit,
    platform: String,
    prefixCls: String
  ): Anon_CheckedDisabled = {
    val __obj = js.Dynamic.literal(checked = checked, disabled = disabled, name = name, onChange = js.Any.fromFunction0(onChange), onClick = js.Any.fromFunction0(onClick), platform = platform, prefixCls = prefixCls)
  
    __obj.asInstanceOf[Anon_CheckedDisabled]
  }
}

