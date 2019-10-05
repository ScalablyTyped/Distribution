package typings.amapDashJsDashApiDashGeolocation.AMap.Geolocation

import typings.amapDashJsDashApi.AMap.Pixel
import typings.amapDashJsDashApiDashGeolocation.amapDashJsDashApiDashGeolocationStrings.all
import typings.amapDashJsDashApiDashGeolocation.amapDashJsDashApiDashGeolocationStrings.base
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * 是否PC端为优先使用浏览器定位
    */
  var GeoLocationFirst: js.UndefOr[Boolean] = js.undefined
  /**
    * 自定义定位按钮的内容
    */
  var buttonDom: js.UndefOr[String | HTMLElement] = js.undefined
  /**
    * 按钮距离停靠位置的偏移量
    */
  var buttonOffset: js.UndefOr[Pixel] = js.undefined
  /**
    * 定位按钮可停靠的位置
    * “LT”：左上角
    * “LB”：左下角
    * “RT”：右上角
    * “RB”：右下角
    */
  var buttonPosition: js.UndefOr[ButtonPosition] = js.undefined
  /**
    * 定位点Circle的配置
    */
  var circleOptions: js.UndefOr[typings.amapDashJsDashApi.AMap.Circle.Options[_]] = js.undefined
  /**
    * 是否转换成高德坐标
    */
  var convert: js.UndefOr[Boolean] = js.undefined
  // internal
  var convertUrl: js.UndefOr[String] = js.undefined
  /**
    * 是否使用高精度
    */
  var enableHighAccuracy: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否返回详细信息
    */
  var extensions: js.UndefOr[all | base] = js.undefined
  /**
    * 定位点Marker的配置
    */
  var markerOptions: js.UndefOr[typings.amapDashJsDashApi.AMap.Marker.Options[_]] = js.undefined
  /**
    * 缓存毫秒数
    */
  var maximumAge: js.UndefOr[Double] = js.undefined
  /**
    * 是否禁止使用浏览器Geolocation定位，默认值为0
    * 0: 可以使用浏览器定位
    * 1: 手机设备禁止使用浏览器定位
    * 2: PC上禁止使用浏览器定位
    * 3: 所有终端禁止使用浏览器定位
    */
  var noGeoLocation: js.UndefOr[Double] = js.undefined
  /**
    * 是否禁止使用IP定位，默认值为0
    * 0: 可以使用IP定位
    * 1: 手机设备禁止使用IP定位
    * 2: PC上禁止使用IP定位
    * 3: 所有终端禁止使用IP定位
    */
  var noIpLocate: js.UndefOr[Double] = js.undefined
  /**
    * 定位成功后，是否把定位得到的坐标设置为地图中心点坐标
    */
  var panToLocation: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否显示定位按钮
    */
  var showButton: js.UndefOr[Boolean] = js.undefined
  /**
    * 定位成功并且有精度信息时，是否用一个圆圈circle表示精度范围
    */
  var showCircle: js.UndefOr[Boolean] = js.undefined
  /**
    * 定位成功时是否在定位位置显示一个Marker
    */
  var showMarker: js.UndefOr[Boolean] = js.undefined
  var stopWhenPermissionDenied: js.UndefOr[Boolean] = js.undefined
  /**
    * 超时毫秒数
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * 是否使用安卓定位sdk用来进行定位
    */
  var useNative: js.UndefOr[Boolean] = js.undefined
  /**
    * 定位成功且显示精度范围时，是否把地图视野调整到正好显示精度范围
    */
  var zoomToAccuracy: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    GeoLocationFirst: js.UndefOr[Boolean] = js.undefined,
    buttonDom: String | HTMLElement = null,
    buttonOffset: Pixel = null,
    buttonPosition: ButtonPosition = null,
    circleOptions: typings.amapDashJsDashApi.AMap.Circle.Options[_] = null,
    convert: js.UndefOr[Boolean] = js.undefined,
    convertUrl: String = null,
    enableHighAccuracy: js.UndefOr[Boolean] = js.undefined,
    extensions: all | base = null,
    markerOptions: typings.amapDashJsDashApi.AMap.Marker.Options[_] = null,
    maximumAge: Int | Double = null,
    noGeoLocation: Int | Double = null,
    noIpLocate: Int | Double = null,
    panToLocation: js.UndefOr[Boolean] = js.undefined,
    showButton: js.UndefOr[Boolean] = js.undefined,
    showCircle: js.UndefOr[Boolean] = js.undefined,
    showMarker: js.UndefOr[Boolean] = js.undefined,
    stopWhenPermissionDenied: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    useNative: js.UndefOr[Boolean] = js.undefined,
    zoomToAccuracy: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(GeoLocationFirst)) __obj.updateDynamic("GeoLocationFirst")(GeoLocationFirst)
    if (buttonDom != null) __obj.updateDynamic("buttonDom")(buttonDom.asInstanceOf[js.Any])
    if (buttonOffset != null) __obj.updateDynamic("buttonOffset")(buttonOffset)
    if (buttonPosition != null) __obj.updateDynamic("buttonPosition")(buttonPosition)
    if (circleOptions != null) __obj.updateDynamic("circleOptions")(circleOptions)
    if (!js.isUndefined(convert)) __obj.updateDynamic("convert")(convert)
    if (convertUrl != null) __obj.updateDynamic("convertUrl")(convertUrl)
    if (!js.isUndefined(enableHighAccuracy)) __obj.updateDynamic("enableHighAccuracy")(enableHighAccuracy)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (markerOptions != null) __obj.updateDynamic("markerOptions")(markerOptions)
    if (maximumAge != null) __obj.updateDynamic("maximumAge")(maximumAge.asInstanceOf[js.Any])
    if (noGeoLocation != null) __obj.updateDynamic("noGeoLocation")(noGeoLocation.asInstanceOf[js.Any])
    if (noIpLocate != null) __obj.updateDynamic("noIpLocate")(noIpLocate.asInstanceOf[js.Any])
    if (!js.isUndefined(panToLocation)) __obj.updateDynamic("panToLocation")(panToLocation)
    if (!js.isUndefined(showButton)) __obj.updateDynamic("showButton")(showButton)
    if (!js.isUndefined(showCircle)) __obj.updateDynamic("showCircle")(showCircle)
    if (!js.isUndefined(showMarker)) __obj.updateDynamic("showMarker")(showMarker)
    if (!js.isUndefined(stopWhenPermissionDenied)) __obj.updateDynamic("stopWhenPermissionDenied")(stopWhenPermissionDenied)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useNative)) __obj.updateDynamic("useNative")(useNative)
    if (!js.isUndefined(zoomToAccuracy)) __obj.updateDynamic("zoomToAccuracy")(zoomToAccuracy)
    __obj.asInstanceOf[Options]
  }
}

