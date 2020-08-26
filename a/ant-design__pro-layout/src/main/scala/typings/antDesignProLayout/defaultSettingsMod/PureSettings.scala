package typings.antDesignProLayout.defaultSettingsMod

import typings.antDesignProLayout.anon.DefaultOpenAll
import typings.antDesignProLayout.antDesignProLayoutStrings.mix
import typings.antDesignProLayout.antDesignProLayoutStrings.realDark
import typings.antDesignProLayout.antDesignProLayoutStrings.side
import typings.antDesignProLayout.antDesignProLayoutStrings.top
import typings.antd.menuContextMod.MenuTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PureSettings extends js.Object {
  var colorWeak: js.UndefOr[Boolean] = js.native
  /**
    * layout of content: `Fluid` or `Fixed`, only works when layout is top
    */
  var contentWidth: ContentWidth = js.native
  /**
    * sticky siderbar
    */
  var fixSiderbar: Boolean = js.native
  /**
    * sticky header
    */
  var fixedHeader: Boolean = js.native
  /**
    * nav menu position: `side` or `top`
    */
  var headerHeight: js.UndefOr[Double] = js.native
  var iconfontUrl: String = js.native
  /**
    * customize header height
    */
  var layout: side | top | mix = js.native
  var menu: DefaultOpenAll = js.native
  /**
    * theme for nav menu
    */
  var navTheme: js.UndefOr[MenuTheme | realDark] = js.native
  var primaryColor: String = js.native
  var splitMenus: js.UndefOr[Boolean] = js.native
  var title: String = js.native
}

object PureSettings {
  @scala.inline
  def apply(
    contentWidth: ContentWidth,
    fixSiderbar: Boolean,
    fixedHeader: Boolean,
    iconfontUrl: String,
    layout: side | top | mix,
    menu: DefaultOpenAll,
    primaryColor: String,
    title: String
  ): PureSettings = {
    val __obj = js.Dynamic.literal(contentWidth = contentWidth.asInstanceOf[js.Any], fixSiderbar = fixSiderbar.asInstanceOf[js.Any], fixedHeader = fixedHeader.asInstanceOf[js.Any], iconfontUrl = iconfontUrl.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], primaryColor = primaryColor.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
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
    def setContentWidth(value: ContentWidth): Self = this.set("contentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixSiderbar(value: Boolean): Self = this.set("fixSiderbar", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixedHeader(value: Boolean): Self = this.set("fixedHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconfontUrl(value: String): Self = this.set("iconfontUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayout(value: side | top | mix): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenu(value: DefaultOpenAll): Self = this.set("menu", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryColor(value: String): Self = this.set("primaryColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorWeak(value: Boolean): Self = this.set("colorWeak", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorWeak: Self = this.set("colorWeak", js.undefined)
    @scala.inline
    def setHeaderHeight(value: Double): Self = this.set("headerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderHeight: Self = this.set("headerHeight", js.undefined)
    @scala.inline
    def setNavTheme(value: MenuTheme | realDark): Self = this.set("navTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavTheme: Self = this.set("navTheme", js.undefined)
    @scala.inline
    def setSplitMenus(value: Boolean): Self = this.set("splitMenus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitMenus: Self = this.set("splitMenus", js.undefined)
  }
  
}

