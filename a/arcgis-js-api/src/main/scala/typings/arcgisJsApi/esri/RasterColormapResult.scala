package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterColormapResult
  extends StObject
     with Object {
  
  /**
    * The colormap renderer to apply to the input layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-colormap.html#RasterColormapResult)
    */
  var renderer: RasterColormapRenderer
}
object RasterColormapResult {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    renderer: RasterColormapRenderer
  ): RasterColormapResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterColormapResult]
  }
  
  extension [Self <: RasterColormapResult](x: Self) {
    
    inline def setRenderer(value: RasterColormapRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
