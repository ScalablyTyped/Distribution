package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
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
  implicit class CIMMarkerPlacementOnVerticesMutableBuilder[Self <: CIMMarkerPlacementOnVertices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaceOnControlPoints(value: Boolean): Self = StObject.set(x, "placeOnControlPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceOnControlPointsUndefined: Self = StObject.set(x, "placeOnControlPoints", js.undefined)
    
    @scala.inline
    def setPlaceOnEndPoints(value: Boolean): Self = StObject.set(x, "placeOnEndPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceOnEndPointsUndefined: Self = StObject.set(x, "placeOnEndPoints", js.undefined)
    
    @scala.inline
    def setPlaceOnRegularVertices(value: Boolean): Self = StObject.set(x, "placeOnRegularVertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceOnRegularVerticesUndefined: Self = StObject.set(x, "placeOnRegularVertices", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementOnVertices): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
