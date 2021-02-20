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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  @js.native
  trait LineSearch extends EventEmitter {
    
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
    
    @js.native
    trait BusStop extends StObject {
      
      var id: String = js.native
      
      var location: LngLat = js.native
      
      var name: String = js.native
      
      var sequence: Double = js.native
    }
    object BusStop {
      
      @scala.inline
      def apply(id: String, location: LngLat, name: String, sequence: Double): BusStop = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
        __obj.asInstanceOf[BusStop]
      }
      
      @scala.inline
      implicit class BusStopMutableBuilder[Self <: BusStop] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait EventMap extends StObject {
      
      var complete: Event_[typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.complete, SearchResult] = js.native
      
      var error: Event_[typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.error, Info] = js.native
    }
    object EventMap {
      
      @scala.inline
      def apply(complete: Event_[complete, SearchResult], error: Event_[error, Info]): EventMap = {
        val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventMap]
      }
      
      @scala.inline
      implicit class EventMapMutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setComplete(value: Event_[complete, SearchResult]): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: Event_[error, Info]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.amapJsApiLineSearch.AMap.LineSearch.LineInfoBase
      - typings.amapJsApiLineSearch.AMap.LineSearch.LineInfoExt
    */
    trait LineInfo extends StObject
    object LineInfo {
      
      @scala.inline
      def LineInfoBase(
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
      
      @scala.inline
      def LineInfoExt(
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
    
    @js.native
    trait LineInfoBase extends LineInfo {
      
      /**
        * 所在城市的城市编码
        */
      var citycode: String = js.native
      
      /**
        * 终点站
        */
      var end_stop: String = js.native
      
      /**
        * 公交线路id，该id是唯一标识
        */
      var id: String = js.native
      
      /**
        * 线路名称
        */
      var name: String = js.native
      
      /**
        * 线路经纬度
        */
      var path: js.Array[LngLat] = js.native
      
      /**
        * 首发站
        */
      var start_stop: String = js.native
      
      /**
        * 公交类型列表
        */
      var `type`: String = js.native
    }
    object LineInfoBase {
      
      @scala.inline
      def apply(
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
      
      @scala.inline
      implicit class LineInfoBaseMutableBuilder[Self <: LineInfoBase] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnd_stop(value: String): Self = StObject.set(x, "end_stop", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPath(value: js.Array[LngLat]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathVarargs(value: LngLat*): Self = StObject.set(x, "path", js.Array(value :_*))
        
        @scala.inline
        def setStart_stop(value: String): Self = StObject.set(x, "start_stop", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.amapJsApiLineSearch.AMap.LineSearch.LineInfo because Already inherited */ @js.native
    trait LineInfoExt extends LineInfoBase {
      
      /**
        * 起步票价，单位：元
        */
      var basic_price: String = js.native
      
      // is string actually
      /**
        * 全程距离，单位：千米
        */
      var bounds: Bounds = js.native
      
      /**
        * 所属公交公司
        */
      var company: String = js.native
      
      /**
        * 全程距离，单位：千米
        */
      var distance: String = js.native
      
      /**
        * 末班车时间
        */
      var etime: String = js.native
      
      /**
        * 首班车时间
        */
      var stime: String = js.native
      
      /**
        * 全程票价，单位：元
        */
      var total_price: String = js.native
      
      /**
        * 途径站，包括首发站和终点站
        */
      var via_stops: js.Array[BusStop] = js.native
    }
    object LineInfoExt {
      
      @scala.inline
      def apply(
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
      
      @scala.inline
      implicit class LineInfoExtMutableBuilder[Self <: LineInfoExt] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBasic_price(value: String): Self = StObject.set(x, "basic_price", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDistance(value: String): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtime(value: String): Self = StObject.set(x, "etime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStime(value: String): Self = StObject.set(x, "stime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTotal_price(value: String): Self = StObject.set(x, "total_price", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVia_stops(value: js.Array[BusStop]): Self = StObject.set(x, "via_stops", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVia_stopsVarargs(value: BusStop*): Self = StObject.set(x, "via_stops", js.Array(value :_*))
      }
    }
    
    @js.native
    trait Options extends StObject {
      
      /**
        * 公交线路所在城市
        * 默认值：“全国”
        * 可选值：cityname（中文或中文全拼）、citycode、adcode
        */
      var city: js.UndefOr[String] = js.native
      
      /**
        * 此项仅公交路线查询时有效，默认值：base，返回公交路线基本信息，当取值为：all，返回公交路线基本信息+详细信息
        */
      var extensions: js.UndefOr[base | all] = js.native
      
      /**
        * 页码
        * 默认值：1
        * 取值范围：1-100，超过取值范围按默认，超出实际页数按最大值返回
        */
      var pageIndex: js.UndefOr[Double] = js.native
      
      /**
        * 单页显示结果条数
        * 默认值：20
        * 取值范围：1-100，超过取值范围按默认
        */
      var pageSize: js.UndefOr[Double] = js.native
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
        def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
        
        @scala.inline
        def setExtensions(value: base | all): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
        
        @scala.inline
        def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageIndexUndefined: Self = StObject.set(x, "pageIndex", js.undefined)
        
        @scala.inline
        def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      }
    }
    
    @js.native
    trait SearchResult extends StObject {
      
      /**
        * 查该城市无此公交站时，返回的建议城市列表
        */
      var cityList: js.UndefOr[js.Array[_]] = js.native
      
      /**
        * 成功状态文字描述
        */
      var info: String = js.native
      
      /**
        * 查无此公交站时，返回的建议关键字列表
        */
      var keywordList: js.UndefOr[js.Array[_]] = js.native
      
      /**
        * 根据查询条件返回公交路线信息
        */
      var lineInfo: js.Array[LineInfo] = js.native
    }
    object SearchResult {
      
      @scala.inline
      def apply(info: String, lineInfo: js.Array[LineInfo]): SearchResult = {
        val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], lineInfo = lineInfo.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchResult]
      }
      
      @scala.inline
      implicit class SearchResultMutableBuilder[Self <: SearchResult] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCityList(value: js.Array[_]): Self = StObject.set(x, "cityList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCityListUndefined: Self = StObject.set(x, "cityList", js.undefined)
        
        @scala.inline
        def setCityListVarargs(value: js.Any*): Self = StObject.set(x, "cityList", js.Array(value :_*))
        
        @scala.inline
        def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeywordList(value: js.Array[_]): Self = StObject.set(x, "keywordList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeywordListUndefined: Self = StObject.set(x, "keywordList", js.undefined)
        
        @scala.inline
        def setKeywordListVarargs(value: js.Any*): Self = StObject.set(x, "keywordList", js.Array(value :_*))
        
        @scala.inline
        def setLineInfo(value: js.Array[LineInfo]): Self = StObject.set(x, "lineInfo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLineInfoVarargs(value: LineInfo*): Self = StObject.set(x, "lineInfo", js.Array(value :_*))
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.complete
      - typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.error
      - typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.no_data
    */
    trait SearchStatus extends StObject
    object SearchStatus {
      
      @scala.inline
      def complete: typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.complete = "complete".asInstanceOf[typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.complete]
      
      @scala.inline
      def error: typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.error = "error".asInstanceOf[typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.error]
      
      @scala.inline
      def no_data: typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.no_data = "no_data".asInstanceOf[typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.no_data]
    }
  }
}
