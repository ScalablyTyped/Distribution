package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestionResult
  extends stdLib.Object {
  /**
    * Indicates if the result is a Collection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#SuggestionResult)
    */
  var isCollection: scala.Boolean
  /**
    * ID used in combination with the `text` property to uniquely identify a suggestion.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#SuggestionResult)
    */
  var magicKey: java.lang.String
  /**
    * The string name of the suggested location to geocode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#SuggestionResult)
    */
  var text: java.lang.String
}

object SuggestionResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    isCollection: scala.Boolean,
    magicKey: java.lang.String,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    text: java.lang.String
  ): SuggestionResult = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), isCollection = isCollection, magicKey = magicKey, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), text = text)
  
    __obj.asInstanceOf[SuggestionResult]
  }
}

