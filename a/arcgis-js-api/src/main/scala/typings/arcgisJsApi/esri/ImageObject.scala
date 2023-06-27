package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageObject extends StObject {
  
  /**
  		 * The image data for the sprite.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#ImageObject)
  		 */
  var data: js.typedarray.ArrayBuffer
  
  /**
  		 * The height of the sprite.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#ImageObject)
  		 */
  var height: Double
  
  /**
  		 * The width of the sprite.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#ImageObject)
  		 */
  var width: Double
}
object ImageObject {
  
  inline def apply(data: js.typedarray.ArrayBuffer, height: Double, width: Double): ImageObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageObject] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
