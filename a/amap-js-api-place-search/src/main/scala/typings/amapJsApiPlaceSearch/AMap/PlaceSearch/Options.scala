package typings.amapJsApiPlaceSearch.AMap.PlaceSearch

import typings.amapJsApi.AMap.Lang
import typings.amapJsApi.AMap.Map
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.all
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.base
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.default
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.newpc
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * 是否自动调整地图视野使绘制的Marker点都处于视口的可见范围
    */
  var autoFitView: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否按照层级展示子POI数据
    * children=1，展示子节点POI数据，children=0，不展示子节点数据
    */
  var children: js.UndefOr[Double] = js.undefined
  /**
    * 兴趣点城市
    */
  var city: js.UndefOr[String] = js.undefined
  /**
    * 是否强制限制在设置的城市内搜索
    */
  var citylimit: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否返回详细信息
    * base返回基本地址信息；all返回基本+详细信息
    */
  var extensions: js.UndefOr[base | all] = js.undefined
  /**
    * 检索语言类型
    */
  var lang: js.UndefOr[Lang] = js.undefined
  /**
    * Map对象
    */
  var map: js.UndefOr[Map] = js.undefined
  /**
    * 页码
    */
  var pageIndex: js.UndefOr[Double] = js.undefined
  /**
    * 单页显示结果条数
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  /**
    * 结果列表的HTML容器id或容器元素
    */
  var panel: js.UndefOr[String | HTMLElement] = js.undefined
  var rankBy: js.UndefOr[String] = js.undefined
  // internal
  var renderEngine: js.UndefOr[String] = js.undefined
  /**
    * 绘制的UI风格
    */
  var renderStyle: js.UndefOr[newpc | default] = js.undefined
  /**
    * 是否在地图上显示周边搜索的圆或者范围搜索的多边形
    */
  var showCover: js.UndefOr[Boolean] = js.undefined
  /**
    * 兴趣点类别，多个类别用“|”分割
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoFitView: js.UndefOr[Boolean] = js.undefined,
    children: js.UndefOr[Double] = js.undefined,
    city: String = null,
    citylimit: js.UndefOr[Boolean] = js.undefined,
    extensions: base | all = null,
    lang: Lang = null,
    map: Map = null,
    pageIndex: js.UndefOr[Double] = js.undefined,
    pageSize: js.UndefOr[Double] = js.undefined,
    panel: String | HTMLElement = null,
    rankBy: String = null,
    renderEngine: String = null,
    renderStyle: newpc | default = null,
    showCover: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): Options = {
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
    if (rankBy != null) __obj.updateDynamic("rankBy")(rankBy.asInstanceOf[js.Any])
    if (renderEngine != null) __obj.updateDynamic("renderEngine")(renderEngine.asInstanceOf[js.Any])
    if (renderStyle != null) __obj.updateDynamic("renderStyle")(renderStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(showCover)) __obj.updateDynamic("showCover")(showCover.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

