package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestionResult
  extends StObject
     with Object {
  
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
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    isCollection: Boolean,
    magicKey: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    text: String
  ): SuggestionResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), isCollection = isCollection.asInstanceOf[js.Any], magicKey = magicKey.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionResult]
  }
  
  extension [Self <: SuggestionResult](x: Self) {
    
    inline def setIsCollection(value: Boolean): Self = StObject.set(x, "isCollection", value.asInstanceOf[js.Any])
    
    inline def setMagicKey(value: String): Self = StObject.set(x, "magicKey", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
