package typings.antd.skeletonInputMod

import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<antd.antd/lib/skeleton/Element.SkeletonElementProps, 'size' | 'shape'> */
trait SkeletonInputProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[large | small | typings.antd.antdStrings.default] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object SkeletonInputProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    prefixCls: String = null,
    size: large | small | typings.antd.antdStrings.default = null,
    style: js.Object = null
  ): SkeletonInputProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkeletonInputProps]
  }
}

