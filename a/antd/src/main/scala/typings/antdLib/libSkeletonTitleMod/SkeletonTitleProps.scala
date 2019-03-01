package typings
package antdLib.libSkeletonTitleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkeletonTitleProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object SkeletonTitleProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    prefixCls: java.lang.String = null,
    style: js.Object = null,
    width: scala.Double | java.lang.String = null
  ): SkeletonTitleProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkeletonTitleProps]
  }
}

