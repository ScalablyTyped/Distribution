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
import typings.antDesignProLayout.siderMenuSiderMenuMod.SiderMenuProps
import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.antDesignProLayout.typingsMod.WithFalse
import typings.antd.menuContextMod.MenuTheme
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topNavHeaderMod extends Shortcut {
  
  @JSImport("@ant-design/pro-layout/lib/TopNavHeader", JSImport.Default)
  @js.native
  val default: FC[TopNavHeaderProps] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.antDesignProLayout.globalHeaderMod.GlobalHeaderProps because var conflicts: className, collapsedButtonRender, logo, menuHeaderRender, onMenuHeaderClick, style. Inlined collapsed, onCollapse, isMobile, menuRender, rightContentRender, prefixCls, menuData, splitMenus, title, iconfontUrl, menu, fixSiderbar, layout, headerTheme, navTheme, fixedHeader, colorWeak, contentWidth, primaryColor, headerHeight */ trait TopNavHeaderProps
    extends StObject
       with SiderMenuProps
       with PrivateSiderMenuProps {
    
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    var colorWeak: js.UndefOr[Boolean] = js.undefined
    
    var contentWidth: js.UndefOr[ContentWidth] = js.undefined
    
    var fixSiderbar: js.UndefOr[Boolean] = js.undefined
    
    var fixedHeader: js.UndefOr[Boolean] = js.undefined
    
    var headerHeight: js.UndefOr[Double] = js.undefined
    
    var headerTheme: js.UndefOr[MenuTheme] = js.undefined
    
    var iconfontUrl: js.UndefOr[String] = js.undefined
    
    var isMobile: js.UndefOr[Boolean] = js.undefined
    
    var layout: js.UndefOr[side | top | mix] = js.undefined
    
    var menu: js.UndefOr[DefaultOpenAll] = js.undefined
    
    var menuData: js.UndefOr[js.Array[MenuDataItem]] = js.undefined
    
    var menuRender: js.UndefOr[
        WithFalse[js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactNode, ReactNode]]
      ] = js.undefined
    
    var navTheme: js.UndefOr[MenuTheme | realDark] = js.undefined
    
    var onCollapse: js.UndefOr[js.Function1[/* collapsed */ Boolean, Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var primaryColor: js.UndefOr[String] = js.undefined
    
    var rightContentRender: js.UndefOr[WithFalse[js.Function1[/* props */ HeaderViewProps, ReactNode]]] = js.undefined
    
    var splitMenus: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String | `false`] = js.undefined
  }
  object TopNavHeaderProps {
    
    inline def apply(matchMenuKeys: js.Array[String]): TopNavHeaderProps = {
      val __obj = js.Dynamic.literal(matchMenuKeys = matchMenuKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopNavHeaderProps]
    }
    
    extension [Self <: TopNavHeaderProps](x: Self) {
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
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
      
      inline def setMenu(value: DefaultOpenAll): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuData(value: js.Array[MenuDataItem]): Self = StObject.set(x, "menuData", value.asInstanceOf[js.Any])
      
      inline def setMenuDataUndefined: Self = StObject.set(x, "menuData", js.undefined)
      
      inline def setMenuDataVarargs(value: MenuDataItem*): Self = StObject.set(x, "menuData", js.Array(value :_*))
      
      inline def setMenuRender(value: WithFalse[js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactNode, ReactNode]]): Self = StObject.set(x, "menuRender", value.asInstanceOf[js.Any])
      
      inline def setMenuRenderFunction2(value: (/* props */ HeaderViewProps, /* defaultDom */ ReactNode) => ReactNode): Self = StObject.set(x, "menuRender", js.Any.fromFunction2(value))
      
      inline def setMenuRenderUndefined: Self = StObject.set(x, "menuRender", js.undefined)
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setNavTheme(value: MenuTheme | realDark): Self = StObject.set(x, "navTheme", value.asInstanceOf[js.Any])
      
      inline def setNavThemeUndefined: Self = StObject.set(x, "navTheme", js.undefined)
      
      inline def setOnCollapse(value: /* collapsed */ Boolean => Unit): Self = StObject.set(x, "onCollapse", js.Any.fromFunction1(value))
      
      inline def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      inline def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
      
      inline def setRightContentRender(value: WithFalse[js.Function1[/* props */ HeaderViewProps, ReactNode]]): Self = StObject.set(x, "rightContentRender", value.asInstanceOf[js.Any])
      
      inline def setRightContentRenderFunction1(value: /* props */ HeaderViewProps => ReactNode): Self = StObject.set(x, "rightContentRender", js.Any.fromFunction1(value))
      
      inline def setRightContentRenderUndefined: Self = StObject.set(x, "rightContentRender", js.undefined)
      
      inline def setSplitMenus(value: Boolean): Self = StObject.set(x, "splitMenus", value.asInstanceOf[js.Any])
      
      inline def setSplitMenusUndefined: Self = StObject.set(x, "splitMenus", js.undefined)
      
      inline def setTitle(value: String | `false`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = FC[TopNavHeaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `topNavHeaderMod.foo` */
  override def _to: FC[TopNavHeaderProps] = default
}
