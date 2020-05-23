package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var checked: Boolean
  var disabled: Boolean
  var name: String
  var platform: String
  var prefixCls: String
  def onChange(): Unit
  def onClick(): Unit
}

object Name {
  @scala.inline
  def apply(
    checked: Boolean,
    disabled: Boolean,
    name: String,
    onChange: () => Unit,
    onClick: () => Unit,
    platform: String,
    prefixCls: String
  ): Name = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onClick = js.Any.fromFunction0(onClick), platform = platform.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

