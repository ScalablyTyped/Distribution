package typings.amapJsApi.AMap.Map

import typings.amapJsApi.AMap.Lang
import typings.amapJsApi.AMap.Layer
import typings.amapJsApi.AMap.LocationValue
import typings.amapJsApi.AMap.TileLayer
import typings.amapJsApi.AMap.View2D
import typings.amapJsApi.amapJsApiStrings.EPSG3395
import typings.amapJsApi.amapJsApiStrings.EPSG3857
import typings.amapJsApi.amapJsApiStrings.EPSG4326
import typings.amapJsApi.amapJsApiStrings.all
import typings.amapJsApi.amapJsApiStrings.c
import typings.amapJsApi.amapJsApiStrings.d
import typings.amapJsApi.amapJsApiStrings.dv
import typings.amapJsApi.amapJsApiStrings.v
import typings.amapJsApi.amapJsApiStrings.vw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * 地图平移过程中是否使用动画
    */
  var animateEnable: js.UndefOr[Boolean] = js.native
  // internal
  var baseRender: js.UndefOr[vw | d | dv | v] = js.native
  /**
    * 楼块出现和消失的时候是否显示动画过程
    */
  var buildingAnimation: js.UndefOr[Boolean] = js.native
  /**
    * 地图中心点坐标值
    */
  var center: js.UndefOr[LocationValue] = js.native
  var copyright: js.UndefOr[String] = js.native
  /**
    * 地图显示的参考坐标系
    */
  var crs: js.UndefOr[EPSG3857 | EPSG3395 | EPSG4326] = js.native
  /**
    * 地图默认鼠标样式
    */
  var defaultCursor: js.UndefOr[String] = js.native
  /**
    * 当前地图中默认显示的图层
    */
  var defaultLayer: js.UndefOr[TileLayer] = js.native
  /**
    * 地图是否可通过双击鼠标放大地图
    */
  var doubleClickZoom: js.UndefOr[Boolean] = js.native
  /**
    * 地图是否可通过鼠标拖拽平移
    */
  var dragEnable: js.UndefOr[Boolean] = js.native
  /**
    * 在展示矢量图的时候自动展示室内地图图层
    */
  // indoorMap?: IndorMap
  /**
    * 是否支持可以扩展最大缩放级别
    */
  var expandZoomRange: js.UndefOr[Boolean] = js.native
  /**
    * 设置地图上显示的元素种类
    */
  var features: js.UndefOr[js.Array[Feature] | all | Feature] = js.native
  var forceVector: js.UndefOr[Boolean] = js.native
  var gridMapForeign: js.UndefOr[Boolean] = js.native
  /**
    * 是否开启地图热点和标注的hover效果
    */
  var isHotspot: js.UndefOr[Boolean] = js.native
  /**
    * 地图是否使用缓动效果
    */
  var jogEnable: js.UndefOr[Boolean] = js.native
  /**
    * 地图是否可通过键盘控制
    */
  var keyboardEnable: js.UndefOr[Boolean] = js.native
  /**
    * 地图标注显示顺序
    */
  var labelzIndex: js.UndefOr[Double] = js.native
  /**
    * 地图语言类型
    */
  var lang: js.UndefOr[Lang] = js.native
  /**
    * 地图图层数组，数组可以是图层 中的一个或多个，默认为普通二维地图
    */
  var layers: js.UndefOr[js.Array[Layer]] = js.native
  var logoUrl: js.UndefOr[String] = js.native
  var logoUrlRetina: js.UndefOr[String] = js.native
  /**
    * 设置地图的显示样式
    */
  var mapStyle: js.UndefOr[String] = js.native
  /**
    * 为 Map 实例指定掩模的路径，各图层将只显示路径范围内图像
    */
  var mask: js.UndefOr[
    js.Array[
      (js.Array[(js.Array[js.Tuple2[Double, Double]]) | (js.Tuple2[Double, Double])]) | (js.Tuple2[Double, Double])
    ]
  ] = js.native
  var maxPitch: js.UndefOr[Double] = js.native
  var overlayRender: js.UndefOr[c | d] = js.native
  /**
    * 俯仰角度
    */
  var pitch: js.UndefOr[Double] = js.native
  /**
    * 是否允许设置俯仰角度
    */
  var pitchEnable: js.UndefOr[Boolean] = js.native
  /**
    * 设置地图的预加载模式
    */
  var preloadMode: js.UndefOr[Boolean] = js.native
  /**
    * 是否监控地图容器尺寸变化
    */
  var resizeEnable: js.UndefOr[Boolean] = js.native
  /**
    * 地图是否可旋转
    */
  var rotateEnable: js.UndefOr[Boolean] = js.native
  var rotation: js.UndefOr[Double] = js.native
  /**
    * 地图是否可通过鼠标滚轮缩放浏览
    */
  var scrollWheel: js.UndefOr[Boolean] = js.native
  /**
    * 设置地图显示3D楼块效果
    */
  var showBuildingBlock: js.UndefOr[Boolean] = js.native
  /**
    * 是否在有矢量底图的时候自动展示室内地图
    */
  var showIndoorMap: js.UndefOr[Boolean] = js.native
  var showLabel: js.UndefOr[Boolean] = js.native
  /**
    * 调整天空颜色
    */
  var skyColor: js.UndefOr[String] = js.native
  /**
    * 地图在移动终端上是否可通过多点触控缩放浏览地图
    */
  var touchZoom: js.UndefOr[Boolean] = js.native
  /**
    * 当touchZoomCenter=1的时候，手机端双指缩放的以地图中心为中心，否则默认以双指中间点为中心
    */
  var touchZoomCenter: js.UndefOr[Double] = js.native
  var turboMode: js.UndefOr[Boolean] = js.native
  /**
    * 地图视口，用于控制影响地图静态显示的属性
    */
  var view: js.UndefOr[View2D] = js.native
  /**
    * 视图模式
    */
  var viewMode: js.UndefOr[ViewMode] = js.native
  var workerMode: js.UndefOr[Boolean] = js.native
  /**
    * 地图显示的缩放级别
    */
  var zoom: js.UndefOr[Double] = js.native
  /**
    * 地图是否可缩放
    */
  var zoomEnable: js.UndefOr[Boolean] = js.native
  /**
    * 地图显示的缩放级别范围
    */
  var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimateEnable(value: Boolean): Self = this.set("animateEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateEnable: Self = this.set("animateEnable", js.undefined)
    @scala.inline
    def setBaseRender(value: vw | d | dv | v): Self = this.set("baseRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseRender: Self = this.set("baseRender", js.undefined)
    @scala.inline
    def setBuildingAnimation(value: Boolean): Self = this.set("buildingAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildingAnimation: Self = this.set("buildingAnimation", js.undefined)
    @scala.inline
    def setCenter(value: LocationValue): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    @scala.inline
    def setCrs(value: EPSG3857 | EPSG3395 | EPSG4326): Self = this.set("crs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrs: Self = this.set("crs", js.undefined)
    @scala.inline
    def setDefaultCursor(value: String): Self = this.set("defaultCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultCursor: Self = this.set("defaultCursor", js.undefined)
    @scala.inline
    def setDefaultLayer(value: TileLayer): Self = this.set("defaultLayer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLayer: Self = this.set("defaultLayer", js.undefined)
    @scala.inline
    def setDoubleClickZoom(value: Boolean): Self = this.set("doubleClickZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleClickZoom: Self = this.set("doubleClickZoom", js.undefined)
    @scala.inline
    def setDragEnable(value: Boolean): Self = this.set("dragEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragEnable: Self = this.set("dragEnable", js.undefined)
    @scala.inline
    def setExpandZoomRange(value: Boolean): Self = this.set("expandZoomRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandZoomRange: Self = this.set("expandZoomRange", js.undefined)
    @scala.inline
    def setFeaturesVarargs(value: Feature*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: js.Array[Feature] | all | Feature): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setForceVector(value: Boolean): Self = this.set("forceVector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceVector: Self = this.set("forceVector", js.undefined)
    @scala.inline
    def setGridMapForeign(value: Boolean): Self = this.set("gridMapForeign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridMapForeign: Self = this.set("gridMapForeign", js.undefined)
    @scala.inline
    def setIsHotspot(value: Boolean): Self = this.set("isHotspot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHotspot: Self = this.set("isHotspot", js.undefined)
    @scala.inline
    def setJogEnable(value: Boolean): Self = this.set("jogEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJogEnable: Self = this.set("jogEnable", js.undefined)
    @scala.inline
    def setKeyboardEnable(value: Boolean): Self = this.set("keyboardEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardEnable: Self = this.set("keyboardEnable", js.undefined)
    @scala.inline
    def setLabelzIndex(value: Double): Self = this.set("labelzIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelzIndex: Self = this.set("labelzIndex", js.undefined)
    @scala.inline
    def setLang(value: Lang): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setLayersVarargs(value: Layer*): Self = this.set("layers", js.Array(value :_*))
    @scala.inline
    def setLayers(value: js.Array[Layer]): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    @scala.inline
    def setLogoUrl(value: String): Self = this.set("logoUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogoUrl: Self = this.set("logoUrl", js.undefined)
    @scala.inline
    def setLogoUrlRetina(value: String): Self = this.set("logoUrlRetina", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogoUrlRetina: Self = this.set("logoUrlRetina", js.undefined)
    @scala.inline
    def setMapStyle(value: String): Self = this.set("mapStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapStyle: Self = this.set("mapStyle", js.undefined)
    @scala.inline
    def setMaskVarargs(
      value: ((js.Array[(js.Array[js.Tuple2[Double, Double]]) | (js.Tuple2[Double, Double])]) | (js.Tuple2[Double, Double]))*
    ): Self = this.set("mask", js.Array(value :_*))
    @scala.inline
    def setMask(
      value: js.Array[
          (js.Array[(js.Array[js.Tuple2[Double, Double]]) | (js.Tuple2[Double, Double])]) | (js.Tuple2[Double, Double])
        ]
    ): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setMaxPitch(value: Double): Self = this.set("maxPitch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPitch: Self = this.set("maxPitch", js.undefined)
    @scala.inline
    def setOverlayRender(value: c | d): Self = this.set("overlayRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayRender: Self = this.set("overlayRender", js.undefined)
    @scala.inline
    def setPitch(value: Double): Self = this.set("pitch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePitch: Self = this.set("pitch", js.undefined)
    @scala.inline
    def setPitchEnable(value: Boolean): Self = this.set("pitchEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePitchEnable: Self = this.set("pitchEnable", js.undefined)
    @scala.inline
    def setPreloadMode(value: Boolean): Self = this.set("preloadMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreloadMode: Self = this.set("preloadMode", js.undefined)
    @scala.inline
    def setResizeEnable(value: Boolean): Self = this.set("resizeEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeEnable: Self = this.set("resizeEnable", js.undefined)
    @scala.inline
    def setRotateEnable(value: Boolean): Self = this.set("rotateEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotateEnable: Self = this.set("rotateEnable", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setScrollWheel(value: Boolean): Self = this.set("scrollWheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollWheel: Self = this.set("scrollWheel", js.undefined)
    @scala.inline
    def setShowBuildingBlock(value: Boolean): Self = this.set("showBuildingBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowBuildingBlock: Self = this.set("showBuildingBlock", js.undefined)
    @scala.inline
    def setShowIndoorMap(value: Boolean): Self = this.set("showIndoorMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowIndoorMap: Self = this.set("showIndoorMap", js.undefined)
    @scala.inline
    def setShowLabel(value: Boolean): Self = this.set("showLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLabel: Self = this.set("showLabel", js.undefined)
    @scala.inline
    def setSkyColor(value: String): Self = this.set("skyColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkyColor: Self = this.set("skyColor", js.undefined)
    @scala.inline
    def setTouchZoom(value: Boolean): Self = this.set("touchZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchZoom: Self = this.set("touchZoom", js.undefined)
    @scala.inline
    def setTouchZoomCenter(value: Double): Self = this.set("touchZoomCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchZoomCenter: Self = this.set("touchZoomCenter", js.undefined)
    @scala.inline
    def setTurboMode(value: Boolean): Self = this.set("turboMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTurboMode: Self = this.set("turboMode", js.undefined)
    @scala.inline
    def setView(value: View2D): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    @scala.inline
    def setViewMode(value: ViewMode): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewMode: Self = this.set("viewMode", js.undefined)
    @scala.inline
    def setWorkerMode(value: Boolean): Self = this.set("workerMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerMode: Self = this.set("workerMode", js.undefined)
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
    @scala.inline
    def setZoomEnable(value: Boolean): Self = this.set("zoomEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomEnable: Self = this.set("zoomEnable", js.undefined)
    @scala.inline
    def setZooms(value: js.Tuple2[Double, Double]): Self = this.set("zooms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZooms: Self = this.set("zooms", js.undefined)
  }
  
}

