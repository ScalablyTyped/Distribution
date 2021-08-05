package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeRangeResult
  extends StObject
     with Object {
  
  /**
    * The suggested sizes of the largest symbols at various scales in a layer with a [size visualization](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-sizeRange.html#SizeRangeResult)
    */
  var maxSize: ScaleDependentStops
  
  /**
    * The suggested sizes of the smallest symbols at various scales in a layer with a [size visualization](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-sizeRange.html#SizeRangeResult)
    */
  var minSize: ScaleDependentStops
}
object SizeRangeResult {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    maxSize: ScaleDependentStops,
    minSize: ScaleDependentStops,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SizeRangeResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SizeRangeResult]
  }
  
  extension [Self <: SizeRangeResult](x: Self) {
    
    inline def setMaxSize(value: ScaleDependentStops): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMinSize(value: ScaleDependentStops): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
  }
}
