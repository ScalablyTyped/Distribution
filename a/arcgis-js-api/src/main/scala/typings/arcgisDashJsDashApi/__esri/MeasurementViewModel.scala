package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`direct-line`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`nautical-miles`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-feet`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-inches`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-kilometers`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-meters`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-miles`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-us-feet`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-yards`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`us-feet`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.acres
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.area
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.ares
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.disabled
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.distance
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.feet
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.hectares
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.imperial
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.inches
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.kilometers
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.measured
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.measuring
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.meters
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.metric
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.miles
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.ready
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeasurementViewModel extends Accessor {
  /**
    * Specifies the current measurement tool to display. Setting its value to `area` activates the area measurement tool and it works for both [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) and [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). To measure distance in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) set the property to `distance` and in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) set it to `direct-line`. If this property is not set, the widget will not be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#activeTool)
    *
    * @default null
    */
  var activeTool: area | distance | `direct-line` = js.native
  /**
    * View model of the active measurement widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#activeViewModel)
    */
  var activeViewModel: AreaMeasurement2DViewModel | AreaMeasurement3DViewModel | DirectLineMeasurement3DViewModel | DistanceMeasurement2DViewModel = js.native
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the area values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#areaUnit)
    */
  var areaUnit: metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares = js.native
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#linearUnit)
    */
  var linearUnit: metric | imperial | inches | feet | `us-feet` | yards | miles | `nautical-miles` | meters | kilometers = js.native
  /**
    * The ViewModel's state.
    *
    * Value       | Description
    * ------------|-------------
    * disabled    | not ready yet
    * ready       | ready for measuring
    * measuring   | measuring has started
    * measured    | measuring has finished
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#state)
    *
    * @default disabled
    */
  val state: disabled | ready | measuring | measured = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
}

@JSGlobal("__esri.MeasurementViewModel")
@js.native
object MeasurementViewModel extends TopLevel[MeasurementViewModelConstructor]

