package typings.antd.spaceMod

import typings.antd.antdStrings.baseline
import typings.antd.antdStrings.center
import typings.antd.antdStrings.end
import typings.antd.antdStrings.horizontal
import typings.antd.antdStrings.start
import typings.antd.antdStrings.vertical
import typings.antd.sizeContextMod.SizeType
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpaceProps extends js.Object {
  var align: js.UndefOr[start | end | center | baseline] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[SizeType | Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SpaceProps {
  @scala.inline
  def apply(
    align: start | end | center | baseline = null,
    className: String = null,
    direction: horizontal | vertical = null,
    prefixCls: String = null,
    size: SizeType | Double = null,
    style: CSSProperties = null
  ): SpaceProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpaceProps]
  }
}

