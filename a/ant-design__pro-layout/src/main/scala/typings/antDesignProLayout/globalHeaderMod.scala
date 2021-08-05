package typings.antDesignProLayout

import org.scalablytyped.runtime.Shortcut
import typings.antDesignProLayout.anon.DefaultOpenAll
import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.antDesignProLayout.antDesignProLayoutStrings.mix
import typings.antDesignProLayout.antDesignProLayoutStrings.realDark
import typings.antDesignProLayout.antDesignProLayoutStrings.side
import typings.antDesignProLayout.antDesignProLayoutStrings.top
import typings.antDesignProLayout.defaultSettingsMod.ContentWidth
import typings.antDesignProLayout.headerMod.HeaderViewProps
import typings.antDesignProLayout.siderMenuSiderMenuMod.PrivateSiderMenuProps
import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.antDesignProLayout.typingsMod.WithFalse
import typings.antd.menuContextMod.MenuTheme
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalHeaderMod extends Shortcut {
  
  @JSImport("@ant-design/pro-layout/lib/GlobalHeader", JSImport.Default)
  @js.native
  val default: FC[GlobalHeaderProps & PrivateSiderMenuProps] = js.native
  
  /* Inlined parent std.Partial<@ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.PureSettings> */
  trait GlobalHeaderProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    var collapsedButtonRender: js.UndefOr[WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], ReactNode]]] = js.undefined
    
    var colorWeak: js.UndefOr[Boolean] = js.undefined
    
    var contentWidth: js.UndefOr[ContentWidth] = js.undefined
    
    var fixSiderbar: js.UndefOr[Boolean] = js.undefined
    
    var fixedHeader: js.UndefOr[Boolean] = js.undefined
    
    var headerHeight: js.UndefOr[Double] = js.undefined
    
    var headerTheme: js.UndefOr[MenuTheme] = js.undefined
    
    var iconfontUrl: js.UndefOr[String] = js.undefined
    
    var isMobile: js.UndefOr[Boolean] = js.undefined
    
    var layout: js.UndefOr[side | top | mix] = js.undefined
    
    var logo: js.UndefOr[ReactNode] = js.undefined
    
    var menu: js.UndefOr[DefaultOpenAll] = js.undefined
    
    var menuData: js.UndefOr[js.Array[MenuDataItem]] = js.undefined
    
    var menuHeaderRender: js.UndefOr[
        WithFalse[
          js.Function3[
            /* logo */ ReactNode, 
            /* title */ ReactNode, 
            /* props */ js.UndefOr[this.type], 
            ReactNode
          ]
        ]
      ] = js.undefined
    
    var menuRender: js.UndefOr[
        WithFalse[js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactNode, ReactNode]]
      ] = js.undefined
    
    var navTheme: js.UndefOr[MenuTheme | realDark] = js.undefined
    
    var onCollapse: js.UndefOr[js.Function1[/* collapsed */ Boolean, Unit]] = js.undefined
    
    var onMenuHeaderClick: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var primaryColor: js.UndefOr[String] = js.undefined
    
    var rightContentRender: js.UndefOr[WithFalse[js.Function1[/* props */ HeaderViewProps, ReactNode]]] = js.undefined
    
    var splitMenus: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[String | `false`] = js.undefined
  }
  object GlobalHeaderProps {
    
    inline def apply(): GlobalHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalHeaderProps]
    }
    
    extension [Self <: GlobalHeaderProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedButtonRender(value: WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], ReactNode]]): Self = StObject.set(x, "collapsedButtonRender", value.asInstanceOf[js.Any])
      
      inline def setCollapsedButtonRenderFunction1(value: /* collapsed */ js.UndefOr[Boolean] => ReactNode): Self = StObject.set(x, "collapsedButtonRender", js.Any.fromFunction1(value))
      
      inline def setCollapsedButtonRenderUndefined: Self = StObject.set(x, "collapsedButtonRender", js.undefined)
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setColorWeak(value: Boolean): Self = StObject.set(x, "colorWeak", value.asInstanceOf[js.Any])
      
      inline def setColorWeakUndefined: Self = StObject.set(x, "colorWeak", js.undefined)
      
      inline def setContentWidth(value: ContentWidth): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
      
      inline def setContentWidthUndefined: Self = StObject.set(x, "contentWidth", js.undefined)
      
      inline def setFixSiderbar(value: Boolean): Self = StObject.set(x, "fixSiderbar", value.asInstanceOf[js.Any])
      
      inline def setFixSiderbarUndefined: Self = StObject.set(x, "fixSiderbar", js.undefined)
      
      inline def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      inline def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      inline def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
      
      inline def setHeaderHeightUndefined: Self = StObject.set(x, "headerHeight", js.undefined)
      
      inline def setHeaderTheme(value: MenuTheme): Self = StObject.set(x, "headerTheme", value.asInstanceOf[js.Any])
      
      inline def setHeaderThemeUndefined: Self = StObject.set(x, "headerTheme", js.undefined)
      
      inline def setIconfontUrl(value: String): Self = StObject.set(x, "iconfontUrl", value.asInstanceOf[js.Any])
      
      inline def setIconfontUrlUndefined: Self = StObject.set(x, "iconfontUrl", js.undefined)
      
      inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      inline def setIsMobileUndefined: Self = StObject.set(x, "isMobile", js.undefined)
      
      inline def setLayout(value: side | top | mix): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setLogo(value: ReactNode): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      inline def setMenu(value: DefaultOpenAll): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuData(value: js.Array[MenuDataItem]): Self = StObject.set(x, "menuData", value.asInstanceOf[js.Any])
      
      inline def setMenuDataUndefined: Self = StObject.set(x, "menuData", js.undefined)
      
      inline def setMenuDataVarargs(value: MenuDataItem*): Self = StObject.set(x, "menuData", js.Array(value :_*))
      
      inline def setMenuHeaderRender(
        value: WithFalse[
              js.Function3[
                /* logo */ ReactNode, 
                /* title */ ReactNode, 
                /* props */ js.UndefOr[GlobalHeaderProps], 
                ReactNode
              ]
            ]
      ): Self = StObject.set(x, "menuHeaderRender", value.asInstanceOf[js.Any])
      
      inline def setMenuHeaderRenderFunction3(
        value: (/* logo */ ReactNode, /* title */ ReactNode, /* props */ js.UndefOr[GlobalHeaderProps]) => ReactNode
      ): Self = StObject.set(x, "menuHeaderRender", js.Any.fromFunction3(value))
      
      inline def setMenuHeaderRenderUndefined: Self = StObject.set(x, "menuHeaderRender", js.undefined)
      
      inline def setMenuRender(value: WithFalse[js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactNode, ReactNode]]): Self = StObject.set(x, "menuRender", value.asInstanceOf[js.Any])
      
      inline def setMenuRenderFunction2(value: (/* props */ HeaderViewProps, /* defaultDom */ ReactNode) => ReactNode): Self = StObject.set(x, "menuRender", js.Any.fromFunction2(value))
      
      inline def setMenuRenderUndefined: Self = StObject.set(x, "menuRender", js.undefined)
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setNavTheme(value: MenuTheme | realDark): Self = StObject.set(x, "navTheme", value.asInstanceOf[js.Any])
      
      inline def setNavThemeUndefined: Self = StObject.set(x, "navTheme", js.undefined)
      
      inline def setOnCollapse(value: /* collapsed */ Boolean => Unit): Self = StObject.set(x, "onCollapse", js.Any.fromFunction1(value))
      
      inline def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
      
      inline def setOnMenuHeaderClick(value: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMenuHeaderClick", js.Any.fromFunction1(value))
      
      inline def setOnMenuHeaderClickUndefined: Self = StObject.set(x, "onMenuHeaderClick", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      inline def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
      
      inline def setRightContentRender(value: WithFalse[js.Function1[/* props */ HeaderViewProps, ReactNode]]): Self = StObject.set(x, "rightContentRender", value.asInstanceOf[js.Any])
      
      inline def setRightContentRenderFunction1(value: /* props */ HeaderViewProps => ReactNode): Self = StObject.set(x, "rightContentRender", js.Any.fromFunction1(value))
      
      inline def setRightContentRenderUndefined: Self = StObject.set(x, "rightContentRender", js.undefined)
      
      inline def setSplitMenus(value: Boolean): Self = StObject.set(x, "splitMenus", value.asInstanceOf[js.Any])
      
      inline def setSplitMenusUndefined: Self = StObject.set(x, "splitMenus", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: String | `false`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = FC[GlobalHeaderProps & PrivateSiderMenuProps]
  
  /* This means you don't have to write `default`, but can instead just say `globalHeaderMod.foo` */
  override def _to: FC[GlobalHeaderProps & PrivateSiderMenuProps] = default
}
