package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMMarkerPlacementOnLine
  extends CIMMarkerStrokePlacement
     with CIMMarkerPlacementType {
  
  /**
    * The location on a line where a marker will be placed. The direction of the line is determined by the direction in which the line was digitized.
    */
  var relativeTo: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementOnLineRelativeTo * / any */ String
  ] = js.native
  
  /**
    * The distances from a specified location on a line that a marker will be placed.
    */
  var startPointOffset: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMMarkerPlacementOnLine: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementOnLine = js.native
}
object CIMMarkerPlacementOnLine {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementOnLine): CIMMarkerPlacementOnLine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMarkerPlacementOnLine]
  }
  
  @scala.inline
  implicit class CIMMarkerPlacementOnLineOps[Self <: CIMMarkerPlacementOnLine] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementOnLine): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeTo(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementOnLineRelativeTo * / any */ String
    ): Self = this.set("relativeTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativeTo: Self = this.set("relativeTo", js.undefined)
    
    @scala.inline
    def setStartPointOffset(value: Double): Self = this.set("startPointOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartPointOffset: Self = this.set("startPointOffset", js.undefined)
  }
}
