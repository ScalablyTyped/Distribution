package typings.amapJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectRetina extends js.Object {
  
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
  implicit class DetectRetinaOps[Self <: DetectRetina] (val x: Self) extends AnyVal {
    
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
    def setMap(value: typings.amapJsSdk.AMap.Map): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectRetina(value: Boolean): Self = this.set("detectRetina", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectRetina: Self = this.set("detectRetina", js.undefined)
    
    @scala.inline
    def setErrorUrl(value: String): Self = this.set("errorUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorUrl: Self = this.set("errorUrl", js.undefined)
    
    @scala.inline
    def setGetTileUrl(value: (/* x */ Double, /* y */ Double, /* z */ Double) => String): Self = this.set("getTileUrl", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteGetTileUrl: Self = this.set("getTileUrl", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setTileSize(value: Double): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileSize: Self = this.set("tileSize", js.undefined)
    
    @scala.inline
    def setTileUrl(value: String): Self = this.set("tileUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileUrl: Self = this.set("tileUrl", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
    
    @scala.inline
    def setZoomsVarargs(value: Double*): Self = this.set("zooms", js.Array(value :_*))
    
    @scala.inline
    def setZooms(value: js.Array[Double]): Self = this.set("zooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZooms: Self = this.set("zooms", js.undefined)
  }
}
