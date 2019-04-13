package typings
package antdLib.libListItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] {
  var actions: js.UndefOr[js.Array[reactLib.reactMod.ReactNode]] = js.undefined
  var extra: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var grid: js.UndefOr[antdLib.libListMod.ListGridType] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
}

object ListItemProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] = null,
    actions: js.Array[reactLib.reactMod.ReactNode] = null,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    extra: reactLib.reactMod.ReactNode = null,
    grid: antdLib.libListMod.ListGridType = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null
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

