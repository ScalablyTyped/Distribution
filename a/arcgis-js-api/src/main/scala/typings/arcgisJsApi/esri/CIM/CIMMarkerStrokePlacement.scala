package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMMarkerStrokePlacement extends CIMMarkerPlacementBase {
  
  /**
    * A value indicating whether to angle the marker to the line.
    */
  var angleToLine: js.UndefOr[Boolean] = js.native
  
  /**
    * The offset.
    */
  var offset: js.UndefOr[Double] = js.native
}
object CIMMarkerStrokePlacement {
  
  @scala.inline
  def apply(`type`: String): CIMMarkerStrokePlacement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMarkerStrokePlacement]
  }
  
  @scala.inline
  implicit class CIMMarkerStrokePlacementOps[Self <: CIMMarkerStrokePlacement] (val x: Self) extends AnyVal {
    
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
    def setAngleToLine(value: Boolean): Self = this.set("angleToLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngleToLine: Self = this.set("angleToLine", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
}
