package typings.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialReferenceWkid extends SpatialReference {
  
  var latestVcsWkid: js.UndefOr[Double] = js.native
  
  var latestWkid: js.UndefOr[Double] = js.native
  
  var vcsWkid: js.UndefOr[Double] = js.native
  
  var wkid: js.UndefOr[Double] = js.native
}
object SpatialReferenceWkid {
  
  @scala.inline
  def apply(): SpatialReferenceWkid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpatialReferenceWkid]
  }
  
  @scala.inline
  implicit class SpatialReferenceWkidOps[Self <: SpatialReferenceWkid] (val x: Self) extends AnyVal {
    
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
    def setLatestVcsWkid(value: Double): Self = this.set("latestVcsWkid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestVcsWkid: Self = this.set("latestVcsWkid", js.undefined)
    
    @scala.inline
    def setLatestWkid(value: Double): Self = this.set("latestWkid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestWkid: Self = this.set("latestWkid", js.undefined)
    
    @scala.inline
    def setVcsWkid(value: Double): Self = this.set("vcsWkid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVcsWkid: Self = this.set("vcsWkid", js.undefined)
    
    @scala.inline
    def setWkid(value: Double): Self = this.set("wkid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWkid: Self = this.set("wkid", js.undefined)
  }
}
