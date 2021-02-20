package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
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
  implicit class CIMMarkerPlacementAtExtremitiesMutableBuilder[Self <: CIMMarkerPlacementAtExtremities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtremityPlacement(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExtremityPlacement * / any */ String
    ): Self = StObject.set(x, "extremityPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtremityPlacementUndefined: Self = StObject.set(x, "extremityPlacement", js.undefined)
    
    @scala.inline
    def setOffsetAlongLine(value: Double): Self = StObject.set(x, "offsetAlongLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetAlongLineUndefined: Self = StObject.set(x, "offsetAlongLine", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtExtremities): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
