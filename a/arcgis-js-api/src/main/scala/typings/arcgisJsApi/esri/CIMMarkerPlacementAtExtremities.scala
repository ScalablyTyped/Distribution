package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.Both
import typings.arcgisJsApi.arcgisJsApiStrings.JustBegin
import typings.arcgisJsApi.arcgisJsApiStrings.JustEnd
import typings.arcgisJsApi.arcgisJsApiStrings.None
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMarkerPlacementAtExtremities
  extends StObject
     with Object
     with MarkerPlacement {
  
  /**
    * A value indicating whether to angle the marker to the line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementAtExtremities)
    */
  var angleToLine: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Which ends of the line a marker will be placed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementAtExtremities)
    */
  var extremityPlacement: js.UndefOr[Both | JustBegin | JustEnd | None] = js.undefined
  
  /**
    * The offset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementAtExtremities)
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * The distance from the ends of a line that the marker will be placed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementAtExtremities)
    */
  var offsetAlongLine: js.UndefOr[Double] = js.undefined
  
  /**
    * A value indicating whether to consider individual geometry parts or the whole geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementAtExtremities)
    */
  var placePerPart: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The primitive name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerPlacementAtExtremities)
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtExtremities
}
object CIMMarkerPlacementAtExtremities {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): CIMMarkerPlacementAtExtremities = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMMarkerPlacementAtExtremities")
    __obj.asInstanceOf[CIMMarkerPlacementAtExtremities]
  }
  
  extension [Self <: CIMMarkerPlacementAtExtremities](x: Self) {
    
    inline def setAngleToLine(value: Boolean): Self = StObject.set(x, "angleToLine", value.asInstanceOf[js.Any])
    
    inline def setAngleToLineUndefined: Self = StObject.set(x, "angleToLine", js.undefined)
    
    inline def setExtremityPlacement(value: Both | JustBegin | JustEnd | None): Self = StObject.set(x, "extremityPlacement", value.asInstanceOf[js.Any])
    
    inline def setExtremityPlacementUndefined: Self = StObject.set(x, "extremityPlacement", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetAlongLine(value: Double): Self = StObject.set(x, "offsetAlongLine", value.asInstanceOf[js.Any])
    
    inline def setOffsetAlongLineUndefined: Self = StObject.set(x, "offsetAlongLine", js.undefined)
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPlacePerPart(value: Boolean): Self = StObject.set(x, "placePerPart", value.asInstanceOf[js.Any])
    
    inline def setPlacePerPartUndefined: Self = StObject.set(x, "placePerPart", js.undefined)
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtExtremities): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
