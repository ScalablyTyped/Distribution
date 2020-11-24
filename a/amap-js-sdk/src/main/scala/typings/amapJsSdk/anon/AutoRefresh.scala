package typings.amapJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoRefresh extends js.Object {
  
  var autoRefresh: js.UndefOr[Boolean] = js.native
  
  var detectRetina: js.UndefOr[Boolean] = js.native
  
  var interval: js.UndefOr[Double] = js.native
  
  var map: typings.amapJsSdk.AMap.Map = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
  
  var zooms: js.UndefOr[js.Array[Double]] = js.native
}
object AutoRefresh {
  
  @scala.inline
  def apply(map: typings.amapJsSdk.AMap.Map): AutoRefresh = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoRefresh]
  }
  
  @scala.inline
  implicit class AutoRefreshOps[Self <: AutoRefresh] (val x: Self) extends AnyVal {
    
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
    def setAutoRefresh(value: Boolean): Self = this.set("autoRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRefresh: Self = this.set("autoRefresh", js.undefined)
    
    @scala.inline
    def setDetectRetina(value: Boolean): Self = this.set("detectRetina", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectRetina: Self = this.set("detectRetina", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
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
