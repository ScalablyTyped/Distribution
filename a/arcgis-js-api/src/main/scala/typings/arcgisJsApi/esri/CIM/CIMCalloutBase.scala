package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMCalloutBase extends js.Object {
  
  /**
    * The leader offset which is an offset value defining the distance (in points) between the anchor point and the beginning of the drawn leader.
    */
  var leaderOffset: js.UndefOr[Double] = js.native
  
  /**
    * The leader tolerance which is the closest distance (in points) to the text the anchor point can be for the callout to draw.
    */
  var leaderTolerance: js.UndefOr[Double] = js.native
  
  var `type`: String = js.native
}
object CIMCalloutBase {
  
  @scala.inline
  def apply(`type`: String): CIMCalloutBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMCalloutBase]
  }
  
  @scala.inline
  implicit class CIMCalloutBaseOps[Self <: CIMCalloutBase] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaderOffset(value: Double): Self = this.set("leaderOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaderOffset: Self = this.set("leaderOffset", js.undefined)
    
    @scala.inline
    def setLeaderTolerance(value: Double): Self = this.set("leaderTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaderTolerance: Self = this.set("leaderTolerance", js.undefined)
  }
}
