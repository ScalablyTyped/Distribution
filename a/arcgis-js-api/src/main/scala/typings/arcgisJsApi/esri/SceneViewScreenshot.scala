package typings.arcgisJsApi.esri

import typings.std.ImageData
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewScreenshot
  extends StObject
     with Object {
  
  /**
    * The raw RGBA image data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#Screenshot)
    */
  var data: ImageData
  
  /**
    * A data url representing the screenshot.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#Screenshot)
    */
  var dataUrl: String
}
object SceneViewScreenshot {
  
  inline def apply(
    constructor: js.Function,
    data: ImageData,
    dataUrl: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SceneViewScreenshot = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dataUrl = dataUrl.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SceneViewScreenshot]
  }
  
  extension [Self <: SceneViewScreenshot](x: Self) {
    
    inline def setData(value: ImageData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUrl(value: String): Self = StObject.set(x, "dataUrl", value.asInstanceOf[js.Any])
  }
}
