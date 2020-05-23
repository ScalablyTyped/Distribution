package typings.amapJsSdk.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoFitView extends js.Object {
  var autoFitView: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[Double] = js.undefined
  var city: js.UndefOr[String] = js.undefined
  var citylimit: js.UndefOr[Boolean] = js.undefined
  var extensions: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var map: js.UndefOr[typings.amapJsSdk.AMap.Map] = js.undefined
  var pageIndex: js.UndefOr[Double] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
  var panel: js.UndefOr[String | HTMLElement] = js.undefined
  var renderStyle: js.UndefOr[String] = js.undefined
  var showCover: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AutoFitView {
  @scala.inline
  def apply(
    autoFitView: js.UndefOr[Boolean] = js.undefined,
    children: js.UndefOr[Double] = js.undefined,
    city: String = null,
    citylimit: js.UndefOr[Boolean] = js.undefined,
    extensions: String = null,
    lang: String = null,
    map: typings.amapJsSdk.AMap.Map = null,
    pageIndex: js.UndefOr[Double] = js.undefined,
    pageSize: js.UndefOr[Double] = js.undefined,
    panel: String | HTMLElement = null,
    renderStyle: String = null,
    showCover: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): AutoFitView = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFitView)) __obj.updateDynamic("autoFitView")(autoFitView.get.asInstanceOf[js.Any])
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.get.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (!js.isUndefined(citylimit)) __obj.updateDynamic("citylimit")(citylimit.get.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (!js.isUndefined(pageIndex)) __obj.updateDynamic("pageIndex")(pageIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (renderStyle != null) __obj.updateDynamic("renderStyle")(renderStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(showCover)) __obj.updateDynamic("showCover")(showCover.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFitView]
  }
}

