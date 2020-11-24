package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.Marker
import typings.amapJsSdk.AMap.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoPosition extends js.Object {
  
  var autoPosition: js.UndefOr[Boolean] = js.native
  
  var direction: js.UndefOr[Boolean] = js.native
  
  var liteStyle: js.UndefOr[Boolean] = js.native
  
  var locate: js.UndefOr[Boolean] = js.native
  
  var locationMarker: js.UndefOr[Marker] = js.native
  
  var noIpLocate: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Pixel] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var ruler: js.UndefOr[Boolean] = js.native
  
  var useNative: js.UndefOr[Boolean] = js.native
}
object AutoPosition {
  
  @scala.inline
  def apply(): AutoPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoPosition]
  }
  
  @scala.inline
  implicit class AutoPositionOps[Self <: AutoPosition] (val x: Self) extends AnyVal {
    
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
    def setAutoPosition(value: Boolean): Self = this.set("autoPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPosition: Self = this.set("autoPosition", js.undefined)
    
    @scala.inline
    def setDirection(value: Boolean): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setLiteStyle(value: Boolean): Self = this.set("liteStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiteStyle: Self = this.set("liteStyle", js.undefined)
    
    @scala.inline
    def setLocate(value: Boolean): Self = this.set("locate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocate: Self = this.set("locate", js.undefined)
    
    @scala.inline
    def setLocationMarker(value: Marker): Self = this.set("locationMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationMarker: Self = this.set("locationMarker", js.undefined)
    
    @scala.inline
    def setNoIpLocate(value: Boolean): Self = this.set("noIpLocate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoIpLocate: Self = this.set("noIpLocate", js.undefined)
    
    @scala.inline
    def setOffset(value: Pixel): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRuler(value: Boolean): Self = this.set("ruler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuler: Self = this.set("ruler", js.undefined)
    
    @scala.inline
    def setUseNative(value: Boolean): Self = this.set("useNative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNative: Self = this.set("useNative", js.undefined)
  }
}
