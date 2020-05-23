package typings.antDesignProLayout.anon

import typings.antDesignProLayout.antDesignProLayoutStrings.realDark
import typings.antDesignProLayout.antDesignProLayoutStrings.sidemenu
import typings.antDesignProLayout.antDesignProLayoutStrings.topmenu
import typings.antDesignProLayout.defaultSettingsMod.ContentWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @ant-design/pro-layout.@ant-design/pro-layout/lib/SettingDrawer.MergerSettingsType<@ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.Settings> */
trait MergerSettingsTypeSetting extends js.Object {
  var colorWeak: js.UndefOr[Boolean] = js.undefined
  var contentWidth: js.UndefOr[ContentWidth] = js.undefined
  var fixSiderbar: js.UndefOr[Boolean] = js.undefined
  var fixedHeader: js.UndefOr[Boolean] = js.undefined
  var iconfontUrl: js.UndefOr[String] = js.undefined
  var layout: js.UndefOr[sidemenu | topmenu] = js.undefined
  var menu: js.UndefOr[DefaultOpenAll] = js.undefined
  var navTheme: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuTheme */ js.Any) | realDark
  ] = js.undefined
  var primaryColor: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object MergerSettingsTypeSetting {
  @scala.inline
  def apply(
    colorWeak: js.UndefOr[Boolean] = js.undefined,
    contentWidth: ContentWidth = null,
    fixSiderbar: js.UndefOr[Boolean] = js.undefined,
    fixedHeader: js.UndefOr[Boolean] = js.undefined,
    iconfontUrl: String = null,
    layout: sidemenu | topmenu = null,
    menu: DefaultOpenAll = null,
    navTheme: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuTheme */ js.Any) | realDark = null,
    primaryColor: String = null,
    title: String = null
  ): MergerSettingsTypeSetting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colorWeak)) __obj.updateDynamic("colorWeak")(colorWeak.get.asInstanceOf[js.Any])
    if (contentWidth != null) __obj.updateDynamic("contentWidth")(contentWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(fixSiderbar)) __obj.updateDynamic("fixSiderbar")(fixSiderbar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader.get.asInstanceOf[js.Any])
    if (iconfontUrl != null) __obj.updateDynamic("iconfontUrl")(iconfontUrl.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    if (navTheme != null) __obj.updateDynamic("navTheme")(navTheme.asInstanceOf[js.Any])
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergerSettingsTypeSetting]
  }
}

