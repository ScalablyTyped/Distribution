package typings.amapJsApiLineSearch

import typings.amapJsApi.AMap.Bounds
import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApi.AMap.Event_
import typings.amapJsApi.AMap.LngLat
import typings.amapJsApiLineSearch.AMap.LineSearch.SearchResult
import typings.amapJsApiLineSearch.AMap.LineSearch.SearchStatus
import typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.all
import typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.base
import typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.complete
import typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.error
import typings.amapJsApiLineSearch.anon.Info
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  @js.native
  trait LineSearch
    extends StObject
       with EventEmitter {
    
    /**
      * 根据给定公交线路名称进行公交线路详情查询
      * @param keyword 名称
      * @param callback 回调
      */
    def search(
      keyword: String,
      callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResult, Unit]
    ): Unit = js.native
    
    /**
      * 根据给定的公交线路id进行公交站点详情检索
      * @param id 公交线路的唯一标识
      * @param callback 回调
      */
    def searchById(
      id: String,
      callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResult, Unit]
    ): Unit = js.native
    
    /**
      * 设置查询城市
      * @param city 城市，默认值：“全国”，可选值：cityname（中文或中文全拼）、citycode、adcode
      */
    def setCity(): Unit = js.native
    def setCity(city: String): Unit = js.native
    
    /**
      * 设置查询结果页码
      * @param pageIndex 页码，默认值：1
      */
    def setPageIndex(): Unit = js.native
    def setPageIndex(pageIndex: Double): Unit = js.native
    
    /**
      * 设置单页显示结果条数
      * @param pageSize 条数，默认值：20
      */
    def setPageSize(): Unit = js.native
    def setPageSize(pageSize: Double): Unit = js.native
  }
  object LineSearch {
    
    trait BusStop extends StObject {
      
      var id: String
      
      var location: LngLat
      
      var name: String
      
      var sequence: Double
    }
    object BusStop {
      
      inline def apply(id: String, location: LngLat, name: String, sequence: Double): BusStop = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
        __obj.asInstanceOf[BusStop]
      }
      
      extension [Self <: BusStop](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      }
    }
    
    trait EventMap extends StObject {
      
      var complete: Event_[typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.complete, SearchResult]
      
      var error: Event_[typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.error, Info]
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
    
    /* Rewritten from type alias, can be one of: 
      - typings.amapJsApiLineSearch.AMap.LineSearch.LineInfoBase
      - typings.amapJsApiLineSearch.AMap.LineSearch.LineInfoExt
    */
    trait LineInfo extends StObject
    object LineInfo {
      
      inline def LineInfoBase(
        citycode: String,
        end_stop: String,
        id: String,
        name: String,
        path: js.Array[LngLat],
        start_stop: String,
        `type`: String
      ): typings.amapJsApiLineSearch.AMap.LineSearch.LineInfoBase = {
        val __obj = js.Dynamic.literal(citycode = citycode.asInstanceOf[js.Any], end_stop = end_stop.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], start_stop = start_stop.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.amapJsApiLineSearch.AMap.LineSearch.LineInfoBase]
      }
      
      inline def LineInfoExt(
        basic_price: String,
        bounds: Bounds,
        citycode: String,
        company: String,
        distance: String,
        end_stop: String,
        etime: String,
        id: String,
        name: String,
        path: js.Array[LngLat],
        start_stop: String,
        stime: String,
        total_price: String,
        `type`: String,
        via_stops: js.Array[BusStop]
      ): typings.amapJsApiLineSearch.AMap.LineSearch.LineInfoExt = {
        val __obj = js.Dynamic.literal(basic_price = basic_price.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], end_stop = end_stop.asInstanceOf[js.Any], etime = etime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], start_stop = start_stop.asInstanceOf[js.Any], stime = stime.asInstanceOf[js.Any], total_price = total_price.asInstanceOf[js.Any], via_stops = via_stops.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.amapJsApiLineSearch.AMap.LineSearch.LineInfoExt]
      }
    }
    
    trait LineInfoBase
      extends StObject
         with LineInfo {
      
      /**
        * 所在城市的城市编码
        */
      var citycode: String
      
      /**
        * 终点站
        */
      var end_stop: String
      
      /**
        * 公交线路id，该id是唯一标识
        */
      var id: String
      
      /**
        * 线路名称
        */
      var name: String
      
      /**
        * 线路经纬度
        */
      var path: js.Array[LngLat]
      
      /**
        * 首发站
        */
      var start_stop: String
      
      /**
        * 公交类型列表
        */
      var `type`: String
    }
    object LineInfoBase {
      
      inline def apply(
        citycode: String,
        end_stop: String,
        id: String,
        name: String,
        path: js.Array[LngLat],
        start_stop: String,
        `type`: String
      ): LineInfoBase = {
        val __obj = js.Dynamic.literal(citycode = citycode.asInstanceOf[js.Any], end_stop = end_stop.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], start_stop = start_stop.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[LineInfoBase]
      }
      
      extension [Self <: LineInfoBase](x: Self) {
        
        inline def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
        
        inline def setEnd_stop(value: String): Self = StObject.set(x, "end_stop", value.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setPath(value: js.Array[LngLat]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathVarargs(value: LngLat*): Self = StObject.set(x, "path", js.Array(value*))
        
        inline def setStart_stop(value: String): Self = StObject.set(x, "start_stop", value.asInstanceOf[js.Any])
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.amapJsApiLineSearch.AMap.LineSearch.LineInfo because Already inherited */ trait LineInfoExt
      extends StObject
         with LineInfoBase {
      
      /**
        * 起步票价，单位：元
        */
      var basic_price: String
      
      // is string actually
      /**
        * 全程距离，单位：千米
        */
      var bounds: Bounds
      
      /**
        * 所属公交公司
        */
      var company: String
      
      /**
        * 全程距离，单位：千米
        */
      var distance: String
      
      /**
        * 末班车时间
        */
      var etime: String
      
      /**
        * 首班车时间
        */
      var stime: String
      
      /**
        * 全程票价，单位：元
        */
      var total_price: String
      
      /**
        * 途径站，包括首发站和终点站
        */
      var via_stops: js.Array[BusStop]
    }
    object LineInfoExt {
      
      inline def apply(
        basic_price: String,
        bounds: Bounds,
        citycode: String,
        company: String,
        distance: String,
        end_stop: String,
        etime: String,
        id: String,
        name: String,
        path: js.Array[LngLat],
        start_stop: String,
        stime: String,
        total_price: String,
        `type`: String,
        via_stops: js.Array[BusStop]
      ): LineInfoExt = {
        val __obj = js.Dynamic.literal(basic_price = basic_price.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], end_stop = end_stop.asInstanceOf[js.Any], etime = etime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], start_stop = start_stop.asInstanceOf[js.Any], stime = stime.asInstanceOf[js.Any], total_price = total_price.asInstanceOf[js.Any], via_stops = via_stops.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[LineInfoExt]
      }
      
      extension [Self <: LineInfoExt](x: Self) {
        
        inline def setBasic_price(value: String): Self = StObject.set(x, "basic_price", value.asInstanceOf[js.Any])
        
        inline def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
        
        inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
        
        inline def setDistance(value: String): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
        
        inline def setEtime(value: String): Self = StObject.set(x, "etime", value.asInstanceOf[js.Any])
        
        inline def setStime(value: String): Self = StObject.set(x, "stime", value.asInstanceOf[js.Any])
        
        inline def setTotal_price(value: String): Self = StObject.set(x, "total_price", value.asInstanceOf[js.Any])
        
        inline def setVia_stops(value: js.Array[BusStop]): Self = StObject.set(x, "via_stops", value.asInstanceOf[js.Any])
        
        inline def setVia_stopsVarargs(value: BusStop*): Self = StObject.set(x, "via_stops", js.Array(value*))
      }
    }
    
    trait Options extends StObject {
      
      /**
        * 公交线路所在城市
        * 默认值：“全国”
        * 可选值：cityname（中文或中文全拼）、citycode、adcode
        */
      var city: js.UndefOr[String] = js.undefined
      
      /**
        * 此项仅公交路线查询时有效，默认值：base，返回公交路线基本信息，当取值为：all，返回公交路线基本信息+详细信息
        */
      var extensions: js.UndefOr[base | all] = js.undefined
      
      /**
        * 页码
        * 默认值：1
        * 取值范围：1-100，超过取值范围按默认，超出实际页数按最大值返回
        */
      var pageIndex: js.UndefOr[Double] = js.undefined
      
      /**
        * 单页显示结果条数
        * 默认值：20
        * 取值范围：1-100，超过取值范围按默认
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
        
        inline def setExtensions(value: base | all): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
        
        inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
        
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
      var cityList: js.UndefOr[js.Array[Any]] = js.undefined
      
      /**
        * 成功状态文字描述
        */
      var info: String
      
      /**
        * 查无此公交站时，返回的建议关键字列表
        */
      var keywordList: js.UndefOr[js.Array[Any]] = js.undefined
      
      /**
        * 根据查询条件返回公交路线信息
        */
      var lineInfo: js.Array[LineInfo]
    }
    object SearchResult {
      
      inline def apply(info: String, lineInfo: js.Array[LineInfo]): SearchResult = {
        val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], lineInfo = lineInfo.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchResult]
      }
      
      extension [Self <: SearchResult](x: Self) {
        
        inline def setCityList(value: js.Array[Any]): Self = StObject.set(x, "cityList", value.asInstanceOf[js.Any])
        
        inline def setCityListUndefined: Self = StObject.set(x, "cityList", js.undefined)
        
        inline def setCityListVarargs(value: Any*): Self = StObject.set(x, "cityList", js.Array(value*))
        
        inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        inline def setKeywordList(value: js.Array[Any]): Self = StObject.set(x, "keywordList", value.asInstanceOf[js.Any])
        
        inline def setKeywordListUndefined: Self = StObject.set(x, "keywordList", js.undefined)
        
        inline def setKeywordListVarargs(value: Any*): Self = StObject.set(x, "keywordList", js.Array(value*))
        
        inline def setLineInfo(value: js.Array[LineInfo]): Self = StObject.set(x, "lineInfo", value.asInstanceOf[js.Any])
        
        inline def setLineInfoVarargs(value: LineInfo*): Self = StObject.set(x, "lineInfo", js.Array(value*))
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.complete
      - typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.error
      - typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.no_data
    */
    trait SearchStatus extends StObject
    object SearchStatus {
      
      inline def complete: typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.complete = "complete".asInstanceOf[typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.complete]
      
      inline def error: typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.error = "error".asInstanceOf[typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.error]
      
      inline def no_data: typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.no_data = "no_data".asInstanceOf[typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.no_data]
    }
  }
}
