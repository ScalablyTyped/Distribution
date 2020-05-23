package typings.amapJsApiIndoorMap.AMap.IndoorMap

import typings.amapJsApi.AMap.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typings.amapJsApi.AMap.Layer.Options {
  /**
    * 是否持续显示
    */
  var alaysShow: js.UndefOr[Boolean] = js.undefined
  var autoLoadBuildingsInTile: js.UndefOr[Boolean] = js.undefined
  /**
    * 鼠标悬停到店铺面时的鼠标样式
    */
  var cursor: js.UndefOr[String] = js.undefined
  var disableHoverMarker: js.UndefOr[Boolean] = js.undefined
  var disableIconRender: js.UndefOr[Boolean] = js.undefined
  var disableLabelRender: js.UndefOr[Boolean] = js.undefined
  var featurezIndex: js.UndefOr[Double] = js.undefined
  /**
    * 是否隐藏楼层切换控件
    */
  var hideFloorBar: js.UndefOr[Boolean] = js.undefined
  /**
    * 图层的透明度
    */
  var opacity: js.UndefOr[Double] = js.undefined
  // internal
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * 图层叠加的顺序值
    */
  var zIndex: js.UndefOr[Double] = js.undefined
  var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    alaysShow: js.UndefOr[Boolean] = js.undefined,
    autoLoadBuildingsInTile: js.UndefOr[Boolean] = js.undefined,
    cursor: String = null,
    disableHoverMarker: js.UndefOr[Boolean] = js.undefined,
    disableIconRender: js.UndefOr[Boolean] = js.undefined,
    disableLabelRender: js.UndefOr[Boolean] = js.undefined,
    featurezIndex: js.UndefOr[Double] = js.undefined,
    hideFloorBar: js.UndefOr[Boolean] = js.undefined,
    map: Map = null,
    opacity: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined,
    zooms: js.Tuple2[Double, Double] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alaysShow)) __obj.updateDynamic("alaysShow")(alaysShow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLoadBuildingsInTile)) __obj.updateDynamic("autoLoadBuildingsInTile")(autoLoadBuildingsInTile.get.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHoverMarker)) __obj.updateDynamic("disableHoverMarker")(disableHoverMarker.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableIconRender)) __obj.updateDynamic("disableIconRender")(disableIconRender.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableLabelRender)) __obj.updateDynamic("disableLabelRender")(disableLabelRender.get.asInstanceOf[js.Any])
    if (!js.isUndefined(featurezIndex)) __obj.updateDynamic("featurezIndex")(featurezIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideFloorBar)) __obj.updateDynamic("hideFloorBar")(hideFloorBar.get.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    if (zooms != null) __obj.updateDynamic("zooms")(zooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

