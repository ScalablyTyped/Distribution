package typings
package antdLib.esTagCheckableTagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckableTagProps extends js.Object {
  var checked: scala.Boolean
  var className: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* checked */ scala.Boolean, scala.Unit]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
}

object CheckableTagProps {
  @scala.inline
  def apply(
    checked: scala.Boolean,
    className: java.lang.String = null,
    onChange: /* checked */ scala.Boolean => scala.Unit = null,
    prefixCls: java.lang.String = null
  ): CheckableTagProps = {
    val __obj = js.Dynamic.literal(checked = checked)
    if (className != null) __obj.updateDynamic("className")(className)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.asInstanceOf[CheckableTagProps]
  }
}

