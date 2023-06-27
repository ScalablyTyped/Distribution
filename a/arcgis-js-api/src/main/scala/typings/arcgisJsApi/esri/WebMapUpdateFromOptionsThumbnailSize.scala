package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebMapUpdateFromOptionsThumbnailSize extends StObject {
  
  /**
  		 * The height of the thumbnail.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
  		 */
  var height: Double
  
  /**
  		 * The width of the thumbnail.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
  		 */
  var width: Double
}
object WebMapUpdateFromOptionsThumbnailSize {
  
  inline def apply(height: Double, width: Double): WebMapUpdateFromOptionsThumbnailSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebMapUpdateFromOptionsThumbnailSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebMapUpdateFromOptionsThumbnailSize] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
