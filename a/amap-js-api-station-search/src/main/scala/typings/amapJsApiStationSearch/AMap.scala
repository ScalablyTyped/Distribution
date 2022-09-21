package typings.amapJsApiStationSearch

import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApi.AMap.Event_
import typings.amapJsApi.AMap.LngLat
import typings.amapJsApiStationSearch.AMap.StationSearch.SearchResult
import typings.amapJsApiStationSearch.AMap.StationSearch.SearchStatus
import typings.amapJsApiStationSearch.amapJsApiStationSearchStrings.complete
import typings.amapJsApiStationSearch.amapJsApiStationSearchStrings.error
import typings.amapJsApiStationSearch.anon.Info
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  /**
    * 公交站点查询服务
    */
  @js.native
  trait StationSearch
    extends StObject
       with EventEmitter {
    
    /**
      * 根据给定公交站点名称进行公交站点详情查询
      * @param keyword 查询关键词，多个关键字用"|"分割
      * @param callback 查询回调
      */
    def search(
      keyword: String,
      callback: js.Function2[/* status */ SearchStatus, /* result */ SearchResult | String, Unit]
    ): Unit = js.native
    
    /**
      * 根据给定的公交站点id进行公交站点详情检索
      * @param id 公交站点的唯一标识
      * @param callback 查询回调
      */
    def searchById(
      id: String,
      callback: js.Function2[/* status */ SearchStatus, /* result */ SearchResult | String, Unit]
    ): Unit = js.native
    
    /**
      * 设置查询城市
      * @param city 城市:cityname（中文或中文全拼）、citycode或adcode
      */
    def setCity(): Unit = js.native
    def setCity(city: String): Unit = js.native
    
    /**
      * 设置查询结果页码
      * @param pageIndex 页码,取值范围：1-100
      */
    def setPageIndex(): Unit = js.native
    def setPageIndex(pageIndex: Double): Unit = js.native
    
    /**
      * 设置单页显示结果条数
      * @param pageSize 条数,取值范围：1-100
      */
    def setPageSize(): Unit = js.native
    def setPageSize(pageSize: Double): Unit = js.native
  }
  object StationSearch {
    
    trait Busline extends StObject {
      
      /**
        * 首发站名称
        */
      var end_stop: String
      
      /**
        * 公交线路id，该id是唯一标识
        */
      var id: String
      
      /**
        * 公交线路途经此站的经纬度
        */
      var location: LngLat
      
      /**
        * 公交线路名称
        */
      var name: String
      
      /**
        * 首发站名称
        */
      var start_stop: String
    }
    object Busline {
      
      inline def apply(end_stop: String, id: String, location: LngLat, name: String, start_stop: String): Busline = {
        val __obj = js.Dynamic.literal(end_stop = end_stop.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start_stop = start_stop.asInstanceOf[js.Any])
        __obj.asInstanceOf[Busline]
      }
      
      extension [Self <: Busline](x: Self) {
        
        inline def setEnd_stop(value: String): Self = StObject.set(x, "end_stop", value.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setStart_stop(value: String): Self = StObject.set(x, "start_stop", value.asInstanceOf[js.Any])
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
        * 城市名称
        */
      var name: String
    }
    object CityInfo {
      
      inline def apply(adcode: String, citycode: String, count: Double, name: String): CityInfo = {
        val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[CityInfo]
      }
      
      extension [Self <: CityInfo](x: Self) {
        
        inline def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
        
        inline def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
        
        inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    trait EventMap extends StObject {
      
      var complete: Event_[
            typings.amapJsApiStationSearch.amapJsApiStationSearchStrings.complete, 
            SearchResult
          ]
      
      var error: Event_[typings.amapJsApiStationSearch.amapJsApiStationSearchStrings.error, Info]
    }
    object EventMap {
      
      inline def apply(complete: Event_[complete, SearchResult], error: Event_[error, Info]): EventMap = {
        val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventMap]
      }
      
      extension [Self <: EventMap](x: Self) {
        
        inline def setComplete(value: Event_[complete, SearchResult]): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
        
        inline def setError(value: Event_[error, Info]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      }
    }
    
    trait Options extends StObject {
      
      /**
        * 公交站点所在城市
        * 可选值：cityname（中文或中文全拼）、citycode、adcode
        * 默认值：“全国”
        */
      var city: js.UndefOr[String] = js.undefined
      
      /**
        * 页码
        * 默认值：1, 取值范围：1-100
        */
      var pageIndex: js.UndefOr[Double] = js.undefined
      
      /**
        * 单页显示结果条数
        * 默认值：20, 取值范围：1-100
        */
      var pageSize: js.UndefOr[Double] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
        
        inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
        
        inline def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
        
        inline def setPageIndexUndefined: Self = StObject.set(x, "pageIndex", js.undefined)
        
        inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      }
    }
    
    trait SearchResult extends StObject {
      
      /**
        * 查该城市无此公交站时，返回的建议城市列表
        */
      var cityList: js.UndefOr[js.Array[CityInfo]] = js.undefined
      
      /**
        * 成功状态文字描述
        */
      var info: String
      
      /**
        * 查无此公交站时，返回的建议关键字列表，可根据建议关键字查询
        */
      var keywordList: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * 根据查询条件返回公交站点信息
        */
      var stationInfo: js.Array[StationInfo]
    }
    object SearchResult {
      
      inline def apply(info: String, stationInfo: js.Array[StationInfo]): SearchResult = {
        val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], stationInfo = stationInfo.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchResult]
      }
      
      extension [Self <: SearchResult](x: Self) {
        
        inline def setCityList(value: js.Array[CityInfo]): Self = StObject.set(x, "cityList", value.asInstanceOf[js.Any])
        
        inline def setCityListUndefined: Self = StObject.set(x, "cityList", js.undefined)
        
        inline def setCityListVarargs(value: CityInfo*): Self = StObject.set(x, "cityList", js.Array(value*))
        
        inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        inline def setKeywordList(value: js.Array[String]): Self = StObject.set(x, "keywordList", value.asInstanceOf[js.Any])
        
        inline def setKeywordListUndefined: Self = StObject.set(x, "keywordList", js.undefined)
        
        inline def setKeywordListVarargs(value: String*): Self = StObject.set(x, "keywordList", js.Array(value*))
        
        inline def setStationInfo(value: js.Array[StationInfo]): Self = StObject.set(x, "stationInfo", value.asInstanceOf[js.Any])
        
        inline def setStationInfoVarargs(value: StationInfo*): Self = StObject.set(x, "stationInfo", js.Array(value*))
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.amapJsApiStationSearch.amapJsApiStationSearchStrings.complete
      - typings.amapJsApiStationSearch.amapJsApiStationSearchStrings.error
      - typings.amapJsApiStationSearch.amapJsApiStationSearchStrings.no_data
    */
    trait SearchStatus extends StObject
    object SearchStatus {
      
      inline def complete: typings.amapJsApiStationSearch.amapJsApiStationSearchStrings.complete = "complete".asInstanceOf[typings.amapJsApiStationSearch.amapJsApiStationSearchStrings.complete]
      
      inline def error: typings.amapJsApiStationSearch.amapJsApiStationSearchStrings.error = "error".asInstanceOf[typings.amapJsApiStationSearch.amapJsApiStationSearchStrings.error]
      
      inline def no_data: typings.amapJsApiStationSearch.amapJsApiStationSearchStrings.no_data = "no_data".asInstanceOf[typings.amapJsApiStationSearch.amapJsApiStationSearchStrings.no_data]
    }
    
    trait StationInfo extends StObject {
      
      /**
        * 区域编码
        */
      var adcode: String
      
      /**
        * 途经此站点的公交路线列表
        */
      var buslines: js.Array[Busline]
      
      /**
        * 城市编码
        */
      var citycode: String
      
      /**
        * 公交站点id，该id是唯一标识
        */
      var id: String
      
      /**
        * 公交站点经纬度
        */
      var location: LngLat
      
      /**
        * 公交站点名称
        */
      var name: String
    }
    object StationInfo {
      
      inline def apply(
        adcode: String,
        buslines: js.Array[Busline],
        citycode: String,
        id: String,
        location: LngLat,
        name: String
      ): StationInfo = {
        val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], buslines = buslines.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[StationInfo]
      }
      
      extension [Self <: StationInfo](x: Self) {
        
        inline def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
        
        inline def setBuslines(value: js.Array[Busline]): Self = StObject.set(x, "buslines", value.asInstanceOf[js.Any])
        
        inline def setBuslinesVarargs(value: Busline*): Self = StObject.set(x, "buslines", js.Array(value*))
        
        inline def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
  }
}
