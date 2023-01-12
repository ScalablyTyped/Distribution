package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerClustererOptions extends StObject {
  
  var averageCenter: js.UndefOr[Boolean] = js.undefined
  
  var gridSize: js.UndefOr[Double] = js.undefined
  
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  var minClusterSize: js.UndefOr[Double] = js.undefined
  
  var renderCluserMarker: js.UndefOr[js.Function1[/* obj */ Any, Unit]] = js.undefined
  
  var styles: js.UndefOr[js.Array[Any]] = js.undefined
  
  var zoomOnClick: js.UndefOr[Boolean] = js.undefined
}
object MarkerClustererOptions {
  
  inline def apply(): MarkerClustererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerClustererOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkerClustererOptions] (val x: Self) extends AnyVal {
    
    inline def setAverageCenter(value: Boolean): Self = StObject.set(x, "averageCenter", value.asInstanceOf[js.Any])
    
    inline def setAverageCenterUndefined: Self = StObject.set(x, "averageCenter", js.undefined)
    
    inline def setGridSize(value: Double): Self = StObject.set(x, "gridSize", value.asInstanceOf[js.Any])
    
    inline def setGridSizeUndefined: Self = StObject.set(x, "gridSize", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMinClusterSize(value: Double): Self = StObject.set(x, "minClusterSize", value.asInstanceOf[js.Any])
    
    inline def setMinClusterSizeUndefined: Self = StObject.set(x, "minClusterSize", js.undefined)
    
    inline def setRenderCluserMarker(value: /* obj */ Any => Unit): Self = StObject.set(x, "renderCluserMarker", js.Any.fromFunction1(value))
    
    inline def setRenderCluserMarkerUndefined: Self = StObject.set(x, "renderCluserMarker", js.undefined)
    
    inline def setStyles(value: js.Array[Any]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: Any*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setZoomOnClick(value: Boolean): Self = StObject.set(x, "zoomOnClick", value.asInstanceOf[js.Any])
    
    inline def setZoomOnClickUndefined: Self = StObject.set(x, "zoomOnClick", js.undefined)
  }
}
