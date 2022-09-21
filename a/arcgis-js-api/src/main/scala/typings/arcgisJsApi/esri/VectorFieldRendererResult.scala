package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorFieldRendererResult
  extends StObject
     with Object {
  
  /**
    * The VectorFieldRenderer renderer to apply to the input layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-vectorField.html#VectorFieldRendererResult)
    */
  var renderer: VectorFieldRenderer
}
object VectorFieldRendererResult {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    renderer: VectorFieldRenderer
  ): VectorFieldRendererResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorFieldRendererResult]
  }
  
  extension [Self <: VectorFieldRendererResult](x: Self) {
    
    inline def setRenderer(value: VectorFieldRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
