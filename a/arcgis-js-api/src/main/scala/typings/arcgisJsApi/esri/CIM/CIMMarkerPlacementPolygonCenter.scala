package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMMarkerPlacementPolygonCenter
  extends CIMMarkerPlacementBase
     with CIMMarkerPlacementType {
  
  /**
    * A value indicating whether the marker should be clipped if it extends pasts the boundary of the polygon.
    */
  var clipAtBoundary: js.UndefOr[Boolean] = js.native
  
  /**
    * The method used to determine the polygon center.
    */
  var method: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementPolygonCenterMethod * / any */ String
  ] = js.native
  
  /**
    * The value which offsets the marker horizontally from the center.
    */
  var offsetX: js.UndefOr[Double] = js.native
  
  /**
    * The value which offsets the marker vertically from the center.
    */
  var offsetY: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMMarkerPlacementPolygonCenter: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementPolygonCenter = js.native
}
object CIMMarkerPlacementPolygonCenter {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementPolygonCenter): CIMMarkerPlacementPolygonCenter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMarkerPlacementPolygonCenter]
  }
  
  @scala.inline
  implicit class CIMMarkerPlacementPolygonCenterOps[Self <: CIMMarkerPlacementPolygonCenter] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementPolygonCenter): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipAtBoundary(value: Boolean): Self = this.set("clipAtBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipAtBoundary: Self = this.set("clipAtBoundary", js.undefined)
    
    @scala.inline
    def setMethod(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementPolygonCenterMethod * / any */ String
    ): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
  }
}
