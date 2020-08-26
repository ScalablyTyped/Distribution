package typings.amapJsApiGeolocation.AMap.Geolocation

import typings.amapJsApi.AMap.Pixel
import typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.all
import typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.base
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * 是否PC端为优先使用浏览器定位
    */
  var GeoLocationFirst: js.UndefOr[Boolean] = js.native
  /**
    * 自定义定位按钮的内容
    */
  var buttonDom: js.UndefOr[String | HTMLElement] = js.native
  /**
    * 按钮距离停靠位置的偏移量
    */
  var buttonOffset: js.UndefOr[Pixel] = js.native
  /**
    * 定位按钮可停靠的位置
    * “LT”：左上角
    * “LB”：左下角
    * “RT”：右上角
    * “RB”：右下角
    */
  var buttonPosition: js.UndefOr[ButtonPosition] = js.native
  /**
    * 定位点Circle的配置
    */
  var circleOptions: js.UndefOr[typings.amapJsApi.AMap.Circle.Options[_]] = js.native
  /**
    * 是否转换成高德坐标
    */
  var convert: js.UndefOr[Boolean] = js.native
  // internal
  var convertUrl: js.UndefOr[String] = js.native
  /**
    * 是否使用高精度
    */
  var enableHighAccuracy: js.UndefOr[Boolean] = js.native
  /**
    * 是否返回详细信息
    */
  var extensions: js.UndefOr[all | base] = js.native
  /**
    * 定位点Marker的配置
    */
  var markerOptions: js.UndefOr[typings.amapJsApi.AMap.Marker.Options[_]] = js.native
  /**
    * 缓存毫秒数
    */
  var maximumAge: js.UndefOr[Double] = js.native
  /**
    * 是否禁止使用浏览器Geolocation定位，默认值为0
    * 0: 可以使用浏览器定位
    * 1: 手机设备禁止使用浏览器定位
    * 2: PC上禁止使用浏览器定位
    * 3: 所有终端禁止使用浏览器定位
    */
  var noGeoLocation: js.UndefOr[Double] = js.native
  /**
    * 是否禁止使用IP定位，默认值为0
    * 0: 可以使用IP定位
    * 1: 手机设备禁止使用IP定位
    * 2: PC上禁止使用IP定位
    * 3: 所有终端禁止使用IP定位
    */
  var noIpLocate: js.UndefOr[Double] = js.native
  /**
    * 定位成功后，是否把定位得到的坐标设置为地图中心点坐标
    */
  var panToLocation: js.UndefOr[Boolean] = js.native
  /**
    * 是否显示定位按钮
    */
  var showButton: js.UndefOr[Boolean] = js.native
  /**
    * 定位成功并且有精度信息时，是否用一个圆圈circle表示精度范围
    */
  var showCircle: js.UndefOr[Boolean] = js.native
  /**
    * 定位成功时是否在定位位置显示一个Marker
    */
  var showMarker: js.UndefOr[Boolean] = js.native
  var stopWhenPermissionDenied: js.UndefOr[Boolean] = js.native
  /**
    * 超时毫秒数
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * 是否使用安卓定位sdk用来进行定位
    */
  var useNative: js.UndefOr[Boolean] = js.native
  /**
    * 定位成功且显示精度范围时，是否把地图视野调整到正好显示精度范围
    */
  var zoomToAccuracy: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGeoLocationFirst(value: Boolean): Self = this.set("GeoLocationFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeoLocationFirst: Self = this.set("GeoLocationFirst", js.undefined)
    @scala.inline
    def setButtonDom(value: String | HTMLElement): Self = this.set("buttonDom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonDom: Self = this.set("buttonDom", js.undefined)
    @scala.inline
    def setButtonOffset(value: Pixel): Self = this.set("buttonOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonOffset: Self = this.set("buttonOffset", js.undefined)
    @scala.inline
    def setButtonPosition(value: ButtonPosition): Self = this.set("buttonPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonPosition: Self = this.set("buttonPosition", js.undefined)
    @scala.inline
    def setCircleOptions(value: typings.amapJsApi.AMap.Circle.Options[_]): Self = this.set("circleOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircleOptions: Self = this.set("circleOptions", js.undefined)
    @scala.inline
    def setConvert(value: Boolean): Self = this.set("convert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConvert: Self = this.set("convert", js.undefined)
    @scala.inline
    def setConvertUrl(value: String): Self = this.set("convertUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConvertUrl: Self = this.set("convertUrl", js.undefined)
    @scala.inline
    def setEnableHighAccuracy(value: Boolean): Self = this.set("enableHighAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableHighAccuracy: Self = this.set("enableHighAccuracy", js.undefined)
    @scala.inline
    def setExtensions(value: all | base): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setMarkerOptions(value: typings.amapJsApi.AMap.Marker.Options[_]): Self = this.set("markerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerOptions: Self = this.set("markerOptions", js.undefined)
    @scala.inline
    def setMaximumAge(value: Double): Self = this.set("maximumAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumAge: Self = this.set("maximumAge", js.undefined)
    @scala.inline
    def setNoGeoLocation(value: Double): Self = this.set("noGeoLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoGeoLocation: Self = this.set("noGeoLocation", js.undefined)
    @scala.inline
    def setNoIpLocate(value: Double): Self = this.set("noIpLocate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoIpLocate: Self = this.set("noIpLocate", js.undefined)
    @scala.inline
    def setPanToLocation(value: Boolean): Self = this.set("panToLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanToLocation: Self = this.set("panToLocation", js.undefined)
    @scala.inline
    def setShowButton(value: Boolean): Self = this.set("showButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowButton: Self = this.set("showButton", js.undefined)
    @scala.inline
    def setShowCircle(value: Boolean): Self = this.set("showCircle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCircle: Self = this.set("showCircle", js.undefined)
    @scala.inline
    def setShowMarker(value: Boolean): Self = this.set("showMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMarker: Self = this.set("showMarker", js.undefined)
    @scala.inline
    def setStopWhenPermissionDenied(value: Boolean): Self = this.set("stopWhenPermissionDenied", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopWhenPermissionDenied: Self = this.set("stopWhenPermissionDenied", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUseNative(value: Boolean): Self = this.set("useNative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseNative: Self = this.set("useNative", js.undefined)
    @scala.inline
    def setZoomToAccuracy(value: Boolean): Self = this.set("zoomToAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomToAccuracy: Self = this.set("zoomToAccuracy", js.undefined)
  }
  
}

