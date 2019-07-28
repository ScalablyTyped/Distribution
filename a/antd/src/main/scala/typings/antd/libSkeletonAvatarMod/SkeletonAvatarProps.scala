package typings.antd.libSkeletonAvatarMod

import typings.antd.antdStrings.circle
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.antd.antdStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkeletonAvatarProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var shape: js.UndefOr[circle | square] = js.undefined
  var size: js.UndefOr[large | small | typings.antd.antdStrings.default | Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object SkeletonAvatarProps {
  @scala.inline
  def apply(
    className: String = null,
    prefixCls: String = null,
    shape: circle | square = null,
    size: large | small | typings.antd.antdStrings.default | Double = null,
    style: js.Object = null
  ): SkeletonAvatarProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SkeletonAvatarProps]
  }
}

