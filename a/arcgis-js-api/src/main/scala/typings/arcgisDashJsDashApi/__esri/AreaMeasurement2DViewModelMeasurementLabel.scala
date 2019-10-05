package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaMeasurement2DViewModelMeasurementLabel extends Object {
  /**
    * The area (m²).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurementLabel)
    */
  var area: Double
  /**
    * The perimeter (m).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurementLabel)
    */
  var perimeter: Double
}

object AreaMeasurement2DViewModelMeasurementLabel {
  @scala.inline
  def apply(
    area: Double,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    perimeter: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): AreaMeasurement2DViewModelMeasurementLabel = {
    val __obj = js.Dynamic.literal(area = area, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), perimeter = perimeter, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[AreaMeasurement2DViewModelMeasurementLabel]
  }
}

