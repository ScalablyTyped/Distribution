package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocatorSuggestLocationsParams extends Object {
  /**
    * A place or address type which can be used to filter suggest results. The parameter supports input of single category values or multiple comma-separated values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#suggestLocations)
    */
  var categories: js.UndefOr[js.Array[String]] = js.native
  /**
    * Defines a normalized location point that is used to sort geocoding candidates based upon their proximity to the given location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#suggestLocations)
    */
  var location: Point = js.native
  /**
    * The input text entered by a user which is used by the suggest operation to generate a list of possible matches.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#suggestLocations)
    */
  var text: String = js.native
}

object LocatorSuggestLocationsParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    location: Point,
    propertyIsEnumerable: PropertyKey => Boolean,
    text: String
  ): LocatorSuggestLocationsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), location = location.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocatorSuggestLocationsParams]
  }
  @scala.inline
  implicit class LocatorSuggestLocationsParamsOps[Self <: LocatorSuggestLocationsParams] (val x: Self) extends AnyVal {
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
    def setLocation(value: Point): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
  }
  
}

