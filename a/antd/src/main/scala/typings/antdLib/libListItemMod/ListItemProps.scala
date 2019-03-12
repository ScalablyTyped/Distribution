package typings
package antdLib.libListItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLDivElement] {
  var actions: js.UndefOr[js.Array[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var extra: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var grid: js.UndefOr[antdLib.libListMod.ListGridType] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
}

object ListItemProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLDivElement] = null,
    actions: js.Array[reactLib.reactMod.ReactNs.ReactNode] = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    extra: reactLib.reactMod.ReactNs.ReactNode = null,
    grid: antdLib.libListMod.ListGridType = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
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

