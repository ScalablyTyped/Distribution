package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Provides a utility method used to deserialize a JSON renderer object returned by the REST API.
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-jsonUtils.html)
	 */
trait supportJsonUtils extends StObject {
  
  /**
  		 * Creates a new instance of an appropriate [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) class and initializes it with values from a JSON object generated from an ArcGIS product.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-jsonUtils.html#fromJSON)
  		 */
  def fromJSON(json: Any): Renderer
}
object supportJsonUtils {
  
  inline def apply(fromJSON: Any => Renderer): supportJsonUtils = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON))
    __obj.asInstanceOf[supportJsonUtils]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: supportJsonUtils] (val x: Self) extends AnyVal {
    
    inline def setFromJSON(value: Any => Renderer): Self = StObject.set(x, "fromJSON", js.Any.fromFunction1(value))
  }
}
