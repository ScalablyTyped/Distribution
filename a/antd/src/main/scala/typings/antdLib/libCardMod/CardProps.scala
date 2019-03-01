package typings
package antdLib.libCardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<react.HTMLDivElement>, 'title'> ]: react.react.HTMLAttributes<react.HTMLDivElement>[P]} */ trait CardProps extends js.Object {
  var actions: js.UndefOr[js.Array[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var activeTabKey: js.UndefOr[java.lang.String] = js.undefined
  var bodyStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var bordered: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cover: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var defaultActiveTabKey: js.UndefOr[java.lang.String] = js.undefined
  var extra: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var headStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var hoverable: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  var noHovering: js.UndefOr[scala.Boolean] = js.undefined
  var onTabChange: js.UndefOr[js.Function1[/* key */ java.lang.String, scala.Unit]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[CardSize] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var tabList: js.UndefOr[js.Array[CardTabListType]] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var `type`: js.UndefOr[CardType] = js.undefined
}

object CardProps {
  @scala.inline
  def apply(
    actions: js.Array[reactLib.reactMod.ReactNs.ReactNode] = null,
    activeTabKey: java.lang.String = null,
    bodyStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    bordered: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    cover: reactLib.reactMod.ReactNs.ReactNode = null,
    defaultActiveTabKey: java.lang.String = null,
    extra: reactLib.reactMod.ReactNs.ReactNode = null,
    headStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    hoverable: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    noHovering: js.UndefOr[scala.Boolean] = js.undefined,
    onTabChange: js.Function1[/* key */ java.lang.String, scala.Unit] = null,
    prefixCls: java.lang.String = null,
    size: CardSize = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tabList: js.Array[CardTabListType] = null,
    title: reactLib.reactMod.ReactNs.ReactNode = null,
    `type`: CardType = null
  ): CardProps = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (activeTabKey != null) __obj.updateDynamic("activeTabKey")(activeTabKey)
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle)
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (cover != null) __obj.updateDynamic("cover")(cover.asInstanceOf[js.Any])
    if (defaultActiveTabKey != null) __obj.updateDynamic("defaultActiveTabKey")(defaultActiveTabKey)
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (headStyle != null) __obj.updateDynamic("headStyle")(headStyle)
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (!js.isUndefined(noHovering)) __obj.updateDynamic("noHovering")(noHovering)
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(onTabChange)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabList != null) __obj.updateDynamic("tabList")(tabList)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CardProps]
  }
}

