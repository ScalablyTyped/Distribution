package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-feet`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-inches`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-kilometers`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-meters`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-miles`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-us-feet`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-yards`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.acres
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.ares
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.auto
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.geodesic
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.hectares
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.imperial
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.metric
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.planar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaMeasurement2DViewModel extends js.Object {
  /**
    * The threshold distance used by the "auto" mode to switch between planar and geodesic linear computations. The threshold is measured in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#geodesicDistanceThreshold)
    *
    * @default 100000
    */
  var geodesicDistanceThreshold: Double
  /**
    * The area and perimeter of the measurement polygon in square meters and meters respectively.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurement)
    */
  val measurement: AreaMeasurement2DViewModelMeasurement
  /**
    * This property returns the locale specific representation of the area and perimeter. Areas and perimeters are rounded to two decimal places. Areas are sourced from the [measurement](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurement) property (in square meters) and converted to the user defined units/system and mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurementLabel)
    */
  val measurementLabel: AreaMeasurement2DViewModelMeasurementLabel
  /**
    * The mode used to calculate the area and perimeter of a polygon.  **Possible Values:** auto | planar | geodesic
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#mode)
    *
    * @default auto
    */
  var mode: auto | planar | geodesic
  /**
    * An array of valid mode values. By default, the following units are included: `auto`, `planar`, `geodesic`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#modes)
    */
  val modes: js.Array[String]
  /**
    * The ViewModel's state.  **Possible Values:** disabled | ready | measuring | measured
    *
    *    Value    | Description
    * ------------|-------------
    * disabled    | not ready yet
    * ready       | ready for measuring
    * measuring   | measuring has started
    * measured    | measuring has finished
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#state)
    *
    * @default disabled
    */
  val state: String
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the area values.  **Possible Values:** metric | imperial | square-inches | square-feet | square-us-feet | square-yards | square-miles | square-meters | square-kilometers | acres | ares | hectares
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#unit)
    */
  var unit: metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares
  /**
    * List of available units and unit systems (imperial, metric) for displaying the area values. By default, the following units are included: `metric`, `imperial`, `square-inches`, `square-feet`, `square-us-feet`, `square-yards`, `square-miles`, `square-meters`, `square-kilometers`, `acres`, `ares`, `hectares`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#unitOptions)
    */
  var unitOptions: js.Array[String]
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#view)
    */
  var view: MapView
  /**
    * Clears the current measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#clearMeasurement)
    *
    *
    */
  def clearMeasurement(): Unit
  /**
    * Starts a new measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#newMeasurement)
    *
    *
    */
  def newMeasurement(): Unit
}

@JSGlobal("__esri.AreaMeasurement2DViewModel")
@js.native
class AreaMeasurement2DViewModelCls () extends AreaMeasurement2DViewModel {
  def this(properties: js.Any) = this()
  /**
    * The threshold distance used by the "auto" mode to switch between planar and geodesic linear computations. The threshold is measured in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#geodesicDistanceThreshold)
    *
    * @default 100000
    */
  /* CompleteClass */
  override var geodesicDistanceThreshold: Double = js.native
  /**
    * The area and perimeter of the measurement polygon in square meters and meters respectively.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurement)
    */
  /* CompleteClass */
  override val measurement: AreaMeasurement2DViewModelMeasurement = js.native
  /**
    * This property returns the locale specific representation of the area and perimeter. Areas and perimeters are rounded to two decimal places. Areas are sourced from the [measurement](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurement) property (in square meters) and converted to the user defined units/system and mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurementLabel)
    */
  /* CompleteClass */
  override val measurementLabel: AreaMeasurement2DViewModelMeasurementLabel = js.native
  /**
    * The mode used to calculate the area and perimeter of a polygon.  **Possible Values:** auto | planar | geodesic
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#mode)
    *
    * @default auto
    */
  /* CompleteClass */
  override var mode: auto | planar | geodesic = js.native
  /**
    * An array of valid mode values. By default, the following units are included: `auto`, `planar`, `geodesic`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#modes)
    */
  /* CompleteClass */
  override val modes: js.Array[String] = js.native
  /**
    * The ViewModel's state.  **Possible Values:** disabled | ready | measuring | measured
    *
    *    Value    | Description
    * ------------|-------------
    * disabled    | not ready yet
    * ready       | ready for measuring
    * measuring   | measuring has started
    * measured    | measuring has finished
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#state)
    *
    * @default disabled
    */
  /* CompleteClass */
  override val state: String = js.native
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the area values.  **Possible Values:** metric | imperial | square-inches | square-feet | square-us-feet | square-yards | square-miles | square-meters | square-kilometers | acres | ares | hectares
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#unit)
    */
  /* CompleteClass */
  override var unit: metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares = js.native
  /**
    * List of available units and unit systems (imperial, metric) for displaying the area values. By default, the following units are included: `metric`, `imperial`, `square-inches`, `square-feet`, `square-us-feet`, `square-yards`, `square-miles`, `square-meters`, `square-kilometers`, `acres`, `ares`, `hectares`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#unitOptions)
    */
  /* CompleteClass */
  override var unitOptions: js.Array[String] = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#view)
    */
  /* CompleteClass */
  override var view: MapView = js.native
  /**
    * Clears the current measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#clearMeasurement)
    *
    *
    */
  /* CompleteClass */
  override def clearMeasurement(): Unit = js.native
  /**
    * Starts a new measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#newMeasurement)
    *
    *
    */
  /* CompleteClass */
  override def newMeasurement(): Unit = js.native
}

object AreaMeasurement2DViewModel {
  @scala.inline
  def apply(
    clearMeasurement: () => Unit,
    geodesicDistanceThreshold: Double,
    measurement: AreaMeasurement2DViewModelMeasurement,
    measurementLabel: AreaMeasurement2DViewModelMeasurementLabel,
    mode: auto | planar | geodesic,
    modes: js.Array[String],
    newMeasurement: () => Unit,
    state: String,
    unit: metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares,
    unitOptions: js.Array[String],
    view: MapView
  ): AreaMeasurement2DViewModel = {
    val __obj = js.Dynamic.literal(clearMeasurement = js.Any.fromFunction0(clearMeasurement), geodesicDistanceThreshold = geodesicDistanceThreshold, measurement = measurement, measurementLabel = measurementLabel, mode = mode.asInstanceOf[js.Any], modes = modes, newMeasurement = js.Any.fromFunction0(newMeasurement), state = state, unit = unit.asInstanceOf[js.Any], unitOptions = unitOptions, view = view)
  
    __obj.asInstanceOf[AreaMeasurement2DViewModel]
  }
}

