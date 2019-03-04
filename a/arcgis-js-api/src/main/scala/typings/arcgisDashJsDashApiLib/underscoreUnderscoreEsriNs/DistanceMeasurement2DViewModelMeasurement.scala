package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceMeasurement2DViewModelMeasurement
  extends stdLib.Object {
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
  var length: scala.Double
}

object DistanceMeasurement2DViewModelMeasurement {
  @scala.inline
  def apply(
    constructor: js.Function,
    geometry: js.Any,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    length: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): DistanceMeasurement2DViewModelMeasurement = {
    val __obj = js.Dynamic.literal(constructor = constructor, geometry = geometry, hasOwnProperty = hasOwnProperty, length = length, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[DistanceMeasurement2DViewModelMeasurement]
  }
}

