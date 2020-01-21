package typings.amapJsSdk

import typings.amapJsSdk.AMap.Map
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoFitView extends js.Object {
  var autoFitView: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[Double] = js.undefined
  var city: js.UndefOr[String] = js.undefined
  var citylimit: js.UndefOr[Boolean] = js.undefined
  var extensions: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var pageIndex: js.UndefOr[Double] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
  var panel: js.UndefOr[String | HTMLElement] = js.undefined
  var renderStyle: js.UndefOr[String] = js.undefined
  var showCover: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AnonAutoFitView {
  @scala.inline
  def apply(
    autoFitView: js.UndefOr[Boolean] = js.undefined,
    children: Int | Double = null,
    city: String = null,
    citylimit: js.UndefOr[Boolean] = js.undefined,
    extensions: String = null,
    lang: String = null,
    map: Map = null,
    pageIndex: Int | Double = null,
    pageSize: Int | Double = null,
    panel: String | HTMLElement = null,
    renderStyle: String = null,
    showCover: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): AnonAutoFitView = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFitView)) __obj.updateDynamic("autoFitView")(autoFitView.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (!js.isUndefined(citylimit)) __obj.updateDynamic("citylimit")(citylimit.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (pageIndex != null) __obj.updateDynamic("pageIndex")(pageIndex.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (renderStyle != null) __obj.updateDynamic("renderStyle")(renderStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(showCover)) __obj.updateDynamic("showCover")(showCover.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoFitView]
  }
}

