package typings.atAntDashDesignProDashLayout

import typings.antd.esMenuMenuContextMod.MenuTheme
import typings.antd.esMenuMod.ClickParam
import typings.antd.esMenuMod.MenuMode
import typings.antd.esMenuMod.SelectParam
import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.sidemenu
import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.topmenu
import typings.atAntDashDesignProDashLayout.libDefaultSettingsMod.ContentWidth
import typings.atAntDashDesignProDashLayout.libSiderMenuBaseMenuMod.BaseMenu
import typings.atAntDashDesignProDashLayout.libSiderMenuBaseMenuMod.BaseMenuProps
import typings.atAntDashDesignProDashLayout.libTypingsMod.MenuDataItem
import typings.atAntDashDesignProDashLayout.libTypingsMod.MessageDescriptor
import typings.atAntDashDesignProDashLayout.libTypingsMod.Route
import typings.atAntDashDesignProDashLayout.libTypingsMod.WithFalse
import typings.history.historyMod.History
import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Component
import typings.react.reactMod.ReactNode
import typings.reactDashRouter.reactDashRouterMod.StaticContext
import typings.reactDashRouter.reactDashRouterMod.`match`
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/pro-layout/lib/SiderMenu/BaseMenu", JSImport.Namespace)
@js.native
object libSiderMenuBaseMenuMod extends js.Object {
  @js.native
  trait BaseMenu
    extends Component[BaseMenuProps, js.Object, js.Any] {
    var warp: js.UndefOr[HTMLDivElement] = js.native
    def conversionPath(path: String): String = js.native
    def getIntlName(item: MenuDataItem): js.UndefOr[String] = js.native
    /**
      * 判断是否是http链接.返回 Link 或 a
      * Judge whether it is http link.return a or Link
      * @memberof SiderMenu
      */
    def getMenuItemPath(item: MenuDataItem): js.UndefOr[js.Object | Null] = js.native
    /**
      * 获得菜单子节点
      */
    def getNavMenuItems(): js.Array[ReactNode] = js.native
    def getNavMenuItems(menusData: js.Array[MenuDataItem]): js.Array[ReactNode] = js.native
    def getPopupContainer(fixedHeader: Boolean, layout: String): HTMLElement = js.native
    def getRef(ref: HTMLDivElement): Unit = js.native
    def getSelectedMenuKeys(): js.Array[String] = js.native
    def getSelectedMenuKeys(pathname: String): js.Array[String] = js.native
    /**
      * get SubMenu or Item
      */
    def getSubMenuOrItem(item: MenuDataItem): ReactNode = js.native
  }
  
  /* Inlined parent std.Partial<@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.RouterTypes<@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.Route>> */
  /* Inlined parent std.Omit<antd.antd/es/menu.MenuProps, 'openKeys'> */
  /* Inlined parent std.Partial<@ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.Settings> */
  @js.native
  trait BaseMenuProps extends js.Object {
    var autoHideHeader: js.UndefOr[Boolean] = js.native
    var className: js.UndefOr[String] = js.native
    var collapsed: js.UndefOr[Boolean] = js.native
    var computedMatch: js.UndefOr[`match`[Route]] = js.native
    var contentWidth: js.UndefOr[ContentWidth] = js.native
    var defaultOpenKeys: js.UndefOr[js.Array[String]] = js.native
    var defaultSelectedKeys: js.UndefOr[js.Array[String]] = js.native
    var fixSiderbar: js.UndefOr[Boolean] = js.native
    var fixedHeader: js.UndefOr[Boolean] = js.native
    var flatMenuKeys: js.UndefOr[js.Array[String]] = js.native
    var focusable: js.UndefOr[Boolean] = js.native
    var forceSubMenuRender: js.UndefOr[Boolean] = js.native
    var formatMessage: js.UndefOr[js.Function1[/* message */ MessageDescriptor, String]] = js.native
    var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.native
    var handleOpenChange: js.UndefOr[js.Function1[/* openKeys */ js.Array[String], Unit]] = js.native
    var history: js.UndefOr[History[LocationState]] = js.native
    var iconfontUrl: js.UndefOr[String] = js.native
    var id: js.UndefOr[String] = js.native
    var inlineCollapsed: js.UndefOr[Boolean] = js.native
    var inlineIndent: js.UndefOr[Double] = js.native
    var isMobile: js.UndefOr[Boolean] = js.native
    var layout: js.UndefOr[sidemenu | topmenu] = js.native
    var location: js.UndefOr[Location[LocationState] | Anon_Pathname] = js.native
    var `match`: js.UndefOr[typings.reactDashRouter.reactDashRouterMod.`match`[js.Object]] = js.native
    var menu: js.UndefOr[Anon_Locale] = js.native
    var menuData: js.UndefOr[js.Array[MenuDataItem]] = js.native
    var menuItemRender: js.UndefOr[
        WithFalse[
          js.Function2[/* item */ MenuDataItemisUrlbooleanAuthority, /* defaultDom */ ReactNode, ReactNode]
        ]
      ] = js.native
    var mode: js.UndefOr[MenuMode] = js.native
    var multiple: js.UndefOr[Boolean] = js.native
    var navTheme: js.UndefOr[MenuTheme] = js.native
    var onClick: js.UndefOr[js.Function1[/* param */ ClickParam, Unit]] = js.native
    var onCollapse: js.UndefOr[js.Function1[/* collapsed */ Boolean, Unit]] = js.native
    var onDeselect: js.UndefOr[js.Function1[/* param */ SelectParam, Unit]] = js.native
    var onMouseEnter: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.native
    var onOpenChange: js.UndefOr[js.Function1[/* openKeys */ js.Array[String], Unit]] = js.native
    var onSelect: js.UndefOr[js.Function1[/* param */ SelectParam, Unit]] = js.native
    var openAnimation: js.UndefOr[String | js.Object] = js.native
    var openKeys: js.UndefOr[WithFalse[js.Array[String]]] = js.native
    var openTransitionName: js.UndefOr[String | js.Object] = js.native
    var overflowedIndicator: js.UndefOr[ReactNode] = js.native
    var prefixCls: js.UndefOr[String] = js.native
    var route: js.UndefOr[Route] = js.native
    var selectable: js.UndefOr[Boolean] = js.native
    var selectedKeys: js.UndefOr[js.Array[String]] = js.native
    var staticContext: js.UndefOr[StaticContext] = js.native
    var style: js.UndefOr[CSSProperties] = js.native
    var subMenuCloseDelay: js.UndefOr[Double] = js.native
    var subMenuOpenDelay: js.UndefOr[Double] = js.native
    var theme: js.UndefOr[MenuTheme] = js.native
    var title: js.UndefOr[String] = js.native
  }
  
  @js.native
  class default protected () extends BaseMenu {
    def this(props: BaseMenuProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: PartialBaseMenuPropsAutoHideHeader = js.native
    def getDerivedStateFromProps(props: BaseMenuProps): Null = js.native
  }
  
}

