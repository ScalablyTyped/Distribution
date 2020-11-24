package typings.antDesignProLayout.libSettingDrawerMod

import typings.antDesignProLayout.anon.DefaultOpenAll
import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.antDesignProLayout.antDesignProLayoutStrings.mix
import typings.antDesignProLayout.antDesignProLayoutStrings.realDark
import typings.antDesignProLayout.antDesignProLayoutStrings.side
import typings.antDesignProLayout.antDesignProLayoutStrings.top
import typings.antDesignProLayout.defaultSettingsMod.ContentWidth
import typings.antd.menuContextMod.MenuTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent @ant-design/pro-layout.@ant-design/pro-layout/lib/SettingDrawer.MergerSettingsType<@ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.ProSettings> */
@js.native
trait SettingDrawerState extends js.Object {
  
  var collapse: js.UndefOr[Boolean] = js.native
  
  var colorWeak: js.UndefOr[Boolean] = js.native
  
  var contentWidth: js.UndefOr[ContentWidth] = js.native
  
  var fixSiderbar: js.UndefOr[Boolean] = js.native
  
  var fixedHeader: js.UndefOr[Boolean] = js.native
  
  var footerRender: js.UndefOr[`false`] = js.native
  
  var headerHeight: js.UndefOr[Double] = js.native
  
  var headerRender: js.UndefOr[`false`] = js.native
  
  var headerTheme: js.UndefOr[MenuTheme] = js.native
  
  var iconfontUrl: js.UndefOr[String] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var layout: js.UndefOr[side | top | mix] = js.native
  
  var menu: js.UndefOr[DefaultOpenAll] = js.native
  
  var menuHeaderRender: js.UndefOr[`false`] = js.native
  
  var menuRender: js.UndefOr[`false`] = js.native
  
  var navTheme: js.UndefOr[MenuTheme | realDark] = js.native
  
  var primaryColor: js.UndefOr[String] = js.native
  
  var splitMenus: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String | `false`] = js.native
}
object SettingDrawerState {
  
  @scala.inline
  def apply(): SettingDrawerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingDrawerState]
  }
  
  @scala.inline
  implicit class SettingDrawerStateOps[Self <: SettingDrawerState] (val x: Self) extends AnyVal {
    
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
    def setCollapse(value: Boolean): Self = this.set("collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    
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
    def setFooterRender(value: `false`): Self = this.set("footerRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterRender: Self = this.set("footerRender", js.undefined)
    
    @scala.inline
    def setHeaderHeight(value: Double): Self = this.set("headerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderHeight: Self = this.set("headerHeight", js.undefined)
    
    @scala.inline
    def setHeaderRender(value: `false`): Self = this.set("headerRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderRender: Self = this.set("headerRender", js.undefined)
    
    @scala.inline
    def setHeaderTheme(value: MenuTheme): Self = this.set("headerTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTheme: Self = this.set("headerTheme", js.undefined)
    
    @scala.inline
    def setIconfontUrl(value: String): Self = this.set("iconfontUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconfontUrl: Self = this.set("iconfontUrl", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLayout(value: side | top | mix): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setMenu(value: DefaultOpenAll): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    
    @scala.inline
    def setMenuHeaderRender(value: `false`): Self = this.set("menuHeaderRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuHeaderRender: Self = this.set("menuHeaderRender", js.undefined)
    
    @scala.inline
    def setMenuRender(value: `false`): Self = this.set("menuRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuRender: Self = this.set("menuRender", js.undefined)
    
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
    
    @scala.inline
    def setTitle(value: String | `false`): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
