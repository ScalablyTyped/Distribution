package typings.antDesignProLayout.defaultSettingsMod

import typings.antDesignProLayout.anon.DefaultOpenAll
import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.antDesignProLayout.antDesignProLayoutStrings.mix
import typings.antDesignProLayout.antDesignProLayoutStrings.realDark
import typings.antDesignProLayout.antDesignProLayoutStrings.side
import typings.antDesignProLayout.antDesignProLayoutStrings.top
import typings.antd.menuContextMod.MenuTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PureSettings extends js.Object {
  
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
  implicit class PureSettingsOps[Self <: PureSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTitle(value: String | `false`): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorWeak(value: Boolean): Self = this.set("colorWeak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorWeak: Self = this.set("colorWeak", js.undefined)
    
    @scala.inline
    def setContentWidth(value: ContentWidth): Self = this.set("contentWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentWidth: Self = this.set("contentWidth", js.undefined)
    
    @scala.inline
    def setFixSiderbar(value: Boolean): Self = this.set("fixSiderbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixSiderbar: Self = this.set("fixSiderbar", js.undefined)
    
    @scala.inline
    def setFixedHeader(value: Boolean): Self = this.set("fixedHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedHeader: Self = this.set("fixedHeader", js.undefined)
    
    @scala.inline
    def setHeaderHeight(value: Double): Self = this.set("headerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderHeight: Self = this.set("headerHeight", js.undefined)
    
    @scala.inline
    def setHeaderTheme(value: MenuTheme): Self = this.set("headerTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTheme: Self = this.set("headerTheme", js.undefined)
    
    @scala.inline
    def setIconfontUrl(value: String): Self = this.set("iconfontUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconfontUrl: Self = this.set("iconfontUrl", js.undefined)
    
    @scala.inline
    def setLayout(value: side | top | mix): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setMenu(value: DefaultOpenAll): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    
    @scala.inline
    def setNavTheme(value: MenuTheme | realDark): Self = this.set("navTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavTheme: Self = this.set("navTheme", js.undefined)
    
    @scala.inline
    def setPrimaryColor(value: String): Self = this.set("primaryColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryColor: Self = this.set("primaryColor", js.undefined)
    
    @scala.inline
    def setSplitMenus(value: Boolean): Self = this.set("splitMenus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitMenus: Self = this.set("splitMenus", js.undefined)
  }
}
