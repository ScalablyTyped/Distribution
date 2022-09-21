package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait univariateColorSizeCreateContinuousRendererParamsSymbolOptionsSymbols
  extends StObject
     with Object {
  
  /**
    * The symbol to use for the above portion of the `above-and-below` visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  var above: Symbol
  
  /**
    * The symbol to use for the below portion of the `above-and-below` visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  var below: Symbol
}
object univariateColorSizeCreateContinuousRendererParamsSymbolOptionsSymbols {
  
  inline def apply(
    above: Symbol,
    below: Symbol,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): univariateColorSizeCreateContinuousRendererParamsSymbolOptionsSymbols = {
    val __obj = js.Dynamic.literal(above = above.asInstanceOf[js.Any], below = below.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[univariateColorSizeCreateContinuousRendererParamsSymbolOptionsSymbols]
  }
  
  extension [Self <: univariateColorSizeCreateContinuousRendererParamsSymbolOptionsSymbols](x: Self) {
    
    inline def setAbove(value: Symbol): Self = StObject.set(x, "above", value.asInstanceOf[js.Any])
    
    inline def setBelow(value: Symbol): Self = StObject.set(x, "below", value.asInstanceOf[js.Any])
  }
}
