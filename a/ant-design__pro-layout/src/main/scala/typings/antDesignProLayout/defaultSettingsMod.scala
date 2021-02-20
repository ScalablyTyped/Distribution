package typings.antDesignProLayout

import org.scalablytyped.runtime.Shortcut
import typings.antDesignProLayout.anon.DefaultOpenAll
import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.antDesignProLayout.antDesignProLayoutStrings.mix
import typings.antDesignProLayout.antDesignProLayoutStrings.realDark
import typings.antDesignProLayout.antDesignProLayoutStrings.side
import typings.antDesignProLayout.antDesignProLayoutStrings.top
import typings.antd.menuContextMod.MenuTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultSettingsMod extends Shortcut {
  
  @JSImport("@ant-design/pro-layout/lib/defaultSettings", JSImport.Default)
  @js.native
  val default: ProSettings = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.antDesignProLayout.antDesignProLayoutStrings.Fluid
    - typings.antDesignProLayout.antDesignProLayoutStrings.Fixed
  */
  trait ContentWidth extends StObject
  object ContentWidth {
    
    @scala.inline
    def Fixed: typings.antDesignProLayout.antDesignProLayoutStrings.Fixed = "Fixed".asInstanceOf[typings.antDesignProLayout.antDesignProLayoutStrings.Fixed]
    
    @scala.inline
    def Fluid: typings.antDesignProLayout.antDesignProLayoutStrings.Fluid = "Fluid".asInstanceOf[typings.antDesignProLayout.antDesignProLayoutStrings.Fluid]
  }
  
  type ProSettings = PureSettings with RenderSetting
  
  @js.native
  trait PureSettings extends StObject {
    
    /**
      * @name 全局增加滤镜
      */
    var colorWeak: js.UndefOr[Boolean] = js.native
    
    /**
      * @name layout of content: `Fluid` or `Fixed`, only works when layout is top
      */
    var contentWidth: js.UndefOr[ContentWidth] = js.native
    
    /**
      * @name sticky siderbar
      */
    var fixSiderbar: js.UndefOr[Boolean] = js.native
    
    /**
      * @name sticky header
      */
    var fixedHeader: js.UndefOr[Boolean] = js.native
    
    /**
      * @name nav menu position: `side` or `top`
      */
    var headerHeight: js.UndefOr[Double] = js.native
    
    /**
      * @name 顶部菜单的颜色，mix 模式下生效
      */
    var headerTheme: js.UndefOr[MenuTheme] = js.native
    
    /**
      * Your custom iconfont Symbol script Url
      * eg：//at.alicdn.com/t/font_1039637_btcrd5co4w.js
      * 注意：如果需要图标多色，Iconfont 图标项目里要进行批量去色处理
      * Usage: https://github.com/ant-design/ant-design-pro/pull/3517
      */
    var iconfontUrl: js.UndefOr[String] = js.native
    
    /**
      * @name customize header height
      */
    var layout: js.UndefOr[side | top | mix] = js.native
    
    /**
      * @name menu 相关的一些配置
      */
    var menu: js.UndefOr[DefaultOpenAll] = js.native
    
    /**
      * @name theme for nav menu
      */
    var navTheme: js.UndefOr[MenuTheme | realDark] = js.native
    
    /**
      * @name 主色，需要配合 umi 使用
      */
    var primaryColor: js.UndefOr[String] = js.native
    
    /**
      * @name 切割菜单
      * @description 只在 mix 模式下生效
      */
    var splitMenus: js.UndefOr[Boolean] = js.native
    
    /**
      * @name Layout 的 title，也会显示在浏览器标签上
      * @description 设置为 false，在 layout 中只展示 pageName，而不是 pageName - title
      */
    var title: String | `false` = js.native
  }
  object PureSettings {
    
    @scala.inline
    def apply(title: String | `false`): PureSettings = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[PureSettings]
    }
    
    @scala.inline
    implicit class PureSettingsMutableBuilder[Self <: PureSettings] (val x: Self) extends AnyVal {
      
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
      def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderHeightUndefined: Self = StObject.set(x, "headerHeight", js.undefined)
      
      @scala.inline
      def setHeaderTheme(value: MenuTheme): Self = StObject.set(x, "headerTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderThemeUndefined: Self = StObject.set(x, "headerTheme", js.undefined)
      
      @scala.inline
      def setIconfontUrl(value: String): Self = StObject.set(x, "iconfontUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconfontUrlUndefined: Self = StObject.set(x, "iconfontUrl", js.undefined)
      
      @scala.inline
      def setLayout(value: side | top | mix): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setMenu(value: DefaultOpenAll): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      @scala.inline
      def setNavTheme(value: MenuTheme | realDark): Self = StObject.set(x, "navTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavThemeUndefined: Self = StObject.set(x, "navTheme", js.undefined)
      
      @scala.inline
      def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
      
      @scala.inline
      def setSplitMenus(value: Boolean): Self = StObject.set(x, "splitMenus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitMenusUndefined: Self = StObject.set(x, "splitMenus", js.undefined)
      
      @scala.inline
      def setTitle(value: String | `false`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RenderSetting extends StObject {
    
    var footerRender: js.UndefOr[`false`] = js.native
    
    var headerRender: js.UndefOr[`false`] = js.native
    
    var menuHeaderRender: js.UndefOr[`false`] = js.native
    
    var menuRender: js.UndefOr[`false`] = js.native
  }
  object RenderSetting {
    
    @scala.inline
    def apply(): RenderSetting = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderSetting]
    }
    
    @scala.inline
    implicit class RenderSettingMutableBuilder[Self <: RenderSetting] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFooterRender(value: `false`): Self = StObject.set(x, "footerRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterRenderUndefined: Self = StObject.set(x, "footerRender", js.undefined)
      
      @scala.inline
      def setHeaderRender(value: `false`): Self = StObject.set(x, "headerRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderRenderUndefined: Self = StObject.set(x, "headerRender", js.undefined)
      
      @scala.inline
      def setMenuHeaderRender(value: `false`): Self = StObject.set(x, "menuHeaderRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuHeaderRenderUndefined: Self = StObject.set(x, "menuHeaderRender", js.undefined)
      
      @scala.inline
      def setMenuRender(value: `false`): Self = StObject.set(x, "menuRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuRenderUndefined: Self = StObject.set(x, "menuRender", js.undefined)
    }
  }
  
  type _To = ProSettings
  
  /* This means you don't have to write `default`, but can instead just say `defaultSettingsMod.foo` */
  override def _to: ProSettings = default
}
