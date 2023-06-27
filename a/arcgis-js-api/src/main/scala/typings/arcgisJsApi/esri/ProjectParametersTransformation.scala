package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectParametersTransformation extends StObject {
  
  /**
  		 * The well-known ID of the datum transformation to apply to the projection.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ProjectParameters.html#transformation)
  		 */
  var wkid: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The well-known text that defines a spatial reference.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ProjectParameters.html#transformation)
  		 */
  var wkt: js.UndefOr[String] = js.undefined
}
object ProjectParametersTransformation {
  
  inline def apply(): ProjectParametersTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectParametersTransformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectParametersTransformation] (val x: Self) extends AnyVal {
    
    inline def setWkid(value: Double): Self = StObject.set(x, "wkid", value.asInstanceOf[js.Any])
    
    inline def setWkidUndefined: Self = StObject.set(x, "wkid", js.undefined)
    
    inline def setWkt(value: String): Self = StObject.set(x, "wkt", value.asInstanceOf[js.Any])
    
    inline def setWktUndefined: Self = StObject.set(x, "wkt", js.undefined)
  }
}
