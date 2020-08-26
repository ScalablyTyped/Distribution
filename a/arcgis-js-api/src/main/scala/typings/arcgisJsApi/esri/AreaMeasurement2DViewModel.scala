package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`square-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-inches`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-kilometers`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-meters`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-yards`
import typings.arcgisJsApi.arcgisJsApiStrings.acres
import typings.arcgisJsApi.arcgisJsApiStrings.ares
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.hectares
import typings.arcgisJsApi.arcgisJsApiStrings.imperial
import typings.arcgisJsApi.arcgisJsApiStrings.measured
import typings.arcgisJsApi.arcgisJsApiStrings.measuring
import typings.arcgisJsApi.arcgisJsApiStrings.metric
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaMeasurement2DViewModel extends js.Object {
  /**
    * When the coordinate sustem is projected (other than web mercator) then perimeters less than this threshold will be computed planimetrically. Otherwise areas will be computed geodetically.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#geodesicDistanceThreshold)
    *
    * @default 100000
    */
  var geodesicDistanceThreshold: Double = js.native
  /**
    * The area and perimeter of the measurement polygon in square meters and meters respectively.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurement)
    */
  val measurement: AreaMeasurement2DViewModelMeasurement = js.native
  /**
    * This property returns the locale specific representation of the area and perimeter. Areas and perimeters are rounded to two decimal places. Areas are sourced from the [measurement](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurement) property (in square meters) and converted to the user defined units/system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurementLabel)
    */
  val measurementLabel: AreaMeasurement2DViewModelMeasurementLabel = js.native
  /**
    * The ViewModel's state.
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
  val state: disabled | ready | measuring | measured = js.native
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the area values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#unit)
    */
  var unit: metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares = js.native
  /**
    * List of available units and unit systems (imperial, metric) for displaying the area values. By default, the following units are included: `metric`, `imperial`, `square-inches`, `square-feet`, `square-us-feet`, `square-yards`, `square-miles`, `square-meters`, `square-kilometers`, `acres`, `ares`, `hectares`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#unitOptions)
    */
  var unitOptions: js.Array[
    metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares
  ] = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#view)
    */
  var view: MapView = js.native
  /**
    * Clears the current measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#clear)
    *
    *
    */
  def clear(): Unit = js.native
  /**
    * Clears the current measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#clearMeasurement)
    *
    *
    */
  def clearMeasurement(): Unit = js.native
  /**
    * Starts a new measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#newMeasurement)
    *
    *
    */
  def newMeasurement(): Unit = js.native
  /**
    * Starts a new measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#start)
    *
    *
    */
  def start(): Unit = js.native
}

object AreaMeasurement2DViewModel {
  @scala.inline
  def apply(
    clear: () => Unit,
    clearMeasurement: () => Unit,
    geodesicDistanceThreshold: Double,
    measurement: AreaMeasurement2DViewModelMeasurement,
    measurementLabel: AreaMeasurement2DViewModelMeasurementLabel,
    newMeasurement: () => Unit,
    start: () => Unit,
    state: disabled | ready | measuring | measured,
    unit: metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares,
    unitOptions: js.Array[
      metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares
    ],
    view: MapView
  ): AreaMeasurement2DViewModel = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), clearMeasurement = js.Any.fromFunction0(clearMeasurement), geodesicDistanceThreshold = geodesicDistanceThreshold.asInstanceOf[js.Any], measurement = measurement.asInstanceOf[js.Any], measurementLabel = measurementLabel.asInstanceOf[js.Any], newMeasurement = js.Any.fromFunction0(newMeasurement), start = js.Any.fromFunction0(start), state = state.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], unitOptions = unitOptions.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaMeasurement2DViewModel]
  }
  @scala.inline
  implicit class AreaMeasurement2DViewModelOps[Self <: AreaMeasurement2DViewModel] (val x: Self) extends AnyVal {
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setClearMeasurement(value: () => Unit): Self = this.set("clearMeasurement", js.Any.fromFunction0(value))
    @scala.inline
    def setGeodesicDistanceThreshold(value: Double): Self = this.set("geodesicDistanceThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeasurement(value: AreaMeasurement2DViewModelMeasurement): Self = this.set("measurement", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeasurementLabel(value: AreaMeasurement2DViewModelMeasurementLabel): Self = this.set("measurementLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewMeasurement(value: () => Unit): Self = this.set("newMeasurement", js.Any.fromFunction0(value))
    @scala.inline
    def setStart(value: () => Unit): Self = this.set("start", js.Any.fromFunction0(value))
    @scala.inline
    def setState(value: disabled | ready | measuring | measured): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnit(
      value: metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares
    ): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnitOptionsVarargs(
      value: (metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares)*
    ): Self = this.set("unitOptions", js.Array(value :_*))
    @scala.inline
    def setUnitOptions(
      value: js.Array[
          metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares
        ]
    ): Self = this.set("unitOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setView(value: MapView): Self = this.set("view", value.asInstanceOf[js.Any])
  }
  
}

