package typings
package antdDashMobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckedDisabled extends js.Object {
  var checked: scala.Boolean
  var disabled: scala.Boolean
  var name: java.lang.String
  var platform: java.lang.String
  var prefixCls: java.lang.String
  def onChange(): scala.Unit
  def onClick(): scala.Unit
}

object Anon_CheckedDisabled {
  @scala.inline
  def apply(
    checked: scala.Boolean,
    disabled: scala.Boolean,
    name: java.lang.String,
    onChange: () => scala.Unit,
    onClick: () => scala.Unit,
    platform: java.lang.String,
    prefixCls: java.lang.String
  ): Anon_CheckedDisabled = {
    val __obj = js.Dynamic.literal(checked = checked, disabled = disabled, name = name, onChange = js.Any.fromFunction0(onChange), onClick = js.Any.fromFunction0(onClick), platform = platform, prefixCls = prefixCls)
  
    __obj.asInstanceOf[Anon_CheckedDisabled]
  }
}

