package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.imperial
import typings.arcgisJsApi.arcgisJsApiStrings.inches
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.measured
import typings.arcgisJsApi.arcgisJsApiStrings.measuring
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.metric
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceMeasurement2DViewModel extends js.Object {
  /**
    * When the coordinate sustem is projected (other than web mercator) then distances less than this threshold will be computed planimetrically. Otherwise distances will be computed geodetically.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#geodesicDistanceThreshold)
    *
    * @default 100000
    */
  var geodesicDistanceThreshold: Double
  /**
    * The length and geometry of the measurement polyline in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#measurement)
    */
  val measurement: DistanceMeasurement2DViewModelMeasurement
  /**
    * This property returns the locale specific representation of the length. Lengths are rounded to two decimal places. Lengths are sourced from the [measurement](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#measurement) property (in meters) and converted to the user defined units or system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#measurementLabel)
    */
  val measurementLabel: String
  /**
    * The view model's state.
    *
    *    Value    | Description
    * ------------|-------------
    * disabled    | not ready yet
    * ready       | ready for measuring
    * measuring   | measuring has started
    * measured    | measuring has finished
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#state)
    *
    * @default disabled
    */
  val state: disabled | ready | measuring | measured
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#unit)
    */
  var unit: metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_
  /**
    * List of available units and unit systems (imperial, metric) for displaying the distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#unitOptions)
    */
  var unitOptions: js.Array[
    metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_
  ]
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#view)
    */
  var view: MapView
  /**
    * Clears the current measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#clearMeasurement)
    *
    *
    */
  def clearMeasurement(): Unit
  /**
    * Starts a new measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#newMeasurement)
    *
    *
    */
  def newMeasurement(): Unit
}

object DistanceMeasurement2DViewModel {
  @scala.inline
  def apply(
    clearMeasurement: () => Unit,
    geodesicDistanceThreshold: Double,
    measurement: DistanceMeasurement2DViewModelMeasurement,
    measurementLabel: String,
    newMeasurement: () => Unit,
    state: disabled | ready | measuring | measured,
    unit: metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_,
    unitOptions: js.Array[
      metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_
    ],
    view: MapView
  ): DistanceMeasurement2DViewModel = {
    val __obj = js.Dynamic.literal(clearMeasurement = js.Any.fromFunction0(clearMeasurement), geodesicDistanceThreshold = geodesicDistanceThreshold.asInstanceOf[js.Any], measurement = measurement.asInstanceOf[js.Any], measurementLabel = measurementLabel.asInstanceOf[js.Any], newMeasurement = js.Any.fromFunction0(newMeasurement), state = state.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], unitOptions = unitOptions.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceMeasurement2DViewModel]
  }
}

