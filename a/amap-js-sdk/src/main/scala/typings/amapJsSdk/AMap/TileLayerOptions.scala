package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileLayerOptions extends js.Object {
  
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
  implicit class TileLayerOptionsOps[Self <: TileLayerOptions] (val x: Self) extends AnyVal {
    
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
    def setDetectRetina(value: Boolean): Self = this.set("detectRetina", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUrl(value: String): Self = this.set("errorUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTileUrl(value: (Double, Double, Double) => String): Self = this.set("getTileUrl", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMap(value: Map): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileSize(value: Double): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileUrl(value: String): Self = this.set("tileUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomsVarargs(value: Double*): Self = this.set("zooms", js.Array(value :_*))
    
    @scala.inline
    def setZooms(value: js.Array[Double]): Self = this.set("zooms", value.asInstanceOf[js.Any])
  }
}
