package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMMarkerPlacementOnVertices
  extends CIMMarkerStrokePlacement
     with CIMMarkerPlacementType {
  
  /**
    * A value indicating whether a marker will be placed on the control points of the line.
    */
  var placeOnControlPoints: js.UndefOr[Boolean] = js.native
  
  /**
    * A value indicating whether a marker will be placed on the endpoints of the line.
    */
  var placeOnEndPoints: js.UndefOr[Boolean] = js.native
  
  /**
    * A value indicating whether a marker will be placed on the vertices of the line.
    */
  var placeOnRegularVertices: js.UndefOr[Boolean] = js.native
  
  @JSName("type")
  var type_CIMMarkerPlacementOnVertices: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementOnVertices = js.native
}
object CIMMarkerPlacementOnVertices {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementOnVertices): CIMMarkerPlacementOnVertices = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMarkerPlacementOnVertices]
  }
  
  @scala.inline
  implicit class CIMMarkerPlacementOnVerticesOps[Self <: CIMMarkerPlacementOnVertices] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementOnVertices): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceOnControlPoints(value: Boolean): Self = this.set("placeOnControlPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceOnControlPoints: Self = this.set("placeOnControlPoints", js.undefined)
    
    @scala.inline
    def setPlaceOnEndPoints(value: Boolean): Self = this.set("placeOnEndPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceOnEndPoints: Self = this.set("placeOnEndPoints", js.undefined)
    
    @scala.inline
    def setPlaceOnRegularVertices(value: Boolean): Self = this.set("placeOnRegularVertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceOnRegularVertices: Self = this.set("placeOnRegularVertices", js.undefined)
  }
}
