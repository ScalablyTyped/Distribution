package typings.arcgisJsApi.esri

import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewScreenshot extends StObject {
  
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
  
  inline def apply(data: ImageData, dataUrl: String): SceneViewScreenshot = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataUrl = dataUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewScreenshot]
  }
  
  extension [Self <: SceneViewScreenshot](x: Self) {
    
    inline def setData(value: ImageData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUrl(value: String): Self = StObject.set(x, "dataUrl", value.asInstanceOf[js.Any])
  }
}
