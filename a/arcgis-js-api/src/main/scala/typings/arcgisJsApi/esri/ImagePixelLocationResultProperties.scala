package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagePixelLocationResultProperties extends StObject {
  
  /**
  		 * An array of objects containing pixel space x,y coordinates and the pixel's z values of the pixel location geometries.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImagePixelLocationResult.html#geometries)
  		 */
  var geometries: js.UndefOr[js.Array[Any]] = js.undefined
}
object ImagePixelLocationResultProperties {
  
  inline def apply(): ImagePixelLocationResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePixelLocationResultProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImagePixelLocationResultProperties] (val x: Self) extends AnyVal {
    
    inline def setGeometries(value: js.Array[Any]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    inline def setGeometriesUndefined: Self = StObject.set(x, "geometries", js.undefined)
    
    inline def setGeometriesVarargs(value: Any*): Self = StObject.set(x, "geometries", js.Array(value*))
  }
}
