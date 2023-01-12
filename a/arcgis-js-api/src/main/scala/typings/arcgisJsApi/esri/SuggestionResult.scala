package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestionResult extends StObject {
  
  /**
    * Indicates if the result is a Collection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#SuggestionResult)
    */
  var isCollection: Boolean
  
  /**
    * ID used in combination with the `text` property to uniquely identify a suggestion.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#SuggestionResult)
    */
  var magicKey: String
  
  /**
    * The string name of the suggested location to geocode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#SuggestionResult)
    */
  var text: String
}
object SuggestionResult {
  
  inline def apply(isCollection: Boolean, magicKey: String, text: String): SuggestionResult = {
    val __obj = js.Dynamic.literal(isCollection = isCollection.asInstanceOf[js.Any], magicKey = magicKey.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuggestionResult] (val x: Self) extends AnyVal {
    
    inline def setIsCollection(value: Boolean): Self = StObject.set(x, "isCollection", value.asInstanceOf[js.Any])
    
    inline def setMagicKey(value: String): Self = StObject.set(x, "magicKey", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
