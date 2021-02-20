package typings.amapJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectRetina extends StObject {
  
  var detectRetina: js.UndefOr[Boolean] = js.native
  
  var errorUrl: js.UndefOr[String] = js.native
  
  var getTileUrl: js.UndefOr[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, String]] = js.native
  
  var map: typings.amapJsSdk.AMap.Map = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var tileSize: js.UndefOr[Double] = js.native
  
  var tileUrl: js.UndefOr[String] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
  
  var zooms: js.UndefOr[js.Array[Double]] = js.native
}
object DetectRetina {
  
  @scala.inline
  def apply(map: typings.amapJsSdk.AMap.Map): DetectRetina = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectRetina]
  }
  
  @scala.inline
  implicit class DetectRetinaMutableBuilder[Self <: DetectRetina] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectRetina(value: Boolean): Self = StObject.set(x, "detectRetina", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectRetinaUndefined: Self = StObject.set(x, "detectRetina", js.undefined)
    
    @scala.inline
    def setErrorUrl(value: String): Self = StObject.set(x, "errorUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUrlUndefined: Self = StObject.set(x, "errorUrl", js.undefined)
    
    @scala.inline
    def setGetTileUrl(value: (/* x */ Double, /* y */ Double, /* z */ Double) => String): Self = StObject.set(x, "getTileUrl", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetTileUrlUndefined: Self = StObject.set(x, "getTileUrl", js.undefined)
    
    @scala.inline
    def setMap(value: typings.amapJsSdk.AMap.Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    
    @scala.inline
    def setTileUrl(value: String): Self = StObject.set(x, "tileUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileUrlUndefined: Self = StObject.set(x, "tileUrl", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    
    @scala.inline
    def setZooms(value: js.Array[Double]): Self = StObject.set(x, "zooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomsUndefined: Self = StObject.set(x, "zooms", js.undefined)
    
    @scala.inline
    def setZoomsVarargs(value: Double*): Self = StObject.set(x, "zooms", js.Array(value :_*))
  }
}
