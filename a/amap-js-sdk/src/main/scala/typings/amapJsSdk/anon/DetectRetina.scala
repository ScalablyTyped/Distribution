package typings.amapJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectRetina extends StObject {
  
  var detectRetina: js.UndefOr[Boolean] = js.undefined
  
  var errorUrl: js.UndefOr[String] = js.undefined
  
  var getTileUrl: js.UndefOr[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, String]] = js.undefined
  
  var map: typings.amapJsSdk.AMap.Map
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var tileSize: js.UndefOr[Double] = js.undefined
  
  var tileUrl: js.UndefOr[String] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
  
  var zooms: js.UndefOr[js.Array[Double]] = js.undefined
}
object DetectRetina {
  
  inline def apply(map: typings.amapJsSdk.AMap.Map): DetectRetina = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectRetina]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectRetina] (val x: Self) extends AnyVal {
    
    inline def setDetectRetina(value: Boolean): Self = StObject.set(x, "detectRetina", value.asInstanceOf[js.Any])
    
    inline def setDetectRetinaUndefined: Self = StObject.set(x, "detectRetina", js.undefined)
    
    inline def setErrorUrl(value: String): Self = StObject.set(x, "errorUrl", value.asInstanceOf[js.Any])
    
    inline def setErrorUrlUndefined: Self = StObject.set(x, "errorUrl", js.undefined)
    
    inline def setGetTileUrl(value: (/* x */ Double, /* y */ Double, /* z */ Double) => String): Self = StObject.set(x, "getTileUrl", js.Any.fromFunction3(value))
    
    inline def setGetTileUrlUndefined: Self = StObject.set(x, "getTileUrl", js.undefined)
    
    inline def setMap(value: typings.amapJsSdk.AMap.Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    
    inline def setTileUrl(value: String): Self = StObject.set(x, "tileUrl", value.asInstanceOf[js.Any])
    
    inline def setTileUrlUndefined: Self = StObject.set(x, "tileUrl", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    
    inline def setZooms(value: js.Array[Double]): Self = StObject.set(x, "zooms", value.asInstanceOf[js.Any])
    
    inline def setZoomsUndefined: Self = StObject.set(x, "zooms", js.undefined)
    
    inline def setZoomsVarargs(value: Double*): Self = StObject.set(x, "zooms", js.Array(value*))
  }
}
