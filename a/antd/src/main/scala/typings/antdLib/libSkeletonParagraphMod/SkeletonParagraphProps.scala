package typings
package antdLib.libSkeletonParagraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkeletonParagraphProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var width: js.UndefOr[widthUnit | js.Array[widthUnit]] = js.undefined
}

object SkeletonParagraphProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    prefixCls: java.lang.String = null,
    rows: scala.Int | scala.Double = null,
    style: js.Object = null,
    width: widthUnit | js.Array[widthUnit] = null
  ): SkeletonParagraphProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkeletonParagraphProps]
  }
}

