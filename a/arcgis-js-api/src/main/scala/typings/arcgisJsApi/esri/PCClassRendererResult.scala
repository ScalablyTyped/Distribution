package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PCClassRendererResult extends Object {
  
  /**
    * The renderer object configured to represent the class codes in the point cloud.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#PCClassRendererResult)
    */
  var renderer: PointCloudUniqueValueRenderer = js.native
}
object PCClassRendererResult {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    renderer: PointCloudUniqueValueRenderer
  ): PCClassRendererResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PCClassRendererResult]
  }
  
  @scala.inline
  implicit class PCClassRendererResultMutableBuilder[Self <: PCClassRendererResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderer(value: PointCloudUniqueValueRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
