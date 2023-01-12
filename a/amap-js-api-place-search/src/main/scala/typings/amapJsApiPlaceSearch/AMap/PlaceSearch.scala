package typings.amapJsApiPlaceSearch.AMap

import typings.amapJsApi.AMap.Bounds
import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApi.AMap.Event_
import typings.amapJsApi.AMap.Lang
import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.LocationValue
import typings.amapJsApi.AMap.Map
import typings.amapJsApi.AMap.MapsEvent
import typings.amapJsApi.AMap.Marker
import typings.amapJsApi.AMap.Polygon
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.SearchResult
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.SearchStatus
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.all
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.base
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.click
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.complete
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.default
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.error
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.infoWindowClick
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementClick
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementDetroyed
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerClick
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerDestoryed
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.newpc
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.renderComplete
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.selectChanged
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.willClear
import typings.amapJsApiPlaceSearch.anon.Adcode
import typings.amapJsApiPlaceSearch.anon.Data
import typings.amapJsApiPlaceSearch.anon.Deeptype
import typings.amapJsApiPlaceSearch.anon.Event
import typings.amapJsApiPlaceSearch.anon.Id
import typings.amapJsApiPlaceSearch.anon.Indoordata
import typings.amapJsApiPlaceSearch.anon.Indoormap
import typings.amapJsApiPlaceSearch.anon.Info
import typings.amapJsApiPlaceSearch.anon.LastSelected
import typings.amapJsApiPlaceSearch.anon.ListElements
import typings.amapJsApiPlaceSearch.anon.SelectChangeEventDataeven
import typings.std.HTMLElement
import typings.std.HTMLLIElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaceSearch
  extends StObject
     with EventEmitter {
  
  /**
    * 清除搜索结果
    */
  def clear(): Unit = js.native
  
  def close(): Unit = js.native
  
  /**
    * 唤起高德地图客户端POI详情页
    * @param obj 唤起参数
    */
  def detailOnAMAP(obj: Id): Unit = js.native
  
  /**
    * 根据POIID 查询POI 详细信息
    * @param POIID POIID
    * @param callback 搜索回调
    */
  def getDetails(
    POIID: String,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResult, Unit]
  ): Unit = js.native
  
  /**
    * 获取检索语言类型
    */
  def getLang(): js.UndefOr[Lang] = js.native
  
  // internal
  def open(): Unit = js.native
  
  /**
    * 唤起高德地图客户端marker页
    * @param obj 唤起参数
    */
  def poiOnAMAP(obj: Id): Unit = js.native
  
  /**
    * 根据关键字搜索
    * @param keyword 根据关键字搜索
    * @param callback 回调
    */
  def search(
    keyword: String,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResult, Unit]
  ): Unit = js.native
  
  /**
    * 根据范围和关键词进行范围查询
    * @param keyword 关键字
    * @param bounds 搜索范围
    * @param callback 回调
    */
  def searchInBounds(
    keyword: String,
    bounds: Bounds,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResult, Unit]
  ): Unit = js.native
  def searchInBounds(
    keyword: String,
    bounds: Polygon[Any],
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResult, Unit]
  ): Unit = js.native
  
  /**
    * 周边查询
    * @param keyword 关键字
    * @param center 搜索中心
    * @param radius 搜索半径
    * @param callback 回调
    */
  def searchNearBy(
    keyword: String,
    center: LocationValue,
    radius: Double,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResult, Unit]
  ): Unit = js.native
  
  /**
    * 设置查询城市
    * @param city 城市
    */
  def setCity(): Unit = js.native
  def setCity(city: String): Unit = js.native
  
  /**
    * 设置是否强制限制城市
    * @param limit 是否强制限制城市
    */
  def setCityLimit(): Unit = js.native
  def setCityLimit(limit: Boolean): Unit = js.native
  
  /**
    * 设置检索语言类型
    * @param lang 语言类型
    */
  def setLang(): Unit = js.native
  def setLang(lang: Lang): Unit = js.native
  
  /**
    * 设置查询结果特定页数
    * @param pageIndex 页码
    */
  def setPageIndex(): Unit = js.native
  def setPageIndex(pageIndex: Double): Unit = js.native
  
  /**
    * 设置查询单页结果数
    * @param pageSize 结果数
    */
  def setPageSize(): Unit = js.native
  def setPageSize(pageSize: Double): Unit = js.native
  
  /**
    * 设置查询类别
    * @param type 查询类别
    */
  def setType(): Unit = js.native
  def setType(`type`: String): Unit = js.native
}
object PlaceSearch {
  
  trait Cinema extends StObject {
    
    /**
      * 信息来源
      */
    var deep_src: String
    
    /**
      * 简介
      */
    var intro: String
    
    /**
      * 非规范格式的营业时间
      */
    var opentime: String
    
    /**
      * 规范格式的营业时间
      */
    var opentime_GDF: String
    
    /**
      * 停车场设施
      */
    var parking: String
    
    /**
      * 图片信息列表
      */
    var photos: js.Array[PoiPhoto]
    
    /**
      * 综合评分
      */
    var rating: String
  }
  object Cinema {
    
    inline def apply(
      deep_src: String,
      intro: String,
      opentime: String,
      opentime_GDF: String,
      parking: String,
      photos: js.Array[PoiPhoto],
      rating: String
    ): Cinema = {
      val __obj = js.Dynamic.literal(deep_src = deep_src.asInstanceOf[js.Any], intro = intro.asInstanceOf[js.Any], opentime = opentime.asInstanceOf[js.Any], opentime_GDF = opentime_GDF.asInstanceOf[js.Any], parking = parking.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cinema]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cinema] (val x: Self) extends AnyVal {
      
      inline def setDeep_src(value: String): Self = StObject.set(x, "deep_src", value.asInstanceOf[js.Any])
      
      inline def setIntro(value: String): Self = StObject.set(x, "intro", value.asInstanceOf[js.Any])
      
      inline def setOpentime(value: String): Self = StObject.set(x, "opentime", value.asInstanceOf[js.Any])
      
      inline def setOpentime_GDF(value: String): Self = StObject.set(x, "opentime_GDF", value.asInstanceOf[js.Any])
      
      inline def setParking(value: String): Self = StObject.set(x, "parking", value.asInstanceOf[js.Any])
      
      inline def setPhotos(value: js.Array[PoiPhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      inline def setPhotosVarargs(value: PoiPhoto*): Self = StObject.set(x, "photos", js.Array(value*))
      
      inline def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    }
  }
  
  trait CityInfo extends StObject {
    
    /**
      * 行政区编码
      */
    var adcode: String
    
    /**
      * 城市编码
      */
    var citycode: String
    
    /**
      * 该城市的建议结果数目
      */
    var count: Double
    
    /**
      * 建议城市名称
      */
    var name: String
  }
  object CityInfo {
    
    inline def apply(adcode: String, citycode: String, count: Double, name: String): CityInfo = {
      val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CityInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CityInfo] (val x: Self) extends AnyVal {
      
      inline def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
      
      inline def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dining extends StObject {
    
    /**
      * 餐厅特色
      */
    var addition: String
    
    /**
      * 氛围
      */
    var atmosphere: String
    
    /**
      * 人均消费
      */
    var cost: String
    
    /**
      * 单数据源的评分
      */
    var cp_rating: String
    
    /**
      * 菜系
      */
    var cuisines: String
    
    /**
      * 信息来源
      */
    var deep_src: String
    
    /**
      * 环境评分
      */
    var environment_rating: String
    
    /**
      * 简介
      */
    var intro: String
    
    /**
      * 非规范格式的营业时间
      */
    var opentime: String
    
    /**
      * 规范格式的营业时间
      */
    var opentime_GDF: String
    
    /**
      * 订餐APP URL
      */
    var ordering_app_url: String
    
    /**
      * 订餐wap链接
      */
    var ordering_wap_url: String
    
    /**
      * 订餐web链接
      */
    var ordering_web_url: String
    
    /**
      * 图片信息列表
      */
    var photos: js.Array[PoiPhoto]
    
    /**
      * 综合评分
      */
    var rating: String
    
    /**
      * 特色菜
      */
    var recommend: String
    
    /**
      * 服务评分
      */
    var service_rating: String
    
    /**
      * 标签
      */
    var tag: String
    
    /**
      * 口味评分
      */
    var taste_rating: String
  }
  object Dining {
    
    inline def apply(
      addition: String,
      atmosphere: String,
      cost: String,
      cp_rating: String,
      cuisines: String,
      deep_src: String,
      environment_rating: String,
      intro: String,
      opentime: String,
      opentime_GDF: String,
      ordering_app_url: String,
      ordering_wap_url: String,
      ordering_web_url: String,
      photos: js.Array[PoiPhoto],
      rating: String,
      recommend: String,
      service_rating: String,
      tag: String,
      taste_rating: String
    ): Dining = {
      val __obj = js.Dynamic.literal(addition = addition.asInstanceOf[js.Any], atmosphere = atmosphere.asInstanceOf[js.Any], cost = cost.asInstanceOf[js.Any], cp_rating = cp_rating.asInstanceOf[js.Any], cuisines = cuisines.asInstanceOf[js.Any], deep_src = deep_src.asInstanceOf[js.Any], environment_rating = environment_rating.asInstanceOf[js.Any], intro = intro.asInstanceOf[js.Any], opentime = opentime.asInstanceOf[js.Any], opentime_GDF = opentime_GDF.asInstanceOf[js.Any], ordering_app_url = ordering_app_url.asInstanceOf[js.Any], ordering_wap_url = ordering_wap_url.asInstanceOf[js.Any], ordering_web_url = ordering_web_url.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], recommend = recommend.asInstanceOf[js.Any], service_rating = service_rating.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], taste_rating = taste_rating.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dining]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dining] (val x: Self) extends AnyVal {
      
      inline def setAddition(value: String): Self = StObject.set(x, "addition", value.asInstanceOf[js.Any])
      
      inline def setAtmosphere(value: String): Self = StObject.set(x, "atmosphere", value.asInstanceOf[js.Any])
      
      inline def setCost(value: String): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
      
      inline def setCp_rating(value: String): Self = StObject.set(x, "cp_rating", value.asInstanceOf[js.Any])
      
      inline def setCuisines(value: String): Self = StObject.set(x, "cuisines", value.asInstanceOf[js.Any])
      
      inline def setDeep_src(value: String): Self = StObject.set(x, "deep_src", value.asInstanceOf[js.Any])
      
      inline def setEnvironment_rating(value: String): Self = StObject.set(x, "environment_rating", value.asInstanceOf[js.Any])
      
      inline def setIntro(value: String): Self = StObject.set(x, "intro", value.asInstanceOf[js.Any])
      
      inline def setOpentime(value: String): Self = StObject.set(x, "opentime", value.asInstanceOf[js.Any])
      
      inline def setOpentime_GDF(value: String): Self = StObject.set(x, "opentime_GDF", value.asInstanceOf[js.Any])
      
      inline def setOrdering_app_url(value: String): Self = StObject.set(x, "ordering_app_url", value.asInstanceOf[js.Any])
      
      inline def setOrdering_wap_url(value: String): Self = StObject.set(x, "ordering_wap_url", value.asInstanceOf[js.Any])
      
      inline def setOrdering_web_url(value: String): Self = StObject.set(x, "ordering_web_url", value.asInstanceOf[js.Any])
      
      inline def setPhotos(value: js.Array[PoiPhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      inline def setPhotosVarargs(value: PoiPhoto*): Self = StObject.set(x, "photos", js.Array(value*))
      
      inline def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      inline def setRecommend(value: String): Self = StObject.set(x, "recommend", value.asInstanceOf[js.Any])
      
      inline def setService_rating(value: String): Self = StObject.set(x, "service_rating", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTaste_rating(value: String): Self = StObject.set(x, "taste_rating", value.asInstanceOf[js.Any])
    }
  }
  
  trait Discount extends StObject {
    
    /**
      * 优惠详情
      */
    var detail: String
    
    /**
      * 结束时间
      */
    var end_time: String
    
    /**
      * 图片信息列表
      */
    var photos: js.Array[PoiPhoto]
    
    /**
      * 来源标识
      */
    var provider: String
    
    /**
      * 已卖出数量
      */
    var sold_num: Double
    
    /**
      * 开始时间
      */
    var start_time: String
    
    /**
      * 优惠标题
      */
    var title: String
    
    /**
      * 来源url
      */
    var url: String
  }
  object Discount {
    
    inline def apply(
      detail: String,
      end_time: String,
      photos: js.Array[PoiPhoto],
      provider: String,
      sold_num: Double,
      start_time: String,
      title: String,
      url: String
    ): Discount = {
      val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], sold_num = sold_num.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Discount]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Discount] (val x: Self) extends AnyVal {
      
      inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setEnd_time(value: String): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
      
      inline def setPhotos(value: js.Array[PoiPhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      inline def setPhotosVarargs(value: PoiPhoto*): Self = StObject.set(x, "photos", js.Array(value*))
      
      inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setSold_num(value: Double): Self = StObject.set(x, "sold_num", value.asInstanceOf[js.Any])
      
      inline def setStart_time(value: String): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventMap extends StObject {
    
    var complete: Event_[typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.complete, SearchResult]
    
    var error: Event_[typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.error, Info]
    
    var infoWindowClick: Event_[
        typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.infoWindowClick, 
        SelectChangeEventDataeven
      ]
    
    var listElementClick: SelectChangeEvent[
        typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementClick, 
        MouseEvent
      ]
    
    // typo in source code
    var listElementDetroyed: Event_[
        typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementDetroyed, 
        SelectChangeEventData
      ]
    
    var markerClick: SelectChangeEvent[
        typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerClick, 
        MapsEvent[click, Marker[Any]]
      ]
    
    var markerDestoryed: Event_[
        typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerDestoryed, 
        SelectChangeEventData
      ]
    
    // internal
    var renderComplete: Event_[
        typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.renderComplete, 
        ListElements
      ]
    
    var selectChanged: Event_[
        typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.selectChanged, 
        LastSelected
      ]
    
    var willClear: Event_[typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.willClear, Data]
  }
  object EventMap {
    
    inline def apply(
      complete: Event_[complete, SearchResult],
      error: Event_[error, Info],
      infoWindowClick: Event_[infoWindowClick, SelectChangeEventDataeven],
      listElementClick: SelectChangeEvent[listElementClick, MouseEvent],
      listElementDetroyed: Event_[listElementDetroyed, SelectChangeEventData],
      markerClick: SelectChangeEvent[markerClick, MapsEvent[click, Marker[Any]]],
      markerDestoryed: Event_[markerDestoryed, SelectChangeEventData],
      renderComplete: Event_[renderComplete, ListElements],
      selectChanged: Event_[selectChanged, LastSelected],
      willClear: Event_[willClear, Data]
    ): EventMap = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], infoWindowClick = infoWindowClick.asInstanceOf[js.Any], listElementClick = listElementClick.asInstanceOf[js.Any], listElementDetroyed = listElementDetroyed.asInstanceOf[js.Any], markerClick = markerClick.asInstanceOf[js.Any], markerDestoryed = markerDestoryed.asInstanceOf[js.Any], renderComplete = renderComplete.asInstanceOf[js.Any], selectChanged = selectChanged.asInstanceOf[js.Any], willClear = willClear.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setComplete(value: Event_[complete, SearchResult]): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setError(value: Event_[error, Info]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setInfoWindowClick(value: Event_[infoWindowClick, SelectChangeEventDataeven]): Self = StObject.set(x, "infoWindowClick", value.asInstanceOf[js.Any])
      
      inline def setListElementClick(value: SelectChangeEvent[listElementClick, MouseEvent]): Self = StObject.set(x, "listElementClick", value.asInstanceOf[js.Any])
      
      inline def setListElementDetroyed(value: Event_[listElementDetroyed, SelectChangeEventData]): Self = StObject.set(x, "listElementDetroyed", value.asInstanceOf[js.Any])
      
      inline def setMarkerClick(value: SelectChangeEvent[markerClick, MapsEvent[click, Marker[Any]]]): Self = StObject.set(x, "markerClick", value.asInstanceOf[js.Any])
      
      inline def setMarkerDestoryed(value: Event_[markerDestoryed, SelectChangeEventData]): Self = StObject.set(x, "markerDestoryed", value.asInstanceOf[js.Any])
      
      inline def setRenderComplete(value: Event_[renderComplete, ListElements]): Self = StObject.set(x, "renderComplete", value.asInstanceOf[js.Any])
      
      inline def setSelectChanged(value: Event_[selectChanged, LastSelected]): Self = StObject.set(x, "selectChanged", value.asInstanceOf[js.Any])
      
      inline def setWillClear(value: Event_[willClear, Data]): Self = StObject.set(x, "willClear", value.asInstanceOf[js.Any])
    }
  }
  
  trait Groupbuy extends StObject {
    
    /**
      * 团购总量
      */
    var count: Double
    
    /**
      * 团购详情
      */
    var detail: String
    
    /**
      * 折扣
      */
    var discount: Double
    
    /**
      * 团购结束时间
      */
    var etime: String
    
    /**
      * 折扣价
      */
    var groupbuy_price: Double
    
    /**
      * 原价
      */
    var original_price: Double
    
    /**
      * 图片信息
      */
    var photos: js.Array[PoiPhoto]
    
    /**
      * 来源标识
      */
    var provider: String
    
    /**
      * 已卖出数量
      */
    var sold_num: Double
    
    /**
      * 团购开始时间
      */
    var stime: String
    
    /**
      * 取票地址
      */
    var ticket_address: String
    
    /**
      * 取票电话
      */
    var ticket_tel: String
    
    /**
      * 团购标题
      */
    var title: String
    
    /**
      * 团购分类
      */
    var `type`: String
    
    /**
      * 团购分类代码
      */
    var type_code: String
    
    /**
      * 来源url
      */
    var url: String
  }
  object Groupbuy {
    
    inline def apply(
      count: Double,
      detail: String,
      discount: Double,
      etime: String,
      groupbuy_price: Double,
      original_price: Double,
      photos: js.Array[PoiPhoto],
      provider: String,
      sold_num: Double,
      stime: String,
      ticket_address: String,
      ticket_tel: String,
      title: String,
      `type`: String,
      type_code: String,
      url: String
    ): Groupbuy = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], discount = discount.asInstanceOf[js.Any], etime = etime.asInstanceOf[js.Any], groupbuy_price = groupbuy_price.asInstanceOf[js.Any], original_price = original_price.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], sold_num = sold_num.asInstanceOf[js.Any], stime = stime.asInstanceOf[js.Any], ticket_address = ticket_address.asInstanceOf[js.Any], ticket_tel = ticket_tel.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], type_code = type_code.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Groupbuy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Groupbuy] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDiscount(value: Double): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
      
      inline def setEtime(value: String): Self = StObject.set(x, "etime", value.asInstanceOf[js.Any])
      
      inline def setGroupbuy_price(value: Double): Self = StObject.set(x, "groupbuy_price", value.asInstanceOf[js.Any])
      
      inline def setOriginal_price(value: Double): Self = StObject.set(x, "original_price", value.asInstanceOf[js.Any])
      
      inline def setPhotos(value: js.Array[PoiPhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      inline def setPhotosVarargs(value: PoiPhoto*): Self = StObject.set(x, "photos", js.Array(value*))
      
      inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setSold_num(value: Double): Self = StObject.set(x, "sold_num", value.asInstanceOf[js.Any])
      
      inline def setStime(value: String): Self = StObject.set(x, "stime", value.asInstanceOf[js.Any])
      
      inline def setTicket_address(value: String): Self = StObject.set(x, "ticket_address", value.asInstanceOf[js.Any])
      
      inline def setTicket_tel(value: String): Self = StObject.set(x, "ticket_tel", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setType_code(value: String): Self = StObject.set(x, "type_code", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Hotel extends StObject {
    
    /**
      * 特色服务
      */
    var addition: String
    
    /**
      * 信息来源
      */
    var deep_src: String
    
    /**
      * 环境评分
      */
    var environment_rating: String
    
    /**
      * 设施评分
      */
    var faci_rating: String
    
    /**
      * 卫生评分
      */
    var health_rating: String
    
    /**
      * 简介
      */
    var intro: String
    
    /**
      * 最低房价
      */
    var lowest_price: String
    
    /**
      * 图片信息列表
      */
    var photos: js.Array[PoiPhoto]
    
    /**
      * 综合评分
      */
    var rating: String
    
    /**
      * 服务评分
      */
    var service_rating: String
    
    /**
      * 星级
      */
    var star: String
    
    /**
      * 交通提示
      */
    var traffic: String
  }
  object Hotel {
    
    inline def apply(
      addition: String,
      deep_src: String,
      environment_rating: String,
      faci_rating: String,
      health_rating: String,
      intro: String,
      lowest_price: String,
      photos: js.Array[PoiPhoto],
      rating: String,
      service_rating: String,
      star: String,
      traffic: String
    ): Hotel = {
      val __obj = js.Dynamic.literal(addition = addition.asInstanceOf[js.Any], deep_src = deep_src.asInstanceOf[js.Any], environment_rating = environment_rating.asInstanceOf[js.Any], faci_rating = faci_rating.asInstanceOf[js.Any], health_rating = health_rating.asInstanceOf[js.Any], intro = intro.asInstanceOf[js.Any], lowest_price = lowest_price.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], service_rating = service_rating.asInstanceOf[js.Any], star = star.asInstanceOf[js.Any], traffic = traffic.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hotel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hotel] (val x: Self) extends AnyVal {
      
      inline def setAddition(value: String): Self = StObject.set(x, "addition", value.asInstanceOf[js.Any])
      
      inline def setDeep_src(value: String): Self = StObject.set(x, "deep_src", value.asInstanceOf[js.Any])
      
      inline def setEnvironment_rating(value: String): Self = StObject.set(x, "environment_rating", value.asInstanceOf[js.Any])
      
      inline def setFaci_rating(value: String): Self = StObject.set(x, "faci_rating", value.asInstanceOf[js.Any])
      
      inline def setHealth_rating(value: String): Self = StObject.set(x, "health_rating", value.asInstanceOf[js.Any])
      
      inline def setIntro(value: String): Self = StObject.set(x, "intro", value.asInstanceOf[js.Any])
      
      inline def setLowest_price(value: String): Self = StObject.set(x, "lowest_price", value.asInstanceOf[js.Any])
      
      inline def setPhotos(value: js.Array[PoiPhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      inline def setPhotosVarargs(value: PoiPhoto*): Self = StObject.set(x, "photos", js.Array(value*))
      
      inline def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      inline def setService_rating(value: String): Self = StObject.set(x, "service_rating", value.asInstanceOf[js.Any])
      
      inline def setStar(value: String): Self = StObject.set(x, "star", value.asInstanceOf[js.Any])
      
      inline def setTraffic(value: String): Self = StObject.set(x, "traffic", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAutoFitView(value: Boolean): Self = StObject.set(x, "autoFitView", value.asInstanceOf[js.Any])
      
      inline def setAutoFitViewUndefined: Self = StObject.set(x, "autoFitView", js.undefined)
      
      inline def setChildren(value: Double): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      inline def setCitylimit(value: Boolean): Self = StObject.set(x, "citylimit", value.asInstanceOf[js.Any])
      
      inline def setCitylimitUndefined: Self = StObject.set(x, "citylimit", js.undefined)
      
      inline def setExtensions(value: base | all): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setLang(value: Lang): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
      
      inline def setPageIndexUndefined: Self = StObject.set(x, "pageIndex", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPanel(value: String | HTMLElement): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      inline def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
      
      inline def setRankBy(value: String): Self = StObject.set(x, "rankBy", value.asInstanceOf[js.Any])
      
      inline def setRankByUndefined: Self = StObject.set(x, "rankBy", js.undefined)
      
      inline def setRenderEngine(value: String): Self = StObject.set(x, "renderEngine", value.asInstanceOf[js.Any])
      
      inline def setRenderEngineUndefined: Self = StObject.set(x, "renderEngine", js.undefined)
      
      inline def setRenderStyle(value: newpc | default): Self = StObject.set(x, "renderStyle", value.asInstanceOf[js.Any])
      
      inline def setRenderStyleUndefined: Self = StObject.set(x, "renderStyle", js.undefined)
      
      inline def setShowCover(value: Boolean): Self = StObject.set(x, "showCover", value.asInstanceOf[js.Any])
      
      inline def setShowCoverUndefined: Self = StObject.set(x, "showCover", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type Poi = PoiBase | PoiExt
  
  trait PoiBase extends StObject {
    
    /**
      * 地址
      */
    var address: String
    
    var children: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * 离中心点距离
      */
    var distance: Double
    
    /**
      * 全局唯一ID
      */
    var id: String
    
    /**
      * 兴趣点经纬度
      */
    var location: LngLat | Null
    
    /**
      * 名称
      */
    var name: String
    
    var shopinfo: String
    
    /**
      * 电话
      */
    var tel: String
    
    /**
      * 兴趣点类型
      */
    var `type`: String
  }
  object PoiBase {
    
    inline def apply(
      address: String,
      distance: Double,
      id: String,
      name: String,
      shopinfo: String,
      tel: String,
      `type`: String
    ): PoiBase = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shopinfo = shopinfo.asInstanceOf[js.Any], tel = tel.asInstanceOf[js.Any], location = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PoiBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PoiBase] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Any*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationNull: Self = StObject.set(x, "location", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setShopinfo(value: String): Self = StObject.set(x, "shopinfo", value.asInstanceOf[js.Any])
      
      inline def setTel(value: String): Self = StObject.set(x, "tel", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type PoiExt = Adcode & PoiBase & (Indoordata | Indoormap) & (typings.amapJsApiPlaceSearch.anon.Cinema | Deeptype | typings.amapJsApiPlaceSearch.anon.Scenic | typings.amapJsApiPlaceSearch.anon.Hotel)
  
  trait PoiList extends StObject {
    
    /**
      * 查询结果总数
      */
    var count: Double
    
    // PlaceSearchPoiBase[] | PlaceSearchPoiExt[];
    /**
      * 页码
      */
    var pageIndex: Double
    
    /**
      * 单页结果数
      */
    var pageSize: Double
    
    /**
      * Poi列表
      */
    var pois: js.Array[Poi]
  }
  object PoiList {
    
    inline def apply(count: Double, pageIndex: Double, pageSize: Double, pois: js.Array[Poi]): PoiList = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], pageIndex = pageIndex.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], pois = pois.asInstanceOf[js.Any])
      __obj.asInstanceOf[PoiList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PoiList] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPois(value: js.Array[Poi]): Self = StObject.set(x, "pois", value.asInstanceOf[js.Any])
      
      inline def setPoisVarargs(value: Poi*): Self = StObject.set(x, "pois", js.Array(value*))
    }
  }
  
  trait PoiPhoto extends StObject {
    
    /**
      * 图片名称
      */
    var title: String
    
    /**
      * 图片url
      */
    var url: String
  }
  object PoiPhoto {
    
    inline def apply(title: String, url: String): PoiPhoto = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PoiPhoto]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PoiPhoto] (val x: Self) extends AnyVal {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Scenic extends StObject {
    
    /**
      * 信息来源
      */
    var deep_src: String
    
    /**
      * 简介
      */
    var intro: String
    
    /**
      * 景区国标级别
      */
    var level: String
    
    /**
      * 非规范格式的营业时间
      */
    var opentime: String
    
    /**
      * 规范格式的营业时间
      */
    var opentime_GDF: String
    
    /**
      * wap购票链接
      */
    var ordering_wap_url: String
    
    /**
      * web购票链接
      */
    var ordering_web_url: String
    
    /**
      * 图片信息列表
      */
    var photos: js.Array[PoiPhoto]
    
    /**
      * 门票价格
      */
    var price: String
    
    /**
      * 综合评分
      */
    var rating: String
    
    /**
      * 推荐景点
      */
    var recommend: String
    
    /**
      * 适合游玩的季节
      */
    var season: String
    
    /**
      * 景区主题
      */
    var theme: String
  }
  object Scenic {
    
    inline def apply(
      deep_src: String,
      intro: String,
      level: String,
      opentime: String,
      opentime_GDF: String,
      ordering_wap_url: String,
      ordering_web_url: String,
      photos: js.Array[PoiPhoto],
      price: String,
      rating: String,
      recommend: String,
      season: String,
      theme: String
    ): Scenic = {
      val __obj = js.Dynamic.literal(deep_src = deep_src.asInstanceOf[js.Any], intro = intro.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], opentime = opentime.asInstanceOf[js.Any], opentime_GDF = opentime_GDF.asInstanceOf[js.Any], ordering_wap_url = ordering_wap_url.asInstanceOf[js.Any], ordering_web_url = ordering_web_url.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], recommend = recommend.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scenic]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Scenic] (val x: Self) extends AnyVal {
      
      inline def setDeep_src(value: String): Self = StObject.set(x, "deep_src", value.asInstanceOf[js.Any])
      
      inline def setIntro(value: String): Self = StObject.set(x, "intro", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setOpentime(value: String): Self = StObject.set(x, "opentime", value.asInstanceOf[js.Any])
      
      inline def setOpentime_GDF(value: String): Self = StObject.set(x, "opentime_GDF", value.asInstanceOf[js.Any])
      
      inline def setOrdering_wap_url(value: String): Self = StObject.set(x, "ordering_wap_url", value.asInstanceOf[js.Any])
      
      inline def setOrdering_web_url(value: String): Self = StObject.set(x, "ordering_web_url", value.asInstanceOf[js.Any])
      
      inline def setPhotos(value: js.Array[PoiPhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      inline def setPhotosVarargs(value: PoiPhoto*): Self = StObject.set(x, "photos", js.Array(value*))
      
      inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      inline def setRecommend(value: String): Self = StObject.set(x, "recommend", value.asInstanceOf[js.Any])
      
      inline def setSeason(value: String): Self = StObject.set(x, "season", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchResult extends StObject {
    
    /**
      * 城市建议列表
      */
    var cityList: js.UndefOr[js.Array[CityInfo]] = js.undefined
    
    /**
      * 成功状态说明
      */
    var info: String
    
    /**
      * 建议关键字列表
      */
    var keywordList: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * 兴趣点列表
      */
    var poiList: PoiList
  }
  object SearchResult {
    
    inline def apply(info: String, poiList: PoiList): SearchResult = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], poiList = poiList.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchResult] (val x: Self) extends AnyVal {
      
      inline def setCityList(value: js.Array[CityInfo]): Self = StObject.set(x, "cityList", value.asInstanceOf[js.Any])
      
      inline def setCityListUndefined: Self = StObject.set(x, "cityList", js.undefined)
      
      inline def setCityListVarargs(value: CityInfo*): Self = StObject.set(x, "cityList", js.Array(value*))
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setKeywordList(value: js.Array[String]): Self = StObject.set(x, "keywordList", value.asInstanceOf[js.Any])
      
      inline def setKeywordListUndefined: Self = StObject.set(x, "keywordList", js.undefined)
      
      inline def setKeywordListVarargs(value: String*): Self = StObject.set(x, "keywordList", js.Array(value*))
      
      inline def setPoiList(value: PoiList): Self = StObject.set(x, "poiList", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.complete
    - typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.error
    - typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.no_data
  */
  trait SearchStatus extends StObject
  object SearchStatus {
    
    inline def complete: typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.complete = "complete".asInstanceOf[typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.complete]
    
    inline def error: typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.error = "error".asInstanceOf[typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.error]
    
    inline def no_data: typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.no_data = "no_data".asInstanceOf[typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.no_data]
  }
  
  type SelectChangeEvent[N /* <: String */, E] = Event_[N, SelectChangeEventData & Event[E]]
  
  trait SelectChangeEventData extends StObject {
    
    /**
      * 当前选中的POI的信息
      */
    var data: js.Array[Poi]
    
    /**
      * 当前选中的POI的ID
      */
    var id: String
    
    /**
      * 索引
      */
    var index: Double
    
    /**
      * 当前选中的POI在结果面板中对应的列表项
      */
    var listElement: HTMLLIElement
    
    /**
      * 当前选中的POI对应的在地图中的Marker对象
      */
    var marker: Marker[Any]
  }
  object SelectChangeEventData {
    
    inline def apply(data: js.Array[Poi], id: String, index: Double, listElement: HTMLLIElement, marker: Marker[Any]): SelectChangeEventData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], listElement = listElement.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectChangeEventData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectChangeEventData] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Array[Poi]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Poi*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setListElement(value: HTMLLIElement): Self = StObject.set(x, "listElement", value.asInstanceOf[js.Any])
      
      inline def setMarker(value: Marker[Any]): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    }
  }
}
