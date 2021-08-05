package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapOptions extends StObject {
  
  var animateEnable: js.UndefOr[Boolean] = js.undefined
  
  var center: js.UndefOr[LngLat] = js.undefined
  
  var crs: js.UndefOr[String] = js.undefined
  
  var cursor: js.UndefOr[String] = js.undefined
  
  var defaultLayer: js.UndefOr[TileLayer] = js.undefined
  
  var doubleClickZoom: js.UndefOr[Boolean] = js.undefined
  
  var dragEnable: js.UndefOr[Boolean] = js.undefined
  
  var expandZoomRange: js.UndefOr[Boolean] = js.undefined
  
  var features: js.UndefOr[js.Array[String]] = js.undefined
  
  var indoorMap: js.UndefOr[IndoorMap] = js.undefined
  
  var isHotspot: js.UndefOr[Boolean] = js.undefined
  
  var jogEnable: js.UndefOr[Boolean] = js.undefined
  
  var keyboardEnable: js.UndefOr[Boolean] = js.undefined
  
  var labelzIndex: js.UndefOr[Double] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var layers: js.UndefOr[js.Array[TileLayer]] = js.undefined
  
  var level: js.UndefOr[Double] = js.undefined
  
  var mapStyle: js.UndefOr[String] = js.undefined
  
  var resizeEnable: js.UndefOr[Boolean] = js.undefined
  
  var rotateEnable: js.UndefOr[Boolean] = js.undefined
  
  var scrollWheel: js.UndefOr[Boolean] = js.undefined
  
  var showIndoorMap: js.UndefOr[Boolean] = js.undefined
  
  var touchZoom: js.UndefOr[Boolean] = js.undefined
  
  var view: js.UndefOr[View2D] = js.undefined
  
  var zoomEnable: js.UndefOr[Boolean] = js.undefined
  
  var zooms: js.UndefOr[js.Array[Double]] = js.undefined
}
object MapOptions {
  
  inline def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  
  extension [Self <: MapOptions](x: Self) {
    
    inline def setAnimateEnable(value: Boolean): Self = StObject.set(x, "animateEnable", value.asInstanceOf[js.Any])
    
    inline def setAnimateEnableUndefined: Self = StObject.set(x, "animateEnable", js.undefined)
    
    inline def setCenter(value: LngLat): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setCrs(value: String): Self = StObject.set(x, "crs", value.asInstanceOf[js.Any])
    
    inline def setCrsUndefined: Self = StObject.set(x, "crs", js.undefined)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setDefaultLayer(value: TileLayer): Self = StObject.set(x, "defaultLayer", value.asInstanceOf[js.Any])
    
    inline def setDefaultLayerUndefined: Self = StObject.set(x, "defaultLayer", js.undefined)
    
    inline def setDoubleClickZoom(value: Boolean): Self = StObject.set(x, "doubleClickZoom", value.asInstanceOf[js.Any])
    
    inline def setDoubleClickZoomUndefined: Self = StObject.set(x, "doubleClickZoom", js.undefined)
    
    inline def setDragEnable(value: Boolean): Self = StObject.set(x, "dragEnable", value.asInstanceOf[js.Any])
    
    inline def setDragEnableUndefined: Self = StObject.set(x, "dragEnable", js.undefined)
    
    inline def setExpandZoomRange(value: Boolean): Self = StObject.set(x, "expandZoomRange", value.asInstanceOf[js.Any])
    
    inline def setExpandZoomRangeUndefined: Self = StObject.set(x, "expandZoomRange", js.undefined)
    
    inline def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    inline def setIndoorMap(value: IndoorMap): Self = StObject.set(x, "indoorMap", value.asInstanceOf[js.Any])
    
    inline def setIndoorMapUndefined: Self = StObject.set(x, "indoorMap", js.undefined)
    
    inline def setIsHotspot(value: Boolean): Self = StObject.set(x, "isHotspot", value.asInstanceOf[js.Any])
    
    inline def setIsHotspotUndefined: Self = StObject.set(x, "isHotspot", js.undefined)
    
    inline def setJogEnable(value: Boolean): Self = StObject.set(x, "jogEnable", value.asInstanceOf[js.Any])
    
    inline def setJogEnableUndefined: Self = StObject.set(x, "jogEnable", js.undefined)
    
    inline def setKeyboardEnable(value: Boolean): Self = StObject.set(x, "keyboardEnable", value.asInstanceOf[js.Any])
    
    inline def setKeyboardEnableUndefined: Self = StObject.set(x, "keyboardEnable", js.undefined)
    
    inline def setLabelzIndex(value: Double): Self = StObject.set(x, "labelzIndex", value.asInstanceOf[js.Any])
    
    inline def setLabelzIndexUndefined: Self = StObject.set(x, "labelzIndex", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setLayers(value: js.Array[TileLayer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: TileLayer*): Self = StObject.set(x, "layers", js.Array(value :_*))
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setMapStyle(value: String): Self = StObject.set(x, "mapStyle", value.asInstanceOf[js.Any])
    
    inline def setMapStyleUndefined: Self = StObject.set(x, "mapStyle", js.undefined)
    
    inline def setResizeEnable(value: Boolean): Self = StObject.set(x, "resizeEnable", value.asInstanceOf[js.Any])
    
    inline def setResizeEnableUndefined: Self = StObject.set(x, "resizeEnable", js.undefined)
    
    inline def setRotateEnable(value: Boolean): Self = StObject.set(x, "rotateEnable", value.asInstanceOf[js.Any])
    
    inline def setRotateEnableUndefined: Self = StObject.set(x, "rotateEnable", js.undefined)
    
    inline def setScrollWheel(value: Boolean): Self = StObject.set(x, "scrollWheel", value.asInstanceOf[js.Any])
    
    inline def setScrollWheelUndefined: Self = StObject.set(x, "scrollWheel", js.undefined)
    
    inline def setShowIndoorMap(value: Boolean): Self = StObject.set(x, "showIndoorMap", value.asInstanceOf[js.Any])
    
    inline def setShowIndoorMapUndefined: Self = StObject.set(x, "showIndoorMap", js.undefined)
    
    inline def setTouchZoom(value: Boolean): Self = StObject.set(x, "touchZoom", value.asInstanceOf[js.Any])
    
    inline def setTouchZoomUndefined: Self = StObject.set(x, "touchZoom", js.undefined)
    
    inline def setView(value: View2D): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setZoomEnable(value: Boolean): Self = StObject.set(x, "zoomEnable", value.asInstanceOf[js.Any])
    
    inline def setZoomEnableUndefined: Self = StObject.set(x, "zoomEnable", js.undefined)
    
    inline def setZooms(value: js.Array[Double]): Self = StObject.set(x, "zooms", value.asInstanceOf[js.Any])
    
    inline def setZoomsUndefined: Self = StObject.set(x, "zooms", js.undefined)
    
    inline def setZoomsVarargs(value: Double*): Self = StObject.set(x, "zooms", js.Array(value :_*))
  }
}
