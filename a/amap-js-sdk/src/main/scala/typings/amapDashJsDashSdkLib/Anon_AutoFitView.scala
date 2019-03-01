package typings
package amapDashJsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoFitView extends js.Object {
  var autoFitView: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[scala.Double] = js.undefined
  var city: js.UndefOr[java.lang.String] = js.undefined
  var citylimit: js.UndefOr[scala.Boolean] = js.undefined
  var extensions: js.UndefOr[java.lang.String] = js.undefined
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var map: js.UndefOr[amapDashJsDashSdkLib.AMapNs.Map] = js.undefined
  var pageIndex: js.UndefOr[scala.Double] = js.undefined
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  var panel: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  var renderStyle: js.UndefOr[java.lang.String] = js.undefined
  var showCover: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AutoFitView {
  @scala.inline
  def apply(
    autoFitView: js.UndefOr[scala.Boolean] = js.undefined,
    children: scala.Int | scala.Double = null,
    city: java.lang.String = null,
    citylimit: js.UndefOr[scala.Boolean] = js.undefined,
    extensions: java.lang.String = null,
    lang: java.lang.String = null,
    map: amapDashJsDashSdkLib.AMapNs.Map = null,
    pageIndex: scala.Int | scala.Double = null,
    pageSize: scala.Int | scala.Double = null,
    panel: java.lang.String | stdLib.HTMLElement = null,
    renderStyle: java.lang.String = null,
    showCover: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): Anon_AutoFitView = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFitView)) __obj.updateDynamic("autoFitView")(autoFitView)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city)
    if (!js.isUndefined(citylimit)) __obj.updateDynamic("citylimit")(citylimit)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (map != null) __obj.updateDynamic("map")(map)
    if (pageIndex != null) __obj.updateDynamic("pageIndex")(pageIndex.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (renderStyle != null) __obj.updateDynamic("renderStyle")(renderStyle)
    if (!js.isUndefined(showCover)) __obj.updateDynamic("showCover")(showCover)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AutoFitView]
  }
}

