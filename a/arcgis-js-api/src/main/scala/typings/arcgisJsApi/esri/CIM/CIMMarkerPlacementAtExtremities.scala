package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMMarkerPlacementAtExtremities
  extends CIMMarkerStrokePlacement
     with CIMMarkerPlacementType {
  
  /**
    * Which ends of the line a marker will be placed.
    */
  var extremityPlacement: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExtremityPlacement * / any */ String
  ] = js.native
  
  /**
    * The distance from the ends of a line that the marker will be placed.
    */
  var offsetAlongLine: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMMarkerPlacementAtExtremities: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtExtremities = js.native
}
object CIMMarkerPlacementAtExtremities {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtExtremities): CIMMarkerPlacementAtExtremities = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMarkerPlacementAtExtremities]
  }
  
  @scala.inline
  implicit class CIMMarkerPlacementAtExtremitiesOps[Self <: CIMMarkerPlacementAtExtremities] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtExtremities): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtremityPlacement(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExtremityPlacement * / any */ String
    ): Self = this.set("extremityPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtremityPlacement: Self = this.set("extremityPlacement", js.undefined)
    
    @scala.inline
    def setOffsetAlongLine(value: Double): Self = this.set("offsetAlongLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetAlongLine: Self = this.set("offsetAlongLine", js.undefined)
  }
}
