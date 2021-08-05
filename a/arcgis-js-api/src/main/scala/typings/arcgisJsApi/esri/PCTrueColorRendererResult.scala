package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PCTrueColorRendererResult
  extends StObject
     with Object {
  
  /**
    * The renderer object configured to represent the true color of each point in the point cloud.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#PCTrueColorRendererResult)
    */
  var renderer: PointCloudRGBRenderer
}
object PCTrueColorRendererResult {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    renderer: PointCloudRGBRenderer
  ): PCTrueColorRendererResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PCTrueColorRendererResult]
  }
  
  extension [Self <: PCTrueColorRendererResult](x: Self) {
    
    inline def setRenderer(value: PointCloudRGBRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
