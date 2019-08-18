package typings.antd.esTagCheckableTagMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckableTagProps extends js.Object {
  var checked: Boolean
  var className: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object CheckableTagProps {
  @scala.inline
  def apply(
    checked: Boolean,
    className: String = null,
    onChange: /* checked */ Boolean => Unit = null,
    prefixCls: String = null,
    style: CSSProperties = null
  ): CheckableTagProps = {
    val __obj = js.Dynamic.literal(checked = checked)
    if (className != null) __obj.updateDynamic("className")(className)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[CheckableTagProps]
  }
}

