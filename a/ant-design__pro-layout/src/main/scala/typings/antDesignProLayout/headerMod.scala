package typings.antDesignProLayout

import typings.antDesignProLayout.anon.DefaultOpenAll
import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.antDesignProLayout.antDesignProLayoutStrings.mix
import typings.antDesignProLayout.antDesignProLayoutStrings.realDark
import typings.antDesignProLayout.antDesignProLayoutStrings.side
import typings.antDesignProLayout.antDesignProLayoutStrings.top
import typings.antDesignProLayout.defaultSettingsMod.ContentWidth
import typings.antDesignProLayout.siderMenuSiderMenuMod.PrivateSiderMenuProps
import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.antDesignProLayout.typingsMod.WithFalse
import typings.antd.menuContextMod.MenuTheme
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerMod {
  
  @JSImport("@ant-design/pro-layout/lib/Header", JSImport.Default)
  @js.native
  class default () extends HeaderView
  
  @js.native
  trait HeaderView
    extends Component[HeaderViewProps with PrivateSiderMenuProps, HeaderViewState, js.Any] {
    
    def renderContent(): js.UndefOr[js.Object | Null] = js.native
  }
  
  /* Inlined @ant-design/pro-layout.@ant-design/pro-layout/lib/GlobalHeader.GlobalHeaderProps & {  isMobile :boolean | undefined,   collapsed :boolean | undefined,   logo :react.react.ReactNode | undefined,   headerRender :@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.WithFalse<(props : @ant-design/pro-layout.@ant-design/pro-layout/lib/Header.HeaderViewProps, defaultDom : react.react.ReactNode): react.react.ReactNode> | undefined,   headerTitleRender :@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.WithFalse<(props : @ant-design/pro-layout.@ant-design/pro-layout/lib/Header.HeaderViewProps, defaultDom : react.react.ReactNode): react.react.ReactNode> | undefined,   headerContentRender :@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.WithFalse<(props : @ant-design/pro-layout.@ant-design/pro-layout/lib/Header.HeaderViewProps): react.react.ReactNode> | undefined,   siderWidth :number | undefined,   hasSiderMenu :boolean | undefined} */
  @js.native
  trait HeaderViewProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var collapsed: js.UndefOr[Boolean] = js.native
    
    var collapsedButtonRender: js.UndefOr[WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], ReactNode]]] = js.native
    
    var colorWeak: js.UndefOr[Boolean] = js.native
    
    var contentWidth: js.UndefOr[ContentWidth] = js.native
    
    var fixSiderbar: js.UndefOr[Boolean] = js.native
    
    var fixedHeader: js.UndefOr[Boolean] = js.native
    
    var hasSiderMenu: js.UndefOr[Boolean] = js.native
    
    var headerContentRender: js.UndefOr[WithFalse[js.Function1[/* props */ this.type, ReactNode]]] = js.native
    
    var headerHeight: js.UndefOr[Double] = js.native
    
    var headerRender: js.UndefOr[
        WithFalse[js.Function2[/* props */ this.type, /* defaultDom */ ReactNode, ReactNode]]
      ] = js.native
    
    var headerTheme: js.UndefOr[MenuTheme] = js.native
    
    var headerTitleRender: js.UndefOr[
        WithFalse[js.Function2[/* props */ this.type, /* defaultDom */ ReactNode, ReactNode]]
      ] = js.native
    
    var iconfontUrl: js.UndefOr[String] = js.native
    
    var isMobile: js.UndefOr[Boolean] = js.native
    
    var layout: js.UndefOr[side | top | mix] = js.native
    
    var logo: js.UndefOr[ReactNode] = js.native
    
    var menu: js.UndefOr[DefaultOpenAll] = js.native
    
    var menuData: js.UndefOr[js.Array[MenuDataItem]] = js.native
    
    var menuHeaderRender: js.UndefOr[
        WithFalse[
          js.Function3[
            /* logo */ ReactNode, 
            /* title */ ReactNode, 
            /* props */ js.UndefOr[this.type], 
            ReactNode
          ]
        ]
      ] = js.native
    
    var menuRender: js.UndefOr[
        WithFalse[js.Function2[/* props */ this.type, /* defaultDom */ ReactNode, ReactNode]]
      ] = js.native
    
    var navTheme: js.UndefOr[MenuTheme | realDark] = js.native
    
    var onCollapse: js.UndefOr[js.Function1[/* collapsed */ Boolean, Unit]] = js.native
    
    var onMenuHeaderClick: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var primaryColor: js.UndefOr[String] = js.native
    
    var rightContentRender: js.UndefOr[WithFalse[js.Function1[/* props */ this.type, ReactNode]]] = js.native
    
    var siderWidth: js.UndefOr[Double] = js.native
    
    var splitMenus: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var title: js.UndefOr[String | `false`] = js.native
  }
  object HeaderViewProps {
    
    @scala.inline
    def apply(): HeaderViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderViewProps]
    }
    
    @scala.inline
    implicit class HeaderViewPropsMutableBuilder[Self <: HeaderViewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedButtonRender(value: WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], ReactNode]]): Self = StObject.set(x, "collapsedButtonRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedButtonRenderFunction1(value: /* collapsed */ js.UndefOr[Boolean] => ReactNode): Self = StObject.set(x, "collapsedButtonRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCollapsedButtonRenderUndefined: Self = StObject.set(x, "collapsedButtonRender", js.undefined)
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setColorWeak(value: Boolean): Self = StObject.set(x, "colorWeak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorWeakUndefined: Self = StObject.set(x, "colorWeak", js.undefined)
      
      @scala.inline
      def setContentWidth(value: ContentWidth): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentWidthUndefined: Self = StObject.set(x, "contentWidth", js.undefined)
      
      @scala.inline
      def setFixSiderbar(value: Boolean): Self = StObject.set(x, "fixSiderbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixSiderbarUndefined: Self = StObject.set(x, "fixSiderbar", js.undefined)
      
      @scala.inline
      def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      @scala.inline
      def setHasSiderMenu(value: Boolean): Self = StObject.set(x, "hasSiderMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasSiderMenuUndefined: Self = StObject.set(x, "hasSiderMenu", js.undefined)
      
      @scala.inline
      def setHeaderContentRender(value: WithFalse[js.Function1[HeaderViewProps, ReactNode]]): Self = StObject.set(x, "headerContentRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderContentRenderFunction1(value: HeaderViewProps => ReactNode): Self = StObject.set(x, "headerContentRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderContentRenderUndefined: Self = StObject.set(x, "headerContentRender", js.undefined)
      
      @scala.inline
      def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderHeightUndefined: Self = StObject.set(x, "headerHeight", js.undefined)
      
      @scala.inline
      def setHeaderRender(value: WithFalse[js.Function2[HeaderViewProps, /* defaultDom */ ReactNode, ReactNode]]): Self = StObject.set(x, "headerRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderRenderFunction2(value: (HeaderViewProps, /* defaultDom */ ReactNode) => ReactNode): Self = StObject.set(x, "headerRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHeaderRenderUndefined: Self = StObject.set(x, "headerRender", js.undefined)
      
      @scala.inline
      def setHeaderTheme(value: MenuTheme): Self = StObject.set(x, "headerTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderThemeUndefined: Self = StObject.set(x, "headerTheme", js.undefined)
      
      @scala.inline
      def setHeaderTitleRender(value: WithFalse[js.Function2[HeaderViewProps, /* defaultDom */ ReactNode, ReactNode]]): Self = StObject.set(x, "headerTitleRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTitleRenderFunction2(value: (HeaderViewProps, /* defaultDom */ ReactNode) => ReactNode): Self = StObject.set(x, "headerTitleRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHeaderTitleRenderUndefined: Self = StObject.set(x, "headerTitleRender", js.undefined)
      
      @scala.inline
      def setIconfontUrl(value: String): Self = StObject.set(x, "iconfontUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconfontUrlUndefined: Self = StObject.set(x, "iconfontUrl", js.undefined)
      
      @scala.inline
      def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMobileUndefined: Self = StObject.set(x, "isMobile", js.undefined)
      
      @scala.inline
      def setLayout(value: side | top | mix): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setLogo(value: ReactNode): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      @scala.inline
      def setMenu(value: DefaultOpenAll): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuData(value: js.Array[MenuDataItem]): Self = StObject.set(x, "menuData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuDataUndefined: Self = StObject.set(x, "menuData", js.undefined)
      
      @scala.inline
      def setMenuDataVarargs(value: MenuDataItem*): Self = StObject.set(x, "menuData", js.Array(value :_*))
      
      @scala.inline
      def setMenuHeaderRender(
        value: WithFalse[
              js.Function3[
                /* logo */ ReactNode, 
                /* title */ ReactNode, 
                /* props */ js.UndefOr[HeaderViewProps], 
                ReactNode
              ]
            ]
      ): Self = StObject.set(x, "menuHeaderRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuHeaderRenderFunction3(
        value: (/* logo */ ReactNode, /* title */ ReactNode, /* props */ js.UndefOr[HeaderViewProps]) => ReactNode
      ): Self = StObject.set(x, "menuHeaderRender", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMenuHeaderRenderUndefined: Self = StObject.set(x, "menuHeaderRender", js.undefined)
      
      @scala.inline
      def setMenuRender(value: WithFalse[js.Function2[HeaderViewProps, /* defaultDom */ ReactNode, ReactNode]]): Self = StObject.set(x, "menuRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuRenderFunction2(value: (HeaderViewProps, /* defaultDom */ ReactNode) => ReactNode): Self = StObject.set(x, "menuRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMenuRenderUndefined: Self = StObject.set(x, "menuRender", js.undefined)
      
      @scala.inline
      def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      @scala.inline
      def setNavTheme(value: MenuTheme | realDark): Self = StObject.set(x, "navTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavThemeUndefined: Self = StObject.set(x, "navTheme", js.undefined)
      
      @scala.inline
      def setOnCollapse(value: /* collapsed */ Boolean => Unit): Self = StObject.set(x, "onCollapse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
      
      @scala.inline
      def setOnMenuHeaderClick(value: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMenuHeaderClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMenuHeaderClickUndefined: Self = StObject.set(x, "onMenuHeaderClick", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
      
      @scala.inline
      def setRightContentRender(value: WithFalse[js.Function1[HeaderViewProps, ReactNode]]): Self = StObject.set(x, "rightContentRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightContentRenderFunction1(value: HeaderViewProps => ReactNode): Self = StObject.set(x, "rightContentRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRightContentRenderUndefined: Self = StObject.set(x, "rightContentRender", js.undefined)
      
      @scala.inline
      def setSiderWidth(value: Double): Self = StObject.set(x, "siderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiderWidthUndefined: Self = StObject.set(x, "siderWidth", js.undefined)
      
      @scala.inline
      def setSplitMenus(value: Boolean): Self = StObject.set(x, "splitMenus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitMenusUndefined: Self = StObject.set(x, "splitMenus", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: String | `false`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait HeaderViewState extends StObject {
    
    var visible: Boolean = js.native
  }
  object HeaderViewState {
    
    @scala.inline
    def apply(visible: Boolean): HeaderViewState = {
      val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderViewState]
    }
    
    @scala.inline
    implicit class HeaderViewStateMutableBuilder[Self <: HeaderViewState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
