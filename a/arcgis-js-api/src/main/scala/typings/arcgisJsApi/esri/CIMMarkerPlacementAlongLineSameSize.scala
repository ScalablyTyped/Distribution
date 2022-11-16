package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.Custom
import typings.arcgisJsApi.arcgisJsApiStrings.NoConstraint
import typings.arcgisJsApi.arcgisJsApiStrings.WithFullGap
import typings.arcgisJsApi.arcgisJsApiStrings.WithHalfGap
import typings.arcgisJsApi.arcgisJsApiStrings.WithMarkers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMarkerPlacementAlongLineSameSize
  extends StObject
     with MarkerPlacement {
  
  /**
    * A value indicating whether to angle the marker to the line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementAlongLineSameSize)
    */
  var angleToLine: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Where the pattern should end relative to the ending point of the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementAlongLineSameSize)
    */
  var customEndingOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * How markers are placed at the end points of a line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementAlongLineSameSize)
    */
  var endings: js.UndefOr[NoConstraint | WithMarkers | WithFullGap | WithHalfGap | Custom] = js.undefined
  
  /**
    * The offset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementAlongLineSameSize)
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * Where the pattern should begin relative to the starting point of the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementAlongLineSameSize)
    */
  var offsetAlongLine: js.UndefOr[Double] = js.undefined
  
  /**
    * A value indicating whether to consider individual geometry parts or the whole geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementAlongLineSameSize)
    */
  var placePerPart: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The numeric pattern that defines the sequence of placed markers and the length of space between them.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementAlongLineSameSize)
    */
  var placementTemplate: js.Array[Double]
  
  /**
    * The primitive name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementAlongLineSameSize)
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAlongLineSameSize
}
object CIMMarkerPlacementAlongLineSameSize {
  
  inline def apply(placementTemplate: js.Array[Double]): CIMMarkerPlacementAlongLineSameSize = {
    val __obj = js.Dynamic.literal(placementTemplate = placementTemplate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMMarkerPlacementAlongLineSameSize")
    __obj.asInstanceOf[CIMMarkerPlacementAlongLineSameSize]
  }
  
  extension [Self <: CIMMarkerPlacementAlongLineSameSize](x: Self) {
    
    inline def setAngleToLine(value: Boolean): Self = StObject.set(x, "angleToLine", value.asInstanceOf[js.Any])
    
    inline def setAngleToLineUndefined: Self = StObject.set(x, "angleToLine", js.undefined)
    
    inline def setCustomEndingOffset(value: Double): Self = StObject.set(x, "customEndingOffset", value.asInstanceOf[js.Any])
    
    inline def setCustomEndingOffsetUndefined: Self = StObject.set(x, "customEndingOffset", js.undefined)
    
    inline def setEndings(value: NoConstraint | WithMarkers | WithFullGap | WithHalfGap | Custom): Self = StObject.set(x, "endings", value.asInstanceOf[js.Any])
    
    inline def setEndingsUndefined: Self = StObject.set(x, "endings", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetAlongLine(value: Double): Self = StObject.set(x, "offsetAlongLine", value.asInstanceOf[js.Any])
    
    inline def setOffsetAlongLineUndefined: Self = StObject.set(x, "offsetAlongLine", js.undefined)
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPlacePerPart(value: Boolean): Self = StObject.set(x, "placePerPart", value.asInstanceOf[js.Any])
    
    inline def setPlacePerPartUndefined: Self = StObject.set(x, "placePerPart", js.undefined)
    
    inline def setPlacementTemplate(value: js.Array[Double]): Self = StObject.set(x, "placementTemplate", value.asInstanceOf[js.Any])
    
    inline def setPlacementTemplateVarargs(value: Double*): Self = StObject.set(x, "placementTemplate", js.Array(value*))
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAlongLineSameSize): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
