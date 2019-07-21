package typings
package atAntDashDesignProDashLayoutLib.libDefaultSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /**
    * auto hide header
    */
  var autoHideHeader: scala.Boolean
  /**
    * layout of content: `Fluid` or `Fixed`, only works when layout is topmenu
    */
  var contentWidth: ContentWidth
  /**
    * sticky siderbar
    */
  var fixSiderbar: scala.Boolean
  /**
    * sticky header
    */
  var fixedHeader: scala.Boolean
  var iconfontUrl: java.lang.String
  /**
    * nav menu position: `sidemenu` or `topmenu`
    */
  var layout: atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.sidemenu | atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.topmenu
  var menu: atAntDashDesignProDashLayoutLib.Anon_Locale
  /**
    * theme for nav menu
    */
  var navTheme: js.UndefOr[antdLib.esMenuMod.MenuTheme] = js.undefined
  var title: java.lang.String
}

object Settings {
  @scala.inline
  def apply(
    autoHideHeader: scala.Boolean,
    contentWidth: ContentWidth,
    fixSiderbar: scala.Boolean,
    fixedHeader: scala.Boolean,
    iconfontUrl: java.lang.String,
    layout: atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.sidemenu | atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.topmenu,
    menu: atAntDashDesignProDashLayoutLib.Anon_Locale,
    title: java.lang.String,
    navTheme: antdLib.esMenuMod.MenuTheme = null
  ): Settings = {
    val __obj = js.Dynamic.literal(autoHideHeader = autoHideHeader, contentWidth = contentWidth, fixSiderbar = fixSiderbar, fixedHeader = fixedHeader, iconfontUrl = iconfontUrl, layout = layout.asInstanceOf[js.Any], menu = menu, title = title)
    if (navTheme != null) __obj.updateDynamic("navTheme")(navTheme)
    __obj.asInstanceOf[Settings]
  }
}

