package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApi.AMap.Map
import typings.amapJsApiTransfer.AMap.TransferPolicy
import typings.amapJsApiTransfer.amapJsApiTransferStrings.all
import typings.amapJsApiTransfer.amapJsApiTransferStrings.base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * 用于控制在路径规划结束后，是否自动调整地图视野使绘制的路线处于视口的可见范围
    */
  var autoFitView: js.UndefOr[Boolean] = js.undefined
  /**
    * 公交换乘的城市，支持城市名称、城市区号、电话区号，此项为必填
    */
  var city: String
  /**
    * 终点城市，跨城公交路径规划时为必填参数
    */
  var cityd: js.UndefOr[String] = js.undefined
  /**
    * 返回结果控制, 默认值: base
    * base:返回基本信息
    * all:返回全部信息
    */
  var extensions: js.UndefOr[all | base] = js.undefined
  /**
    * 设置是否隐藏路径规划的起始点图标
    */
  var hideMarkers: js.UndefOr[Boolean] = js.undefined
  /**
    * 使用map属性时，绘制的规划线路是否显示描边。默认为true
    */
  var isOutline: js.UndefOr[Boolean] = js.undefined
  /**
    * AMap.Map对象, 展现结果的地图实例
    */
  var map: js.UndefOr[Map] = js.undefined
  /**
    * 是否计算夜班车，默认为不计算
    */
  var nightflag: js.UndefOr[Boolean] = js.undefined
  /**
    * 使用map属性时，绘制的规划线路的描边颜色。默认为'white'
    */
  var outlineColor: js.UndefOr[String] = js.undefined
  /**
    * 结果列表的HTML容器id或容器元素
    */
  var panel: js.UndefOr[String] = js.undefined
  /**
    * 公交换乘策略
    */
  var policy: js.UndefOr[TransferPolicy] = js.undefined
  // internal
  var showDir: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    city: String,
    autoFitView: js.UndefOr[Boolean] = js.undefined,
    cityd: String = null,
    extensions: all | base = null,
    hideMarkers: js.UndefOr[Boolean] = js.undefined,
    isOutline: js.UndefOr[Boolean] = js.undefined,
    map: Map = null,
    nightflag: js.UndefOr[Boolean] = js.undefined,
    outlineColor: String = null,
    panel: String = null,
    policy: TransferPolicy = null,
    showDir: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFitView)) __obj.updateDynamic("autoFitView")(autoFitView.get.asInstanceOf[js.Any])
    if (cityd != null) __obj.updateDynamic("cityd")(cityd.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(hideMarkers)) __obj.updateDynamic("hideMarkers")(hideMarkers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isOutline)) __obj.updateDynamic("isOutline")(isOutline.get.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (!js.isUndefined(nightflag)) __obj.updateDynamic("nightflag")(nightflag.get.asInstanceOf[js.Any])
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (!js.isUndefined(showDir)) __obj.updateDynamic("showDir")(showDir.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

