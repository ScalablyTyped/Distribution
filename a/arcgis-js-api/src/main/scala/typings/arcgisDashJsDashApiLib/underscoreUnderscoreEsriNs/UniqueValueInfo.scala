package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniqueValueInfo
  extends stdLib.Object {
  /**
    * The number of features with the given `value` (or belonging to the given category).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#UniqueValueInfo)
    */
  var count: scala.Double
  /**
    * The label describing the value or category in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#UniqueValueInfo)
    */
  var label: java.lang.String
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
  var value: java.lang.String | scala.Double
}

object UniqueValueInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    count: scala.Double,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    label: java.lang.String,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    symbol: Symbol,
    value: java.lang.String | scala.Double
  ): UniqueValueInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, count = count, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), symbol = symbol, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UniqueValueInfo]
  }
}

