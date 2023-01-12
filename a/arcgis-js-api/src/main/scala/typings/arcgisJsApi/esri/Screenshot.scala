package typings.arcgisJsApi.esri

import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Screenshot extends StObject {
  
  /**
    * The raw RGBA image data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#Screenshot)
    */
  var data: ImageData
  
  /**
    * A data url representing the screenshot.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#Screenshot)
    */
  var dataUrl: String
}
object Screenshot {
  
  inline def apply(data: ImageData, dataUrl: String): Screenshot = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataUrl = dataUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screenshot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Screenshot] (val x: Self) extends AnyVal {
    
    inline def setData(value: ImageData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUrl(value: String): Self = StObject.set(x, "dataUrl", value.asInstanceOf[js.Any])
  }
}
