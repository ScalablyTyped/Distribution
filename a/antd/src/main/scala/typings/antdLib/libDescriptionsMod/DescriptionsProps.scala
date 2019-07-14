package typings
package antdLib.libDescriptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptionsProps extends js.Object {
  var bordered: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var column: js.UndefOr[scala.Double | antdLib.PartialRecordBreakpointnumber] = js.undefined
  var layout: js.UndefOr[antdLib.antdLibStrings.horizontal | antdLib.antdLibStrings.vertical] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[
    antdLib.antdLibStrings.middle | antdLib.antdLibStrings.small | antdLib.antdLibStrings.default
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object DescriptionsProps {
  @scala.inline
  def apply(
    bordered: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    column: scala.Double | antdLib.PartialRecordBreakpointnumber = null,
    layout: antdLib.antdLibStrings.horizontal | antdLib.antdLibStrings.vertical = null,
    prefixCls: java.lang.String = null,
    size: antdLib.antdLibStrings.middle | antdLib.antdLibStrings.small | antdLib.antdLibStrings.default = null,
    style: reactLib.reactMod.CSSProperties = null,
    title: reactLib.reactMod.ReactNode = null
  ): DescriptionsProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionsProps]
  }
}

