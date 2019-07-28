package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bin extends Object {
  /**
    * The number of values in a dataset that are contained between the indicated `minValue` and `maxValue`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#Bin)
    */
  var count: Double
  /**
    * The maximum value (or bound) of the bin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#Bin)
    */
  var maxValue: Double
  /**
    * The minimum value (or bound) of the bin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#Bin)
    */
  var minValue: Double
}

object Bin {
  @scala.inline
  def apply(
    constructor: js.Function,
    count: Double,
    hasOwnProperty: PropertyKey => Boolean,
    maxValue: Double,
    minValue: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): Bin = {
    val __obj = js.Dynamic.literal(constructor = constructor, count = count, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), maxValue = maxValue, minValue = minValue, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[Bin]
  }
}

