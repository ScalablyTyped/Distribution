package typings.atAntDashDesignProDashLayout.esDefaultSettingsMod

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
  var navTheme: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MenuTheme */ js.Any
  ] = js.undefined
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
    navTheme: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MenuTheme */ js.Any = null
  ): Settings = {
    val __obj = js.Dynamic.literal(autoHideHeader = autoHideHeader, contentWidth = contentWidth, fixSiderbar = fixSiderbar, fixedHeader = fixedHeader, iconfontUrl = iconfontUrl, layout = layout.asInstanceOf[js.Any], menu = menu, title = title)
    if (navTheme != null) __obj.updateDynamic("navTheme")(navTheme)
    __obj.asInstanceOf[Settings]
  }
}

