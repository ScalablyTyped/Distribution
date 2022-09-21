package typings.amapJsApiTransfer.AMap

import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApi.AMap.Event_
import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.LocationValue
import typings.amapJsApi.AMap.Map
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiExt
import typings.amapJsApiTransfer.AMap.Transfer.SearchPoint
import typings.amapJsApiTransfer.AMap.Transfer.SearchResultBase
import typings.amapJsApiTransfer.AMap.Transfer.SearchResultExt
import typings.amapJsApiTransfer.AMap.Transfer.SearchStatus
import typings.amapJsApiTransfer.amapJsApiTransferStrings.BUS
import typings.amapJsApiTransfer.amapJsApiTransferStrings.METRO_RAIL
import typings.amapJsApiTransfer.amapJsApiTransferStrings.RAILWAY
import typings.amapJsApiTransfer.amapJsApiTransferStrings.SUBWAY
import typings.amapJsApiTransfer.amapJsApiTransferStrings.TAXI
import typings.amapJsApiTransfer.amapJsApiTransferStrings.WALK
import typings.amapJsApiTransfer.amapJsApiTransferStrings.all
import typings.amapJsApiTransfer.amapJsApiTransferStrings.base
import typings.amapJsApiTransfer.amapJsApiTransferStrings.complete
import typings.amapJsApiTransfer.amapJsApiTransferStrings.end
import typings.amapJsApiTransfer.amapJsApiTransferStrings.error
import typings.amapJsApiTransfer.amapJsApiTransferStrings.start
import typings.amapJsApiTransfer.anon.Destination
import typings.amapJsApiTransfer.anon.Info
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transfer
  extends StObject
     with EventEmitter {
  
  /**
    * 清除结果显示
    */
  def clear(): Unit = js.native
  
  def close(): Unit = js.native
  
  /**
    * 设置公交路径规划出发时间
    * @param time 时间
    * @param date 日期
    */
  def leaveAt(): Unit = js.native
  def leaveAt(time: String): Unit = js.native
  def leaveAt(time: String, date: String): Unit = js.native
  def leaveAt(time: Unit, date: String): Unit = js.native
  
  // internal
  def open(): Unit = js.native
  
  /**
    * 根据起点和终点坐标，进行公交换乘查询
    * @param origin 起点坐标
    * @param destination 终点坐标
    * @param callback 查询回调
    */
  def search(origin: LocationValue, destination: LocationValue): Unit = js.native
  def search(
    origin: LocationValue,
    destination: LocationValue,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResultBase, Unit]
  ): Unit = js.native
  /**
    * 根据起点和终点坐标，进行公交换乘查询
    * @param path 路径名称关键字
    * @param callback 路径回调
    */
  def search(path: js.Tuple2[SearchPoint, SearchPoint]): Unit = js.native
  def search(
    path: js.Tuple2[SearchPoint, SearchPoint],
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResultExt, Unit]
  ): Unit = js.native
  
  /**
    * 唤起高德地图客户端公交路径规划
    * @param obj 唤起参数
    */
  def searchOnAMAP(obj: Destination): Unit = js.native
  
  /**
    * 设置公交换乘查询的城市
    * @param city  城市名称、城市区号、电话区号
    */
  def setCity(): Unit = js.native
  def setCity(city: String): Unit = js.native
  
  /**
    * 设置公交换乘查询的城市
    * @param city  城市名称、城市区号、电话区号
    */
  def setCityd(): Unit = js.native
  def setCityd(city: String): Unit = js.native
  
  /**
    * 设置公交换乘策略
    * @param policy 公交换乘策略
    */
  def setPolicy(): Unit = js.native
  def setPolicy(policy: TransferPolicy): Unit = js.native
}
object Transfer {
  
  trait Alter extends StObject {
    
    /**
      * 备选方案ID
      */
    var id: String
    
    /**
      * 备选线路名称
      */
    var name: String
  }
  object Alter {
    
    inline def apply(id: String, name: String): Alter = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alter]
    }
    
    extension [Self <: Alter](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventMap extends StObject {
    
    var complete: Event_[typings.amapJsApiTransfer.amapJsApiTransferStrings.complete, SearchResult]
    
    var error: Event_[typings.amapJsApiTransfer.amapJsApiTransferStrings.error, Info]
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
      * 公交换乘的城市，支持城市名称、城市区号、电话区号，此项为必填
      */
    var city: String
    
    /**
      * 终点城市，跨城公交路径规划时为必填参数
      */
    var cityd: js.UndefOr[String] = js.undefined
    
    /**
      * 返回结果控制, 默认值: base
      * base:返回基本信息
      * all:返回全部信息
      */
    var extensions: js.UndefOr[all | base] = js.undefined
    
    /**
      * 设置是否隐藏路径规划的起始点图标
      */
    var hideMarkers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 使用map属性时，绘制的规划线路是否显示描边。默认为true
      */
    var isOutline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * AMap.Map对象, 展现结果的地图实例
      */
    var map: js.UndefOr[Map] = js.undefined
    
    /**
      * 是否计算夜班车，默认为不计算
      */
    var nightflag: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 使用map属性时，绘制的规划线路的描边颜色。默认为'white'
      */
    var outlineColor: js.UndefOr[String] = js.undefined
    
    /**
      * 结果列表的HTML容器id或容器元素
      */
    var panel: js.UndefOr[String] = js.undefined
    
    /**
      * 公交换乘策略
      */
    var policy: js.UndefOr[TransferPolicy] = js.undefined
    
    // internal
    var showDir: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(city: String): Options = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAutoFitView(value: Boolean): Self = StObject.set(x, "autoFitView", value.asInstanceOf[js.Any])
      
      inline def setAutoFitViewUndefined: Self = StObject.set(x, "autoFitView", js.undefined)
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCityd(value: String): Self = StObject.set(x, "cityd", value.asInstanceOf[js.Any])
      
      inline def setCitydUndefined: Self = StObject.set(x, "cityd", js.undefined)
      
      inline def setExtensions(value: all | base): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setHideMarkers(value: Boolean): Self = StObject.set(x, "hideMarkers", value.asInstanceOf[js.Any])
      
      inline def setHideMarkersUndefined: Self = StObject.set(x, "hideMarkers", js.undefined)
      
      inline def setIsOutline(value: Boolean): Self = StObject.set(x, "isOutline", value.asInstanceOf[js.Any])
      
      inline def setIsOutlineUndefined: Self = StObject.set(x, "isOutline", js.undefined)
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setNightflag(value: Boolean): Self = StObject.set(x, "nightflag", value.asInstanceOf[js.Any])
      
      inline def setNightflagUndefined: Self = StObject.set(x, "nightflag", js.undefined)
      
      inline def setOutlineColor(value: String): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
      
      inline def setPanel(value: String): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      inline def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
      
      inline def setPolicy(value: TransferPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      inline def setShowDir(value: Boolean): Self = StObject.set(x, "showDir", value.asInstanceOf[js.Any])
      
      inline def setShowDirUndefined: Self = StObject.set(x, "showDir", js.undefined)
    }
  }
  
  trait Poi extends StObject {
    
    var location: LngLat
    
    var name: String
    
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
  
  trait RailStop extends StObject {
    
    /**
      * 上、下车站点所在城市的adcode
      */
    var adcode: String
    
    /**
      * 上、下车站点ID
      */
    var id: String
    
    /**
      * 上、下站点经纬度信息
      */
    var location: LngLat
    
    /**
      * 上、下车站点名称
      */
    var name: String
    
    var segment: js.UndefOr[RailwaySegment] = js.undefined
    
    /**
      * 上下车点发车时间
      */
    var time: Double
    
    @JSName("wait")
    var wait_FRailStop: js.UndefOr[Double] = js.undefined
  }
  object RailStop {
    
    inline def apply(adcode: String, id: String, location: LngLat, name: String, time: Double): RailStop = {
      val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[RailStop]
    }
    
    extension [Self <: RailStop](x: Self) {
      
      inline def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSegment(value: RailwaySegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
      
      inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.amapJsApiTransfer.AMap.Transfer.RailwayDetailsBase
    - typings.amapJsApiTransfer.AMap.Transfer.RailwayDetailsExt
  */
  trait RailwayDetails extends StObject
  object RailwayDetails {
    
    inline def RailwayDetailsBase(
      arrival_stop: RailStop,
      departure_stop: RailStop,
      distance: Double,
      id: String,
      name: String,
      spaces: js.Array[Space],
      time: Double,
      trip: String,
      `type`: String
    ): typings.amapJsApiTransfer.AMap.Transfer.RailwayDetailsBase = {
      val __obj = js.Dynamic.literal(arrival_stop = arrival_stop.asInstanceOf[js.Any], departure_stop = departure_stop.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], trip = trip.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.amapJsApiTransfer.AMap.Transfer.RailwayDetailsBase]
    }
    
    inline def RailwayDetailsExt(
      alters: js.Array[Alter],
      arrival_stop: RailStop,
      departure_stop: RailStop,
      distance: Double,
      id: String,
      name: String,
      spaces: js.Array[Space],
      time: Double,
      trip: String,
      `type`: String,
      via_num: Double,
      via_stops: js.Array[ViaStop]
    ): typings.amapJsApiTransfer.AMap.Transfer.RailwayDetailsExt = {
      val __obj = js.Dynamic.literal(alters = alters.asInstanceOf[js.Any], arrival_stop = arrival_stop.asInstanceOf[js.Any], departure_stop = departure_stop.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], trip = trip.asInstanceOf[js.Any], via_num = via_num.asInstanceOf[js.Any], via_stops = via_stops.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.amapJsApiTransfer.AMap.Transfer.RailwayDetailsExt]
    }
  }
  
  trait RailwayDetailsBase
    extends StObject
       with RailwayDetails {
    
    /**
      * 火车到站信息
      */
    var arrival_stop: RailStop
    
    /**
      * 火车始发站信息
      */
    var departure_stop: RailStop
    
    /**
      * 该换乘段的行车总距离
      */
    var distance: Double
    
    /**
      * 线路id编码
      */
    var id: String
    
    /**
      * 线路名称
      */
    var name: String
    
    /**
      * 仓位及价格信息
      */
    var spaces: js.Array[Space]
    
    /**
      * 该线路车段耗时
      */
    var time: Double
    
    /**
      * 线路车次号
      */
    var trip: String
    
    /**
      * 线路车次类型，参考火车路线类型列表
      */
    var `type`: String
  }
  object RailwayDetailsBase {
    
    inline def apply(
      arrival_stop: RailStop,
      departure_stop: RailStop,
      distance: Double,
      id: String,
      name: String,
      spaces: js.Array[Space],
      time: Double,
      trip: String,
      `type`: String
    ): RailwayDetailsBase = {
      val __obj = js.Dynamic.literal(arrival_stop = arrival_stop.asInstanceOf[js.Any], departure_stop = departure_stop.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], trip = trip.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RailwayDetailsBase]
    }
    
    extension [Self <: RailwayDetailsBase](x: Self) {
      
      inline def setArrival_stop(value: RailStop): Self = StObject.set(x, "arrival_stop", value.asInstanceOf[js.Any])
      
      inline def setDeparture_stop(value: RailStop): Self = StObject.set(x, "departure_stop", value.asInstanceOf[js.Any])
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSpaces(value: js.Array[Space]): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
      
      inline def setSpacesVarargs(value: Space*): Self = StObject.set(x, "spaces", js.Array(value*))
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTrip(value: String): Self = StObject.set(x, "trip", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.amapJsApiTransfer.AMap.Transfer.RailwayDetails because Already inherited */ trait RailwayDetailsExt
    extends StObject
       with RailwayDetailsBase {
    
    /**
      * 聚合的备选方案
      */
    var alters: js.Array[Alter]
    
    /**
      * 途经站点数量
      */
    var via_num: Double
    
    /**
      * 途经站点信息
      */
    var via_stops: js.Array[ViaStop]
  }
  object RailwayDetailsExt {
    
    inline def apply(
      alters: js.Array[Alter],
      arrival_stop: RailStop,
      departure_stop: RailStop,
      distance: Double,
      id: String,
      name: String,
      spaces: js.Array[Space],
      time: Double,
      trip: String,
      `type`: String,
      via_num: Double,
      via_stops: js.Array[ViaStop]
    ): RailwayDetailsExt = {
      val __obj = js.Dynamic.literal(alters = alters.asInstanceOf[js.Any], arrival_stop = arrival_stop.asInstanceOf[js.Any], departure_stop = departure_stop.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], trip = trip.asInstanceOf[js.Any], via_num = via_num.asInstanceOf[js.Any], via_stops = via_stops.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RailwayDetailsExt]
    }
    
    extension [Self <: RailwayDetailsExt](x: Self) {
      
      inline def setAlters(value: js.Array[Alter]): Self = StObject.set(x, "alters", value.asInstanceOf[js.Any])
      
      inline def setAltersVarargs(value: Alter*): Self = StObject.set(x, "alters", js.Array(value*))
      
      inline def setVia_num(value: Double): Self = StObject.set(x, "via_num", value.asInstanceOf[js.Any])
      
      inline def setVia_stops(value: js.Array[ViaStop]): Self = StObject.set(x, "via_stops", value.asInstanceOf[js.Any])
      
      inline def setVia_stopsVarargs(value: ViaStop*): Self = StObject.set(x, "via_stops", js.Array(value*))
    }
  }
  
  trait RailwaySegment
    extends StObject
       with SegmentCommon
       with Segment {
    
    /**
      * 此换乘段导航信息
      */
    var transit: RailwayDetails
    
    /**
      * 换乘动作类型
      */
    var transit_mode: RAILWAY
  }
  object RailwaySegment {
    
    inline def apply(distance: Double, instruction: String, time: Double, transit: RailwayDetails): RailwaySegment = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = "RAILWAY")
      __obj.asInstanceOf[RailwaySegment]
    }
    
    extension [Self <: RailwaySegment](x: Self) {
      
      inline def setTransit(value: RailwayDetails): Self = StObject.set(x, "transit", value.asInstanceOf[js.Any])
      
      inline def setTransit_mode(value: RAILWAY): Self = StObject.set(x, "transit_mode", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchPoint extends StObject {
    
    /**
      * 关键词
      */
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
    - typings.amapJsApiTransfer.AMap.Transfer.SearchResultBase
    - typings.amapJsApiTransfer.AMap.Transfer.SearchResultExt
  */
  trait SearchResult extends StObject
  object SearchResult {
    
    inline def SearchResultBase(
      destination: LngLat,
      info: String,
      origin: LngLat,
      plans: js.Array[TransferPlan],
      taxi_cost: Double
    ): typings.amapJsApiTransfer.AMap.Transfer.SearchResultBase = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any], taxi_cost = taxi_cost.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.amapJsApiTransfer.AMap.Transfer.SearchResultBase]
    }
    
    inline def SearchResultExt(
      destination: LngLat,
      destinationName: String,
      end: PoiExt,
      info: String,
      origin: LngLat,
      originName: String,
      plans: js.Array[TransferPlan],
      start: PoiExt,
      taxi_cost: Double
    ): typings.amapJsApiTransfer.AMap.Transfer.SearchResultExt = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], originName = originName.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], taxi_cost = taxi_cost.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.amapJsApiTransfer.AMap.Transfer.SearchResultExt]
    }
  }
  
  trait SearchResultBase
    extends StObject
       with SearchResultCommon
       with SearchResult {
    
    /**
      * 公交换乘终点
      */
    var end: js.UndefOr[Poi] = js.undefined
    
    /**
      * 公交换乘起点
      */
    var start: js.UndefOr[Poi] = js.undefined
  }
  object SearchResultBase {
    
    inline def apply(
      destination: LngLat,
      info: String,
      origin: LngLat,
      plans: js.Array[TransferPlan],
      taxi_cost: Double
    ): SearchResultBase = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any], taxi_cost = taxi_cost.asInstanceOf[js.Any])
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
      * 公交换乘终点坐标
      */
    var destination: LngLat
    
    /**
      * 成功状态说明
      */
    var info: String
    
    /**
      * 公交换乘起点坐标
      */
    var origin: LngLat
    
    /**
      * 换乘方案列表
      */
    var plans: js.Array[TransferPlan]
    
    /**
      * 出租车费用，单位：元
      */
    var taxi_cost: Double
  }
  object SearchResultCommon {
    
    inline def apply(
      destination: LngLat,
      info: String,
      origin: LngLat,
      plans: js.Array[TransferPlan],
      taxi_cost: Double
    ): SearchResultCommon = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any], taxi_cost = taxi_cost.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResultCommon]
    }
    
    extension [Self <: SearchResultCommon](x: Self) {
      
      inline def setDestination(value: LngLat): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: LngLat): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setPlans(value: js.Array[TransferPlan]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
      
      inline def setPlansVarargs(value: TransferPlan*): Self = StObject.set(x, "plans", js.Array(value*))
      
      inline def setTaxi_cost(value: Double): Self = StObject.set(x, "taxi_cost", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchResultExt
    extends StObject
       with SearchResultCommon
       with SearchResult {
    
    /**
      * 公交换乘终点名称
      */
    var destinationName: String
    
    /**
      * 公交换乘终点
      */
    var end: PoiExt
    
    /**
      * 公交换乘起点名称
      */
    var originName: String
    
    /**
      * 公交换乘起点
      */
    var start: PoiExt
  }
  object SearchResultExt {
    
    inline def apply(
      destination: LngLat,
      destinationName: String,
      end: PoiExt,
      info: String,
      origin: LngLat,
      originName: String,
      plans: js.Array[TransferPlan],
      start: PoiExt,
      taxi_cost: Double
    ): SearchResultExt = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], originName = originName.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], taxi_cost = taxi_cost.asInstanceOf[js.Any])
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
    - typings.amapJsApiTransfer.amapJsApiTransferStrings.complete
    - typings.amapJsApiTransfer.amapJsApiTransferStrings.error
    - typings.amapJsApiTransfer.amapJsApiTransferStrings.no_data
  */
  trait SearchStatus extends StObject
  object SearchStatus {
    
    inline def complete: typings.amapJsApiTransfer.amapJsApiTransferStrings.complete = "complete".asInstanceOf[typings.amapJsApiTransfer.amapJsApiTransferStrings.complete]
    
    inline def error: typings.amapJsApiTransfer.amapJsApiTransferStrings.error = "error".asInstanceOf[typings.amapJsApiTransfer.amapJsApiTransferStrings.error]
    
    inline def no_data: typings.amapJsApiTransfer.amapJsApiTransferStrings.no_data = "no_data".asInstanceOf[typings.amapJsApiTransfer.amapJsApiTransferStrings.no_data]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.amapJsApiTransfer.AMap.Transfer.WalkSegment
    - typings.amapJsApiTransfer.AMap.Transfer.TaxiSegment
    - typings.amapJsApiTransfer.AMap.Transfer.TransitSegment
    - typings.amapJsApiTransfer.AMap.Transfer.RailwaySegment
  */
  trait Segment extends StObject
  object Segment {
    
    inline def RailwaySegment(distance: Double, instruction: String, time: Double, transit: RailwayDetails): typings.amapJsApiTransfer.AMap.Transfer.RailwaySegment = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = "RAILWAY")
      __obj.asInstanceOf[typings.amapJsApiTransfer.AMap.Transfer.RailwaySegment]
    }
    
    inline def TaxiSegment(distance: Double, instruction: String, time: Double, transit: TaxiDetails): typings.amapJsApiTransfer.AMap.Transfer.TaxiSegment = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = "TAXI")
      __obj.asInstanceOf[typings.amapJsApiTransfer.AMap.Transfer.TaxiSegment]
    }
    
    inline def TransitSegment(
      distance: Double,
      instruction: String,
      time: Double,
      transit: TransitDetails,
      transit_mode: SUBWAY | METRO_RAIL | BUS
    ): typings.amapJsApiTransfer.AMap.Transfer.TransitSegment = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = transit_mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.amapJsApiTransfer.AMap.Transfer.TransitSegment]
    }
    
    inline def WalkSegment(distance: Double, instruction: String, time: Double, transit: WalkDetails): typings.amapJsApiTransfer.AMap.Transfer.WalkSegment = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = "WALK")
      __obj.asInstanceOf[typings.amapJsApiTransfer.AMap.Transfer.WalkSegment]
    }
  }
  
  trait SegmentCommon extends StObject {
    
    /**
      * 此换乘段距离
      */
    var distance: Double
    
    /**
      * 此换乘段的文字描述
      */
    var instruction: String
    
    /**
      * 此换乘段预期用时，单位：秒
      */
    var time: Double
  }
  object SegmentCommon {
    
    inline def apply(distance: Double, instruction: String, time: Double): SegmentCommon = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[SegmentCommon]
    }
    
    extension [Self <: SegmentCommon](x: Self) {
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  trait Space extends StObject {
    
    /**
      * 仓位费用
      */
    var cost: Double
    
    /**
      * 仓位编码，参考仓位级别表
      */
    var `type`: String | js.Array[scala.Nothing]
  }
  object Space {
    
    inline def apply(cost: Double, `type`: String | js.Array[scala.Nothing]): Space = {
      val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Space]
    }
    
    extension [Self <: Space](x: Self) {
      
      inline def setCost(value: Double): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
      
      inline def setType(value: String | js.Array[scala.Nothing]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeVarargs(value: scala.Nothing*): Self = StObject.set(x, "type", js.Array(value*))
    }
  }
  
  trait Stop extends StObject {
    
    /**
      * 公交站点ID
      */
    var id: String
    
    /**
      * 站点经纬度信息
      */
    var location: LngLat
    
    /**
      * 公交站点名称
      */
    var name: String
    
    var segment: js.UndefOr[TransitSegment] = js.undefined
  }
  object Stop {
    
    inline def apply(id: String, location: LngLat, name: String): Stop = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stop]
    }
    
    extension [Self <: Stop](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSegment(value: TransitSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
      
      inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    }
  }
  
  trait SubwayEntrance extends StObject {
    
    /**
      * 地铁口经纬度坐标
      */
    var location: LngLat
    
    /**
      * 地铁口名称
      */
    var name: String
  }
  object SubwayEntrance {
    
    inline def apply(location: LngLat, name: String): SubwayEntrance = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubwayEntrance]
    }
    
    extension [Self <: SubwayEntrance](x: Self) {
      
      inline def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaxiDetails extends StObject {
    
    /**
      * 打车终点坐标
      */
    var destination: LngLat
    
    /**
      * 该方案的总距离，单位：米
      */
    var distance: Double
    
    /**
      * 打车起点坐标
      */
    var origin: LngLat
    
    /**
      * 起点名称
      */
    var sname: String
    
    /**
      * 耗时，单位：秒
      */
    var time: Double
    
    /**
      * 终点名称
      */
    var tname: String
  }
  object TaxiDetails {
    
    inline def apply(destination: LngLat, distance: Double, origin: LngLat, sname: String, time: Double, tname: String): TaxiDetails = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], sname = sname.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tname = tname.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaxiDetails]
    }
    
    extension [Self <: TaxiDetails](x: Self) {
      
      inline def setDestination(value: LngLat): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: LngLat): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setSname(value: String): Self = StObject.set(x, "sname", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTname(value: String): Self = StObject.set(x, "tname", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaxiSegment
    extends StObject
       with SegmentCommon
       with Segment {
    
    /**
      * 此换乘段导航信息
      */
    var transit: TaxiDetails
    
    /**
      * 换乘动作类型
      */
    var transit_mode: TAXI
  }
  object TaxiSegment {
    
    inline def apply(distance: Double, instruction: String, time: Double, transit: TaxiDetails): TaxiSegment = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = "TAXI")
      __obj.asInstanceOf[TaxiSegment]
    }
    
    extension [Self <: TaxiSegment](x: Self) {
      
      inline def setTransit(value: TaxiDetails): Self = StObject.set(x, "transit", value.asInstanceOf[js.Any])
      
      inline def setTransit_mode(value: TAXI): Self = StObject.set(x, "transit_mode", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransferPlan extends StObject {
    
    /**
      * 此换乘方案价格，单位：元
      */
    var cost: Double
    
    /**
      * 此换乘方案全程距离，单位：米
      */
    var distance: Double
    
    /**
      * 是否夜间线路
      */
    var nightLine: Boolean
    
    /**
      * 此换乘方案的路径坐标集合
      */
    var path: js.Array[LngLat]
    
    /**
      * 此方案火车行驶距离，单位：米
      */
    var railway_distance: Double
    
    /**
      * 换乘路段列表，以每次换乘动结束作为分段点，将整个换乘方案分隔成若干 Segment（换乘路段）
      */
    var segments: js.Array[Segment]
    
    /**
      * 此方案出租车行驶距离，单位：米
      */
    var taxi_distance: Double
    
    /**
      * 预期时间，单位：秒
      */
    var time: Double
    
    /**
      * 此方案公交行驶距离，单位：米
      */
    var transit_distance: Double
    
    /**
      * 此方案总步行距离，单位：米
      */
    var walking_distance: Double
  }
  object TransferPlan {
    
    inline def apply(
      cost: Double,
      distance: Double,
      nightLine: Boolean,
      path: js.Array[LngLat],
      railway_distance: Double,
      segments: js.Array[Segment],
      taxi_distance: Double,
      time: Double,
      transit_distance: Double,
      walking_distance: Double
    ): TransferPlan = {
      val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], nightLine = nightLine.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], railway_distance = railway_distance.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], taxi_distance = taxi_distance.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit_distance = transit_distance.asInstanceOf[js.Any], walking_distance = walking_distance.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferPlan]
    }
    
    extension [Self <: TransferPlan](x: Self) {
      
      inline def setCost(value: Double): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setNightLine(value: Boolean): Self = StObject.set(x, "nightLine", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[LngLat]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: LngLat*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setRailway_distance(value: Double): Self = StObject.set(x, "railway_distance", value.asInstanceOf[js.Any])
      
      inline def setSegments(value: js.Array[Segment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      inline def setSegmentsVarargs(value: Segment*): Self = StObject.set(x, "segments", js.Array(value*))
      
      inline def setTaxi_distance(value: Double): Self = StObject.set(x, "taxi_distance", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTransit_distance(value: Double): Self = StObject.set(x, "transit_distance", value.asInstanceOf[js.Any])
      
      inline def setWalking_distance(value: Double): Self = StObject.set(x, "walking_distance", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransitDetails extends StObject {
    
    /**
      * 地铁站入口
      */
    var entrance: js.UndefOr[SubwayEntrance] = js.undefined
    
    /**
      * 地铁站出口
      */
    var exit: js.UndefOr[SubwayEntrance] = js.undefined
    
    /**
      * 此换乘段公交路线
      */
    var lines: js.Array[TransitLine]
    
    /**
      * 此换乘段的下车站
      */
    var off_station: Stop
    
    /**
      * 此换乘段的上车站
      */
    var on_station: Stop
    
    /**
      * 此换乘段公交部分（上车站-下车站）坐标集合
      */
    var path: js.Array[LngLat]
    
    /**
      * 途径公交站点数（不包括上车站和下车站）
      */
    var via_num: Double
    
    /**
      * 途径公交站点集合（不包括上车站和下车站）
      */
    var via_stops: js.Array[Stop]
  }
  object TransitDetails {
    
    inline def apply(
      lines: js.Array[TransitLine],
      off_station: Stop,
      on_station: Stop,
      path: js.Array[LngLat],
      via_num: Double,
      via_stops: js.Array[Stop]
    ): TransitDetails = {
      val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], off_station = off_station.asInstanceOf[js.Any], on_station = on_station.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], via_num = via_num.asInstanceOf[js.Any], via_stops = via_stops.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitDetails]
    }
    
    extension [Self <: TransitDetails](x: Self) {
      
      inline def setEntrance(value: SubwayEntrance): Self = StObject.set(x, "entrance", value.asInstanceOf[js.Any])
      
      inline def setEntranceUndefined: Self = StObject.set(x, "entrance", js.undefined)
      
      inline def setExit(value: SubwayEntrance): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      inline def setLines(value: js.Array[TransitLine]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesVarargs(value: TransitLine*): Self = StObject.set(x, "lines", js.Array(value*))
      
      inline def setOff_station(value: Stop): Self = StObject.set(x, "off_station", value.asInstanceOf[js.Any])
      
      inline def setOn_station(value: Stop): Self = StObject.set(x, "on_station", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[LngLat]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: LngLat*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setVia_num(value: Double): Self = StObject.set(x, "via_num", value.asInstanceOf[js.Any])
      
      inline def setVia_stops(value: js.Array[Stop]): Self = StObject.set(x, "via_stops", value.asInstanceOf[js.Any])
      
      inline def setVia_stopsVarargs(value: Stop*): Self = StObject.set(x, "via_stops", js.Array(value*))
    }
  }
  
  trait TransitLine extends StObject {
    
    /**
      * 公交路线末班车时间
      */
    var etime: String | js.Array[scala.Nothing]
    
    /**
      * 公交路线ID
      */
    var id: String
    
    /**
      * 公交路线名
      */
    var name: String
    
    /**
      * 公交路线首班车时间
      */
    var stime: String | js.Array[scala.Nothing]
    
    /**
      * 公交类型
      */
    var `type`: String
  }
  object TransitLine {
    
    inline def apply(
      etime: String | js.Array[scala.Nothing],
      id: String,
      name: String,
      stime: String | js.Array[scala.Nothing],
      `type`: String
    ): TransitLine = {
      val __obj = js.Dynamic.literal(etime = etime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stime = stime.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitLine]
    }
    
    extension [Self <: TransitLine](x: Self) {
      
      inline def setEtime(value: String | js.Array[scala.Nothing]): Self = StObject.set(x, "etime", value.asInstanceOf[js.Any])
      
      inline def setEtimeVarargs(value: scala.Nothing*): Self = StObject.set(x, "etime", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStime(value: String | js.Array[scala.Nothing]): Self = StObject.set(x, "stime", value.asInstanceOf[js.Any])
      
      inline def setStimeVarargs(value: scala.Nothing*): Self = StObject.set(x, "stime", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransitSegment
    extends StObject
       with SegmentCommon
       with Segment {
    
    /**
      * 此换乘段导航信息
      */
    var transit: TransitDetails
    
    /**
      * 换乘动作类型
      */
    var transit_mode: SUBWAY | METRO_RAIL | BUS
  }
  object TransitSegment {
    
    inline def apply(
      distance: Double,
      instruction: String,
      time: Double,
      transit: TransitDetails,
      transit_mode: SUBWAY | METRO_RAIL | BUS
    ): TransitSegment = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = transit_mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitSegment]
    }
    
    extension [Self <: TransitSegment](x: Self) {
      
      inline def setTransit(value: TransitDetails): Self = StObject.set(x, "transit", value.asInstanceOf[js.Any])
      
      inline def setTransit_mode(value: SUBWAY | METRO_RAIL | BUS): Self = StObject.set(x, "transit_mode", value.asInstanceOf[js.Any])
    }
  }
  
  trait ViaStop extends StObject {
    
    /**
      * 途径车站点ID
      */
    var id: String
    
    /**
      * 站点经纬度信息
      */
    var location: LngLat
    
    /**
      * 途径车站点名称
      */
    var name: String
    
    /**
      * 途径站点的进站时间，如大于24:00,则表示跨天
      */
    var time: Double
    
    /**
      * 途径站点的停靠时间，单位：分钟
      */
    @JSName("wait")
    var wait_FViaStop: Double
  }
  object ViaStop {
    
    inline def apply(id: String, location: LngLat, name: String, time: Double, wait_ : Double): ViaStop = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.updateDynamic("wait")(wait_.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViaStop]
    }
    
    extension [Self <: ViaStop](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    }
  }
  
  trait WalkDetails extends StObject {
    
    /**
      * 此换乘段的步行终点
      */
    var destination: LngLat
    
    /**
      * 此换乘段的步行起点
      */
    var origin: LngLat
    
    /**
      * 此换乘段坐标集合
      */
    var path: js.Array[LngLat]
    
    /**
      * 步行子路段WalkStep列表
      */
    var steps: js.Array[WalkStep]
  }
  object WalkDetails {
    
    inline def apply(destination: LngLat, origin: LngLat, path: js.Array[LngLat], steps: js.Array[WalkStep]): WalkDetails = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[WalkDetails]
    }
    
    extension [Self <: WalkDetails](x: Self) {
      
      inline def setDestination(value: LngLat): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: LngLat): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[LngLat]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: LngLat*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setSteps(value: js.Array[WalkStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: WalkStep*): Self = StObject.set(x, "steps", js.Array(value*))
    }
  }
  
  trait WalkSegment
    extends StObject
       with SegmentCommon
       with Segment {
    
    /**
      * 此换乘段导航信息
      */
    var transit: WalkDetails
    
    /**
      * 换乘动作类型
      */
    var transit_mode: WALK
  }
  object WalkSegment {
    
    inline def apply(distance: Double, instruction: String, time: Double, transit: WalkDetails): WalkSegment = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = "WALK")
      __obj.asInstanceOf[WalkSegment]
    }
    
    extension [Self <: WalkSegment](x: Self) {
      
      inline def setTransit(value: WalkDetails): Self = StObject.set(x, "transit", value.asInstanceOf[js.Any])
      
      inline def setTransit_mode(value: WALK): Self = StObject.set(x, "transit_mode", value.asInstanceOf[js.Any])
    }
  }
  
  trait WalkStep extends StObject {
    
    /**
      * 本步行子路段完成后动作
      */
    var action: String
    
    /**
      * 步行子路段完成后辅助动作，一般为到达某个公交站点或目的地时返回
      */
    var assist_action: String
    
    /**
      * 步行子路段距离，单位：米
      */
    var distance: Double
    
    /**
      * 步行子路段描述
      */
    var instruction: String
    
    /**
      * 步行子路段坐标集合
      */
    var path: js.Array[LngLat]
    
    /**
      * 道路
      */
    var road: String
    
    /**
      * 步行子路段预计使用时间，单位：秒
      */
    var time: Double
  }
  object WalkStep {
    
    inline def apply(
      action: String,
      assist_action: String,
      distance: Double,
      instruction: String,
      path: js.Array[LngLat],
      road: String,
      time: Double
    ): WalkStep = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], assist_action = assist_action.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], road = road.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[WalkStep]
    }
    
    extension [Self <: WalkStep](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setAssist_action(value: String): Self = StObject.set(x, "assist_action", value.asInstanceOf[js.Any])
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[LngLat]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: LngLat*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setRoad(value: String): Self = StObject.set(x, "road", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
