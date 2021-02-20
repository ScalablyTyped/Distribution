package typings.amapJsApiGeocoder.AMap

import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApi.AMap.Event_
import typings.amapJsApi.AMap.Lang
import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.LocationValue
import typings.amapJsApiGeocoder.AMap.Geocoder.BatchReGeocodeResult
import typings.amapJsApiGeocoder.AMap.Geocoder.GeocodeResult
import typings.amapJsApiGeocoder.AMap.Geocoder.ReGeocodeResult
import typings.amapJsApiGeocoder.AMap.Geocoder.SearchStatus
import typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.all
import typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.base
import typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.complete
import typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.error
import typings.amapJsApiGeocoder.anon.Info
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geocoder extends EventEmitter {
  
  /**
    * 根据给定坐标进行解析
    * @param locations 坐标数组
    * @param callback 回调
    */
  def getAddress(
    locations: js.Array[LocationValue],
    callback: js.Function2[/* status */ SearchStatus, /* result */ BatchReGeocodeResult | String, Unit]
  ): Unit = js.native
  /**
    * 根据给定坐标进行解析
    * @param location 坐标
    * @param callback 回调
    */
  def getAddress(
    location: LocationValue,
    callback: js.Function2[/* status */ SearchStatus, /* result */ ReGeocodeResult | String, Unit]
  ): Unit = js.native
  
  def getLang(): js.UndefOr[Lang] = js.native
  
  /**
    * 根据给定的地址描述进行解析
    * @param address 地址描述
    * @param callback 回调
    */
  def getLocation(
    address: String,
    callback: js.Function2[/* status */ SearchStatus, /* result */ GeocodeResult | String, Unit]
  ): Unit = js.native
  def getLocation(
    address: js.Array[String],
    callback: js.Function2[/* status */ SearchStatus, /* result */ GeocodeResult | String, Unit]
  ): Unit = js.native
  
  /**
    * 设置地址描述所在城市
    * @param city 城市
    */
  def setCity(): Unit = js.native
  def setCity(city: String): Unit = js.native
  
  // internal
  def setLang(): Unit = js.native
  def setLang(lang: Lang): Unit = js.native
}
object Geocoder {
  
  @js.native
  trait BatchReGeocodeResult extends StObject {
    
    /**
      * 状态说明
      */
    var info: String = js.native
    
    /**
      * 批量逆地理编码结果
      */
    var regeocodes: js.Array[ReGeocode] = js.native
  }
  object BatchReGeocodeResult {
    
    @scala.inline
    def apply(info: String, regeocodes: js.Array[ReGeocode]): BatchReGeocodeResult = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], regeocodes = regeocodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchReGeocodeResult]
    }
    
    @scala.inline
    implicit class BatchReGeocodeResultMutableBuilder[Self <: BatchReGeocodeResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegeocodes(value: js.Array[ReGeocode]): Self = StObject.set(x, "regeocodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegeocodesVarargs(value: ReGeocode*): Self = StObject.set(x, "regeocodes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait BuildingArea extends StObject {
    
    /**
      * 唯一标识
      */
    var id: String = js.native
    
    /**
      * 中心点经纬度
      */
    var location: LngLat = js.native
    
    /**
      * 名称
      */
    var name: String = js.native
  }
  object BuildingArea {
    
    @scala.inline
    def apply(id: String, location: LngLat, name: String): BuildingArea = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildingArea]
    }
    
    @scala.inline
    implicit class BuildingAreaMutableBuilder[Self <: BuildingArea] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Cross extends StObject {
    
    /**
      * 与查询点的相对方位
      */
    var direction: String = js.native
    
    /**
      * 道路离查询点最近距离
      */
    var distance: Double = js.native
    
    /**
      * 第一条道路id
      */
    var first_id: String = js.native
    
    /**
      * 第一条道路名称
      */
    var first_name: String = js.native
    
    /**
      * 经纬度
      */
    var location: LngLat = js.native
    
    /**
      * 第二条道路id
      */
    var second_id: String = js.native
    
    /**
      * 第二条道路名称
      */
    var second_name: String = js.native
  }
  object Cross {
    
    @scala.inline
    def apply(
      direction: String,
      distance: Double,
      first_id: String,
      first_name: String,
      location: LngLat,
      second_id: String,
      second_name: String
    ): Cross = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], first_id = first_id.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], second_id = second_id.asInstanceOf[js.Any], second_name = second_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cross]
    }
    
    @scala.inline
    implicit class CrossMutableBuilder[Self <: Cross] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirst_id(value: String): Self = StObject.set(x, "first_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecond_id(value: String): Self = StObject.set(x, "second_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecond_name(value: String): Self = StObject.set(x, "second_name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventMap extends StObject {
    
    var complete: Event_[
        typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.complete, 
        GeocodeResult | js.Object | ReGeocodeResult | BatchReGeocodeResult
      ] = js.native
    
    var error: Event_[typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.error, Info] = js.native
  }
  object EventMap {
    
    @scala.inline
    def apply(
      complete: Event_[complete, GeocodeResult | js.Object | ReGeocodeResult | BatchReGeocodeResult],
      error: Event_[error, Info]
    ): EventMap = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit class EventMapMutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: Event_[complete, GeocodeResult | js.Object | ReGeocodeResult | BatchReGeocodeResult]): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: Event_[error, Info]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Geocode extends StObject {
    
    /**
      * 区域编码
      */
    var adcode: String = js.native
    
    /**
      * 地址组成元素
      */
    var addressComponent: GeocodeAddressComponent = js.native
    
    /**
      * 格式化地址
      */
    var formattedAddress: String = js.native
    
    /**
      * 给定地址匹配级别
      */
    var level: String = js.native
    
    /**
      * 坐标
      */
    var location: LngLat = js.native
  }
  object Geocode {
    
    @scala.inline
    def apply(
      adcode: String,
      addressComponent: GeocodeAddressComponent,
      formattedAddress: String,
      level: String,
      location: LngLat
    ): Geocode = {
      val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], addressComponent = addressComponent.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[Geocode]
    }
    
    @scala.inline
    implicit class GeocodeMutableBuilder[Self <: Geocode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressComponent(value: GeocodeAddressComponent): Self = StObject.set(x, "addressComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormattedAddress(value: String): Self = StObject.set(x, "formattedAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GeocodeAddressComponent extends StObject {
    
    /**
      * 楼/大厦
      */
    var building: String = js.native
    
    /**
      * 楼类型
      */
    var buildingType: String = js.native
    
    /**
      * 城市
      */
    var city: String = js.native
    
    /**
      * 城市编码
      */
    var citycode: String = js.native
    
    /**
      * 区
      */
    var district: String = js.native
    
    /**
      * 社区
      */
    var neighborhood: String = js.native
    
    /**
      * 社区类型
      */
    var neighborhoodType: String = js.native
    
    /**
      * 省
      */
    var province: String = js.native
    
    /**
      * 街道
      */
    var street: String = js.native
    
    /**
      * 门牌号
      */
    var streetNumber: String = js.native
    
    /**
      * 乡镇
      */
    var township: String = js.native
  }
  object GeocodeAddressComponent {
    
    @scala.inline
    def apply(
      building: String,
      buildingType: String,
      city: String,
      citycode: String,
      district: String,
      neighborhood: String,
      neighborhoodType: String,
      province: String,
      street: String,
      streetNumber: String,
      township: String
    ): GeocodeAddressComponent = {
      val __obj = js.Dynamic.literal(building = building.asInstanceOf[js.Any], buildingType = buildingType.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], neighborhood = neighborhood.asInstanceOf[js.Any], neighborhoodType = neighborhoodType.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], streetNumber = streetNumber.asInstanceOf[js.Any], township = township.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeocodeAddressComponent]
    }
    
    @scala.inline
    implicit class GeocodeAddressComponentMutableBuilder[Self <: GeocodeAddressComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuilding(value: String): Self = StObject.set(x, "building", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildingType(value: String): Self = StObject.set(x, "buildingType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistrict(value: String): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeighborhood(value: String): Self = StObject.set(x, "neighborhood", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeighborhoodType(value: String): Self = StObject.set(x, "neighborhoodType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreetNumber(value: String): Self = StObject.set(x, "streetNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTownship(value: String): Self = StObject.set(x, "township", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GeocodeResult extends StObject {
    
    /**
      * 地理编码结果
      */
    var geocodes: js.Array[Geocode] = js.native
    
    /**
      * 状态说明
      */
    var info: String = js.native
    
    /**
      * 地理编码结果数目
      */
    var resultNum: String = js.native
  }
  object GeocodeResult {
    
    @scala.inline
    def apply(geocodes: js.Array[Geocode], info: String, resultNum: String): GeocodeResult = {
      val __obj = js.Dynamic.literal(geocodes = geocodes.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], resultNum = resultNum.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeocodeResult]
    }
    
    @scala.inline
    implicit class GeocodeResultMutableBuilder[Self <: GeocodeResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGeocodes(value: js.Array[Geocode]): Self = StObject.set(x, "geocodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeocodesVarargs(value: Geocode*): Self = StObject.set(x, "geocodes", js.Array(value :_*))
      
      @scala.inline
      def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultNum(value: String): Self = StObject.set(x, "resultNum", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * 是否批量查询
      */
    var batch: js.UndefOr[Boolean] = js.native
    
    /**
      * 城市
      */
    var city: js.UndefOr[String] = js.native
    
    /**
      * 是否返回详细信息
      */
    var extensions: js.UndefOr[base | all] = js.native
    
    /**
      * 语言类型
      */
    var lang: js.UndefOr[Lang] = js.native
    
    /**
      * 中心点
      */
    var radius: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatch(value: Boolean): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      @scala.inline
      def setExtensions(value: base | all): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setLang(value: Lang): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  @js.native
  trait ReGeocode extends StObject {
    
    /**
      * 地址组成元素
      */
    var addressComponent: ReGeocodeAddressComponent = js.native
    
    var aois: js.UndefOr[js.Array[ReGeocodeAoi]] = js.native
    
    /**
      * 道路路口列表
      */
    var crosses: js.Array[Cross] = js.native
    
    /**
      * 格式化地址
      */
    var formattedAddress: String = js.native
    
    /**
      * 兴趣点列表
      */
    var pois: js.Array[ReGeocodePoi] = js.native
    
    /**
      * 道路信息列表
      */
    var roads: js.Array[Road] = js.native
  }
  object ReGeocode {
    
    @scala.inline
    def apply(
      addressComponent: ReGeocodeAddressComponent,
      crosses: js.Array[Cross],
      formattedAddress: String,
      pois: js.Array[ReGeocodePoi],
      roads: js.Array[Road]
    ): ReGeocode = {
      val __obj = js.Dynamic.literal(addressComponent = addressComponent.asInstanceOf[js.Any], crosses = crosses.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], pois = pois.asInstanceOf[js.Any], roads = roads.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReGeocode]
    }
    
    @scala.inline
    implicit class ReGeocodeMutableBuilder[Self <: ReGeocode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddressComponent(value: ReGeocodeAddressComponent): Self = StObject.set(x, "addressComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAois(value: js.Array[ReGeocodeAoi]): Self = StObject.set(x, "aois", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAoisUndefined: Self = StObject.set(x, "aois", js.undefined)
      
      @scala.inline
      def setAoisVarargs(value: ReGeocodeAoi*): Self = StObject.set(x, "aois", js.Array(value :_*))
      
      @scala.inline
      def setCrosses(value: js.Array[Cross]): Self = StObject.set(x, "crosses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossesVarargs(value: Cross*): Self = StObject.set(x, "crosses", js.Array(value :_*))
      
      @scala.inline
      def setFormattedAddress(value: String): Self = StObject.set(x, "formattedAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPois(value: js.Array[ReGeocodePoi]): Self = StObject.set(x, "pois", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoisVarargs(value: ReGeocodePoi*): Self = StObject.set(x, "pois", js.Array(value :_*))
      
      @scala.inline
      def setRoads(value: js.Array[Road]): Self = StObject.set(x, "roads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoadsVarargs(value: Road*): Self = StObject.set(x, "roads", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ReGeocodeAddressComponent extends StObject {
    
    /**
      * 区域编码
      */
    var adcode: String = js.native
    
    /**
      * 楼/大厦
      */
    var building: String = js.native
    
    /**
      * 楼类型
      */
    var buildingType: String = js.native
    
    /**
      * 所属商圈信息
      */
    var businessAreas: js.Array[BuildingArea] = js.native
    
    /**
      * 城市
      */
    var city: String = js.native
    
    /**
      * 城市编码
      */
    var citycode: String = js.native
    
    /**
      * 区
      */
    var district: String = js.native
    
    /**
      * 社区类型
      */
    var neighborhood: String = js.native
    
    /**
      * 社区
      */
    var neighborhoodType: String = js.native
    
    /**
      * 省
      */
    var province: String = js.native
    
    /**
      * 街道
      */
    var street: String = js.native
    
    /**
      * 门牌号
      */
    var streetNumber: String = js.native
    
    /**
      * 乡镇
      */
    var township: String = js.native
  }
  object ReGeocodeAddressComponent {
    
    @scala.inline
    def apply(
      adcode: String,
      building: String,
      buildingType: String,
      businessAreas: js.Array[BuildingArea],
      city: String,
      citycode: String,
      district: String,
      neighborhood: String,
      neighborhoodType: String,
      province: String,
      street: String,
      streetNumber: String,
      township: String
    ): ReGeocodeAddressComponent = {
      val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], building = building.asInstanceOf[js.Any], buildingType = buildingType.asInstanceOf[js.Any], businessAreas = businessAreas.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], neighborhood = neighborhood.asInstanceOf[js.Any], neighborhoodType = neighborhoodType.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], streetNumber = streetNumber.asInstanceOf[js.Any], township = township.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReGeocodeAddressComponent]
    }
    
    @scala.inline
    implicit class ReGeocodeAddressComponentMutableBuilder[Self <: ReGeocodeAddressComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuilding(value: String): Self = StObject.set(x, "building", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildingType(value: String): Self = StObject.set(x, "buildingType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBusinessAreas(value: js.Array[BuildingArea]): Self = StObject.set(x, "businessAreas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBusinessAreasVarargs(value: BuildingArea*): Self = StObject.set(x, "businessAreas", js.Array(value :_*))
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistrict(value: String): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeighborhood(value: String): Self = StObject.set(x, "neighborhood", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeighborhoodType(value: String): Self = StObject.set(x, "neighborhoodType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreetNumber(value: String): Self = StObject.set(x, "streetNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTownship(value: String): Self = StObject.set(x, "township", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReGeocodeAoi extends StObject {
    
    var adcode: String = js.native
    
    var area: String = js.native
    
    var id: String = js.native
    
    var location: LngLat = js.native
    
    var name: String = js.native
    
    var `type`: String = js.native
  }
  object ReGeocodeAoi {
    
    @scala.inline
    def apply(adcode: String, area: String, id: String, location: LngLat, name: String, `type`: String): ReGeocodeAoi = {
      val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], area = area.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReGeocodeAoi]
    }
    
    @scala.inline
    implicit class ReGeocodeAoiMutableBuilder[Self <: ReGeocodeAoi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArea(value: String): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReGeocodePoi extends StObject {
    
    /**
      * 址信息
      */
    var address: String = js.native
    
    /**
      * 商圈名称
      */
    var businessArea: String = js.native
    
    /**
      * 该Poi相对于请求坐标的方向
      */
    var direction: String = js.native
    
    /**
      * 该Poi到请求坐标的距离
      */
    var distance: Double = js.native
    
    /**
      * 唯一标识
      */
    var id: String = js.native
    
    /**
      * 坐标
      */
    var location: LngLat = js.native
    
    /**
      * 名称
      */
    var name: String = js.native
    
    /**
      * 电话
      */
    var tel: String = js.native
    
    /**
      * 类型
      */
    var `type`: String = js.native
  }
  object ReGeocodePoi {
    
    @scala.inline
    def apply(
      address: String,
      businessArea: String,
      direction: String,
      distance: Double,
      id: String,
      location: LngLat,
      name: String,
      tel: String,
      `type`: String
    ): ReGeocodePoi = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], businessArea = businessArea.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tel = tel.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReGeocodePoi]
    }
    
    @scala.inline
    implicit class ReGeocodePoiMutableBuilder[Self <: ReGeocodePoi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBusinessArea(value: String): Self = StObject.set(x, "businessArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTel(value: String): Self = StObject.set(x, "tel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReGeocodeResult extends StObject {
    
    /**
      * 状态说明
      */
    var info: String = js.native
    
    /**
      * 逆地理编码结果
      */
    var regeocode: ReGeocode = js.native
  }
  object ReGeocodeResult {
    
    @scala.inline
    def apply(info: String, regeocode: ReGeocode): ReGeocodeResult = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], regeocode = regeocode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReGeocodeResult]
    }
    
    @scala.inline
    implicit class ReGeocodeResultMutableBuilder[Self <: ReGeocodeResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegeocode(value: ReGeocode): Self = StObject.set(x, "regeocode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Road extends StObject {
    
    /**
      * 与查询点的相对方位
      */
    var direction: String = js.native
    
    /**
      * 道路离查询点最近距离
      */
    var distance: Double = js.native
    
    /**
      * 唯一标识
      */
    var id: String = js.native
    
    /**
      * 道路上离查询点最近的点坐标
      */
    var location: LngLat = js.native
    
    /**
      * 名称
      */
    var name: String = js.native
  }
  object Road {
    
    @scala.inline
    def apply(direction: String, distance: Double, id: String, location: LngLat, name: String): Road = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Road]
    }
    
    @scala.inline
    implicit class RoadMutableBuilder[Self <: Road] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.complete
    - typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.no_data
    - typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.error
  */
  trait SearchStatus extends StObject
  object SearchStatus {
    
    @scala.inline
    def complete: typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.complete = "complete".asInstanceOf[typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.complete]
    
    @scala.inline
    def error: typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.error = "error".asInstanceOf[typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.error]
    
    @scala.inline
    def no_data: typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.no_data = "no_data".asInstanceOf[typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.no_data]
  }
}
