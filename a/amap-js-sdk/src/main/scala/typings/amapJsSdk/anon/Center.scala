package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.LngLat
import typings.amapJsSdk.amapJsSdkStrings.EPSG3395
import typings.amapJsSdk.amapJsSdkStrings.EPSG3857
import typings.amapJsSdk.amapJsSdkStrings.EPSG4326
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Center extends js.Object {
  
  var center: js.UndefOr[LngLat] = js.native
  
  var crs: js.UndefOr[EPSG3857 | EPSG3395 | EPSG4326] = js.native
  
  var rotation: js.UndefOr[Double] = js.native
  
  var zoom: js.UndefOr[Double] = js.native
}
object Center {
  
  @scala.inline
  def apply(): Center = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Center]
  }
  
  @scala.inline
  implicit class CenterOps[Self <: Center] (val x: Self) extends AnyVal {
    
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
    def setCenter(value: LngLat): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setCrs(value: EPSG3857 | EPSG3395 | EPSG4326): Self = this.set("crs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrs: Self = this.set("crs", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
