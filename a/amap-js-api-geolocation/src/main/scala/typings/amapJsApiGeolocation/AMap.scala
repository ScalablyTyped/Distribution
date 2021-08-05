package typings.amapJsApiGeolocation

import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApi.AMap.Event_
import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.Pixel
import typings.amapJsApiGeocoder.AMap.Geocoder.Cross
import typings.amapJsApiGeocoder.AMap.Geocoder.ReGeocode
import typings.amapJsApiGeocoder.AMap.Geocoder.ReGeocodeAddressComponent
import typings.amapJsApiGeocoder.AMap.Geocoder.ReGeocodePoi
import typings.amapJsApiGeocoder.AMap.Geocoder.Road
import typings.amapJsApiGeolocation.AMap.Geolocation.CityResult
import typings.amapJsApiGeolocation.AMap.Geolocation.ErrorStatus
import typings.amapJsApiGeolocation.AMap.Geolocation.GeolocationResult
import typings.amapJsApiGeolocation.AMap.Geolocation.SearchStatus
import typings.amapJsApiGeolocation.amapJsApiGeolocationNumbers.`0`
import typings.amapJsApiGeolocation.amapJsApiGeolocationNumbers.`1`
import typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.all
import typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.base
import typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.complete
import typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.error
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  @js.native
  trait Geolocation
    extends StObject
       with EventEmitter {
    
    /**
      * 取消对当前位置的监控
      * @param wathcId 监控id
      */
    def clearWatch(wathcId: String): js.UndefOr[String] = js.native
    
    /**
      * 进行IP城市查询
      * @param callback 回调
      */
    def getCityInfo(callback: js.Function2[/* status */ SearchStatus, /* result */ CityResult | ErrorStatus, Unit]): Unit = js.native
    
    /**
      * 获取用户当前的精确位置信息
      * @param callback 回调
      */
    def getCurrentPosition(
      callback: js.Function2[/* status */ SearchStatus, /* result */ GeolocationResult | ErrorStatus, Unit]
    ): Unit = js.native
    
    /**
      * 是否支持浏览器定位
      */
    def isSupported(): Boolean = js.native
    
    /**
      * 使用浏览器定位接口监控当前位置，移动端有效
      */
    def watchPosition(): js.UndefOr[String | Null] = js.native
  }
  object Geolocation {
    
    /* Rewritten from type alias, can be one of: 
      - typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.LT
      - typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.LB
      - typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.RT
      - typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.RB
    */
    trait ButtonPosition extends StObject
    object ButtonPosition {
      
      inline def LB: typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.LB = "LB".asInstanceOf[typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.LB]
      
      inline def LT: typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.LT = "LT".asInstanceOf[typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.LT]
      
      inline def RB: typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.RB = "RB".asInstanceOf[typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.RB]
      
      inline def RT: typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.RT = "RT".asInstanceOf[typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.RT]
    }
    
    trait CityResult extends StObject {
      
      /**
        * 区域编码
        */
      var adcode: String
      
      /**
        * 范围
        */
      var bounds: js.Array[Double]
      
      /**
        * 中心点
        */
      var center: js.Tuple2[Double, Double]
      
      /**
        * 城市
        */
      var city: String
      
      /**
        * 城市编码
        */
      var citycode: String
      
      /**
        * 国家
        */
      var country: String
      
      /**
        * 状态信息
        */
      var info: String
      
      /**
        * 是否已转换成高德坐标
        */
      var isConverted: Boolean
      
      /**
        * 信息描述
        */
      var message: String
      
      /**
        * 省份
        */
      var province: String
      
      /**
        * 状态码
        */
      var status: `1`
    }
    object CityResult {
      
      inline def apply(
        adcode: String,
        bounds: js.Array[Double],
        center: js.Tuple2[Double, Double],
        city: String,
        citycode: String,
        country: String,
        info: String,
        isConverted: Boolean,
        message: String,
        province: String
      ): CityResult = {
        val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], isConverted = isConverted.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], status = 1)
        __obj.asInstanceOf[CityResult]
      }
      
      extension [Self <: CityResult](x: Self) {
        
        inline def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
        
        inline def setBounds(value: js.Array[Double]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
        
        inline def setBoundsVarargs(value: Double*): Self = StObject.set(x, "bounds", js.Array(value :_*))
        
        inline def setCenter(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
        
        inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
        
        inline def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
        
        inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
        
        inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        inline def setIsConverted(value: Boolean): Self = StObject.set(x, "isConverted", value.asInstanceOf[js.Any])
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: `1`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    trait ErrorStatus extends StObject {
      
      /**
        * 错误信息
        */
      var info: String
      
      /**
        * 造成定位失败结果的一些有用信息
        */
      var message: String
      
      /**
        * 状态码
        */
      var status: `0`
    }
    object ErrorStatus {
      
      inline def apply(info: String, message: String): ErrorStatus = {
        val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = 0)
        __obj.asInstanceOf[ErrorStatus]
      }
      
      extension [Self <: ErrorStatus](x: Self) {
        
        inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: `0`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    trait EventMap extends StObject {
      
      var complete: Event_[
            typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.complete, 
            GeolocationResult
          ]
      
      var error: Event_[typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.error, ErrorStatus]
    }
    object EventMap {
      
      inline def apply(complete: Event_[complete, GeolocationResult], error: Event_[error, ErrorStatus]): EventMap = {
        val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventMap]
      }
      
      extension [Self <: EventMap](x: Self) {
        
        inline def setComplete(value: Event_[complete, GeolocationResult]): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
        
        inline def setError(value: Event_[error, ErrorStatus]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      }
    }
    
    trait GeolocationResult
      extends StObject
         with ReGeocode {
      
      /**
        * 精度
        */
      var accuracy: Double | Null
      
      /**
        * 状态信息
        */
      var info: String
      
      /**
        * 是否已经转换成高德坐标
        */
      var isConverted: Boolean
      
      /**
        * 定位结果的来源
        */
      var location_type: LocationType
      
      /**
        * 形成当前定位结果的一些信息
        */
      var message: String
      
      /**
        * 定位结果
        */
      var position: LngLat
      
      /**
        * 状态码
        */
      var status: `1`
    }
    object GeolocationResult {
      
      inline def apply(
        addressComponent: ReGeocodeAddressComponent,
        crosses: js.Array[Cross],
        formattedAddress: String,
        info: String,
        isConverted: Boolean,
        location_type: LocationType,
        message: String,
        pois: js.Array[ReGeocodePoi],
        position: LngLat,
        roads: js.Array[Road]
      ): GeolocationResult = {
        val __obj = js.Dynamic.literal(addressComponent = addressComponent.asInstanceOf[js.Any], crosses = crosses.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], isConverted = isConverted.asInstanceOf[js.Any], location_type = location_type.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], pois = pois.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], roads = roads.asInstanceOf[js.Any], status = 1, accuracy = null)
        __obj.asInstanceOf[GeolocationResult]
      }
      
      extension [Self <: GeolocationResult](x: Self) {
        
        inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
        
        inline def setAccuracyNull: Self = StObject.set(x, "accuracy", null)
        
        inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        inline def setIsConverted(value: Boolean): Self = StObject.set(x, "isConverted", value.asInstanceOf[js.Any])
        
        inline def setLocation_type(value: LocationType): Self = StObject.set(x, "location_type", value.asInstanceOf[js.Any])
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setPosition(value: LngLat): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: `1`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.html5
      - typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.ip
      - typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.sdk
    */
    trait LocationType extends StObject
    object LocationType {
      
      inline def html5: typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.html5 = "html5".asInstanceOf[typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.html5]
      
      inline def ip: typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.ip = "ip".asInstanceOf[typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.ip]
      
      inline def sdk: typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.sdk = "sdk".asInstanceOf[typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.sdk]
    }
    
    trait Options extends StObject {
      
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
      var circleOptions: js.UndefOr[typings.amapJsApi.AMap.Circle.Options[js.Any]] = js.undefined
      
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
      var markerOptions: js.UndefOr[typings.amapJsApi.AMap.Marker.Options[js.Any]] = js.undefined
      
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
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setButtonDom(value: String | HTMLElement): Self = StObject.set(x, "buttonDom", value.asInstanceOf[js.Any])
        
        inline def setButtonDomUndefined: Self = StObject.set(x, "buttonDom", js.undefined)
        
        inline def setButtonOffset(value: Pixel): Self = StObject.set(x, "buttonOffset", value.asInstanceOf[js.Any])
        
        inline def setButtonOffsetUndefined: Self = StObject.set(x, "buttonOffset", js.undefined)
        
        inline def setButtonPosition(value: ButtonPosition): Self = StObject.set(x, "buttonPosition", value.asInstanceOf[js.Any])
        
        inline def setButtonPositionUndefined: Self = StObject.set(x, "buttonPosition", js.undefined)
        
        inline def setCircleOptions(value: typings.amapJsApi.AMap.Circle.Options[js.Any]): Self = StObject.set(x, "circleOptions", value.asInstanceOf[js.Any])
        
        inline def setCircleOptionsUndefined: Self = StObject.set(x, "circleOptions", js.undefined)
        
        inline def setConvert(value: Boolean): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
        
        inline def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
        
        inline def setConvertUrl(value: String): Self = StObject.set(x, "convertUrl", value.asInstanceOf[js.Any])
        
        inline def setConvertUrlUndefined: Self = StObject.set(x, "convertUrl", js.undefined)
        
        inline def setEnableHighAccuracy(value: Boolean): Self = StObject.set(x, "enableHighAccuracy", value.asInstanceOf[js.Any])
        
        inline def setEnableHighAccuracyUndefined: Self = StObject.set(x, "enableHighAccuracy", js.undefined)
        
        inline def setExtensions(value: all | base): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
        
        inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
        
        inline def setGeoLocationFirst(value: Boolean): Self = StObject.set(x, "GeoLocationFirst", value.asInstanceOf[js.Any])
        
        inline def setGeoLocationFirstUndefined: Self = StObject.set(x, "GeoLocationFirst", js.undefined)
        
        inline def setMarkerOptions(value: typings.amapJsApi.AMap.Marker.Options[js.Any]): Self = StObject.set(x, "markerOptions", value.asInstanceOf[js.Any])
        
        inline def setMarkerOptionsUndefined: Self = StObject.set(x, "markerOptions", js.undefined)
        
        inline def setMaximumAge(value: Double): Self = StObject.set(x, "maximumAge", value.asInstanceOf[js.Any])
        
        inline def setMaximumAgeUndefined: Self = StObject.set(x, "maximumAge", js.undefined)
        
        inline def setNoGeoLocation(value: Double): Self = StObject.set(x, "noGeoLocation", value.asInstanceOf[js.Any])
        
        inline def setNoGeoLocationUndefined: Self = StObject.set(x, "noGeoLocation", js.undefined)
        
        inline def setNoIpLocate(value: Double): Self = StObject.set(x, "noIpLocate", value.asInstanceOf[js.Any])
        
        inline def setNoIpLocateUndefined: Self = StObject.set(x, "noIpLocate", js.undefined)
        
        inline def setPanToLocation(value: Boolean): Self = StObject.set(x, "panToLocation", value.asInstanceOf[js.Any])
        
        inline def setPanToLocationUndefined: Self = StObject.set(x, "panToLocation", js.undefined)
        
        inline def setShowButton(value: Boolean): Self = StObject.set(x, "showButton", value.asInstanceOf[js.Any])
        
        inline def setShowButtonUndefined: Self = StObject.set(x, "showButton", js.undefined)
        
        inline def setShowCircle(value: Boolean): Self = StObject.set(x, "showCircle", value.asInstanceOf[js.Any])
        
        inline def setShowCircleUndefined: Self = StObject.set(x, "showCircle", js.undefined)
        
        inline def setShowMarker(value: Boolean): Self = StObject.set(x, "showMarker", value.asInstanceOf[js.Any])
        
        inline def setShowMarkerUndefined: Self = StObject.set(x, "showMarker", js.undefined)
        
        inline def setStopWhenPermissionDenied(value: Boolean): Self = StObject.set(x, "stopWhenPermissionDenied", value.asInstanceOf[js.Any])
        
        inline def setStopWhenPermissionDeniedUndefined: Self = StObject.set(x, "stopWhenPermissionDenied", js.undefined)
        
        inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
        
        inline def setUseNative(value: Boolean): Self = StObject.set(x, "useNative", value.asInstanceOf[js.Any])
        
        inline def setUseNativeUndefined: Self = StObject.set(x, "useNative", js.undefined)
        
        inline def setZoomToAccuracy(value: Boolean): Self = StObject.set(x, "zoomToAccuracy", value.asInstanceOf[js.Any])
        
        inline def setZoomToAccuracyUndefined: Self = StObject.set(x, "zoomToAccuracy", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.complete
      - typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.error
    */
    trait SearchStatus extends StObject
    object SearchStatus {
      
      inline def complete: typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.complete = "complete".asInstanceOf[typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.complete]
      
      inline def error: typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.error = "error".asInstanceOf[typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.error]
    }
  }
}
