package typings.amapJsApiDriving.AMap

import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApi.AMap.Event_
import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.LocationValue
import typings.amapJsApi.AMap.Map
import typings.amapJsApiDriving.AMap.Driving.SearchOptions
import typings.amapJsApiDriving.AMap.Driving.SearchPoint
import typings.amapJsApiDriving.AMap.Driving.SearchResultBase
import typings.amapJsApiDriving.AMap.Driving.SearchResultExt
import typings.amapJsApiDriving.AMap.Driving.SearchStatus
import typings.amapJsApiDriving.amapJsApiDrivingNumbers.`0`
import typings.amapJsApiDriving.amapJsApiDrivingNumbers.`1`
import typings.amapJsApiDriving.amapJsApiDrivingStrings.all
import typings.amapJsApiDriving.amapJsApiDrivingStrings.base
import typings.amapJsApiDriving.amapJsApiDrivingStrings.complete
import typings.amapJsApiDriving.amapJsApiDrivingStrings.end
import typings.amapJsApiDriving.amapJsApiDrivingStrings.error
import typings.amapJsApiDriving.amapJsApiDrivingStrings.start
import typings.amapJsApiDriving.amapJsApiDrivingStrings.waypoint
import typings.amapJsApiDriving.anon.Destination
import typings.amapJsApiDriving.anon.Info
import typings.amapJsApiDriving.anon.IsWaypoint
import typings.amapJsApiDriving.anon.PoiisWaypointboolean
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiExt
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Driving extends EventEmitter {
  
  /**
    * 清除搜索结果
    */
  def clear(): Unit = js.native
  
  /**
    * 清除避让区域
    */
  def clearAvoidPolygons(): Unit = js.native
  
  /**
    * 清除避让道路
    */
  def clearAvoidRoad(): Unit = js.native
  
  def close(): Unit = js.native
  
  /**
    * 获取避让区域
    */
  def getAvoidPolygons(): js.Array[LngLat] = js.native
  
  /**
    * 获取避让道路
    */
  def getAvoidRoad(): js.UndefOr[String] = js.native
  
  // internal
  def open(): Unit = js.native
  
  /**
    * 根据起点、终点坐标查询驾车路线规划
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
  def search(
    origin: LocationValue,
    destination: LocationValue,
    opts: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResultBase, Unit]
  ): Unit = js.native
  def search(origin: LocationValue, destination: LocationValue, opts: SearchOptions): Unit = js.native
  def search(
    origin: LocationValue,
    destination: LocationValue,
    opts: SearchOptions,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResultBase, Unit]
  ): Unit = js.native
  /**
    * 以名称关键字查询驾车路线规划
    * @param points 途经点数组
    * @param callback 查询回调
    */
  def search(points: js.Array[SearchPoint]): Unit = js.native
  def search(
    points: js.Array[SearchPoint],
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResultExt, Unit]
  ): Unit = js.native
  
  /**
    * 唤起高德地图客户端驾车路径规划
    * @param obj 唤起参数
    */
  def searchOnAMAP(obj: Destination): Unit = js.native
  
  /**
    * 设置避让区域，最大支持三个避让区域，避让道路和避让区域不能同时使用
    * @param path 避让区域
    */
  def setAvoidPolygons(path: js.Array[js.Array[LocationValue]]): Unit = js.native
  
  /**
    * 设置避让道路名称，只支持一条避让道路，避让道路和避让区域不能同时使用
    * @param road 道路名称
    */
  def setAvoidRoad(road: String): Unit = js.native
  
  /**
    * 设置驾车路线规划策略
    * @param policy 路线规划策略
    */
  def setPolicy(): Unit = js.native
  def setPolicy(policy: DrivingPolicy): Unit = js.native
  
  /**
    * 设置车牌的汉字首字符和首字后的号码，
    * 设置后路线规划的结果将考虑该车牌在当前时间的限行路段
    * @param province 省份缩写
    * @param number 车牌号码
    */
  def setProvinceAndNumber(province: String, number: String): Unit = js.native
}
object Driving {
  
  @js.native
  trait District extends StObject {
    
    /**
      * 行政区编号
      */
    var adcode: String = js.native
    
    /**
      * 行政区名称
      */
    var name: String = js.native
  }
  object District {
    
    @scala.inline
    def apply(adcode: String, name: String): District = {
      val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[District]
    }
    
    @scala.inline
    implicit class DistrictMutableBuilder[Self <: District] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DriveRoute extends StObject {
    
    /**
      * 起点到终点的驾车距离，单位：米
      */
    var distance: Double = js.native
    
    /**
      * 驾车规划策略
      */
    var policy: String = js.native
    
    /**
      * 限行结果
      * 0 代表限行已规避或未限行，即该路线没有限行路段
      * 1 代表限行无法规避，即该线路有限行路段
      */
    var restriction: `0` | `1` = js.native
    
    /**
      * 子路段DriveStep集合
      */
    var steps: js.Array[DriveStep] = js.native
    
    /**
      * 时间预计，单位：秒
      */
    var time: Double = js.native
    
    /**
      * 此驾车路线收费金额，单位：元
      */
    var tolls: Double = js.native
    
    /**
      * 收费路段长度，单位：米
      */
    var tolls_distance: Double = js.native
  }
  object DriveRoute {
    
    @scala.inline
    def apply(
      distance: Double,
      policy: String,
      restriction: `0` | `1`,
      steps: js.Array[DriveStep],
      time: Double,
      tolls: Double,
      tolls_distance: Double
    ): DriveRoute = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], restriction = restriction.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tolls = tolls.asInstanceOf[js.Any], tolls_distance = tolls_distance.asInstanceOf[js.Any])
      __obj.asInstanceOf[DriveRoute]
    }
    
    @scala.inline
    implicit class DriveRouteMutableBuilder[Self <: DriveRoute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestriction(value: `0` | `1`): Self = StObject.set(x, "restriction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSteps(value: js.Array[DriveStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsVarargs(value: DriveStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTolls(value: Double): Self = StObject.set(x, "tolls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTolls_distance(value: Double): Self = StObject.set(x, "tolls_distance", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DriveStep extends StObject {
    
    /**
      * 本驾车子路段完成后动作
      */
    var action: String = js.native
    
    /**
      * 驾车子路段完成后辅助动作，一般为到达某个目的地时返回
      */
    var assistant_action: String = js.native
    
    /**
      * 途径城市列表
      */
    var cities: js.UndefOr[js.Array[ViaCity]] = js.native
    
    /**
      * 此路段距离，单位：米
      */
    var distance: Double = js.native
    
    /**
      * 此路段终点
      */
    var end_location: LngLat = js.native
    
    /**
      * 此路段说明
      */
    var instruction: String = js.native
    
    /**
      * 驾车方向
      */
    var orientation: String = js.native
    
    /**
      * 此路段坐标集合
      */
    var path: js.Array[LngLat] = js.native
    
    /**
      * 道路
      */
    var road: String = js.native
    
    /**
      * 此路段起点
      */
    var start_location: LngLat = js.native
    
    /**
      * 此路段预计使用时间，单位：秒
      */
    var time: Double = js.native
    
    /**
      * 实时交通信息列表
      */
    var tmcs: js.UndefOr[js.Array[TMC]] = js.native
    
    var tmcsPaths: js.UndefOr[js.Array[TMCsPath]] = js.native
    
    /**
      * 收费路段长度，单位：米
      */
    var toll_distance: Double = js.native
    
    /**
      * 主要收费道路
      */
    var toll_road: String = js.native
    
    /**
      * 此段收费，单位：元
      */
    var tolls: Double = js.native
  }
  object DriveStep {
    
    @scala.inline
    def apply(
      action: String,
      assistant_action: String,
      distance: Double,
      end_location: LngLat,
      instruction: String,
      orientation: String,
      path: js.Array[LngLat],
      road: String,
      start_location: LngLat,
      time: Double,
      toll_distance: Double,
      toll_road: String,
      tolls: Double
    ): DriveStep = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], assistant_action = assistant_action.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], end_location = end_location.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], road = road.asInstanceOf[js.Any], start_location = start_location.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], toll_distance = toll_distance.asInstanceOf[js.Any], toll_road = toll_road.asInstanceOf[js.Any], tolls = tolls.asInstanceOf[js.Any])
      __obj.asInstanceOf[DriveStep]
    }
    
    @scala.inline
    implicit class DriveStepMutableBuilder[Self <: DriveStep] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssistant_action(value: String): Self = StObject.set(x, "assistant_action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCities(value: js.Array[ViaCity]): Self = StObject.set(x, "cities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCitiesUndefined: Self = StObject.set(x, "cities", js.undefined)
      
      @scala.inline
      def setCitiesVarargs(value: ViaCity*): Self = StObject.set(x, "cities", js.Array(value :_*))
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd_location(value: LngLat): Self = StObject.set(x, "end_location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: js.Array[LngLat]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: LngLat*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setRoad(value: String): Self = StObject.set(x, "road", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart_location(value: LngLat): Self = StObject.set(x, "start_location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTmcs(value: js.Array[TMC]): Self = StObject.set(x, "tmcs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTmcsPaths(value: js.Array[TMCsPath]): Self = StObject.set(x, "tmcsPaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTmcsPathsUndefined: Self = StObject.set(x, "tmcsPaths", js.undefined)
      
      @scala.inline
      def setTmcsPathsVarargs(value: TMCsPath*): Self = StObject.set(x, "tmcsPaths", js.Array(value :_*))
      
      @scala.inline
      def setTmcsUndefined: Self = StObject.set(x, "tmcs", js.undefined)
      
      @scala.inline
      def setTmcsVarargs(value: TMC*): Self = StObject.set(x, "tmcs", js.Array(value :_*))
      
      @scala.inline
      def setToll_distance(value: Double): Self = StObject.set(x, "toll_distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToll_road(value: String): Self = StObject.set(x, "toll_road", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTolls(value: Double): Self = StObject.set(x, "tolls", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventMap extends StObject {
    
    var complete: Event_[typings.amapJsApiDriving.amapJsApiDrivingStrings.complete, SearchResult | Info] = js.native
    
    var error: Event_[typings.amapJsApiDriving.amapJsApiDrivingStrings.error, Info] = js.native
  }
  object EventMap {
    
    @scala.inline
    def apply(complete: Event_[complete, SearchResult | Info], error: Event_[error, Info]): EventMap = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit class EventMapMutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: Event_[complete, SearchResult | Info]): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: Event_[error, Info]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * 于控制在路径规划结束后，是否自动调整地图视野使绘制的路线处于视口的可见范围
      */
    var autoFitView: js.UndefOr[Boolean] = js.native
    
    /**
      * 返回信息种类
      * 默认值：base，返回基本地址信息
      * 当取值为：all，返回DriveStep基本信息+DriveStep详细信息
      */
    var extensions: js.UndefOr[base | all] = js.native
    
    /**
      * 默认为0，表示可以使用轮渡，为1的时候表示不可以使用轮渡
      */
    var ferry: js.UndefOr[Boolean] = js.native
    
    /**
      * 设置隐藏路径规划的起始点图标
      */
    var hideMarkers: js.UndefOr[Boolean] = js.native
    
    /**
      * 使用map属性时，绘制的规划线路是否显示描边。缺省为true
      */
    var isOutline: js.UndefOr[Boolean] = js.native
    
    /**
      * AMap.Map对象
      * 展现结果的地图实例。当指定此参数后，搜索结果的标注、线路等均会自动添加到此地图上。
      */
    var map: js.UndefOr[Map] = js.native
    
    /**
      * 除省份之外车牌的字母和数字，用于判断限行相关，与province属性组合使用。
      */
    var number: js.UndefOr[String] = js.native
    
    /**
      * 使用map属性时，绘制的规划线路的描边颜色。缺省为'white'
      */
    var outlineColor: js.UndefOr[String] = js.native
    
    /**
      * 结果列表的HTML容器id或容器元素，提供此参数后，结果列表将在此容器中进行展示。
      */
    var panel: js.UndefOr[String | HTMLElement] = js.native
    
    /**
      * 驾车路线规划策略
      */
    var policy: js.UndefOr[DrivingPolicy] = js.native
    
    /**
      * 车牌省份的汉字缩写，用于判断是否限行，与number属性组合使用。
      */
    var province: js.UndefOr[String] = js.native
    
    // internal
    var showDir: js.UndefOr[Boolean] = js.native
    
    /**
      * 设置是否显示实时路况信息，默认设置为true。
      * 显示绿色代表畅通，黄色代表轻微拥堵，红色代表比较拥堵，灰色表示无路况信息。
      */
    var showTraffic: js.UndefOr[Boolean] = js.native
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
      def setAutoFitView(value: Boolean): Self = StObject.set(x, "autoFitView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFitViewUndefined: Self = StObject.set(x, "autoFitView", js.undefined)
      
      @scala.inline
      def setExtensions(value: base | all): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setFerry(value: Boolean): Self = StObject.set(x, "ferry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFerryUndefined: Self = StObject.set(x, "ferry", js.undefined)
      
      @scala.inline
      def setHideMarkers(value: Boolean): Self = StObject.set(x, "hideMarkers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideMarkersUndefined: Self = StObject.set(x, "hideMarkers", js.undefined)
      
      @scala.inline
      def setIsOutline(value: Boolean): Self = StObject.set(x, "isOutline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOutlineUndefined: Self = StObject.set(x, "isOutline", js.undefined)
      
      @scala.inline
      def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setOutlineColor(value: String): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
      
      @scala.inline
      def setPanel(value: String | HTMLElement): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
      
      @scala.inline
      def setPolicy(value: DrivingPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvinceUndefined: Self = StObject.set(x, "province", js.undefined)
      
      @scala.inline
      def setShowDir(value: Boolean): Self = StObject.set(x, "showDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDirUndefined: Self = StObject.set(x, "showDir", js.undefined)
      
      @scala.inline
      def setShowTraffic(value: Boolean): Self = StObject.set(x, "showTraffic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTrafficUndefined: Self = StObject.set(x, "showTraffic", js.undefined)
    }
  }
  
  @js.native
  trait Poi extends StObject {
    
    var location: LngLat = js.native
    
    var name: String = js.native
    
    var `type`: start | end | waypoint = js.native
  }
  object Poi {
    
    @scala.inline
    def apply(location: LngLat, name: String, `type`: start | end | waypoint): Poi = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Poi]
    }
    
    @scala.inline
    implicit class PoiMutableBuilder[Self <: Poi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: start | end | waypoint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SearchOptions extends StObject {
    
    /**
      * 途经点
      */
    var waypoints: js.UndefOr[js.Array[LocationValue]] = js.native
  }
  object SearchOptions {
    
    @scala.inline
    def apply(): SearchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchOptions]
    }
    
    @scala.inline
    implicit class SearchOptionsMutableBuilder[Self <: SearchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWaypoints(value: js.Array[LocationValue]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaypointsUndefined: Self = StObject.set(x, "waypoints", js.undefined)
      
      @scala.inline
      def setWaypointsVarargs(value: LocationValue*): Self = StObject.set(x, "waypoints", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SearchPoint extends StObject {
    
    /**
      * 城市
      */
    var city: js.UndefOr[String] = js.native
    
    /**
      * 关键词
      */
    var keyword: String = js.native
  }
  object SearchPoint {
    
    @scala.inline
    def apply(keyword: String): SearchPoint = {
      val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchPoint]
    }
    
    @scala.inline
    implicit class SearchPointMutableBuilder[Self <: SearchPoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      @scala.inline
      def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.amapJsApiDriving.AMap.Driving.SearchResultBase
    - typings.amapJsApiDriving.AMap.Driving.SearchResultExt
  */
  trait SearchResult extends StObject
  object SearchResult {
    
    @scala.inline
    def SearchResultBase(
      destination: LngLat,
      end: Poi,
      info: String,
      origin: LngLat,
      routes: js.Array[DriveRoute],
      start: Poi,
      waypoints: js.Array[PoiisWaypointboolean]
    ): typings.amapJsApiDriving.AMap.Driving.SearchResultBase = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.amapJsApiDriving.AMap.Driving.SearchResultBase]
    }
    
    @scala.inline
    def SearchResultExt(
      destination: LngLat,
      destinationName: String,
      end: PoiExt,
      info: String,
      origin: LngLat,
      originName: String,
      routes: js.Array[DriveRoute],
      start: PoiExt,
      waypoints: js.Array[PoiExt with IsWaypoint]
    ): typings.amapJsApiDriving.AMap.Driving.SearchResultExt = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], originName = originName.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.amapJsApiDriving.AMap.Driving.SearchResultExt]
    }
  }
  
  @js.native
  trait SearchResultBase
    extends SearchResultCommon
       with SearchResult {
    
    /**
      * 驾车规划终点
      */
    var end: Poi = js.native
    
    /**
      * 驾车规划起点
      */
    var start: Poi = js.native
    
    /**
      * 驾车规划途经点
      */
    var waypoints: js.Array[PoiisWaypointboolean] = js.native
  }
  object SearchResultBase {
    
    @scala.inline
    def apply(
      destination: LngLat,
      end: Poi,
      info: String,
      origin: LngLat,
      routes: js.Array[DriveRoute],
      start: Poi,
      waypoints: js.Array[PoiisWaypointboolean]
    ): SearchResultBase = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResultBase]
    }
    
    @scala.inline
    implicit class SearchResultBaseMutableBuilder[Self <: SearchResultBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Poi): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Poi): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaypoints(value: js.Array[PoiisWaypointboolean]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaypointsVarargs(value: PoiisWaypointboolean*): Self = StObject.set(x, "waypoints", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SearchResultCommon extends StObject {
    
    /**
      * 驾车规划终点坐标
      */
    var destination: LngLat = js.native
    
    /**
      * 成功状态说明
      */
    var info: String = js.native
    
    /**
      * 驾车规划起点坐标
      */
    var origin: LngLat = js.native
    
    /**
      * 驾车规划路线列表
      */
    var routes: js.Array[DriveRoute] = js.native
    
    /**
      * 打车费用，仅extensions为“all”时返回
      * 单位：元
      */
    var taxi_cost: js.UndefOr[Double] = js.native
  }
  object SearchResultCommon {
    
    @scala.inline
    def apply(destination: LngLat, info: String, origin: LngLat, routes: js.Array[DriveRoute]): SearchResultCommon = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResultCommon]
    }
    
    @scala.inline
    implicit class SearchResultCommonMutableBuilder[Self <: SearchResultCommon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestination(value: LngLat): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigin(value: LngLat): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutes(value: js.Array[DriveRoute]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesVarargs(value: DriveRoute*): Self = StObject.set(x, "routes", js.Array(value :_*))
      
      @scala.inline
      def setTaxi_cost(value: Double): Self = StObject.set(x, "taxi_cost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaxi_costUndefined: Self = StObject.set(x, "taxi_cost", js.undefined)
    }
  }
  
  @js.native
  trait SearchResultExt
    extends SearchResultCommon
       with SearchResult {
    
    /**
      * 驾车规划终点名称
      */
    var destinationName: String = js.native
    
    /**
      * 驾车规划终点
      */
    var end: PoiExt = js.native
    
    /**
      * 驾车规划起点名称
      */
    var originName: String = js.native
    
    /**
      * 驾车规划起点
      */
    var start: PoiExt = js.native
    
    /**
      * 驾车规划途经点
      */
    var waypoints: js.Array[PoiExt with IsWaypoint] = js.native
  }
  object SearchResultExt {
    
    @scala.inline
    def apply(
      destination: LngLat,
      destinationName: String,
      end: PoiExt,
      info: String,
      origin: LngLat,
      originName: String,
      routes: js.Array[DriveRoute],
      start: PoiExt,
      waypoints: js.Array[PoiExt with IsWaypoint]
    ): SearchResultExt = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], originName = originName.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResultExt]
    }
    
    @scala.inline
    implicit class SearchResultExtMutableBuilder[Self <: SearchResultExt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationName(value: String): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd(value: PoiExt): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginName(value: String): Self = StObject.set(x, "originName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: PoiExt): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaypoints(value: js.Array[PoiExt with IsWaypoint]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaypointsVarargs(value: (PoiExt with IsWaypoint)*): Self = StObject.set(x, "waypoints", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.amapJsApiDriving.amapJsApiDrivingStrings.error
    - typings.amapJsApiDriving.amapJsApiDrivingStrings.no_data
    - typings.amapJsApiDriving.amapJsApiDrivingStrings.complete
  */
  trait SearchStatus extends StObject
  object SearchStatus {
    
    @scala.inline
    def complete: typings.amapJsApiDriving.amapJsApiDrivingStrings.complete = "complete".asInstanceOf[typings.amapJsApiDriving.amapJsApiDrivingStrings.complete]
    
    @scala.inline
    def error: typings.amapJsApiDriving.amapJsApiDrivingStrings.error = "error".asInstanceOf[typings.amapJsApiDriving.amapJsApiDrivingStrings.error]
    
    @scala.inline
    def no_data: typings.amapJsApiDriving.amapJsApiDrivingStrings.no_data = "no_data".asInstanceOf[typings.amapJsApiDriving.amapJsApiDrivingStrings.no_data]
  }
  
  @js.native
  trait TMC extends StObject {
    
    /**
      * 此lcode对应的路段长度，单位: 米
      */
    var distance: Double = js.native
    
    /**
      * 路况信息对应的编码
      * 如果direction是正向 lcode返回值大于0；否则lcode，返回值小于0；
      * 如果返回0则说明此路段无lcode
      */
    var lcode: String | js.Array[scala.Nothing] = js.native
    
    var path: js.Array[LngLat] = js.native
    
    var polyline: String = js.native
    
    /**
      * 路况状态，可能的值有：未知，畅通，缓行，拥堵
      */
    var status: String = js.native
  }
  object TMC {
    
    @scala.inline
    def apply(
      distance: Double,
      lcode: String | js.Array[scala.Nothing],
      path: js.Array[LngLat],
      polyline: String,
      status: String
    ): TMC = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], lcode = lcode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[TMC]
    }
    
    @scala.inline
    implicit class TMCMutableBuilder[Self <: TMC] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLcode(value: String | js.Array[scala.Nothing]): Self = StObject.set(x, "lcode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLcodeVarargs(value: scala.Nothing*): Self = StObject.set(x, "lcode", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: js.Array[LngLat]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: LngLat*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setPolyline(value: String): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TMCsPath extends StObject {
    
    var path: js.Array[LngLat] = js.native
    
    var status: String = js.native
  }
  object TMCsPath {
    
    @scala.inline
    def apply(path: js.Array[LngLat], status: String): TMCsPath = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[TMCsPath]
    }
    
    @scala.inline
    implicit class TMCsPathMutableBuilder[Self <: TMCsPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: js.Array[LngLat]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: LngLat*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ViaCity extends StObject {
    
    /**
      * 区域编码
      */
    var adcode: String = js.native
    
    /**
      * 城市编码
      */
    var citycode: String = js.native
    
    /**
      * 途径行政区列表
      */
    var districts: js.Array[District] = js.native
    
    /**
      * 途径名称
      */
    var name: String = js.native
  }
  object ViaCity {
    
    @scala.inline
    def apply(adcode: String, citycode: String, districts: js.Array[District], name: String): ViaCity = {
      val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], districts = districts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViaCity]
    }
    
    @scala.inline
    implicit class ViaCityMutableBuilder[Self <: ViaCity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistricts(value: js.Array[District]): Self = StObject.set(x, "districts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistrictsVarargs(value: District*): Self = StObject.set(x, "districts", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
