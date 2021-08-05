package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMarkerPlacementAtExtremities
  extends StObject
     with CIMMarkerStrokePlacement
     with CIMMarkerPlacementType {
  
  /**
    * Which ends of the line a marker will be placed.
    */
  var extremityPlacement: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExtremityPlacement * / any */ String
  ] = js.undefined
  
  /**
    * The distance from the ends of a line that the marker will be placed.
    */
  var offsetAlongLine: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CIMMarkerPlacementAtExtremities: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtExtremities
}
object CIMMarkerPlacementAtExtremities {
  
  inline def apply(): CIMMarkerPlacementAtExtremities = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMMarkerPlacementAtExtremities")
    __obj.asInstanceOf[CIMMarkerPlacementAtExtremities]
  }
  
  extension [Self <: CIMMarkerPlacementAtExtremities](x: Self) {
    
    inline def setExtremityPlacement(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExtremityPlacement * / any */ String
    ): Self = StObject.set(x, "extremityPlacement", value.asInstanceOf[js.Any])
    
    inline def setExtremityPlacementUndefined: Self = StObject.set(x, "extremityPlacement", js.undefined)
    
    inline def setOffsetAlongLine(value: Double): Self = StObject.set(x, "offsetAlongLine", value.asInstanceOf[js.Any])
    
    inline def setOffsetAlongLineUndefined: Self = StObject.set(x, "offsetAlongLine", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtExtremities): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
