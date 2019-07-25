package typings
package atAntDashDesignProDashLayoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @ant-design/pro-layout.@ant-design/pro-layout/es/SettingDrawer.MergerSettingsType<@ant-design/pro-layout.@ant-design/pro-layout/es/defaultSettings.Settings> */
trait MergerSettingsTypeSettings extends js.Object {
  var autoHideHeader: js.UndefOr[scala.Boolean] = js.undefined
  var colorWeak: js.UndefOr[scala.Boolean] = js.undefined
  var contentWidth: js.UndefOr[atAntDashDesignProDashLayoutLib.esDefaultSettingsMod.ContentWidth] = js.undefined
  var fixSiderbar: js.UndefOr[scala.Boolean] = js.undefined
  var fixedHeader: js.UndefOr[scala.Boolean] = js.undefined
  var iconfontUrl: js.UndefOr[java.lang.String] = js.undefined
  var layout: js.UndefOr[
    atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.sidemenu | atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.topmenu
  ] = js.undefined
  var menu: js.UndefOr[Anon_Locale] = js.undefined
  var navTheme: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MenuTheme */ js.Any
  ] = js.undefined
  var primaryColor: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object MergerSettingsTypeSettings {
  @scala.inline
  def apply(
    autoHideHeader: js.UndefOr[scala.Boolean] = js.undefined,
    colorWeak: js.UndefOr[scala.Boolean] = js.undefined,
    contentWidth: atAntDashDesignProDashLayoutLib.esDefaultSettingsMod.ContentWidth = null,
    fixSiderbar: js.UndefOr[scala.Boolean] = js.undefined,
    fixedHeader: js.UndefOr[scala.Boolean] = js.undefined,
    iconfontUrl: java.lang.String = null,
    layout: atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.sidemenu | atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.topmenu = null,
    menu: Anon_Locale = null,
    navTheme: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MenuTheme */ js.Any = null,
    primaryColor: java.lang.String = null,
    title: java.lang.String = null
  ): MergerSettingsTypeSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHideHeader)) __obj.updateDynamic("autoHideHeader")(autoHideHeader)
    if (!js.isUndefined(colorWeak)) __obj.updateDynamic("colorWeak")(colorWeak)
    if (contentWidth != null) __obj.updateDynamic("contentWidth")(contentWidth)
    if (!js.isUndefined(fixSiderbar)) __obj.updateDynamic("fixSiderbar")(fixSiderbar)
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader)
    if (iconfontUrl != null) __obj.updateDynamic("iconfontUrl")(iconfontUrl)
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu)
    if (navTheme != null) __obj.updateDynamic("navTheme")(navTheme)
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[MergerSettingsTypeSettings]
  }
}

