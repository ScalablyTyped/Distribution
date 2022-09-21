package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterShadedReliefResult
  extends StObject
     with Object {
  
  /**
    * The RasterShadedReliefRenderer renderer to apply to the input layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-shadedRelief.html#RasterShadedReliefResult)
    */
  var renderer: RasterShadedReliefRenderer
}
object RasterShadedReliefResult {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    renderer: RasterShadedReliefRenderer
  ): RasterShadedReliefResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterShadedReliefResult]
  }
  
  extension [Self <: RasterShadedReliefResult](x: Self) {
    
    inline def setRenderer(value: RasterShadedReliefRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
