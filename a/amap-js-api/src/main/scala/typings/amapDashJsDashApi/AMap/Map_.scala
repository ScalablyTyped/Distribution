package typings.amapDashJsDashApi.AMap

import typings.amapDashJsDashApi.AMap.Map.Feature
import typings.amapDashJsDashApi.AMap.Map.Options
import typings.amapDashJsDashApi.AMap.Map.Status
import typings.amapDashJsDashApi.AMap.Map.ViewMode
import typings.amapDashJsDashApi.Anon_City
import typings.amapDashJsDashApi.Anon_IdLocation
import typings.amapDashJsDashApi.PartialStatus
import typings.amapDashJsDashApi.amapDashJsDashApiNumbers.`false`
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.all
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.circle
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.marker
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.polygon_
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.polyline
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Map")
@js.native
class Map_ protected () extends EventEmitter {
  /**
    * 构造一个地图对象
    * @param container 地图容器的id或者是DOM元素
    * @param opts 选项
    */
  def this(container: String) = this()
  def this(container: HTMLElement) = this()
  def this(container: String, opts: Options) = this()
  def this(container: HTMLElement, opts: Options) = this()
  def add(overlay: js.Array[Overlay[_]]): Unit = js.native
  /**
    * 添加覆盖物/图层
    * @param overlay 覆盖物/图层
    */
  def add(overlay: Overlay[_]): Unit = js.native
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
  def detailOnAMAP(obj: Anon_IdLocation): Unit = js.native
  def geodeticCoordToLngLat(pixel: Pixel): LngLat = js.native
  /**
    * 返回添加的覆盖物对象
    * @param type 覆盖物类型
    */
  def getAllOverlays(): js.Array[Overlay[_]] = js.native
  @JSName("getAllOverlays")
  def getAllOverlays_circle(`type`: circle): js.Array[Overlay[_]] = js.native
  @JSName("getAllOverlays")
  def getAllOverlays_marker(`type`: marker): js.Array[Overlay[_]] = js.native
  @JSName("getAllOverlays")
  def getAllOverlays_polygon(`type`: polygon_): js.Array[Overlay[_]] = js.native
  @JSName("getAllOverlays")
  def getAllOverlays_polyline(`type`: polyline): js.Array[Overlay[_]] = js.native
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
  def getCity(callback: js.Function1[/* cityData */ Anon_City, Unit]): Unit = js.native
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
  def poiOnAMAP(obj: Anon_IdLocation): Unit = js.native
  def remove(overlay: js.Array[Overlay[_]]): Unit = js.native
  /**
    * 删除覆盖物/图层
    * @param overlay 覆盖物/图层
    */
  def remove(overlay: Overlay[_]): Unit = js.native
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
  def setFitView(overlayList: js.Array[Overlay[_]]): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(overlayList: js.Array[Overlay[_]], immediately: Boolean): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(
    overlayList: js.Array[Overlay[_]],
    immediately: Boolean,
    avoid: js.Tuple4[Double, Double, Double, Double]
  ): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(
    overlayList: js.Array[Overlay[_]],
    immediately: Boolean,
    avoid: js.Tuple4[Double, Double, Double, Double],
    maxZoom: Double
  ): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(overlayList: Overlay[_]): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(overlayList: Overlay[_], immediately: Boolean): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(overlayList: Overlay[_], immediately: Boolean, avoid: js.Tuple4[Double, Double, Double, Double]): js.UndefOr[Bounds | `false`] = js.native
  def setFitView(
    overlayList: Overlay[_],
    immediately: Boolean,
    avoid: js.Tuple4[Double, Double, Double, Double],
    maxZoom: Double
  ): js.UndefOr[Bounds | `false`] = js.native
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

