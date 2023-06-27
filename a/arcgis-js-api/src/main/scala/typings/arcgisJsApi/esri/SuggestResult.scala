package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestResult extends StObject {
  
  /**
  		 * The key related to the suggest result.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SuggestResult)
  		 */
  var key: String
  
  /**
  		 * The index of the currently selected result.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SuggestResult)
  		 */
  var sourceIndex: Double
  
  /**
  		 * The string name of the suggested location to geocode.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SuggestResult)
  		 */
  var text: String
}
object SuggestResult {
  
  inline def apply(key: String, sourceIndex: Double, text: String): SuggestResult = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuggestResult] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
