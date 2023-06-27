package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Provides a utility method used to deserialize a JSON symbol object returned by the REST API.
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-jsonUtils.html)
	 */
trait symbolsSupportJsonUtils extends StObject {
  
  /**
  		 * Creates a new instance of an appropriate [Symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html) class and initializes it with values from a JSON object generated from an ArcGIS product.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-jsonUtils.html#fromJSON)
  		 */
  def fromJSON(json: Any): Symbol
}
object symbolsSupportJsonUtils {
  
  inline def apply(fromJSON: Any => Symbol): symbolsSupportJsonUtils = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON))
    __obj.asInstanceOf[symbolsSupportJsonUtils]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: symbolsSupportJsonUtils] (val x: Self) extends AnyVal {
    
    inline def setFromJSON(value: Any => Symbol): Self = StObject.set(x, "fromJSON", js.Any.fromFunction1(value))
  }
}
