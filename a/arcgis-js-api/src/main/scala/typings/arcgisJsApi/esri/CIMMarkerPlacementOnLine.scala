package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.LineBeginning
import typings.arcgisJsApi.arcgisJsApiStrings.LineEnd
import typings.arcgisJsApi.arcgisJsApiStrings.LineMiddle
import typings.arcgisJsApi.arcgisJsApiStrings.SegmentMidpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMarkerPlacementOnLine
  extends StObject
     with MarkerPlacement {
  
  /**
    * A value indicating whether to angle the marker to the line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementOnLine)
    */
  var angleToLine: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The offset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementOnLine)
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * A value indicating whether to consider individual geometry parts or the whole geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementOnLine)
    */
  var placePerPart: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The primitive name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementOnLine)
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  /**
    * The location on a line where a marker will be placed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementOnLine)
    */
  var relativeTo: LineMiddle | LineBeginning | LineEnd | SegmentMidpoint
  
  /**
    * The distances from a specified location on a line that a marker will be placed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementOnLine)
    */
  var startPointOffset: js.UndefOr[Double] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementOnLine
}
object CIMMarkerPlacementOnLine {
  
  inline def apply(relativeTo: LineMiddle | LineBeginning | LineEnd | SegmentMidpoint): CIMMarkerPlacementOnLine = {
    val __obj = js.Dynamic.literal(relativeTo = relativeTo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMMarkerPlacementOnLine")
    __obj.asInstanceOf[CIMMarkerPlacementOnLine]
  }
  
  extension [Self <: CIMMarkerPlacementOnLine](x: Self) {
    
    inline def setAngleToLine(value: Boolean): Self = StObject.set(x, "angleToLine", value.asInstanceOf[js.Any])
    
    inline def setAngleToLineUndefined: Self = StObject.set(x, "angleToLine", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPlacePerPart(value: Boolean): Self = StObject.set(x, "placePerPart", value.asInstanceOf[js.Any])
    
    inline def setPlacePerPartUndefined: Self = StObject.set(x, "placePerPart", js.undefined)
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setRelativeTo(value: LineMiddle | LineBeginning | LineEnd | SegmentMidpoint): Self = StObject.set(x, "relativeTo", value.asInstanceOf[js.Any])
    
    inline def setStartPointOffset(value: Double): Self = StObject.set(x, "startPointOffset", value.asInstanceOf[js.Any])
    
    inline def setStartPointOffsetUndefined: Self = StObject.set(x, "startPointOffset", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementOnLine): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
