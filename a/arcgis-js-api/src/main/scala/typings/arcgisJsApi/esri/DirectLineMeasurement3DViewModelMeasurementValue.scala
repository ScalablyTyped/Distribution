package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectLineMeasurement3DViewModelMeasurementValue extends Object {
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
  var state: String = js.native
  /**
    * Textual representation of the measured value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#MeasurementValue)
    */
  var text: String = js.native
}

object DirectLineMeasurement3DViewModelMeasurementValue {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    state: String,
    text: String
  ): DirectLineMeasurement3DViewModelMeasurementValue = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), state = state.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectLineMeasurement3DViewModelMeasurementValue]
  }
  @scala.inline
  implicit class DirectLineMeasurement3DViewModelMeasurementValueOps[Self <: DirectLineMeasurement3DViewModelMeasurementValue] (val x: Self) extends AnyVal {
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
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

