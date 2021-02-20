package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileLayerOptions extends StObject {
  
  var detectRetina: Boolean = js.native
  
  var errorUrl: String = js.native
  
  def getTileUrl(x: Double, y: Double, z: Double): String = js.native
  
  var map: Map = js.native
  
  var opacity: Double = js.native
  
  var tileSize: Double = js.native
  
  var tileUrl: String = js.native
  
  var zIndex: Double = js.native
  
  var zooms: js.Array[Double] = js.native
}
object TileLayerOptions {
  
  @scala.inline
  def apply(
    detectRetina: Boolean,
    errorUrl: String,
    getTileUrl: (Double, Double, Double) => String,
    map: Map,
    opacity: Double,
    tileSize: Double,
    tileUrl: String,
    zIndex: Double,
    zooms: js.Array[Double]
  ): TileLayerOptions = {
    val __obj = js.Dynamic.literal(detectRetina = detectRetina.asInstanceOf[js.Any], errorUrl = errorUrl.asInstanceOf[js.Any], getTileUrl = js.Any.fromFunction3(getTileUrl), map = map.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], tileSize = tileSize.asInstanceOf[js.Any], tileUrl = tileUrl.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any], zooms = zooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileLayerOptions]
  }
  
  @scala.inline
  implicit class TileLayerOptionsMutableBuilder[Self <: TileLayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectRetina(value: Boolean): Self = StObject.set(x, "detectRetina", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUrl(value: String): Self = StObject.set(x, "errorUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTileUrl(value: (Double, Double, Double) => String): Self = StObject.set(x, "getTileUrl", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileUrl(value: String): Self = StObject.set(x, "tileUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZooms(value: js.Array[Double]): Self = StObject.set(x, "zooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomsVarargs(value: Double*): Self = StObject.set(x, "zooms", js.Array(value :_*))
  }
}
