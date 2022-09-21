package typings.amapJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Map extends StObject {
  
  var detectRetina: js.UndefOr[Boolean] = js.undefined
  
  var map: typings.amapJsSdk.AMap.Map
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
  
  var zooms: js.UndefOr[js.Array[Double]] = js.undefined
}
object Map {
  
  inline def apply(map: typings.amapJsSdk.AMap.Map): Map = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
  
  extension [Self <: Map](x: Self) {
    
    inline def setDetectRetina(value: Boolean): Self = StObject.set(x, "detectRetina", value.asInstanceOf[js.Any])
    
    inline def setDetectRetinaUndefined: Self = StObject.set(x, "detectRetina", js.undefined)
    
    inline def setMap(value: typings.amapJsSdk.AMap.Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    
    inline def setZooms(value: js.Array[Double]): Self = StObject.set(x, "zooms", value.asInstanceOf[js.Any])
    
    inline def setZoomsUndefined: Self = StObject.set(x, "zooms", js.undefined)
    
    inline def setZoomsVarargs(value: Double*): Self = StObject.set(x, "zooms", js.Array(value*))
  }
}
