package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.butt_
import typings.arcgisJsApi.arcgisJsApiStrings.round_
import typings.arcgisJsApi.arcgisJsApiStrings.square_
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillSymbol3DLayerOutlineProperties
  extends StObject
     with Object {
  
  /**
    * The color of the outline.
    *
    * @default black
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#outline)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
    * The stroke pattern used to render the outline.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#outline)
    */
  var pattern: js.UndefOr[LineStylePattern3DProperties] = js.undefined
  
  /**
    * The style applied to the tips of each pattern segment along the line.
    *
    * @default butt
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#outline)
    */
  var patternCap: js.UndefOr[butt_ | round_ | square_] = js.undefined
  
  /**
    * The width of the outline in points.
    *
    * @default 1px
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#outline)
    */
  var size: js.UndefOr[Double | String] = js.undefined
}
object FillSymbol3DLayerOutlineProperties {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): FillSymbol3DLayerOutlineProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[FillSymbol3DLayerOutlineProperties]
  }
  
  extension [Self <: FillSymbol3DLayerOutlineProperties](x: Self) {
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setPattern(value: LineStylePattern3DProperties): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternCap(value: butt_ | round_ | square_): Self = StObject.set(x, "patternCap", value.asInstanceOf[js.Any])
    
    inline def setPatternCapUndefined: Self = StObject.set(x, "patternCap", js.undefined)
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
