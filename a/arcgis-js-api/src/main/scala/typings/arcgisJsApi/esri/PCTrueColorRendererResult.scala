package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PCTrueColorRendererResult extends Object {
  
  /**
    * The renderer object configured to represent the true color of each point in the point cloud.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#PCTrueColorRendererResult)
    */
  var renderer: PointCloudRGBRenderer = js.native
}
object PCTrueColorRendererResult {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    renderer: PointCloudRGBRenderer
  ): PCTrueColorRendererResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PCTrueColorRendererResult]
  }
  
  @scala.inline
  implicit class PCTrueColorRendererResultMutableBuilder[Self <: PCTrueColorRendererResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderer(value: PointCloudRGBRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
