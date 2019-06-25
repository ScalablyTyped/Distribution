package typings
package antdLib.esTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends js.Object {
  var activeKey: js.UndefOr[java.lang.String] = js.undefined
  var animated: js.UndefOr[scala.Boolean | antdLib.Anon_InkBar] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultActiveKey: js.UndefOr[java.lang.String] = js.undefined
  var destroyInactiveTabPane: js.UndefOr[scala.Boolean] = js.undefined
  var hideAdd: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* activeKey */ java.lang.String, scala.Unit]] = js.undefined
  var onEdit: js.UndefOr[
    js.Function2[
      /* targetKey */ java.lang.String | (reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent]), 
      /* action */ antdLib.antdLibStrings.add | antdLib.antdLibStrings.remove, 
      scala.Unit
    ]
  ] = js.undefined
  var onNextClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var onPrevClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var onTabClick: js.UndefOr[js.Function] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var renderTabBar: js.UndefOr[
    js.Function2[
      /* props */ TabsProps, 
      /* DefaultTabBar */ reactLib.reactMod.ReactNode, 
      reactLib.reactMod.ReactElement
    ]
  ] = js.undefined
  var size: js.UndefOr[
    antdLib.antdLibStrings.large | antdLib.antdLibStrings.default | antdLib.antdLibStrings.small
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var tabBarExtraContent: js.UndefOr[reactLib.reactMod.ReactNode | scala.Null] = js.undefined
  var tabBarGutter: js.UndefOr[scala.Double] = js.undefined
  var tabBarStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var tabPosition: js.UndefOr[TabsPosition] = js.undefined
  var `type`: js.UndefOr[TabsType] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    activeKey: java.lang.String = null,
    animated: scala.Boolean | antdLib.Anon_InkBar = null,
    className: java.lang.String = null,
    defaultActiveKey: java.lang.String = null,
    destroyInactiveTabPane: js.UndefOr[scala.Boolean] = js.undefined,
    hideAdd: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: /* activeKey */ java.lang.String => scala.Unit = null,
    onEdit: (/* targetKey */ java.lang.String | (reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent]), /* action */ antdLib.antdLibStrings.add | antdLib.antdLibStrings.remove) => scala.Unit = null,
    onNextClick: reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement] = null,
    onPrevClick: reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement] = null,
    onTabClick: js.Function = null,
    prefixCls: java.lang.String = null,
    renderTabBar: (/* props */ TabsProps, /* DefaultTabBar */ reactLib.reactMod.ReactNode) => reactLib.reactMod.ReactElement = null,
    size: antdLib.antdLibStrings.large | antdLib.antdLibStrings.default | antdLib.antdLibStrings.small = null,
    style: reactLib.reactMod.CSSProperties = null,
    tabBarExtraContent: reactLib.reactMod.ReactNode = null,
    tabBarGutter: scala.Int | scala.Double = null,
    tabBarStyle: reactLib.reactMod.CSSProperties = null,
    tabPosition: TabsPosition = null,
    `type`: TabsType = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey)
    if (animated != null) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey)
    if (!js.isUndefined(destroyInactiveTabPane)) __obj.updateDynamic("destroyInactiveTabPane")(destroyInactiveTabPane)
    if (!js.isUndefined(hideAdd)) __obj.updateDynamic("hideAdd")(hideAdd)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onEdit != null) __obj.updateDynamic("onEdit")(js.Any.fromFunction2(onEdit))
    if (onNextClick != null) __obj.updateDynamic("onNextClick")(onNextClick)
    if (onPrevClick != null) __obj.updateDynamic("onPrevClick")(onPrevClick)
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(onTabClick)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(js.Any.fromFunction2(renderTabBar))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabBarExtraContent != null) __obj.updateDynamic("tabBarExtraContent")(tabBarExtraContent.asInstanceOf[js.Any])
    if (tabBarGutter != null) __obj.updateDynamic("tabBarGutter")(tabBarGutter.asInstanceOf[js.Any])
    if (tabBarStyle != null) __obj.updateDynamic("tabBarStyle")(tabBarStyle)
    if (tabPosition != null) __obj.updateDynamic("tabPosition")(tabPosition)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TabsProps]
  }
}

