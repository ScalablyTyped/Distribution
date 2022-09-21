package typings.amapJsApi.AMap

import typings.amapJsApi.AMap.Map.Feature
import typings.amapJsApi.AMap.Map.Status
import typings.amapJsApi.AMap.Map.ViewMode
import typings.amapJsApi.amapJsApiBooleans.`false`
import typings.amapJsApi.amapJsApiStrings.EPSG3395
import typings.amapJsApi.amapJsApiStrings.EPSG3857
import typings.amapJsApi.amapJsApiStrings.EPSG4326
import typings.amapJsApi.amapJsApiStrings.all
import typings.amapJsApi.amapJsApiStrings.c
import typings.amapJsApi.amapJsApiStrings.circle
import typings.amapJsApi.amapJsApiStrings.click
import typings.amapJsApi.amapJsApiStrings.complete
import typings.amapJsApi.amapJsApiStrings.contextmenu
import typings.amapJsApi.amapJsApiStrings.d
import typings.amapJsApi.amapJsApiStrings.dblclick
import typings.amapJsApi.amapJsApiStrings.dragend
import typings.amapJsApi.amapJsApiStrings.dragging
import typings.amapJsApi.amapJsApiStrings.dragstart
import typings.amapJsApi.amapJsApiStrings.dv
import typings.amapJsApi.amapJsApiStrings.hotspotclick
import typings.amapJsApi.amapJsApiStrings.hotspotout
import typings.amapJsApi.amapJsApiStrings.hotspotover
import typings.amapJsApi.amapJsApiStrings.mapmove
import typings.amapJsApi.amapJsApiStrings.marker
import typings.amapJsApi.amapJsApiStrings.mousedown
import typings.amapJsApi.amapJsApiStrings.mousemove
import typings.amapJsApi.amapJsApiStrings.mouseout
import typings.amapJsApi.amapJsApiStrings.mouseover
import typings.amapJsApi.amapJsApiStrings.mouseup
import typings.amapJsApi.amapJsApiStrings.mousewheel
import typings.amapJsApi.amapJsApiStrings.moveend
import typings.amapJsApi.amapJsApiStrings.movestart
import typings.amapJsApi.amapJsApiStrings.point_
import typings.amapJsApi.amapJsApiStrings.polygon_
import typings.amapJsApi.amapJsApiStrings.polyline
import typings.amapJsApi.amapJsApiStrings.rdblclick
import typings.amapJsApi.amapJsApiStrings.resize
import typings.amapJsApi.amapJsApiStrings.rightclick
import typings.amapJsApi.amapJsApiStrings.touchend
import typings.amapJsApi.amapJsApiStrings.touchmove
import typings.amapJsApi.amapJsApiStrings.touchstart
import typings.amapJsApi.amapJsApiStrings.v
import typings.amapJsApi.amapJsApiStrings.vw
import typings.amapJsApi.amapJsApiStrings.zoomchange
import typings.amapJsApi.amapJsApiStrings.zoomend
import typings.amapJsApi.amapJsApiStrings.zoomstart
import typings.amapJsApi.anon.City
import typings.amapJsApi.anon.IsIndoorPOI
import typings.amapJsApi.anon.Location
import typings.amapJsApi.anon.PartialStatus
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map
  extends StObject
     with EventEmitter {
  
  def add(overlay: js.Array[Overlay[Any]]): Unit = js.native
  /**
    * 添加覆盖物/图层
    * @param overlay 覆盖物/图层
    */
  def add(overlay: Overlay[Any]): Unit = js.native
  
  /**
    * 添加控件
    * @param control 控件
    */
  def addControl(control: js.Object): Unit = js.native
  
  // TODO
  /**
    * 清除地图上的信息窗体。
    */
  def clearInfoWindow(): Unit = js.native
  
  /**
    * 清除限制区域
    */
  def clearLimitBounds(): Unit = js.native
  
  /**
    * 删除地图上所有的覆盖物
    */
  def clearMap(): Unit = js.native
  
  /**
    * 地图容器像素坐标转为地图经纬度坐标
    * @param pixel 地图像素坐标
    */
  def containerToLngLat(pixel: Pixel): LngLat = js.native
  
  /**
    * 注销地图对象，并清空地图容器
    */
  def destroy(): Unit = js.native
  
  /**
    * 唤起高德地图客户端marker详情页
    * @param obj 唤起参数
    */
  def detailOnAMAP(obj: Location): Unit = js.native
  
  def geodeticCoordToLngLat(pixel: Pixel): LngLat = js.native
  
  /**
    * 返回添加的覆盖物对象
    * @param type 覆盖物类型
    */
  def getAllOverlays(): js.Array[Overlay[Any]] = js.native
  def getAllOverlays(`type`: marker | circle | polyline | polygon_): js.Array[Overlay[Any]] = js.native
  
  /**
    * 获取当前地图视图范围，获取当前可视区域
    */
  def getBounds(): Bounds = js.native
  
  /**
    * 获取地图中心点经纬度坐标值
    */
  def getCenter(): LngLat = js.native
  
  /**
    * 获取地图中心点所在区域
    */
  def getCity(callback: js.Function1[/* cityData */ City, Unit]): Unit = js.native
  
  /**
    * 返回地图对象的容器
    */
  def getContainer(): HTMLElement | Null = js.native
  
  /**
    * 获取地图默认鼠标指针样式
    */
  def getDefaultCursor(): String = js.native
  
  /**
    * 获取地图显示元素种类
    */
  def getFeatures(): Feature | js.Array[Feature] | all = js.native
  
  /**
    * 获取当前地图标注的显示顺序
    */
  def getLabelzIndex(): Double = js.native
  
  /**
    * 获取地图语言类型
    */
  def getLang(): Lang = js.native
  
  /**
    * 获取地图图层数组
    */
  def getLayers(): js.Array[Layer] = js.native
  
  /**
    * 获取Map的限制区域
    */
  def getLimitBounds(): Bounds = js.native
  
  /**
    * 获取地图显示样式
    */
  def getMapStyle(): String = js.native
  
  /**
    * 获取俯仰角
    */
  def getPitch(): Double = js.native
  
  /**
    * 获取指定位置的地图分辨率
    * @param point 指定经纬度
    */
  def getResolution(): Double = js.native
  def getResolution(point: LocationValue): Double = js.native
  
  /**
    * 获取地图顺时针旋转角度
    */
  def getRotation(): Double = js.native
  
  /**
    * 获取当前地图比例尺
    * @param dpi dpi
    */
  def getScale(): Double = js.native
  def getScale(dpi: Double): Double = js.native
  
  /**
    * 获取地图容器像素大小
    */
  def getSize(): Size = js.native
  
  /**
    * 获取当前地图状态信息
    */
  def getStatus(): Status = js.native
  
  def getViewMode_(): ViewMode = js.native
  
  /**
    * 获取当前地图缩放级别
    */
  def getZoom(): Double = js.native
  
  /**
    * 地图经纬度坐标转为地图容器像素坐标
    * @param lnglat 经纬度坐标
    */
  def lngLatToContainer(lnglat: LocationValue): Pixel = js.native
  
  def lngLatToGeodeticCoord(lnglat: LocationValue): Pixel = js.native
  
  /**
    * 地图经纬度坐标转换为平面地图像素坐标
    * @param lnglat 经纬度坐标
    * @param level 缩放等级
    */
  def lnglatToPixel(lnglat: LocationValue): Pixel = js.native
  def lnglatToPixel(lnglat: LocationValue, level: Double): Pixel = js.native
  
  /**
    * 地图经纬度坐标转为地图容器像素坐标
    * @param lnglat 经纬度坐标
    */
  def lnglatTocontainer(lnglat: LocationValue): Pixel = js.native
  
  /**
    * 以像素为单位，沿x方向和y方向移动地图
    * @param x 横向移动像素，向右为正
    * @param y 纵向移动像素，向下为正
    */
  def panBy(x: Double, y: Double): Unit = js.native
  
  /**
    * 地图中心点平移至指定点位置
    * @param position 目标位置经纬度
    */
  def panTo(position: LocationValue): Unit = js.native
  
  /**
    * 平面地图像素坐标转换为地图经纬度坐标
    * @param pixel 像素坐标
    * @param level 缩放等级
    */
  def pixelToLngLat(pixel: Pixel): LngLat = js.native
  def pixelToLngLat(pixel: Pixel, level: Double): LngLat = js.native
  
  /**
    * 加载插件，
    * tips: 插件的类型定义不在本类型定义中给出，需要另行安装例如
    * 3d地图：@types/amap-js-api-map3d
    * 地区搜索：@types/amap-js-api-place-search
    * @param name 插件名称
    * @param callback 插件加载完成后的回调函数
    */
  def plugin(name: String, callback: js.Function0[Unit]): this.type = js.native
  def plugin(name: js.Array[String], callback: js.Function0[Unit]): this.type = js.native
  
  /**
    * 唤起高德地图客户端marker页
    * @param obj 唤起参数
    */
  def poiOnAMAP(obj: Location): Unit = js.native
  
  def remove(overlay: js.Array[Overlay[Any]]): Unit = js.native
  /**
    * 删除覆盖物/图层
    * @param overlay 覆盖物/图层
    */
  def remove(overlay: Overlay[Any]): Unit = js.native
  
  // TODO
  /**
    * 移除控件
    * @param control 控件
    */
  def removeControl(control: js.Object): Unit = js.native
  
  /**
    * 指定当前地图显示范围
    * @param bound 显示范围
    */
  def setBounds(bound: Bounds): Bounds = js.native
  
  /**
    * 设置地图显示的中心点
    * @param center 中心点经纬度
    */
  def setCenter(center: LocationValue): Unit = js.native
  
  /**
    * 按照行政区名称或adcode来设置地图显示的中心点。
    * @param city 城市名称或城市编码
    * @param callback 回调
    */
  def setCity(
    city: String,
    callback: js.ThisFunction2[/* this */ this.type, /* coord */ js.Tuple2[String, String], /* zoom */ Double, Unit]
  ): Unit = js.native
  
  /**
    * 设置鼠标指针默认样式
    * @param cursor 指针样式
    */
  def setDefaultCursor(cursor: String): Unit = js.native
  
  /**
    * 修改底图图层
    * @param layer 图层
    */
  def setDefaultLayer(layer: TileLayer): Unit = js.native
  
  def setFeatures(feature: js.Array[Feature]): Unit = js.native
  /**
    * 设置地图上显示的元素种类
    * @param feature 元素
    */
  def setFeatures(feature: Feature): Unit = js.native
  @JSName("setFeatures")
  def setFeatures_all(feature: all): Unit = js.native
  
  /**
    * 根据地图上添加的覆盖物分布情况，自动缩放地图到合适的视野级别
    * @param overlayList 覆盖物数组
    * @param immediately 是否需要动画过程
    * @param avoid 上下左右的像素避让宽度
    * @param maxZoom 最大缩放级别
    */
  def setFitView(): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(overlayList: js.Array[Overlay[Any]]): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(overlayList: js.Array[Overlay[Any]], immediately: Boolean): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(
    overlayList: js.Array[Overlay[Any]],
    immediately: Boolean,
    avoid: js.Tuple4[Double, Double, Double, Double]
  ): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(
    overlayList: js.Array[Overlay[Any]],
    immediately: Boolean,
    avoid: js.Tuple4[Double, Double, Double, Double],
    maxZoom: Double
  ): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(overlayList: js.Array[Overlay[Any]], immediately: Boolean, avoid: Unit, maxZoom: Double): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(
    overlayList: js.Array[Overlay[Any]],
    immediately: Unit,
    avoid: js.Tuple4[Double, Double, Double, Double]
  ): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(
    overlayList: js.Array[Overlay[Any]],
    immediately: Unit,
    avoid: js.Tuple4[Double, Double, Double, Double],
    maxZoom: Double
  ): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(overlayList: js.Array[Overlay[Any]], immediately: Unit, avoid: Unit, maxZoom: Double): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(overlayList: Unit, immediately: Boolean): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(overlayList: Unit, immediately: Boolean, avoid: js.Tuple4[Double, Double, Double, Double]): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(
    overlayList: Unit,
    immediately: Boolean,
    avoid: js.Tuple4[Double, Double, Double, Double],
    maxZoom: Double
  ): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(overlayList: Unit, immediately: Boolean, avoid: Unit, maxZoom: Double): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(overlayList: Unit, immediately: Unit, avoid: js.Tuple4[Double, Double, Double, Double]): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(
    overlayList: Unit,
    immediately: Unit,
    avoid: js.Tuple4[Double, Double, Double, Double],
    maxZoom: Double
  ): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(overlayList: Unit, immediately: Unit, avoid: Unit, maxZoom: Double): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(overlayList: Overlay[Any]): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(overlayList: Overlay[Any], immediately: Boolean): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(overlayList: Overlay[Any], immediately: Boolean, avoid: js.Tuple4[Double, Double, Double, Double]): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(
    overlayList: Overlay[Any],
    immediately: Boolean,
    avoid: js.Tuple4[Double, Double, Double, Double],
    maxZoom: Double
  ): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(overlayList: Overlay[Any], immediately: Boolean, avoid: Unit, maxZoom: Double): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(overlayList: Overlay[Any], immediately: Unit, avoid: js.Tuple4[Double, Double, Double, Double]): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(
    overlayList: Overlay[Any],
    immediately: Unit,
    avoid: js.Tuple4[Double, Double, Double, Double],
    maxZoom: Double
  ): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(overlayList: Overlay[Any], immediately: Unit, avoid: Unit, maxZoom: Double): js.UndefOr[Bounds | `false`] = js.native
  
  /**
    * 设置地图标注显示的顺序
    * @param index 显示顺序
    */
  def setLabelzIndex(index: Double): Unit = js.native
  
  /**
    * 设置地图语言类型
    * @param lang 语言类型
    */
  def setLang(lang: Lang): Unit = js.native
  
  /**
    * 设置地图图层数组
    * @param layers 图层数组
    */
  def setLayers(layers: js.Array[Layer]): Unit = js.native
  
  /**
    * 设置Map的限制区域
    * @param bound 限制区域
    */
  def setLimitBounds(bound: Bounds): Unit = js.native
  
  /**
    * 设置地图的显示样式
    * @param style 地图样式
    */
  def setMapStyle(style: String): Unit = js.native
  
  /**
    * 设置俯仰角
    * @param pitch 俯仰角
    */
  def setPitch(pitch: Double): Unit = js.native
  
  /**
    * 设置地图顺时针旋转角度，旋转原点为地图容器中心点
    * @param rotation 旋转角度
    */
  def setRotation(rotation: Double): Unit = js.native
  
  /**
    * 设置当前地图显示状态
    * @param status 状态
    */
  def setStatus(status: PartialStatus): Unit = js.native
  
  /**
    * 设置地图显示的缩放级别
    * @param level 缩放级别
    */
  def setZoom(level: Double): Unit = js.native
  
  /**
    * 地图缩放至指定级别并以指定点为地图显示中心点
    * @param zoomLevel 缩放等级
    * @param center 缩放中心
    */
  def setZoomAndCenter(zoomLevel: Double, center: LocationValue): Unit = js.native
  
  /**
    * 地图放大一级显示
    */
  def zoomIn(): Unit = js.native
  
  /**
    * 地图缩小一级显示
    */
  def zoomOut(): Unit = js.native
}
object Map {
  
  trait EventMap extends StObject {
    
    var click: MapsEvent[typings.amapJsApi.amapJsApiStrings.click, Map]
    
    var complete: Event_[typings.amapJsApi.amapJsApiStrings.complete, Unit]
    
    var contextmenu: MapsEvent[typings.amapJsApi.amapJsApiStrings.contextmenu, Map]
    
    var dblclick: MapsEvent[typings.amapJsApi.amapJsApiStrings.dblclick, Map]
    
    var dragend: Event_[typings.amapJsApi.amapJsApiStrings.dragend, Unit]
    
    var dragging: Event_[typings.amapJsApi.amapJsApiStrings.dragging, Unit]
    
    var dragstart: Event_[typings.amapJsApi.amapJsApiStrings.dragstart, Unit]
    
    var hotspotclick: HotspotEvent[typings.amapJsApi.amapJsApiStrings.hotspotclick]
    
    var hotspotout: HotspotEvent[typings.amapJsApi.amapJsApiStrings.hotspotout]
    
    var hotspotover: HotspotEvent[typings.amapJsApi.amapJsApiStrings.hotspotover]
    
    var mapmove: Event_[typings.amapJsApi.amapJsApiStrings.mapmove, Unit]
    
    var mousedown: MapsEvent[typings.amapJsApi.amapJsApiStrings.mousedown, Map]
    
    var mousemove: MapsEvent[typings.amapJsApi.amapJsApiStrings.mousemove, Map]
    
    var mouseout: MapsEvent[typings.amapJsApi.amapJsApiStrings.mouseout, Map]
    
    var mouseover: MapsEvent[typings.amapJsApi.amapJsApiStrings.mouseover, Map]
    
    var mouseup: MapsEvent[typings.amapJsApi.amapJsApiStrings.mouseup, Map]
    
    var mousewheel: MapsEvent[typings.amapJsApi.amapJsApiStrings.mousewheel, Map]
    
    var moveend: Event_[typings.amapJsApi.amapJsApiStrings.moveend, Unit]
    
    var movestart: Event_[typings.amapJsApi.amapJsApiStrings.movestart, Unit]
    
    var rdblclick: MapsEvent[typings.amapJsApi.amapJsApiStrings.rdblclick, Map]
    
    var resize: Event_[typings.amapJsApi.amapJsApiStrings.resize, Unit]
    
    var rightclick: MapsEvent[typings.amapJsApi.amapJsApiStrings.rightclick, Map]
    
    var touchend: MapsEvent[typings.amapJsApi.amapJsApiStrings.touchend, Map]
    
    var touchmove: MapsEvent[typings.amapJsApi.amapJsApiStrings.touchmove, Map]
    
    var touchstart: MapsEvent[typings.amapJsApi.amapJsApiStrings.touchstart, Map]
    
    var zoomchange: Event_[typings.amapJsApi.amapJsApiStrings.zoomchange, Unit]
    
    var zoomend: Event_[typings.amapJsApi.amapJsApiStrings.zoomend, Unit]
    
    var zoomstart: Event_[typings.amapJsApi.amapJsApiStrings.zoomstart, Unit]
  }
  object EventMap {
    
    inline def apply(
      click: MapsEvent[click, Map],
      complete: Event_[complete, Unit],
      contextmenu: MapsEvent[contextmenu, Map],
      dblclick: MapsEvent[dblclick, Map],
      dragend: Event_[dragend, Unit],
      dragging: Event_[dragging, Unit],
      dragstart: Event_[dragstart, Unit],
      hotspotclick: HotspotEvent[hotspotclick],
      hotspotout: HotspotEvent[hotspotout],
      hotspotover: HotspotEvent[hotspotover],
      mapmove: Event_[mapmove, Unit],
      mousedown: MapsEvent[mousedown, Map],
      mousemove: MapsEvent[mousemove, Map],
      mouseout: MapsEvent[mouseout, Map],
      mouseover: MapsEvent[mouseover, Map],
      mouseup: MapsEvent[mouseup, Map],
      mousewheel: MapsEvent[mousewheel, Map],
      moveend: Event_[moveend, Unit],
      movestart: Event_[movestart, Unit],
      rdblclick: MapsEvent[rdblclick, Map],
      resize: Event_[resize, Unit],
      rightclick: MapsEvent[rightclick, Map],
      touchend: MapsEvent[touchend, Map],
      touchmove: MapsEvent[touchmove, Map],
      touchstart: MapsEvent[touchstart, Map],
      zoomchange: Event_[zoomchange, Unit],
      zoomend: Event_[zoomend, Unit],
      zoomstart: Event_[zoomstart, Unit]
    ): EventMap = {
      val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], hotspotclick = hotspotclick.asInstanceOf[js.Any], hotspotout = hotspotout.asInstanceOf[js.Any], hotspotover = hotspotover.asInstanceOf[js.Any], mapmove = mapmove.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], mousewheel = mousewheel.asInstanceOf[js.Any], moveend = moveend.asInstanceOf[js.Any], movestart = movestart.asInstanceOf[js.Any], rdblclick = rdblclick.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], zoomchange = zoomchange.asInstanceOf[js.Any], zoomend = zoomend.asInstanceOf[js.Any], zoomstart = zoomstart.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    extension [Self <: EventMap](x: Self) {
      
      inline def setClick(value: MapsEvent[click, Map]): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setComplete(value: Event_[complete, Unit]): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setContextmenu(value: MapsEvent[contextmenu, Map]): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
      
      inline def setDblclick(value: MapsEvent[dblclick, Map]): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
      
      inline def setDragend(value: Event_[dragend, Unit]): Self = StObject.set(x, "dragend", value.asInstanceOf[js.Any])
      
      inline def setDragging(value: Event_[dragging, Unit]): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setDragstart(value: Event_[dragstart, Unit]): Self = StObject.set(x, "dragstart", value.asInstanceOf[js.Any])
      
      inline def setHotspotclick(value: HotspotEvent[hotspotclick]): Self = StObject.set(x, "hotspotclick", value.asInstanceOf[js.Any])
      
      inline def setHotspotout(value: HotspotEvent[hotspotout]): Self = StObject.set(x, "hotspotout", value.asInstanceOf[js.Any])
      
      inline def setHotspotover(value: HotspotEvent[hotspotover]): Self = StObject.set(x, "hotspotover", value.asInstanceOf[js.Any])
      
      inline def setMapmove(value: Event_[mapmove, Unit]): Self = StObject.set(x, "mapmove", value.asInstanceOf[js.Any])
      
      inline def setMousedown(value: MapsEvent[mousedown, Map]): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
      
      inline def setMousemove(value: MapsEvent[mousemove, Map]): Self = StObject.set(x, "mousemove", value.asInstanceOf[js.Any])
      
      inline def setMouseout(value: MapsEvent[mouseout, Map]): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
      
      inline def setMouseover(value: MapsEvent[mouseover, Map]): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
      
      inline def setMouseup(value: MapsEvent[mouseup, Map]): Self = StObject.set(x, "mouseup", value.asInstanceOf[js.Any])
      
      inline def setMousewheel(value: MapsEvent[mousewheel, Map]): Self = StObject.set(x, "mousewheel", value.asInstanceOf[js.Any])
      
      inline def setMoveend(value: Event_[moveend, Unit]): Self = StObject.set(x, "moveend", value.asInstanceOf[js.Any])
      
      inline def setMovestart(value: Event_[movestart, Unit]): Self = StObject.set(x, "movestart", value.asInstanceOf[js.Any])
      
      inline def setRdblclick(value: MapsEvent[rdblclick, Map]): Self = StObject.set(x, "rdblclick", value.asInstanceOf[js.Any])
      
      inline def setResize(value: Event_[resize, Unit]): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setRightclick(value: MapsEvent[rightclick, Map]): Self = StObject.set(x, "rightclick", value.asInstanceOf[js.Any])
      
      inline def setTouchend(value: MapsEvent[touchend, Map]): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
      
      inline def setTouchmove(value: MapsEvent[touchmove, Map]): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
      
      inline def setTouchstart(value: MapsEvent[touchstart, Map]): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
      
      inline def setZoomchange(value: Event_[zoomchange, Unit]): Self = StObject.set(x, "zoomchange", value.asInstanceOf[js.Any])
      
      inline def setZoomend(value: Event_[zoomend, Unit]): Self = StObject.set(x, "zoomend", value.asInstanceOf[js.Any])
      
      inline def setZoomstart(value: Event_[zoomstart, Unit]): Self = StObject.set(x, "zoomstart", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.amapJsApi.amapJsApiStrings.bg
    - typings.amapJsApi.amapJsApiStrings.point_
    - typings.amapJsApi.amapJsApiStrings.road
    - typings.amapJsApi.amapJsApiStrings.building
  */
  trait Feature extends StObject
  object Feature {
    
    inline def bg: typings.amapJsApi.amapJsApiStrings.bg = "bg".asInstanceOf[typings.amapJsApi.amapJsApiStrings.bg]
    
    inline def building: typings.amapJsApi.amapJsApiStrings.building = "building".asInstanceOf[typings.amapJsApi.amapJsApiStrings.building]
    
    inline def point: point_ = "point".asInstanceOf[point_]
    
    inline def road: typings.amapJsApi.amapJsApiStrings.road = "road".asInstanceOf[typings.amapJsApi.amapJsApiStrings.road]
  }
  
  type HotspotEvent[N /* <: String */] = Event_[N, IsIndoorPOI]
  
  trait Options extends StObject {
    
    /**
      * 地图平移过程中是否使用动画
      */
    var animateEnable: js.UndefOr[Boolean] = js.undefined
    
    // internal
    var baseRender: js.UndefOr[vw | d | dv | v] = js.undefined
    
    /**
      * 楼块出现和消失的时候是否显示动画过程
      */
    var buildingAnimation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 地图中心点坐标值
      */
    var center: js.UndefOr[LocationValue] = js.undefined
    
    var copyright: js.UndefOr[String] = js.undefined
    
    /**
      * 地图显示的参考坐标系
      */
    var crs: js.UndefOr[EPSG3857 | EPSG3395 | EPSG4326] = js.undefined
    
    /**
      * 地图默认鼠标样式
      */
    var defaultCursor: js.UndefOr[String] = js.undefined
    
    /**
      * 当前地图中默认显示的图层
      */
    var defaultLayer: js.UndefOr[TileLayer] = js.undefined
    
    /**
      * 地图是否可通过双击鼠标放大地图
      */
    var doubleClickZoom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 地图是否可通过鼠标拖拽平移
      */
    var dragEnable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 在展示矢量图的时候自动展示室内地图图层
      */
    // indoorMap?: IndorMap
    /**
      * 是否支持可以扩展最大缩放级别
      */
    var expandZoomRange: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 设置地图上显示的元素种类
      */
    var features: js.UndefOr[js.Array[Feature] | all | Feature] = js.undefined
    
    var forceVector: js.UndefOr[Boolean] = js.undefined
    
    var gridMapForeign: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 是否开启地图热点和标注的hover效果
      */
    var isHotspot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 地图是否使用缓动效果
      */
    var jogEnable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 地图是否可通过键盘控制
      */
    var keyboardEnable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 地图标注显示顺序
      */
    var labelzIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * 地图语言类型
      */
    var lang: js.UndefOr[Lang] = js.undefined
    
    /**
      * 地图图层数组，数组可以是图层 中的一个或多个，默认为普通二维地图
      */
    var layers: js.UndefOr[js.Array[Layer]] = js.undefined
    
    var logoUrl: js.UndefOr[String] = js.undefined
    
    var logoUrlRetina: js.UndefOr[String] = js.undefined
    
    /**
      * 设置地图的显示样式
      */
    var mapStyle: js.UndefOr[String] = js.undefined
    
    /**
      * 为 Map 实例指定掩模的路径，各图层将只显示路径范围内图像
      */
    var mask: js.UndefOr[
        js.Array[
          (js.Array[(js.Array[js.Tuple2[Double, Double]]) | (js.Tuple2[Double, Double])]) | (js.Tuple2[Double, Double])
        ]
      ] = js.undefined
    
    var maxPitch: js.UndefOr[Double] = js.undefined
    
    var overlayRender: js.UndefOr[c | d] = js.undefined
    
    /**
      * 俯仰角度
      */
    var pitch: js.UndefOr[Double] = js.undefined
    
    /**
      * 是否允许设置俯仰角度
      */
    var pitchEnable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 设置地图的预加载模式
      */
    var preloadMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 是否监控地图容器尺寸变化
      */
    var resizeEnable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 地图是否可旋转
      */
    var rotateEnable: js.UndefOr[Boolean] = js.undefined
    
    var rotation: js.UndefOr[Double] = js.undefined
    
    /**
      * 地图是否可通过鼠标滚轮缩放浏览
      */
    var scrollWheel: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 设置地图显示3D楼块效果
      */
    var showBuildingBlock: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 是否在有矢量底图的时候自动展示室内地图
      */
    var showIndoorMap: js.UndefOr[Boolean] = js.undefined
    
    var showLabel: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 调整天空颜色
      */
    var skyColor: js.UndefOr[String] = js.undefined
    
    /**
      * 地图在移动终端上是否可通过多点触控缩放浏览地图
      */
    var touchZoom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 当touchZoomCenter=1的时候，手机端双指缩放的以地图中心为中心，否则默认以双指中间点为中心
      */
    var touchZoomCenter: js.UndefOr[Double] = js.undefined
    
    var turboMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 地图视口，用于控制影响地图静态显示的属性
      */
    var view: js.UndefOr[View2D] = js.undefined
    
    /**
      * 视图模式
      */
    var viewMode: js.UndefOr[ViewMode] = js.undefined
    
    var workerMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 地图显示的缩放级别
      */
    var zoom: js.UndefOr[Double] = js.undefined
    
    /**
      * 地图是否可缩放
      */
    var zoomEnable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 地图显示的缩放级别范围
      */
    var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAnimateEnable(value: Boolean): Self = StObject.set(x, "animateEnable", value.asInstanceOf[js.Any])
      
      inline def setAnimateEnableUndefined: Self = StObject.set(x, "animateEnable", js.undefined)
      
      inline def setBaseRender(value: vw | d | dv | v): Self = StObject.set(x, "baseRender", value.asInstanceOf[js.Any])
      
      inline def setBaseRenderUndefined: Self = StObject.set(x, "baseRender", js.undefined)
      
      inline def setBuildingAnimation(value: Boolean): Self = StObject.set(x, "buildingAnimation", value.asInstanceOf[js.Any])
      
      inline def setBuildingAnimationUndefined: Self = StObject.set(x, "buildingAnimation", js.undefined)
      
      inline def setCenter(value: LocationValue): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      inline def setCrs(value: EPSG3857 | EPSG3395 | EPSG4326): Self = StObject.set(x, "crs", value.asInstanceOf[js.Any])
      
      inline def setCrsUndefined: Self = StObject.set(x, "crs", js.undefined)
      
      inline def setDefaultCursor(value: String): Self = StObject.set(x, "defaultCursor", value.asInstanceOf[js.Any])
      
      inline def setDefaultCursorUndefined: Self = StObject.set(x, "defaultCursor", js.undefined)
      
      inline def setDefaultLayer(value: TileLayer): Self = StObject.set(x, "defaultLayer", value.asInstanceOf[js.Any])
      
      inline def setDefaultLayerUndefined: Self = StObject.set(x, "defaultLayer", js.undefined)
      
      inline def setDoubleClickZoom(value: Boolean): Self = StObject.set(x, "doubleClickZoom", value.asInstanceOf[js.Any])
      
      inline def setDoubleClickZoomUndefined: Self = StObject.set(x, "doubleClickZoom", js.undefined)
      
      inline def setDragEnable(value: Boolean): Self = StObject.set(x, "dragEnable", value.asInstanceOf[js.Any])
      
      inline def setDragEnableUndefined: Self = StObject.set(x, "dragEnable", js.undefined)
      
      inline def setExpandZoomRange(value: Boolean): Self = StObject.set(x, "expandZoomRange", value.asInstanceOf[js.Any])
      
      inline def setExpandZoomRangeUndefined: Self = StObject.set(x, "expandZoomRange", js.undefined)
      
      inline def setFeatures(value: js.Array[Feature] | all | Feature): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      inline def setFeaturesVarargs(value: Feature*): Self = StObject.set(x, "features", js.Array(value*))
      
      inline def setForceVector(value: Boolean): Self = StObject.set(x, "forceVector", value.asInstanceOf[js.Any])
      
      inline def setForceVectorUndefined: Self = StObject.set(x, "forceVector", js.undefined)
      
      inline def setGridMapForeign(value: Boolean): Self = StObject.set(x, "gridMapForeign", value.asInstanceOf[js.Any])
      
      inline def setGridMapForeignUndefined: Self = StObject.set(x, "gridMapForeign", js.undefined)
      
      inline def setIsHotspot(value: Boolean): Self = StObject.set(x, "isHotspot", value.asInstanceOf[js.Any])
      
      inline def setIsHotspotUndefined: Self = StObject.set(x, "isHotspot", js.undefined)
      
      inline def setJogEnable(value: Boolean): Self = StObject.set(x, "jogEnable", value.asInstanceOf[js.Any])
      
      inline def setJogEnableUndefined: Self = StObject.set(x, "jogEnable", js.undefined)
      
      inline def setKeyboardEnable(value: Boolean): Self = StObject.set(x, "keyboardEnable", value.asInstanceOf[js.Any])
      
      inline def setKeyboardEnableUndefined: Self = StObject.set(x, "keyboardEnable", js.undefined)
      
      inline def setLabelzIndex(value: Double): Self = StObject.set(x, "labelzIndex", value.asInstanceOf[js.Any])
      
      inline def setLabelzIndexUndefined: Self = StObject.set(x, "labelzIndex", js.undefined)
      
      inline def setLang(value: Lang): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setLayers(value: js.Array[Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLogoUrl(value: String): Self = StObject.set(x, "logoUrl", value.asInstanceOf[js.Any])
      
      inline def setLogoUrlRetina(value: String): Self = StObject.set(x, "logoUrlRetina", value.asInstanceOf[js.Any])
      
      inline def setLogoUrlRetinaUndefined: Self = StObject.set(x, "logoUrlRetina", js.undefined)
      
      inline def setLogoUrlUndefined: Self = StObject.set(x, "logoUrl", js.undefined)
      
      inline def setMapStyle(value: String): Self = StObject.set(x, "mapStyle", value.asInstanceOf[js.Any])
      
      inline def setMapStyleUndefined: Self = StObject.set(x, "mapStyle", js.undefined)
      
      inline def setMask(
        value: js.Array[
              (js.Array[(js.Array[js.Tuple2[Double, Double]]) | (js.Tuple2[Double, Double])]) | (js.Tuple2[Double, Double])
            ]
      ): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMaskVarargs(
        value: ((js.Array[(js.Array[js.Tuple2[Double, Double]]) | (js.Tuple2[Double, Double])]) | (js.Tuple2[Double, Double]))*
      ): Self = StObject.set(x, "mask", js.Array(value*))
      
      inline def setMaxPitch(value: Double): Self = StObject.set(x, "maxPitch", value.asInstanceOf[js.Any])
      
      inline def setMaxPitchUndefined: Self = StObject.set(x, "maxPitch", js.undefined)
      
      inline def setOverlayRender(value: c | d): Self = StObject.set(x, "overlayRender", value.asInstanceOf[js.Any])
      
      inline def setOverlayRenderUndefined: Self = StObject.set(x, "overlayRender", js.undefined)
      
      inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
      
      inline def setPitchEnable(value: Boolean): Self = StObject.set(x, "pitchEnable", value.asInstanceOf[js.Any])
      
      inline def setPitchEnableUndefined: Self = StObject.set(x, "pitchEnable", js.undefined)
      
      inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
      
      inline def setPreloadMode(value: Boolean): Self = StObject.set(x, "preloadMode", value.asInstanceOf[js.Any])
      
      inline def setPreloadModeUndefined: Self = StObject.set(x, "preloadMode", js.undefined)
      
      inline def setResizeEnable(value: Boolean): Self = StObject.set(x, "resizeEnable", value.asInstanceOf[js.Any])
      
      inline def setResizeEnableUndefined: Self = StObject.set(x, "resizeEnable", js.undefined)
      
      inline def setRotateEnable(value: Boolean): Self = StObject.set(x, "rotateEnable", value.asInstanceOf[js.Any])
      
      inline def setRotateEnableUndefined: Self = StObject.set(x, "rotateEnable", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setScrollWheel(value: Boolean): Self = StObject.set(x, "scrollWheel", value.asInstanceOf[js.Any])
      
      inline def setScrollWheelUndefined: Self = StObject.set(x, "scrollWheel", js.undefined)
      
      inline def setShowBuildingBlock(value: Boolean): Self = StObject.set(x, "showBuildingBlock", value.asInstanceOf[js.Any])
      
      inline def setShowBuildingBlockUndefined: Self = StObject.set(x, "showBuildingBlock", js.undefined)
      
      inline def setShowIndoorMap(value: Boolean): Self = StObject.set(x, "showIndoorMap", value.asInstanceOf[js.Any])
      
      inline def setShowIndoorMapUndefined: Self = StObject.set(x, "showIndoorMap", js.undefined)
      
      inline def setShowLabel(value: Boolean): Self = StObject.set(x, "showLabel", value.asInstanceOf[js.Any])
      
      inline def setShowLabelUndefined: Self = StObject.set(x, "showLabel", js.undefined)
      
      inline def setSkyColor(value: String): Self = StObject.set(x, "skyColor", value.asInstanceOf[js.Any])
      
      inline def setSkyColorUndefined: Self = StObject.set(x, "skyColor", js.undefined)
      
      inline def setTouchZoom(value: Boolean): Self = StObject.set(x, "touchZoom", value.asInstanceOf[js.Any])
      
      inline def setTouchZoomCenter(value: Double): Self = StObject.set(x, "touchZoomCenter", value.asInstanceOf[js.Any])
      
      inline def setTouchZoomCenterUndefined: Self = StObject.set(x, "touchZoomCenter", js.undefined)
      
      inline def setTouchZoomUndefined: Self = StObject.set(x, "touchZoom", js.undefined)
      
      inline def setTurboMode(value: Boolean): Self = StObject.set(x, "turboMode", value.asInstanceOf[js.Any])
      
      inline def setTurboModeUndefined: Self = StObject.set(x, "turboMode", js.undefined)
      
      inline def setView(value: View2D): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewMode(value: ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      inline def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      
      inline def setWorkerMode(value: Boolean): Self = StObject.set(x, "workerMode", value.asInstanceOf[js.Any])
      
      inline def setWorkerModeUndefined: Self = StObject.set(x, "workerMode", js.undefined)
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomEnable(value: Boolean): Self = StObject.set(x, "zoomEnable", value.asInstanceOf[js.Any])
      
      inline def setZoomEnableUndefined: Self = StObject.set(x, "zoomEnable", js.undefined)
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
      
      inline def setZooms(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "zooms", value.asInstanceOf[js.Any])
      
      inline def setZoomsUndefined: Self = StObject.set(x, "zooms", js.undefined)
    }
  }
  
  trait Status extends StObject {
    
    /**
      * 是否开启动画
      */
    var animateEnable: Boolean
    
    /**
      * 是否双击缩放
      */
    var doubleClickZoom: Boolean
    
    /**
      * 是否支持拖拽
      */
    var dragEnable: Boolean
    
    var isHotspot: Boolean
    
    /**
      * 是否开启缓动效果
      */
    var jogEnable: Boolean
    
    /**
      * 是否支持键盘
      */
    var keyboardEnable: Boolean
    
    /**
      * 是否支持调整俯仰角
      */
    var pitchEnable: Boolean
    
    var resizeEnable: Boolean
    
    /**
      * 是否支持旋转
      */
    var rotateEnable: Boolean
    
    /**
      * 是否支持滚轮缩放
      */
    var scrollWheel: Boolean
    
    /**
      * 是否支持触摸缩放
      */
    var touchZoom: Boolean
    
    /**
      * 是否支持缩放
      */
    var zoomEnable: Boolean
  }
  object Status {
    
    inline def apply(
      animateEnable: Boolean,
      doubleClickZoom: Boolean,
      dragEnable: Boolean,
      isHotspot: Boolean,
      jogEnable: Boolean,
      keyboardEnable: Boolean,
      pitchEnable: Boolean,
      resizeEnable: Boolean,
      rotateEnable: Boolean,
      scrollWheel: Boolean,
      touchZoom: Boolean,
      zoomEnable: Boolean
    ): Status = {
      val __obj = js.Dynamic.literal(animateEnable = animateEnable.asInstanceOf[js.Any], doubleClickZoom = doubleClickZoom.asInstanceOf[js.Any], dragEnable = dragEnable.asInstanceOf[js.Any], isHotspot = isHotspot.asInstanceOf[js.Any], jogEnable = jogEnable.asInstanceOf[js.Any], keyboardEnable = keyboardEnable.asInstanceOf[js.Any], pitchEnable = pitchEnable.asInstanceOf[js.Any], resizeEnable = resizeEnable.asInstanceOf[js.Any], rotateEnable = rotateEnable.asInstanceOf[js.Any], scrollWheel = scrollWheel.asInstanceOf[js.Any], touchZoom = touchZoom.asInstanceOf[js.Any], zoomEnable = zoomEnable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Status]
    }
    
    extension [Self <: Status](x: Self) {
      
      inline def setAnimateEnable(value: Boolean): Self = StObject.set(x, "animateEnable", value.asInstanceOf[js.Any])
      
      inline def setDoubleClickZoom(value: Boolean): Self = StObject.set(x, "doubleClickZoom", value.asInstanceOf[js.Any])
      
      inline def setDragEnable(value: Boolean): Self = StObject.set(x, "dragEnable", value.asInstanceOf[js.Any])
      
      inline def setIsHotspot(value: Boolean): Self = StObject.set(x, "isHotspot", value.asInstanceOf[js.Any])
      
      inline def setJogEnable(value: Boolean): Self = StObject.set(x, "jogEnable", value.asInstanceOf[js.Any])
      
      inline def setKeyboardEnable(value: Boolean): Self = StObject.set(x, "keyboardEnable", value.asInstanceOf[js.Any])
      
      inline def setPitchEnable(value: Boolean): Self = StObject.set(x, "pitchEnable", value.asInstanceOf[js.Any])
      
      inline def setResizeEnable(value: Boolean): Self = StObject.set(x, "resizeEnable", value.asInstanceOf[js.Any])
      
      inline def setRotateEnable(value: Boolean): Self = StObject.set(x, "rotateEnable", value.asInstanceOf[js.Any])
      
      inline def setScrollWheel(value: Boolean): Self = StObject.set(x, "scrollWheel", value.asInstanceOf[js.Any])
      
      inline def setTouchZoom(value: Boolean): Self = StObject.set(x, "touchZoom", value.asInstanceOf[js.Any])
      
      inline def setZoomEnable(value: Boolean): Self = StObject.set(x, "zoomEnable", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.amapJsApi.amapJsApiStrings.`2D`
    - typings.amapJsApi.amapJsApiStrings.`3D`
  */
  trait ViewMode extends StObject
  object ViewMode {
    
    inline def `2D`: typings.amapJsApi.amapJsApiStrings.`2D` = "2D".asInstanceOf[typings.amapJsApi.amapJsApiStrings.`2D`]
    
    inline def `3D`: typings.amapJsApi.amapJsApiStrings.`3D` = "3D".asInstanceOf[typings.amapJsApi.amapJsApiStrings.`3D`]
  }
}
