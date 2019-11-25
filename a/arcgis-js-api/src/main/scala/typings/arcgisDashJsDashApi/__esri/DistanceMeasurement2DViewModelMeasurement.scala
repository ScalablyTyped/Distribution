package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceMeasurement2DViewModelMeasurement extends Object {
  /**
    * Measurement line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#measurement)
    */
  var geometry: js.Any
  /**
    * Line length (m).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#measurement)
    */
  var length: Double
}

object DistanceMeasurement2DViewModelMeasurement {
  @scala.inline
  def apply(
    constructor: js.Function,
    geometry: js.Any,
    hasOwnProperty: PropertyKey => Boolean,
    length: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): DistanceMeasurement2DViewModelMeasurement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), length = length.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[DistanceMeasurement2DViewModelMeasurement]
  }
}

