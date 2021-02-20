package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapOptions extends StObject {
  
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
  implicit class MapOptionsMutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimateEnable(value: Boolean): Self = StObject.set(x, "animateEnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateEnableUndefined: Self = StObject.set(x, "animateEnable", js.undefined)
    
    @scala.inline
    def setCenter(value: LngLat): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setCrs(value: String): Self = StObject.set(x, "crs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrsUndefined: Self = StObject.set(x, "crs", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setDefaultLayer(value: TileLayer): Self = StObject.set(x, "defaultLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLayerUndefined: Self = StObject.set(x, "defaultLayer", js.undefined)
    
    @scala.inline
    def setDoubleClickZoom(value: Boolean): Self = StObject.set(x, "doubleClickZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleClickZoomUndefined: Self = StObject.set(x, "doubleClickZoom", js.undefined)
    
    @scala.inline
    def setDragEnable(value: Boolean): Self = StObject.set(x, "dragEnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragEnableUndefined: Self = StObject.set(x, "dragEnable", js.undefined)
    
    @scala.inline
    def setExpandZoomRange(value: Boolean): Self = StObject.set(x, "expandZoomRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandZoomRangeUndefined: Self = StObject.set(x, "expandZoomRange", js.undefined)
    
    @scala.inline
    def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setIndoorMap(value: IndoorMap): Self = StObject.set(x, "indoorMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndoorMapUndefined: Self = StObject.set(x, "indoorMap", js.undefined)
    
    @scala.inline
    def setIsHotspot(value: Boolean): Self = StObject.set(x, "isHotspot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHotspotUndefined: Self = StObject.set(x, "isHotspot", js.undefined)
    
    @scala.inline
    def setJogEnable(value: Boolean): Self = StObject.set(x, "jogEnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJogEnableUndefined: Self = StObject.set(x, "jogEnable", js.undefined)
    
    @scala.inline
    def setKeyboardEnable(value: Boolean): Self = StObject.set(x, "keyboardEnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardEnableUndefined: Self = StObject.set(x, "keyboardEnable", js.undefined)
    
    @scala.inline
    def setLabelzIndex(value: Double): Self = StObject.set(x, "labelzIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelzIndexUndefined: Self = StObject.set(x, "labelzIndex", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setLayers(value: js.Array[TileLayer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: TileLayer*): Self = StObject.set(x, "layers", js.Array(value :_*))
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setMapStyle(value: String): Self = StObject.set(x, "mapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapStyleUndefined: Self = StObject.set(x, "mapStyle", js.undefined)
    
    @scala.inline
    def setResizeEnable(value: Boolean): Self = StObject.set(x, "resizeEnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeEnableUndefined: Self = StObject.set(x, "resizeEnable", js.undefined)
    
    @scala.inline
    def setRotateEnable(value: Boolean): Self = StObject.set(x, "rotateEnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateEnableUndefined: Self = StObject.set(x, "rotateEnable", js.undefined)
    
    @scala.inline
    def setScrollWheel(value: Boolean): Self = StObject.set(x, "scrollWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollWheelUndefined: Self = StObject.set(x, "scrollWheel", js.undefined)
    
    @scala.inline
    def setShowIndoorMap(value: Boolean): Self = StObject.set(x, "showIndoorMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowIndoorMapUndefined: Self = StObject.set(x, "showIndoorMap", js.undefined)
    
    @scala.inline
    def setTouchZoom(value: Boolean): Self = StObject.set(x, "touchZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchZoomUndefined: Self = StObject.set(x, "touchZoom", js.undefined)
    
    @scala.inline
    def setView(value: View2D): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setZoomEnable(value: Boolean): Self = StObject.set(x, "zoomEnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomEnableUndefined: Self = StObject.set(x, "zoomEnable", js.undefined)
    
    @scala.inline
    def setZooms(value: js.Array[Double]): Self = StObject.set(x, "zooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomsUndefined: Self = StObject.set(x, "zooms", js.undefined)
    
    @scala.inline
    def setZoomsVarargs(value: Double*): Self = StObject.set(x, "zooms", js.Array(value :_*))
  }
}
