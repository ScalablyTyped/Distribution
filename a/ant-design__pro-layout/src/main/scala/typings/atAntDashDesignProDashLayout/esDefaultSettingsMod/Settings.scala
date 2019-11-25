package typings.atAntDashDesignProDashLayout.esDefaultSettingsMod

import typings.antd.esMenuMenuContextMod.MenuTheme
import typings.atAntDashDesignProDashLayout.Anon_Locale
import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.sidemenu
import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.topmenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /**
    * auto hide header
    */
  var autoHideHeader: Boolean
  /**
    * layout of content: `Fluid` or `Fixed`, only works when layout is topmenu
    */
  var contentWidth: ContentWidth
  /**
    * sticky siderbar
    */
  var fixSiderbar: Boolean
  /**
    * sticky header
    */
  var fixedHeader: Boolean
  var iconfontUrl: String
  /**
    * nav menu position: `sidemenu` or `topmenu`
    */
  var layout: sidemenu | topmenu
  var menu: Anon_Locale
  /**
    * theme for nav menu
    */
  var navTheme: js.UndefOr[MenuTheme] = js.undefined
  var title: String
}

object Settings {
  @scala.inline
  def apply(
    autoHideHeader: Boolean,
    contentWidth: ContentWidth,
    fixSiderbar: Boolean,
    fixedHeader: Boolean,
    iconfontUrl: String,
    layout: sidemenu | topmenu,
    menu: Anon_Locale,
    title: String,
    navTheme: MenuTheme = null
  ): Settings = {
    val __obj = js.Dynamic.literal(autoHideHeader = autoHideHeader.asInstanceOf[js.Any], contentWidth = contentWidth.asInstanceOf[js.Any], fixSiderbar = fixSiderbar.asInstanceOf[js.Any], fixedHeader = fixedHeader.asInstanceOf[js.Any], iconfontUrl = iconfontUrl.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (navTheme != null) __obj.updateDynamic("navTheme")(navTheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

