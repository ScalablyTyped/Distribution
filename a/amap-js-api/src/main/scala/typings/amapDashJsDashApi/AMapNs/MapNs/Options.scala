package typings.amapDashJsDashApi.AMapNs.MapNs

import typings.amapDashJsDashApi.AMapNs.Lang
import typings.amapDashJsDashApi.AMapNs.Layer
import typings.amapDashJsDashApi.AMapNs.LocationValue
import typings.amapDashJsDashApi.AMapNs.TileLayer
import typings.amapDashJsDashApi.AMapNs.View2D
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.EPSG3395
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.EPSG3857
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.EPSG4326
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.all
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.c
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.d
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.dv
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.v
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.vw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
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
  @scala.inline
  def apply(
    animateEnable: js.UndefOr[Boolean] = js.undefined,
    baseRender: vw | d | dv | v = null,
    buildingAnimation: js.UndefOr[Boolean] = js.undefined,
    center: LocationValue = null,
    copyright: String = null,
    crs: EPSG3857 | EPSG3395 | EPSG4326 = null,
    defaultCursor: String = null,
    defaultLayer: TileLayer = null,
    doubleClickZoom: js.UndefOr[Boolean] = js.undefined,
    dragEnable: js.UndefOr[Boolean] = js.undefined,
    expandZoomRange: js.UndefOr[Boolean] = js.undefined,
    features: js.Array[Feature] | all | Feature = null,
    forceVector: js.UndefOr[Boolean] = js.undefined,
    gridMapForeign: js.UndefOr[Boolean] = js.undefined,
    isHotspot: js.UndefOr[Boolean] = js.undefined,
    jogEnable: js.UndefOr[Boolean] = js.undefined,
    keyboardEnable: js.UndefOr[Boolean] = js.undefined,
    labelzIndex: Int | Double = null,
    lang: Lang = null,
    layers: js.Array[Layer] = null,
    logoUrl: String = null,
    logoUrlRetina: String = null,
    mapStyle: String = null,
    mask: js.Array[
      (js.Array[(js.Array[js.Tuple2[Double, Double]]) | (js.Tuple2[Double, Double])]) | (js.Tuple2[Double, Double])
    ] = null,
    maxPitch: Int | Double = null,
    overlayRender: c | d = null,
    pitch: Int | Double = null,
    pitchEnable: js.UndefOr[Boolean] = js.undefined,
    preloadMode: js.UndefOr[Boolean] = js.undefined,
    resizeEnable: js.UndefOr[Boolean] = js.undefined,
    rotateEnable: js.UndefOr[Boolean] = js.undefined,
    rotation: Int | Double = null,
    scrollWheel: js.UndefOr[Boolean] = js.undefined,
    showBuildingBlock: js.UndefOr[Boolean] = js.undefined,
    showIndoorMap: js.UndefOr[Boolean] = js.undefined,
    showLabel: js.UndefOr[Boolean] = js.undefined,
    skyColor: String = null,
    touchZoom: js.UndefOr[Boolean] = js.undefined,
    touchZoomCenter: Int | Double = null,
    turboMode: js.UndefOr[Boolean] = js.undefined,
    view: View2D = null,
    viewMode: ViewMode = null,
    workerMode: js.UndefOr[Boolean] = js.undefined,
    zoom: Int | Double = null,
    zoomEnable: js.UndefOr[Boolean] = js.undefined,
    zooms: js.Tuple2[Double, Double] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animateEnable)) __obj.updateDynamic("animateEnable")(animateEnable)
    if (baseRender != null) __obj.updateDynamic("baseRender")(baseRender.asInstanceOf[js.Any])
    if (!js.isUndefined(buildingAnimation)) __obj.updateDynamic("buildingAnimation")(buildingAnimation)
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (crs != null) __obj.updateDynamic("crs")(crs.asInstanceOf[js.Any])
    if (defaultCursor != null) __obj.updateDynamic("defaultCursor")(defaultCursor)
    if (defaultLayer != null) __obj.updateDynamic("defaultLayer")(defaultLayer)
    if (!js.isUndefined(doubleClickZoom)) __obj.updateDynamic("doubleClickZoom")(doubleClickZoom)
    if (!js.isUndefined(dragEnable)) __obj.updateDynamic("dragEnable")(dragEnable)
    if (!js.isUndefined(expandZoomRange)) __obj.updateDynamic("expandZoomRange")(expandZoomRange)
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (!js.isUndefined(forceVector)) __obj.updateDynamic("forceVector")(forceVector)
    if (!js.isUndefined(gridMapForeign)) __obj.updateDynamic("gridMapForeign")(gridMapForeign)
    if (!js.isUndefined(isHotspot)) __obj.updateDynamic("isHotspot")(isHotspot)
    if (!js.isUndefined(jogEnable)) __obj.updateDynamic("jogEnable")(jogEnable)
    if (!js.isUndefined(keyboardEnable)) __obj.updateDynamic("keyboardEnable")(keyboardEnable)
    if (labelzIndex != null) __obj.updateDynamic("labelzIndex")(labelzIndex.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (layers != null) __obj.updateDynamic("layers")(layers)
    if (logoUrl != null) __obj.updateDynamic("logoUrl")(logoUrl)
    if (logoUrlRetina != null) __obj.updateDynamic("logoUrlRetina")(logoUrlRetina)
    if (mapStyle != null) __obj.updateDynamic("mapStyle")(mapStyle)
    if (mask != null) __obj.updateDynamic("mask")(mask)
    if (maxPitch != null) __obj.updateDynamic("maxPitch")(maxPitch.asInstanceOf[js.Any])
    if (overlayRender != null) __obj.updateDynamic("overlayRender")(overlayRender.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (!js.isUndefined(pitchEnable)) __obj.updateDynamic("pitchEnable")(pitchEnable)
    if (!js.isUndefined(preloadMode)) __obj.updateDynamic("preloadMode")(preloadMode)
    if (!js.isUndefined(resizeEnable)) __obj.updateDynamic("resizeEnable")(resizeEnable)
    if (!js.isUndefined(rotateEnable)) __obj.updateDynamic("rotateEnable")(rotateEnable)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollWheel)) __obj.updateDynamic("scrollWheel")(scrollWheel)
    if (!js.isUndefined(showBuildingBlock)) __obj.updateDynamic("showBuildingBlock")(showBuildingBlock)
    if (!js.isUndefined(showIndoorMap)) __obj.updateDynamic("showIndoorMap")(showIndoorMap)
    if (!js.isUndefined(showLabel)) __obj.updateDynamic("showLabel")(showLabel)
    if (skyColor != null) __obj.updateDynamic("skyColor")(skyColor)
    if (!js.isUndefined(touchZoom)) __obj.updateDynamic("touchZoom")(touchZoom)
    if (touchZoomCenter != null) __obj.updateDynamic("touchZoomCenter")(touchZoomCenter.asInstanceOf[js.Any])
    if (!js.isUndefined(turboMode)) __obj.updateDynamic("turboMode")(turboMode)
    if (view != null) __obj.updateDynamic("view")(view)
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode)
    if (!js.isUndefined(workerMode)) __obj.updateDynamic("workerMode")(workerMode)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomEnable)) __obj.updateDynamic("zoomEnable")(zoomEnable)
    if (zooms != null) __obj.updateDynamic("zooms")(zooms)
    __obj.asInstanceOf[Options]
  }
}

