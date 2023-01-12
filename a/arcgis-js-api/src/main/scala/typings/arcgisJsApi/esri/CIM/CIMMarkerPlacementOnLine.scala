package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMarkerPlacementOnLine
  extends StObject
     with CIMMarkerStrokePlacement
     with CIMMarkerPlacementType {
  
  /**
    * The location on a line where a marker will be placed. The direction of the line is determined by the direction in which the line was digitized.
    */
  var relativeTo: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementOnLineRelativeTo * / any */ String
  ] = js.undefined
  
  /**
    * The distances from a specified location on a line that a marker will be placed.
    */
  var startPointOffset: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CIMMarkerPlacementOnLine: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementOnLine
}
object CIMMarkerPlacementOnLine {
  
  inline def apply(): CIMMarkerPlacementOnLine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMMarkerPlacementOnLine")
    __obj.asInstanceOf[CIMMarkerPlacementOnLine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMMarkerPlacementOnLine] (val x: Self) extends AnyVal {
    
    inline def setRelativeTo(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementOnLineRelativeTo * / any */ String
    ): Self = StObject.set(x, "relativeTo", value.asInstanceOf[js.Any])
    
    inline def setRelativeToUndefined: Self = StObject.set(x, "relativeTo", js.undefined)
    
    inline def setStartPointOffset(value: Double): Self = StObject.set(x, "startPointOffset", value.asInstanceOf[js.Any])
    
    inline def setStartPointOffsetUndefined: Self = StObject.set(x, "startPointOffset", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementOnLine): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
