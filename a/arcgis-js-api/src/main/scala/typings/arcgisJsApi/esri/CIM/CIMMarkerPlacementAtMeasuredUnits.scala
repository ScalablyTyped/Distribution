package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMMarkerPlacementAtMeasuredUnits
  extends CIMMarkerStrokePlacement
     with CIMMarkerPlacementType {
  
  /**
    * The interval of measured units used to place markers.
    */
  var interval: js.UndefOr[Double] = js.native
  
  /**
    * A value indicating whether markers should be placed at extremities.
    */
  var placeAtExtremities: js.UndefOr[Boolean] = js.native
  
  /**
    * The rate of markers to skip.
    */
  var skipMarkerRate: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMMarkerPlacementAtMeasuredUnits: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtMeasuredUnits = js.native
}
object CIMMarkerPlacementAtMeasuredUnits {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtMeasuredUnits): CIMMarkerPlacementAtMeasuredUnits = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMarkerPlacementAtMeasuredUnits]
  }
  
  @scala.inline
  implicit class CIMMarkerPlacementAtMeasuredUnitsOps[Self <: CIMMarkerPlacementAtMeasuredUnits] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtMeasuredUnits): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setPlaceAtExtremities(value: Boolean): Self = this.set("placeAtExtremities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceAtExtremities: Self = this.set("placeAtExtremities", js.undefined)
    
    @scala.inline
    def setSkipMarkerRate(value: Double): Self = this.set("skipMarkerRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipMarkerRate: Self = this.set("skipMarkerRate", js.undefined)
  }
}
