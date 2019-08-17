package typings.amapDashJsDashApiDashDriving.AMapNs.DrivingNs

import typings.amapDashJsDashApi.AMapNs.Map
import typings.amapDashJsDashApiDashDriving.AMapNs.DrivingPolicy
import typings.amapDashJsDashApiDashDriving.amapDashJsDashApiDashDrivingStrings.all
import typings.amapDashJsDashApiDashDriving.amapDashJsDashApiDashDrivingStrings.base
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * 于控制在路径规划结束后，是否自动调整地图视野使绘制的路线处于视口的可见范围
    */
  var autoFitView: js.UndefOr[Boolean] = js.undefined
  /**
    * 返回信息种类
    * 默认值：base，返回基本地址信息
    * 当取值为：all，返回DriveStep基本信息+DriveStep详细信息
    */
  var extensions: js.UndefOr[base | all] = js.undefined
  /**
    * 默认为0，表示可以使用轮渡，为1的时候表示不可以使用轮渡
    */
  var ferry: js.UndefOr[Boolean] = js.undefined
  /**
    * 设置隐藏路径规划的起始点图标
    */
  var hideMarkers: js.UndefOr[Boolean] = js.undefined
  /**
    * 使用map属性时，绘制的规划线路是否显示描边。缺省为true
    */
  var isOutline: js.UndefOr[Boolean] = js.undefined
  /**
    * AMap.Map对象
    * 展现结果的地图实例。当指定此参数后，搜索结果的标注、线路等均会自动添加到此地图上。
    */
  var map: js.UndefOr[Map] = js.undefined
  /**
    * 除省份之外车牌的字母和数字，用于判断限行相关，与province属性组合使用。
    */
  var number: js.UndefOr[String] = js.undefined
  /**
    * 使用map属性时，绘制的规划线路的描边颜色。缺省为'white'
    */
  var outlineColor: js.UndefOr[String] = js.undefined
  /**
    * 结果列表的HTML容器id或容器元素，提供此参数后，结果列表将在此容器中进行展示。
    */
  var panel: js.UndefOr[String | HTMLElement] = js.undefined
  /**
    * 驾车路线规划策略
    */
  var policy: js.UndefOr[DrivingPolicy] = js.undefined
  /**
    * 车牌省份的汉字缩写，用于判断是否限行，与number属性组合使用。
    */
  var province: js.UndefOr[String] = js.undefined
  // internal
  var showDir: js.UndefOr[Boolean] = js.undefined
  /**
    * 设置是否显示实时路况信息，默认设置为true。
    * 显示绿色代表畅通，黄色代表轻微拥堵，红色代表比较拥堵，灰色表示无路况信息。
    */
  var showTraffic: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoFitView: js.UndefOr[Boolean] = js.undefined,
    extensions: base | all = null,
    ferry: js.UndefOr[Boolean] = js.undefined,
    hideMarkers: js.UndefOr[Boolean] = js.undefined,
    isOutline: js.UndefOr[Boolean] = js.undefined,
    map: Map = null,
    number: String = null,
    outlineColor: String = null,
    panel: String | HTMLElement = null,
    policy: DrivingPolicy = null,
    province: String = null,
    showDir: js.UndefOr[Boolean] = js.undefined,
    showTraffic: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFitView)) __obj.updateDynamic("autoFitView")(autoFitView)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(ferry)) __obj.updateDynamic("ferry")(ferry)
    if (!js.isUndefined(hideMarkers)) __obj.updateDynamic("hideMarkers")(hideMarkers)
    if (!js.isUndefined(isOutline)) __obj.updateDynamic("isOutline")(isOutline)
    if (map != null) __obj.updateDynamic("map")(map)
    if (number != null) __obj.updateDynamic("number")(number)
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor)
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy)
    if (province != null) __obj.updateDynamic("province")(province)
    if (!js.isUndefined(showDir)) __obj.updateDynamic("showDir")(showDir)
    if (!js.isUndefined(showTraffic)) __obj.updateDynamic("showTraffic")(showTraffic)
    __obj.asInstanceOf[Options]
  }
}

