package typings.amapJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultType extends js.Object {
  
  var defaultType: js.UndefOr[Double] = js.native
  
  var showRoad: js.UndefOr[Boolean] = js.native
  
  var showTraffic: js.UndefOr[Boolean] = js.native
}
object DefaultType {
  
  @scala.inline
  def apply(): DefaultType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultType]
  }
  
  @scala.inline
  implicit class DefaultTypeOps[Self <: DefaultType] (val x: Self) extends AnyVal {
    
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
    def setDefaultType(value: Double): Self = this.set("defaultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultType: Self = this.set("defaultType", js.undefined)
    
    @scala.inline
    def setShowRoad(value: Boolean): Self = this.set("showRoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRoad: Self = this.set("showRoad", js.undefined)
    
    @scala.inline
    def setShowTraffic(value: Boolean): Self = this.set("showTraffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTraffic: Self = this.set("showTraffic", js.undefined)
  }
}
