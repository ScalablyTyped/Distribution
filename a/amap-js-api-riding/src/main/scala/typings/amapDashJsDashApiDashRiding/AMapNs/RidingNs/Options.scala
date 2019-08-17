package typings.amapDashJsDashApiDashRiding.AMapNs.RidingNs

import typings.amapDashJsDashApi.AMapNs.Map
import typings.amapDashJsDashApiDashRiding.AMapNs.RidingPolicy
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * 用于控制在路径规划结束后，是否自动调整地图视野使绘制的路线处于视口的可见范围
    */
  var autoFitView: js.UndefOr[Boolean] = js.undefined
  /**
    * 设置隐藏路径规划的起始点图标，设置为true：隐藏图标；设置false：显示图标 默认值为：false
    */
  var hideMarkers: js.UndefOr[Boolean] = js.undefined
  /**
    * 使用map属性时，绘制的规划线路是否显示描边，默认为true
    */
  var isOutline: js.UndefOr[Boolean] = js.undefined
  /**
    * AMap.Map对象, 展现结果的地图实例。
    * 当指定此参数后，搜索结果的标注、线路等均会自动添加到此地图上
    */
  var map: js.UndefOr[Map] = js.undefined
  /**
    * 使用map属性时，绘制的规划线路是否显示描边，默认为"white"
    */
  var outlineColor: js.UndefOr[String] = js.undefined
  /**
    * 结果列表的HTML容器id或容器元素，提供此参数后，结果列表将在此容器中进行展示
    */
  var panel: js.UndefOr[String | HTMLElement] = js.undefined
  /**
    * 骑行路线规划策略
    */
  var policy: js.UndefOr[RidingPolicy] = js.undefined
  // internal
  var showDir: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoFitView: js.UndefOr[Boolean] = js.undefined,
    hideMarkers: js.UndefOr[Boolean] = js.undefined,
    isOutline: js.UndefOr[Boolean] = js.undefined,
    map: Map = null,
    outlineColor: String = null,
    panel: String | HTMLElement = null,
    policy: RidingPolicy = null,
    showDir: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFitView)) __obj.updateDynamic("autoFitView")(autoFitView)
    if (!js.isUndefined(hideMarkers)) __obj.updateDynamic("hideMarkers")(hideMarkers)
    if (!js.isUndefined(isOutline)) __obj.updateDynamic("isOutline")(isOutline)
    if (map != null) __obj.updateDynamic("map")(map)
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor)
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy)
    if (!js.isUndefined(showDir)) __obj.updateDynamic("showDir")(showDir)
    __obj.asInstanceOf[Options]
  }
}

