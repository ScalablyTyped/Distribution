package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait typeUniqueValueInfo extends Object {
  /**
    * The number of features with the given `value` (or belonging to the given category).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#UniqueValueInfo)
    */
  var count: Double
  /**
    * The label describing the value or category in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#UniqueValueInfo)
    */
  var label: String
  /**
    * The symbol used to represent features belonging to the given category.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#UniqueValueInfo)
    */
  var symbol: Symbol
  /**
    * A unique value representing a type or category of features in a layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#UniqueValueInfo)
    */
  var value: String | Double
}

object typeUniqueValueInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    count: Double,
    hasOwnProperty: PropertyKey => Boolean,
    label: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    symbol: Symbol,
    value: String | Double
  ): typeUniqueValueInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, count = count, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), symbol = symbol, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[typeUniqueValueInfo]
  }
}

