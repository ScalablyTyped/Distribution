package typings.atAntDashDesignProDashLayout.esSettingDrawerMod

import typings.antd.esMenuMenuContextMod.MenuTheme
import typings.atAntDashDesignProDashLayout.Anon_Locale
import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.sidemenu
import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.topmenu
import typings.atAntDashDesignProDashLayout.esDefaultSettingsMod.ContentWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @ant-design/pro-layout.@ant-design/pro-layout/es/SettingDrawer.MergerSettingsType<@ant-design/pro-layout.@ant-design/pro-layout/es/defaultSettings.Settings> */
trait SettingDrawerState extends js.Object {
  var autoHideHeader: js.UndefOr[Boolean] = js.undefined
  var collapse: js.UndefOr[Boolean] = js.undefined
  var colorWeak: js.UndefOr[Boolean] = js.undefined
  var contentWidth: js.UndefOr[ContentWidth] = js.undefined
  var fixSiderbar: js.UndefOr[Boolean] = js.undefined
  var fixedHeader: js.UndefOr[Boolean] = js.undefined
  var iconfontUrl: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var layout: js.UndefOr[sidemenu | topmenu] = js.undefined
  var menu: js.UndefOr[Anon_Locale] = js.undefined
  var navTheme: js.UndefOr[MenuTheme] = js.undefined
  var primaryColor: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object SettingDrawerState {
  @scala.inline
  def apply(
    autoHideHeader: js.UndefOr[Boolean] = js.undefined,
    collapse: js.UndefOr[Boolean] = js.undefined,
    colorWeak: js.UndefOr[Boolean] = js.undefined,
    contentWidth: ContentWidth = null,
    fixSiderbar: js.UndefOr[Boolean] = js.undefined,
    fixedHeader: js.UndefOr[Boolean] = js.undefined,
    iconfontUrl: String = null,
    language: String = null,
    layout: sidemenu | topmenu = null,
    menu: Anon_Locale = null,
    navTheme: MenuTheme = null,
    primaryColor: String = null,
    title: String = null
  ): SettingDrawerState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHideHeader)) __obj.updateDynamic("autoHideHeader")(autoHideHeader)
    if (!js.isUndefined(collapse)) __obj.updateDynamic("collapse")(collapse)
    if (!js.isUndefined(colorWeak)) __obj.updateDynamic("colorWeak")(colorWeak)
    if (contentWidth != null) __obj.updateDynamic("contentWidth")(contentWidth)
    if (!js.isUndefined(fixSiderbar)) __obj.updateDynamic("fixSiderbar")(fixSiderbar)
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader)
    if (iconfontUrl != null) __obj.updateDynamic("iconfontUrl")(iconfontUrl)
    if (language != null) __obj.updateDynamic("language")(language)
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu)
    if (navTheme != null) __obj.updateDynamic("navTheme")(navTheme)
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SettingDrawerState]
  }
}

