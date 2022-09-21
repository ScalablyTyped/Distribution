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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geocoder
  extends StObject
     with EventEmitter {
  
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
  
  trait BatchReGeocodeResult extends StObject {
    
    /**
      * 状态说明
      */
    var info: String
    
    /**
      * 批量逆地理编码结果
      */
    var regeocodes: js.Array[ReGeocode]
  }
  object BatchReGeocodeResult {
    
    inline def apply(info: String, regeocodes: js.Array[ReGeocode]): BatchReGeocodeResult = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], regeocodes = regeocodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchReGeocodeResult]
    }
    
    extension [Self <: BatchReGeocodeResult](x: Self) {
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setRegeocodes(value: js.Array[ReGeocode]): Self = StObject.set(x, "regeocodes", value.asInstanceOf[js.Any])
      
      inline def setRegeocodesVarargs(value: ReGeocode*): Self = StObject.set(x, "regeocodes", js.Array(value*))
    }
  }
  
  trait BuildingArea extends StObject {
    
    /**
      * 唯一标识
      */
    var id: String
    
    /**
      * 中心点经纬度
      */
    var location: LngLat
    
    /**
      * 名称
      */
    var name: String
  }
  object BuildingArea {
    
    inline def apply(id: String, location: LngLat, name: String): BuildingArea = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildingArea]
    }
    
    extension [Self <: BuildingArea](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cross extends StObject {
    
    /**
      * 与查询点的相对方位
      */
    var direction: String
    
    /**
      * 道路离查询点最近距离
      */
    var distance: Double
    
    /**
      * 第一条道路id
      */
    var first_id: String
    
    /**
      * 第一条道路名称
      */
    var first_name: String
    
    /**
      * 经纬度
      */
    var location: LngLat
    
    /**
      * 第二条道路id
      */
    var second_id: String
    
    /**
      * 第二条道路名称
      */
    var second_name: String
  }
  object Cross {
    
    inline def apply(
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
    
    extension [Self <: Cross](x: Self) {
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setFirst_id(value: String): Self = StObject.set(x, "first_id", value.asInstanceOf[js.Any])
      
      inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setSecond_id(value: String): Self = StObject.set(x, "second_id", value.asInstanceOf[js.Any])
      
      inline def setSecond_name(value: String): Self = StObject.set(x, "second_name", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventMap extends StObject {
    
    var complete: Event_[
        typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.complete, 
        GeocodeResult | js.Object | ReGeocodeResult | BatchReGeocodeResult
      ]
    
    var error: Event_[typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.error, Info]
  }
  object EventMap {
    
    inline def apply(
      complete: Event_[complete, GeocodeResult | js.Object | ReGeocodeResult | BatchReGeocodeResult],
      error: Event_[error, Info]
    ): EventMap = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    extension [Self <: EventMap](x: Self) {
      
      inline def setComplete(value: Event_[complete, GeocodeResult | js.Object | ReGeocodeResult | BatchReGeocodeResult]): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setError(value: Event_[error, Info]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait Geocode extends StObject {
    
    /**
      * 区域编码
      */
    var adcode: String
    
    /**
      * 地址组成元素
      */
    var addressComponent: GeocodeAddressComponent
    
    /**
      * 格式化地址
      */
    var formattedAddress: String
    
    /**
      * 给定地址匹配级别
      */
    var level: String
    
    /**
      * 坐标
      */
    var location: LngLat
  }
  object Geocode {
    
    inline def apply(
      adcode: String,
      addressComponent: GeocodeAddressComponent,
      formattedAddress: String,
      level: String,
      location: LngLat
    ): Geocode = {
      val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], addressComponent = addressComponent.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[Geocode]
    }
    
    extension [Self <: Geocode](x: Self) {
      
      inline def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
      
      inline def setAddressComponent(value: GeocodeAddressComponent): Self = StObject.set(x, "addressComponent", value.asInstanceOf[js.Any])
      
      inline def setFormattedAddress(value: String): Self = StObject.set(x, "formattedAddress", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  trait GeocodeAddressComponent extends StObject {
    
    /**
      * 楼/大厦
      */
    var building: String
    
    /**
      * 楼类型
      */
    var buildingType: String
    
    /**
      * 城市
      */
    var city: String
    
    /**
      * 城市编码
      */
    var citycode: String
    
    /**
      * 区
      */
    var district: String
    
    /**
      * 社区
      */
    var neighborhood: String
    
    /**
      * 社区类型
      */
    var neighborhoodType: String
    
    /**
      * 省
      */
    var province: String
    
    /**
      * 街道
      */
    var street: String
    
    /**
      * 门牌号
      */
    var streetNumber: String
    
    /**
      * 乡镇
      */
    var township: String
  }
  object GeocodeAddressComponent {
    
    inline def apply(
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
    
    extension [Self <: GeocodeAddressComponent](x: Self) {
      
      inline def setBuilding(value: String): Self = StObject.set(x, "building", value.asInstanceOf[js.Any])
      
      inline def setBuildingType(value: String): Self = StObject.set(x, "buildingType", value.asInstanceOf[js.Any])
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
      
      inline def setDistrict(value: String): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
      
      inline def setNeighborhood(value: String): Self = StObject.set(x, "neighborhood", value.asInstanceOf[js.Any])
      
      inline def setNeighborhoodType(value: String): Self = StObject.set(x, "neighborhoodType", value.asInstanceOf[js.Any])
      
      inline def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
      
      inline def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
      
      inline def setStreetNumber(value: String): Self = StObject.set(x, "streetNumber", value.asInstanceOf[js.Any])
      
      inline def setTownship(value: String): Self = StObject.set(x, "township", value.asInstanceOf[js.Any])
    }
  }
  
  trait GeocodeResult extends StObject {
    
    /**
      * 地理编码结果
      */
    var geocodes: js.Array[Geocode]
    
    /**
      * 状态说明
      */
    var info: String
    
    /**
      * 地理编码结果数目
      */
    var resultNum: String
  }
  object GeocodeResult {
    
    inline def apply(geocodes: js.Array[Geocode], info: String, resultNum: String): GeocodeResult = {
      val __obj = js.Dynamic.literal(geocodes = geocodes.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], resultNum = resultNum.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeocodeResult]
    }
    
    extension [Self <: GeocodeResult](x: Self) {
      
      inline def setGeocodes(value: js.Array[Geocode]): Self = StObject.set(x, "geocodes", value.asInstanceOf[js.Any])
      
      inline def setGeocodesVarargs(value: Geocode*): Self = StObject.set(x, "geocodes", js.Array(value*))
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setResultNum(value: String): Self = StObject.set(x, "resultNum", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * 是否批量查询
      */
    var batch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 城市
      */
    var city: js.UndefOr[String] = js.undefined
    
    /**
      * 是否返回详细信息
      */
    var extensions: js.UndefOr[base | all] = js.undefined
    
    /**
      * 语言类型
      */
    var lang: js.UndefOr[Lang] = js.undefined
    
    /**
      * 中心点
      */
    var radius: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBatch(value: Boolean): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
      
      inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      inline def setExtensions(value: base | all): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setLang(value: Lang): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  trait ReGeocode extends StObject {
    
    /**
      * 地址组成元素
      */
    var addressComponent: ReGeocodeAddressComponent
    
    var aois: js.UndefOr[js.Array[ReGeocodeAoi]] = js.undefined
    
    /**
      * 道路路口列表
      */
    var crosses: js.Array[Cross]
    
    /**
      * 格式化地址
      */
    var formattedAddress: String
    
    /**
      * 兴趣点列表
      */
    var pois: js.Array[ReGeocodePoi]
    
    /**
      * 道路信息列表
      */
    var roads: js.Array[Road]
  }
  object ReGeocode {
    
    inline def apply(
      addressComponent: ReGeocodeAddressComponent,
      crosses: js.Array[Cross],
      formattedAddress: String,
      pois: js.Array[ReGeocodePoi],
      roads: js.Array[Road]
    ): ReGeocode = {
      val __obj = js.Dynamic.literal(addressComponent = addressComponent.asInstanceOf[js.Any], crosses = crosses.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], pois = pois.asInstanceOf[js.Any], roads = roads.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReGeocode]
    }
    
    extension [Self <: ReGeocode](x: Self) {
      
      inline def setAddressComponent(value: ReGeocodeAddressComponent): Self = StObject.set(x, "addressComponent", value.asInstanceOf[js.Any])
      
      inline def setAois(value: js.Array[ReGeocodeAoi]): Self = StObject.set(x, "aois", value.asInstanceOf[js.Any])
      
      inline def setAoisUndefined: Self = StObject.set(x, "aois", js.undefined)
      
      inline def setAoisVarargs(value: ReGeocodeAoi*): Self = StObject.set(x, "aois", js.Array(value*))
      
      inline def setCrosses(value: js.Array[Cross]): Self = StObject.set(x, "crosses", value.asInstanceOf[js.Any])
      
      inline def setCrossesVarargs(value: Cross*): Self = StObject.set(x, "crosses", js.Array(value*))
      
      inline def setFormattedAddress(value: String): Self = StObject.set(x, "formattedAddress", value.asInstanceOf[js.Any])
      
      inline def setPois(value: js.Array[ReGeocodePoi]): Self = StObject.set(x, "pois", value.asInstanceOf[js.Any])
      
      inline def setPoisVarargs(value: ReGeocodePoi*): Self = StObject.set(x, "pois", js.Array(value*))
      
      inline def setRoads(value: js.Array[Road]): Self = StObject.set(x, "roads", value.asInstanceOf[js.Any])
      
      inline def setRoadsVarargs(value: Road*): Self = StObject.set(x, "roads", js.Array(value*))
    }
  }
  
  trait ReGeocodeAddressComponent extends StObject {
    
    /**
      * 区域编码
      */
    var adcode: String
    
    /**
      * 楼/大厦
      */
    var building: String
    
    /**
      * 楼类型
      */
    var buildingType: String
    
    /**
      * 所属商圈信息
      */
    var businessAreas: js.Array[BuildingArea]
    
    /**
      * 城市
      */
    var city: String
    
    /**
      * 城市编码
      */
    var citycode: String
    
    /**
      * 区
      */
    var district: String
    
    /**
      * 社区类型
      */
    var neighborhood: String
    
    /**
      * 社区
      */
    var neighborhoodType: String
    
    /**
      * 省
      */
    var province: String
    
    /**
      * 街道
      */
    var street: String
    
    /**
      * 门牌号
      */
    var streetNumber: String
    
    /**
      * 乡镇
      */
    var township: String
  }
  object ReGeocodeAddressComponent {
    
    inline def apply(
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
    
    extension [Self <: ReGeocodeAddressComponent](x: Self) {
      
      inline def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
      
      inline def setBuilding(value: String): Self = StObject.set(x, "building", value.asInstanceOf[js.Any])
      
      inline def setBuildingType(value: String): Self = StObject.set(x, "buildingType", value.asInstanceOf[js.Any])
      
      inline def setBusinessAreas(value: js.Array[BuildingArea]): Self = StObject.set(x, "businessAreas", value.asInstanceOf[js.Any])
      
      inline def setBusinessAreasVarargs(value: BuildingArea*): Self = StObject.set(x, "businessAreas", js.Array(value*))
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
      
      inline def setDistrict(value: String): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
      
      inline def setNeighborhood(value: String): Self = StObject.set(x, "neighborhood", value.asInstanceOf[js.Any])
      
      inline def setNeighborhoodType(value: String): Self = StObject.set(x, "neighborhoodType", value.asInstanceOf[js.Any])
      
      inline def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
      
      inline def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
      
      inline def setStreetNumber(value: String): Self = StObject.set(x, "streetNumber", value.asInstanceOf[js.Any])
      
      inline def setTownship(value: String): Self = StObject.set(x, "township", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReGeocodeAoi extends StObject {
    
    var adcode: String
    
    var area: String
    
    var id: String
    
    var location: LngLat
    
    var name: String
    
    var `type`: String
  }
  object ReGeocodeAoi {
    
    inline def apply(adcode: String, area: String, id: String, location: LngLat, name: String, `type`: String): ReGeocodeAoi = {
      val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], area = area.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReGeocodeAoi]
    }
    
    extension [Self <: ReGeocodeAoi](x: Self) {
      
      inline def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
      
      inline def setArea(value: String): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReGeocodePoi extends StObject {
    
    /**
      * 址信息
      */
    var address: String
    
    /**
      * 商圈名称
      */
    var businessArea: String
    
    /**
      * 该Poi相对于请求坐标的方向
      */
    var direction: String
    
    /**
      * 该Poi到请求坐标的距离
      */
    var distance: Double
    
    /**
      * 唯一标识
      */
    var id: String
    
    /**
      * 坐标
      */
    var location: LngLat
    
    /**
      * 名称
      */
    var name: String
    
    /**
      * 电话
      */
    var tel: String
    
    /**
      * 类型
      */
    var `type`: String
  }
  object ReGeocodePoi {
    
    inline def apply(
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
    
    extension [Self <: ReGeocodePoi](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setBusinessArea(value: String): Self = StObject.set(x, "businessArea", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTel(value: String): Self = StObject.set(x, "tel", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReGeocodeResult extends StObject {
    
    /**
      * 状态说明
      */
    var info: String
    
    /**
      * 逆地理编码结果
      */
    var regeocode: ReGeocode
  }
  object ReGeocodeResult {
    
    inline def apply(info: String, regeocode: ReGeocode): ReGeocodeResult = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], regeocode = regeocode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReGeocodeResult]
    }
    
    extension [Self <: ReGeocodeResult](x: Self) {
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setRegeocode(value: ReGeocode): Self = StObject.set(x, "regeocode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Road extends StObject {
    
    /**
      * 与查询点的相对方位
      */
    var direction: String
    
    /**
      * 道路离查询点最近距离
      */
    var distance: Double
    
    /**
      * 唯一标识
      */
    var id: String
    
    /**
      * 道路上离查询点最近的点坐标
      */
    var location: LngLat
    
    /**
      * 名称
      */
    var name: String
  }
  object Road {
    
    inline def apply(direction: String, distance: Double, id: String, location: LngLat, name: String): Road = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Road]
    }
    
    extension [Self <: Road](x: Self) {
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.complete
    - typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.no_data
    - typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.error
  */
  trait SearchStatus extends StObject
  object SearchStatus {
    
    inline def complete: typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.complete = "complete".asInstanceOf[typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.complete]
    
    inline def error: typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.error = "error".asInstanceOf[typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.error]
    
    inline def no_data: typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.no_data = "no_data".asInstanceOf[typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.no_data]
  }
}
