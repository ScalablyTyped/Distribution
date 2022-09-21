package typings.amapJsApiRiding

import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApi.AMap.Event_
import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.LocationValue
import typings.amapJsApi.AMap.Map
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiExt
import typings.amapJsApiRiding.AMap.Riding.SearchPoint
import typings.amapJsApiRiding.AMap.Riding.SearchResultBase
import typings.amapJsApiRiding.AMap.Riding.SearchResultExt
import typings.amapJsApiRiding.AMap.Riding.SearchStatus
import typings.amapJsApiRiding.amapJsApiRidingStrings.complete
import typings.amapJsApiRiding.amapJsApiRidingStrings.end
import typings.amapJsApiRiding.amapJsApiRidingStrings.error
import typings.amapJsApiRiding.amapJsApiRidingStrings.start
import typings.amapJsApiRiding.anon.Info
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  @js.native
  sealed trait RidingPolicy extends StObject
  @JSGlobal("AMap.RidingPolicy")
  @js.native
  object RidingPolicy extends StObject {
    
    @js.native
    sealed trait DEFAULT
      extends StObject
         with RidingPolicy
    
    // 推荐路线
    @js.native
    sealed trait FASTEST
      extends StObject
         with RidingPolicy
    
    // 推荐路线及最快路线综合
    @js.native
    sealed trait RECOMMENDED
      extends StObject
         with RidingPolicy
  }
  
  @js.native
  trait Riding
    extends StObject
       with EventEmitter {
    
    /**
      * 清除搜索的结果
      */
    def clear(): Unit = js.native
    
    def close(): Unit = js.native
    
    def open(): Unit = js.native
    
    /**
      * 根据起点和终点坐标，实现骑行路径规划
      * @param origin 起点坐标
      * @param destination 终点坐标
      * @param callback 查询回调
      */
    def search(origin: LocationValue, destination: LocationValue): Unit = js.native
    def search(
      origin: LocationValue,
      destination: LocationValue,
      callback: js.Function2[/* status */ SearchStatus, /* result */ SearchResultBase | String, Unit]
    ): Unit = js.native
    /**
      * 根据起点终点名称查询路径规划
      * @param point 名称数组
      * @param callback 查询回调
      */
    def search(point: js.Array[SearchPoint]): Unit = js.native
    def search(
      point: js.Array[SearchPoint],
      callback: js.Function2[/* status */ SearchStatus, /* result */ SearchResultExt | String, Unit]
    ): Unit = js.native
    
    // internal
    def setPolicy(policy: RidingPolicy): Unit = js.native
  }
  object Riding {
    
    trait EventMap extends StObject {
      
      var complete: Event_[typings.amapJsApiRiding.amapJsApiRidingStrings.complete, SearchResult]
      
      var error: Event_[typings.amapJsApiRiding.amapJsApiRidingStrings.error, Info]
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
        * 用于控制在路径规划结束后，是否自动调整地图视野使绘制的路线处于视口的可见范围
        */
      var autoFitView: js.UndefOr[Boolean] = js.undefined
      
      /**
        * 设置隐藏路径规划的起始点图标，设置为true：隐藏图标；设置false：显示图标 默认值为：false
        */
      var hideMarkers: js.UndefOr[Boolean] = js.undefined
      
      /**
        * 使用map属性时，绘制的规划线路是否显示描边，默认为true
        */
      var isOutline: js.UndefOr[Boolean] = js.undefined
      
      /**
        * AMap.Map对象, 展现结果的地图实例。
        * 当指定此参数后，搜索结果的标注、线路等均会自动添加到此地图上
        */
      var map: js.UndefOr[Map] = js.undefined
      
      /**
        * 使用map属性时，绘制的规划线路是否显示描边，默认为"white"
        */
      var outlineColor: js.UndefOr[String] = js.undefined
      
      /**
        * 结果列表的HTML容器id或容器元素，提供此参数后，结果列表将在此容器中进行展示
        */
      var panel: js.UndefOr[String | HTMLElement] = js.undefined
      
      /**
        * 骑行路线规划策略
        */
      var policy: js.UndefOr[RidingPolicy] = js.undefined
      
      // internal
      var showDir: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setAutoFitView(value: Boolean): Self = StObject.set(x, "autoFitView", value.asInstanceOf[js.Any])
        
        inline def setAutoFitViewUndefined: Self = StObject.set(x, "autoFitView", js.undefined)
        
        inline def setHideMarkers(value: Boolean): Self = StObject.set(x, "hideMarkers", value.asInstanceOf[js.Any])
        
        inline def setHideMarkersUndefined: Self = StObject.set(x, "hideMarkers", js.undefined)
        
        inline def setIsOutline(value: Boolean): Self = StObject.set(x, "isOutline", value.asInstanceOf[js.Any])
        
        inline def setIsOutlineUndefined: Self = StObject.set(x, "isOutline", js.undefined)
        
        inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
        
        inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
        
        inline def setOutlineColor(value: String): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
        
        inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
        
        inline def setPanel(value: String | HTMLElement): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
        
        inline def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
        
        inline def setPolicy(value: RidingPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
        
        inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
        
        inline def setShowDir(value: Boolean): Self = StObject.set(x, "showDir", value.asInstanceOf[js.Any])
        
        inline def setShowDirUndefined: Self = StObject.set(x, "showDir", js.undefined)
      }
    }
    
    trait Poi extends StObject {
      
      /**
        * 坐标
        */
      var location: LngLat
      
      /**
        * 名称
        */
      var name: String
      
      /**
        * 类型
        */
      var `type`: start | end
    }
    object Poi {
      
      inline def apply(location: LngLat, name: String, `type`: start | end): Poi = {
        val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Poi]
      }
      
      extension [Self <: Poi](x: Self) {
        
        inline def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setType(value: start | end): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    trait RideRoute extends StObject {
      
      /**
        * 起点到终点总步行距离，单位：米
        */
      var distance: Double
      
      /**
        * 路段列表，以道路名称作为分段依据，将整个骑行导航方案分隔成若干路段
        */
      var rides: js.Array[RideStep]
      
      /**
        * 步行时间预计，单位：秒
        */
      var time: Double
    }
    object RideRoute {
      
      inline def apply(distance: Double, rides: js.Array[RideStep], time: Double): RideRoute = {
        val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], rides = rides.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
        __obj.asInstanceOf[RideRoute]
      }
      
      extension [Self <: RideRoute](x: Self) {
        
        inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
        
        inline def setRides(value: js.Array[RideStep]): Self = StObject.set(x, "rides", value.asInstanceOf[js.Any])
        
        inline def setRidesVarargs(value: RideStep*): Self = StObject.set(x, "rides", js.Array(value*))
        
        inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      }
    }
    
    trait RideStep extends StObject {
      
      /**
        * 本骑行子路段完成后动作
        */
      var action: String
      
      /**
        * @deprecated
        * 本骑行子路段完成后辅助动作，一般为到达某个目的地时返回
        * 文档中有此字段但是实际代码中并没有返回
        */
      var assist_action: js.UndefOr[String] = js.undefined
      
      /**
        * 此路段距离，单位：米
        */
      var distance: Double
      
      /**
        * 本路段的终点坐标
        */
      var end_location: LngLat
      
      /**
        * 此路段说明，如“沿北京南站路骑行565米右转”
        */
      var instruction: String
      
      /**
        * 步行方向
        */
      var orientation: String
      
      /**
        * 此路段坐标集合
        */
      var path: js.Array[LngLat]
      
      /**
        * 道路
        */
      var road: String
      
      /**
        * 本路段的起点坐标
        */
      var start_location: LngLat
      
      /**
        * 此路段预计使用时间，单位：秒
        */
      var time: Double
    }
    object RideStep {
      
      inline def apply(
        action: String,
        distance: Double,
        end_location: LngLat,
        instruction: String,
        orientation: String,
        path: js.Array[LngLat],
        road: String,
        start_location: LngLat,
        time: Double
      ): RideStep = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], end_location = end_location.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], road = road.asInstanceOf[js.Any], start_location = start_location.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
        __obj.asInstanceOf[RideStep]
      }
      
      extension [Self <: RideStep](x: Self) {
        
        inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        inline def setAssist_action(value: String): Self = StObject.set(x, "assist_action", value.asInstanceOf[js.Any])
        
        inline def setAssist_actionUndefined: Self = StObject.set(x, "assist_action", js.undefined)
        
        inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
        
        inline def setEnd_location(value: LngLat): Self = StObject.set(x, "end_location", value.asInstanceOf[js.Any])
        
        inline def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
        
        inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
        
        inline def setPath(value: js.Array[LngLat]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathVarargs(value: LngLat*): Self = StObject.set(x, "path", js.Array(value*))
        
        inline def setRoad(value: String): Self = StObject.set(x, "road", value.asInstanceOf[js.Any])
        
        inline def setStart_location(value: LngLat): Self = StObject.set(x, "start_location", value.asInstanceOf[js.Any])
        
        inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      }
    }
    
    trait SearchPoint extends StObject {
      
      // 地点名称
      var keyword: String
    }
    object SearchPoint {
      
      inline def apply(keyword: String): SearchPoint = {
        val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchPoint]
      }
      
      extension [Self <: SearchPoint](x: Self) {
        
        inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.amapJsApiRiding.AMap.Riding.SearchResultBase
      - typings.amapJsApiRiding.AMap.Riding.SearchResultExt
    */
    trait SearchResult extends StObject
    object SearchResult {
      
      inline def SearchResultBase(count: Double, destination: LngLat, info: String, origin: LngLat, routes: js.Array[RideRoute]): typings.amapJsApiRiding.AMap.Riding.SearchResultBase = {
        val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.amapJsApiRiding.AMap.Riding.SearchResultBase]
      }
      
      inline def SearchResultExt(
        count: Double,
        destination: LngLat,
        destinationName: String,
        end: PoiExt,
        info: String,
        origin: LngLat,
        originName: String,
        routes: js.Array[RideRoute],
        start: PoiExt
      ): typings.amapJsApiRiding.AMap.Riding.SearchResultExt = {
        val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], originName = originName.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.amapJsApiRiding.AMap.Riding.SearchResultExt]
      }
    }
    
    trait SearchResultBase
      extends StObject
         with SearchResultCommon
         with SearchResult {
      
      /**
        * 骑行导航终点
        */
      var end: js.UndefOr[Poi] = js.undefined
      
      /**
        * 骑行导航起点
        */
      var start: js.UndefOr[Poi] = js.undefined
    }
    object SearchResultBase {
      
      inline def apply(count: Double, destination: LngLat, info: String, origin: LngLat, routes: js.Array[RideRoute]): SearchResultBase = {
        val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchResultBase]
      }
      
      extension [Self <: SearchResultBase](x: Self) {
        
        inline def setEnd(value: Poi): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
        
        inline def setStart(value: Poi): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      }
    }
    
    trait SearchResultCommon extends StObject {
      
      /**
        * 骑行导航路段数目
        */
      var count: Double
      
      /**
        * 骑行导航终点坐标
        */
      var destination: LngLat
      
      /**
        * 成功状态说明
        */
      var info: String
      
      /**
        * 骑行导航起点坐标
        */
      var origin: LngLat
      
      /**
        * 骑行规划路线列表
        */
      var routes: js.Array[RideRoute]
    }
    object SearchResultCommon {
      
      inline def apply(count: Double, destination: LngLat, info: String, origin: LngLat, routes: js.Array[RideRoute]): SearchResultCommon = {
        val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchResultCommon]
      }
      
      extension [Self <: SearchResultCommon](x: Self) {
        
        inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setDestination(value: LngLat): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
        
        inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        inline def setOrigin(value: LngLat): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
        
        inline def setRoutes(value: js.Array[RideRoute]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
        
        inline def setRoutesVarargs(value: RideRoute*): Self = StObject.set(x, "routes", js.Array(value*))
      }
    }
    
    trait SearchResultExt
      extends StObject
         with SearchResultCommon
         with SearchResult {
      
      /**
        * 骑行导航终点名称
        */
      var destinationName: String
      
      /**
        * 骑行导航终点
        */
      var end: PoiExt
      
      /**
        * 骑行导航起点名称
        */
      var originName: String
      
      /**
        * 骑行导航起点
        */
      var start: PoiExt
    }
    object SearchResultExt {
      
      inline def apply(
        count: Double,
        destination: LngLat,
        destinationName: String,
        end: PoiExt,
        info: String,
        origin: LngLat,
        originName: String,
        routes: js.Array[RideRoute],
        start: PoiExt
      ): SearchResultExt = {
        val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], originName = originName.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchResultExt]
      }
      
      extension [Self <: SearchResultExt](x: Self) {
        
        inline def setDestinationName(value: String): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
        
        inline def setEnd(value: PoiExt): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        inline def setOriginName(value: String): Self = StObject.set(x, "originName", value.asInstanceOf[js.Any])
        
        inline def setStart(value: PoiExt): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.amapJsApiRiding.amapJsApiRidingStrings.complete
      - typings.amapJsApiRiding.amapJsApiRidingStrings.error
      - typings.amapJsApiRiding.amapJsApiRidingStrings.no_data
    */
    trait SearchStatus extends StObject
    object SearchStatus {
      
      inline def complete: typings.amapJsApiRiding.amapJsApiRidingStrings.complete = "complete".asInstanceOf[typings.amapJsApiRiding.amapJsApiRidingStrings.complete]
      
      inline def error: typings.amapJsApiRiding.amapJsApiRidingStrings.error = "error".asInstanceOf[typings.amapJsApiRiding.amapJsApiRidingStrings.error]
      
      inline def no_data: typings.amapJsApiRiding.amapJsApiRidingStrings.no_data = "no_data".asInstanceOf[typings.amapJsApiRiding.amapJsApiRidingStrings.no_data]
    }
  }
}
