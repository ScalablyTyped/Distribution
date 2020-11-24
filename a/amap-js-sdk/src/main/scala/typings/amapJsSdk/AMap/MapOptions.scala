package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapOptions extends js.Object {
  
  var animateEnable: js.UndefOr[Boolean] = js.native
  
  var center: js.UndefOr[LngLat] = js.native
  
  var crs: js.UndefOr[String] = js.native
  
  var cursor: js.UndefOr[String] = js.native
  
  var defaultLayer: js.UndefOr[TileLayer] = js.native
  
  var doubleClickZoom: js.UndefOr[Boolean] = js.native
  
  var dragEnable: js.UndefOr[Boolean] = js.native
  
  var expandZoomRange: js.UndefOr[Boolean] = js.native
  
  var features: js.UndefOr[js.Array[String]] = js.native
  
  var indoorMap: js.UndefOr[IndoorMap] = js.native
  
  var isHotspot: js.UndefOr[Boolean] = js.native
  
  var jogEnable: js.UndefOr[Boolean] = js.native
  
  var keyboardEnable: js.UndefOr[Boolean] = js.native
  
  var labelzIndex: js.UndefOr[Double] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var layers: js.UndefOr[js.Array[TileLayer]] = js.native
  
  var level: js.UndefOr[Double] = js.native
  
  var mapStyle: js.UndefOr[String] = js.native
  
  var resizeEnable: js.UndefOr[Boolean] = js.native
  
  var rotateEnable: js.UndefOr[Boolean] = js.native
  
  var scrollWheel: js.UndefOr[Boolean] = js.native
  
  var showIndoorMap: js.UndefOr[Boolean] = js.native
  
  var touchZoom: js.UndefOr[Boolean] = js.native
  
  var view: js.UndefOr[View2D] = js.native
  
  var zoomEnable: js.UndefOr[Boolean] = js.native
  
  var zooms: js.UndefOr[js.Array[Double]] = js.native
}
object MapOptions {
  
  @scala.inline
  def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  
  @scala.inline
  implicit class MapOptionsOps[Self <: MapOptions] (val x: Self) extends AnyVal {
    
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
    def setCenter(value: LngLat): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setCrs(value: String): Self = this.set("crs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrs: Self = this.set("crs", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
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
    def setFeaturesVarargs(value: String*): Self = this.set("features", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[String]): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    
    @scala.inline
    def setIndoorMap(value: IndoorMap): Self = this.set("indoorMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndoorMap: Self = this.set("indoorMap", js.undefined)
    
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
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: TileLayer*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: js.Array[TileLayer]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setMapStyle(value: String): Self = this.set("mapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapStyle: Self = this.set("mapStyle", js.undefined)
    
    @scala.inline
    def setResizeEnable(value: Boolean): Self = this.set("resizeEnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeEnable: Self = this.set("resizeEnable", js.undefined)
    
    @scala.inline
    def setRotateEnable(value: Boolean): Self = this.set("rotateEnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotateEnable: Self = this.set("rotateEnable", js.undefined)
    
    @scala.inline
    def setScrollWheel(value: Boolean): Self = this.set("scrollWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollWheel: Self = this.set("scrollWheel", js.undefined)
    
    @scala.inline
    def setShowIndoorMap(value: Boolean): Self = this.set("showIndoorMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowIndoorMap: Self = this.set("showIndoorMap", js.undefined)
    
    @scala.inline
    def setTouchZoom(value: Boolean): Self = this.set("touchZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchZoom: Self = this.set("touchZoom", js.undefined)
    
    @scala.inline
    def setView(value: View2D): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setZoomEnable(value: Boolean): Self = this.set("zoomEnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomEnable: Self = this.set("zoomEnable", js.undefined)
    
    @scala.inline
    def setZoomsVarargs(value: Double*): Self = this.set("zooms", js.Array(value :_*))
    
    @scala.inline
    def setZooms(value: js.Array[Double]): Self = this.set("zooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZooms: Self = this.set("zooms", js.undefined)
  }
}
