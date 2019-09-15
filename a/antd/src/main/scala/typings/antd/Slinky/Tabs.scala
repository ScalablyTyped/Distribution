package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typings.antd.Anon_InkBar
import typings.antd.antdStrings.add
import typings.antd.antdStrings.large
import typings.antd.antdStrings.remove
import typings.antd.antdStrings.small
import typings.antd.esTabsMod.TabsPosition
import typings.antd.esTabsMod.TabsProps
import typings.antd.esTabsMod.TabsType
import typings.antd.esTabsMod.default
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object Tabs
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esTabsMod.default].asInstanceOf[String | js.Object]
  def apply(
    activeKey: String = null,
    animated: Boolean | Anon_InkBar = null,
    defaultActiveKey: String = null,
    destroyInactiveTabPane: js.UndefOr[Boolean] = js.undefined,
    hideAdd: js.UndefOr[Boolean] = js.undefined,
    onChange: /* activeKey */ String => Unit = null,
    onEdit: (/* targetKey */ String | (MouseEvent[HTMLElement, NativeMouseEvent]), /* action */ add | remove) => Unit = null,
    onNextClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onPrevClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onTabClick: js.Function = null,
    prefixCls: String = null,
    renderTabBar: (/* props */ TabsProps, /* DefaultTabBar */ ReactComponentClass[_]) => ReactElement = null,
    size: large | typings.antd.antdStrings.default | small = null,
    tabBarExtraContent: TagMod[Any] = null,
    tabBarGutter: Int | Double = null,
    tabBarStyle: CSSProperties = null,
    tabPosition: TabsPosition = null,
    `type`: TabsType = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey)
    if (animated != null) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey)
    if (!js.isUndefined(destroyInactiveTabPane)) __obj.updateDynamic("destroyInactiveTabPane")(destroyInactiveTabPane)
    if (!js.isUndefined(hideAdd)) __obj.updateDynamic("hideAdd")(hideAdd)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onEdit != null) __obj.updateDynamic("onEdit")(js.Any.fromFunction2(onEdit))
    if (onNextClick != null) __obj.updateDynamic("onNextClick")(js.Any.fromFunction1(onNextClick))
    if (onPrevClick != null) __obj.updateDynamic("onPrevClick")(js.Any.fromFunction1(onPrevClick))
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(onTabClick)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(js.Any.fromFunction2(renderTabBar))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tabBarExtraContent != null) __obj.updateDynamic("tabBarExtraContent")(tabBarExtraContent)
    if (tabBarGutter != null) __obj.updateDynamic("tabBarGutter")(tabBarGutter.asInstanceOf[js.Any])
    if (tabBarStyle != null) __obj.updateDynamic("tabBarStyle")(tabBarStyle)
    if (tabPosition != null) __obj.updateDynamic("tabPosition")(tabPosition)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TabsProps
}

