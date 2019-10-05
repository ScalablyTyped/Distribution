package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestionResult extends Object {
  /**
    * Indicates if the result is a Collection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#SuggestionResult)
    */
  var isCollection: Boolean
  /**
    * ID used in combination with the `text` property to uniquely identify a suggestion.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#SuggestionResult)
    */
  var magicKey: String
  /**
    * The string name of the suggested location to geocode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#SuggestionResult)
    */
  var text: String
}

object SuggestionResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    isCollection: Boolean,
    magicKey: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    text: String
  ): SuggestionResult = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), isCollection = isCollection, magicKey = magicKey, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), text = text)
  
    __obj.asInstanceOf[SuggestionResult]
  }
}

