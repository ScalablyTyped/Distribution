package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait symbolsSupportJsonUtils extends StObject {
  
  /**
    * Creates a new instance of an appropriate [Symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html) class and initializes it with values from a JSON object generated from a product in the ArcGIS platform.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-jsonUtils.html#fromJSON)
    */
  def fromJSON(json: js.Any): Symbol
}
object symbolsSupportJsonUtils {
  
  inline def apply(fromJSON: js.Any => Symbol): symbolsSupportJsonUtils = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON))
    __obj.asInstanceOf[symbolsSupportJsonUtils]
  }
  
  extension [Self <: symbolsSupportJsonUtils](x: Self) {
    
    inline def setFromJSON(value: js.Any => Symbol): Self = StObject.set(x, "fromJSON", js.Any.fromFunction1(value))
  }
}
