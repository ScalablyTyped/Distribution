package typings.antd.skeletonButtonMod

import typings.antd.antdStrings.circle
import typings.antd.antdStrings.large
import typings.antd.antdStrings.round
import typings.antd.antdStrings.small
import typings.antd.antdStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<antd.antd/lib/skeleton/Element.SkeletonElementProps, 'size'> */
trait SkeletonButtonProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var shape: js.UndefOr[circle | square | round] = js.undefined
  var size: js.UndefOr[large | small | typings.antd.antdStrings.default] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object SkeletonButtonProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    prefixCls: String = null,
    shape: circle | square | round = null,
    size: large | small | typings.antd.antdStrings.default = null,
    style: js.Object = null
  ): SkeletonButtonProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkeletonButtonProps]
  }
}

