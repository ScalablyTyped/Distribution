package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaMeasurement2DViewModelMeasurement extends Object {
  /**
    * The area (m²).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurement)
    */
  var area: Double
  /**
    * Measurement area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurement)
    */
  var geometry: js.Any
  /**
    * The perimeter (m).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurement)
    */
  var perimeter: Double
}

object AreaMeasurement2DViewModelMeasurement {
  @scala.inline
  def apply(
    area: Double,
    constructor: js.Function,
    geometry: js.Any,
    hasOwnProperty: PropertyKey => Boolean,
    perimeter: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): AreaMeasurement2DViewModelMeasurement = {
    val __obj = js.Dynamic.literal(area = area, constructor = constructor, geometry = geometry, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), perimeter = perimeter, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[AreaMeasurement2DViewModelMeasurement]
  }
}

