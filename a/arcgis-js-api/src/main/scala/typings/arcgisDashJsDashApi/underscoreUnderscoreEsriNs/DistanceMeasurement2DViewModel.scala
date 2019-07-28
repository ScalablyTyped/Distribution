package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`nautical-miles`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`us-feet`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.auto
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.feet
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.geodesic
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.imperial
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.inches
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.kilometers
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.meters
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.metric
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.miles
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.planar
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceMeasurement2DViewModel extends js.Object {
  /**
    * The threshold distance used by the "auto" mode to switch between planar and geodesic linear computations. The threshold is measured in meters.
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
    * This property returns the locale specific representation of the length. Lengths are rounded to two decimal places. Lengths are sourced from the [measurement](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#measurement) property (in meters) and converted to the user defined units or system and mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#measurementLabel)
    */
  val measurementLabel: String
  /**
    * The mode used to calculate the length of lines.  **Possible Values:** auto | planar | geodesic
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#mode)
    *
    * @default auto
    */
  var mode: auto | planar | geodesic
  /**
    * An array of valid mode values. By default, the following units are included: `auto`, `planar`, `geodesic`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#modes)
    */
  val modes: js.Array[String]
  /**
    * The view model's state.  **Possible Values:** disabled | ready | measuring | measured
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
  val state: String
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the distance values.  **Possible Values:** metric | imperial | inches | feet | us-feet | yards | miles | nautical-miles | meters | kilometers
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#unit)
    */
  var unit: metric | imperial | inches | feet | `us-feet` | yards | miles | `nautical-miles` | meters | kilometers
  /**
    * List of available units and unit systems (imperial, metric) for displaying the distance values. By default, the following units are included: `metric`, `imperial`, `inches`, `feet`, `us-feet`, `yards`, `miles`, `nautical-miles`, `meters`, `kilometers`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#unitOptions)
    */
  var unitOptions: js.Array[String]
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

@JSGlobal("__esri.DistanceMeasurement2DViewModel")
@js.native
class DistanceMeasurement2DViewModelCls () extends DistanceMeasurement2DViewModel {
  def this(properties: js.Any) = this()
  /**
    * The threshold distance used by the "auto" mode to switch between planar and geodesic linear computations. The threshold is measured in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#geodesicDistanceThreshold)
    *
    * @default 100000
    */
  /* CompleteClass */
  override var geodesicDistanceThreshold: Double = js.native
  /**
    * The length and geometry of the measurement polyline in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#measurement)
    */
  /* CompleteClass */
  override val measurement: DistanceMeasurement2DViewModelMeasurement = js.native
  /**
    * This property returns the locale specific representation of the length. Lengths are rounded to two decimal places. Lengths are sourced from the [measurement](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#measurement) property (in meters) and converted to the user defined units or system and mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#measurementLabel)
    */
  /* CompleteClass */
  override val measurementLabel: String = js.native
  /**
    * The mode used to calculate the length of lines.  **Possible Values:** auto | planar | geodesic
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#mode)
    *
    * @default auto
    */
  /* CompleteClass */
  override var mode: auto | planar | geodesic = js.native
  /**
    * An array of valid mode values. By default, the following units are included: `auto`, `planar`, `geodesic`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#modes)
    */
  /* CompleteClass */
  override val modes: js.Array[String] = js.native
  /**
    * The view model's state.  **Possible Values:** disabled | ready | measuring | measured
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
  /* CompleteClass */
  override val state: String = js.native
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the distance values.  **Possible Values:** metric | imperial | inches | feet | us-feet | yards | miles | nautical-miles | meters | kilometers
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#unit)
    */
  /* CompleteClass */
  override var unit: metric | imperial | inches | feet | `us-feet` | yards | miles | `nautical-miles` | meters | kilometers = js.native
  /**
    * List of available units and unit systems (imperial, metric) for displaying the distance values. By default, the following units are included: `metric`, `imperial`, `inches`, `feet`, `us-feet`, `yards`, `miles`, `nautical-miles`, `meters`, `kilometers`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#unitOptions)
    */
  /* CompleteClass */
  override var unitOptions: js.Array[String] = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#view)
    */
  /* CompleteClass */
  override var view: MapView = js.native
  /**
    * Clears the current measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#clearMeasurement)
    *
    *
    */
  /* CompleteClass */
  override def clearMeasurement(): Unit = js.native
  /**
    * Starts a new measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#newMeasurement)
    *
    *
    */
  /* CompleteClass */
  override def newMeasurement(): Unit = js.native
}

object DistanceMeasurement2DViewModel {
  @scala.inline
  def apply(
    clearMeasurement: () => Unit,
    geodesicDistanceThreshold: Double,
    measurement: DistanceMeasurement2DViewModelMeasurement,
    measurementLabel: String,
    mode: auto | planar | geodesic,
    modes: js.Array[String],
    newMeasurement: () => Unit,
    state: String,
    unit: metric | imperial | inches | feet | `us-feet` | yards | miles | `nautical-miles` | meters | kilometers,
    unitOptions: js.Array[String],
    view: MapView
  ): DistanceMeasurement2DViewModel = {
    val __obj = js.Dynamic.literal(clearMeasurement = js.Any.fromFunction0(clearMeasurement), geodesicDistanceThreshold = geodesicDistanceThreshold, measurement = measurement, measurementLabel = measurementLabel, mode = mode.asInstanceOf[js.Any], modes = modes, newMeasurement = js.Any.fromFunction0(newMeasurement), state = state, unit = unit.asInstanceOf[js.Any], unitOptions = unitOptions, view = view)
  
    __obj.asInstanceOf[DistanceMeasurement2DViewModel]
  }
}

