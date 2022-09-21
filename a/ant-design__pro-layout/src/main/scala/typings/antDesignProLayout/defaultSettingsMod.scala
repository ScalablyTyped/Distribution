package typings.antDesignProLayout

import typings.antDesignProLayout.anon.AutoClose
import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.antDesignProLayout.antDesignProLayoutStrings.group
import typings.antDesignProLayout.antDesignProLayoutStrings.light
import typings.antDesignProLayout.antDesignProLayoutStrings.mix
import typings.antDesignProLayout.antDesignProLayoutStrings.realDark
import typings.antDesignProLayout.antDesignProLayoutStrings.side
import typings.antDesignProLayout.antDesignProLayoutStrings.sub
import typings.antDesignProLayout.antDesignProLayoutStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultSettingsMod {
  
  @JSImport("@ant-design/pro-layout/es/defaultSettings", "defaultSettings")
  @js.native
  val defaultSettings: ProSettings = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.antDesignProLayout.antDesignProLayoutStrings.Fluid
    - typings.antDesignProLayout.antDesignProLayoutStrings.Fixed
  */
  trait ContentWidth extends StObject
  object ContentWidth {
    
    inline def Fixed: typings.antDesignProLayout.antDesignProLayoutStrings.Fixed = "Fixed".asInstanceOf[typings.antDesignProLayout.antDesignProLayoutStrings.Fixed]
    
    inline def Fluid: typings.antDesignProLayout.antDesignProLayoutStrings.Fluid = "Fluid".asInstanceOf[typings.antDesignProLayout.antDesignProLayoutStrings.Fluid]
  }
  
  trait ProSettings
    extends StObject
       with PureSettings
       with RenderSetting
  object ProSettings {
    
    inline def apply(): ProSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProSettings]
    }
  }
  
  trait PureSettings extends StObject {
    
    /** @name 主色，需要配合 umi 使用 */
    var colorPrimary: js.UndefOr[String] = js.undefined
    
    /** @name 全局增加滤镜 */
    var colorWeak: js.UndefOr[Boolean] = js.undefined
    
    /** @name layout of content: `Fluid` or `Fixed`, only works when layout is top */
    var contentWidth: js.UndefOr[ContentWidth] = js.undefined
    
    /** @name sticky siderbar */
    var fixSiderbar: js.UndefOr[Boolean] = js.undefined
    
    /** @name sticky header */
    var fixedHeader: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Your custom iconfont Symbol script Url eg：//at.alicdn.com/t/font_1039637_btcrd5co4w.js
      * 注意：如果需要图标多色，Iconfont 图标项目里要进行批量去色处理 Usage: https://github.com/ant-design/ant-design-pro/pull/3517
      */
    var iconfontUrl: js.UndefOr[String] = js.undefined
    
    /**
      * @name layout 的布局方式
      * @type  'side' | 'top' | 'mix'
      *
      * @example 顶部菜单 layout="top"
      * @example 侧边菜单 layout="side"
      * @example 混合布局 既有顶部也有侧边 layout="mix"
      */
    var layout: js.UndefOr[side | top | mix] = js.undefined
    
    /**
      * @name menu 相关的一些配置，可以配置菜单的行为
      *
      * @example 关闭菜单国际化  menu={{ locale: false }}
      * @example 默认打开所有的菜单 menu={{ defaultOpenAll:true }}
      * @example 让菜单处于loading 状态 menu={{ loading: true }}
      * @example 异步加载菜单数据 menu={{params:{ pathname } request: async (params) => { return [{name:"主页",path=params.pathname}]} }}
      * @example 使用 MenuGroup 来聚合菜单 menu={{ mode: 'group' }}
      * @example 取消自动关闭菜单 menu={{ autoClose: false }}
      * @example 忽略收起时自动关闭菜单 menu={{ ignoreFlatMenu: true }}
      */
    var menu: js.UndefOr[AutoClose] = js.undefined
    
    /**
      * @name theme for nav menu
      *
      * @type  "light" | "dark" | "realDark"
      */
    var navTheme: js.UndefOr[realDark | light] = js.undefined
    
    /**
      * 侧边菜单模式
      */
    var siderMenuType: js.UndefOr[sub | group] = js.undefined
    
    /**
      * 只在 mix 模式下生效
      *
      * @name 切割菜单
      */
    var splitMenus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 设置为 false，在 layout 中只展示 pageName，而不是 pageName - title
      *
      * @name Layout 的 title，也会显示在浏览器标签上
      */
    var title: js.UndefOr[String | `false`] = js.undefined
  }
  object PureSettings {
    
    inline def apply(): PureSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PureSettings]
    }
    
    extension [Self <: PureSettings](x: Self) {
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorPrimaryUndefined: Self = StObject.set(x, "colorPrimary", js.undefined)
      
      inline def setColorWeak(value: Boolean): Self = StObject.set(x, "colorWeak", value.asInstanceOf[js.Any])
      
      inline def setColorWeakUndefined: Self = StObject.set(x, "colorWeak", js.undefined)
      
      inline def setContentWidth(value: ContentWidth): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
      
      inline def setContentWidthUndefined: Self = StObject.set(x, "contentWidth", js.undefined)
      
      inline def setFixSiderbar(value: Boolean): Self = StObject.set(x, "fixSiderbar", value.asInstanceOf[js.Any])
      
      inline def setFixSiderbarUndefined: Self = StObject.set(x, "fixSiderbar", js.undefined)
      
      inline def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      inline def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      inline def setIconfontUrl(value: String): Self = StObject.set(x, "iconfontUrl", value.asInstanceOf[js.Any])
      
      inline def setIconfontUrlUndefined: Self = StObject.set(x, "iconfontUrl", js.undefined)
      
      inline def setLayout(value: side | top | mix): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setMenu(value: AutoClose): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setNavTheme(value: realDark | light): Self = StObject.set(x, "navTheme", value.asInstanceOf[js.Any])
      
      inline def setNavThemeUndefined: Self = StObject.set(x, "navTheme", js.undefined)
      
      inline def setSiderMenuType(value: sub | group): Self = StObject.set(x, "siderMenuType", value.asInstanceOf[js.Any])
      
      inline def setSiderMenuTypeUndefined: Self = StObject.set(x, "siderMenuType", js.undefined)
      
      inline def setSplitMenus(value: Boolean): Self = StObject.set(x, "splitMenus", value.asInstanceOf[js.Any])
      
      inline def setSplitMenusUndefined: Self = StObject.set(x, "splitMenus", js.undefined)
      
      inline def setTitle(value: String | `false`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait RenderSetting extends StObject {
    
    var footerRender: js.UndefOr[`false`] = js.undefined
    
    var headerRender: js.UndefOr[`false`] = js.undefined
    
    var menuHeaderRender: js.UndefOr[`false`] = js.undefined
    
    var menuRender: js.UndefOr[`false`] = js.undefined
  }
  object RenderSetting {
    
    inline def apply(): RenderSetting = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderSetting]
    }
    
    extension [Self <: RenderSetting](x: Self) {
      
      inline def setFooterRender(value: `false`): Self = StObject.set(x, "footerRender", value.asInstanceOf[js.Any])
      
      inline def setFooterRenderUndefined: Self = StObject.set(x, "footerRender", js.undefined)
      
      inline def setHeaderRender(value: `false`): Self = StObject.set(x, "headerRender", value.asInstanceOf[js.Any])
      
      inline def setHeaderRenderUndefined: Self = StObject.set(x, "headerRender", js.undefined)
      
      inline def setMenuHeaderRender(value: `false`): Self = StObject.set(x, "menuHeaderRender", value.asInstanceOf[js.Any])
      
      inline def setMenuHeaderRenderUndefined: Self = StObject.set(x, "menuHeaderRender", js.undefined)
      
      inline def setMenuRender(value: `false`): Self = StObject.set(x, "menuRender", value.asInstanceOf[js.Any])
      
      inline def setMenuRenderUndefined: Self = StObject.set(x, "menuRender", js.undefined)
    }
  }
}
