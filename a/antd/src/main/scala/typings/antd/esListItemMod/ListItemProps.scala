package typings.antd.esListItemMod

import typings.antd.esListMod.ListGridType
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemProps extends HTMLAttributes[HTMLDivElement] {
  var actions: js.UndefOr[js.Array[ReactNode]] = js.undefined
  var extra: js.UndefOr[ReactNode] = js.undefined
  var grid: js.UndefOr[ListGridType] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
}

object ListItemProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    actions: js.Array[ReactNode] = null,
    children: ReactNode = null,
    className: String = null,
    extra: ReactNode = null,
    grid: ListGridType = null,
    prefixCls: String = null,
    style: CSSProperties = null
  ): ListItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ListItemProps]
  }
}

