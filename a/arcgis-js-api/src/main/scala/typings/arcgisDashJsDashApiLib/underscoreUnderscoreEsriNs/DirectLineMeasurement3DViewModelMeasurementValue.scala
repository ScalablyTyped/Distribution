package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectLineMeasurement3DViewModelMeasurementValue
  extends stdLib.Object {
  /**
    * State of the measured value.
    *
    * Value | Description
    * ------------|-------------
    * available | measured value is available
    * unavailable | measured value is not available due an incomplete measurement or because the value is not available for the given measurement configuration (e.g. direct distance is unavailable in `geodesic` mode)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#MeasurementValue)
    */
  var state: java.lang.String
  /**
    * Textual representation of the measured value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#MeasurementValue)
    */
  var text: java.lang.String
}

object DirectLineMeasurement3DViewModelMeasurementValue {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    state: java.lang.String,
    text: java.lang.String
  ): DirectLineMeasurement3DViewModelMeasurementValue = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, state = state, text = text)
  
    __obj.asInstanceOf[DirectLineMeasurement3DViewModelMeasurementValue]
  }
}

