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
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    isCollection: scala.Boolean,
    magicKey: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    text: java.lang.String
  ): SuggestionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("isCollection")(isCollection)
    __obj.updateDynamic("magicKey")(magicKey)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[SuggestionResult]
  }
}

