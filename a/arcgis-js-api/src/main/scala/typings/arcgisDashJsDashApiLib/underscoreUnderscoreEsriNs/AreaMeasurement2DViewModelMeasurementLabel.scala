package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaMeasurement2DViewModelMeasurementLabel
  extends stdLib.Object {
  /**
    * The area (m²).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurementLabel)
    */
  var area: scala.Double
  /**
    * The perimeter (m).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurementLabel)
    */
  var perimeter: scala.Double
}

object AreaMeasurement2DViewModelMeasurementLabel {
  @scala.inline
  def apply(
    area: scala.Double,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    perimeter: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): AreaMeasurement2DViewModelMeasurementLabel = {
    val __obj = js.Dynamic.literal(area = area, constructor = constructor, hasOwnProperty = hasOwnProperty, perimeter = perimeter, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[AreaMeasurement2DViewModelMeasurementLabel]
  }
}

