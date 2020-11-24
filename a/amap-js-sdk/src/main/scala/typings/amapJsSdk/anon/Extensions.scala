package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.DrivingPolicy
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extensions extends js.Object {
  
  var extensions: js.UndefOr[String] = js.native
  
  var hideMarkers: js.UndefOr[Boolean] = js.native
  
  var map: js.UndefOr[typings.amapJsSdk.AMap.Map] = js.native
  
  var panel: js.UndefOr[String | HTMLElement] = js.native
  
  var policy: js.UndefOr[DrivingPolicy] = js.native
  
  var showTraffic: js.UndefOr[Boolean] = js.native
}
object Extensions {
  
  @scala.inline
  def apply(): Extensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extensions]
  }
  
  @scala.inline
  implicit class ExtensionsOps[Self <: Extensions] (val x: Self) extends AnyVal {
    
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
    def setExtensions(value: String): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setHideMarkers(value: Boolean): Self = this.set("hideMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideMarkers: Self = this.set("hideMarkers", js.undefined)
    
    @scala.inline
    def setMap(value: typings.amapJsSdk.AMap.Map): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setPanel(value: String | HTMLElement): Self = this.set("panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanel: Self = this.set("panel", js.undefined)
    
    @scala.inline
    def setPolicy(value: DrivingPolicy): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    
    @scala.inline
    def setShowTraffic(value: Boolean): Self = this.set("showTraffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTraffic: Self = this.set("showTraffic", js.undefined)
  }
}
