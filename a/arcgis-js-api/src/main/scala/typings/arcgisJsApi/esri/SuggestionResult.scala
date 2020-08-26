package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestionResult extends Object {
  /**
    * Indicates if the result is a Collection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#SuggestionResult)
    */
  var isCollection: Boolean = js.native
  /**
    * ID used in combination with the `text` property to uniquely identify a suggestion.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#SuggestionResult)
    */
  var magicKey: String = js.native
  /**
    * The string name of the suggested location to geocode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#SuggestionResult)
    */
  var text: String = js.native
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
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), isCollection = isCollection.asInstanceOf[js.Any], magicKey = magicKey.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionResult]
  }
  @scala.inline
  implicit class SuggestionResultOps[Self <: SuggestionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsCollection(value: Boolean): Self = this.set("isCollection", value.asInstanceOf[js.Any])
    @scala.inline
    def setMagicKey(value: String): Self = this.set("magicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

