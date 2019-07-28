package typings.antd.libSkeletonTitleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkeletonTitleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object SkeletonTitleProps {
  @scala.inline
  def apply(
    className: String = null,
    prefixCls: String = null,
    style: js.Object = null,
    width: Double | String = null
  ): SkeletonTitleProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkeletonTitleProps]
  }
}

