package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`direct-line`
import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-inches`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-kilometers`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-meters`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-yards`
import typings.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.acres
import typings.arcgisJsApi.arcgisJsApiStrings.area
import typings.arcgisJsApi.arcgisJsApiStrings.ares
import typings.arcgisJsApi.arcgisJsApiStrings.distance
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.hectares
import typings.arcgisJsApi.arcgisJsApiStrings.imperial
import typings.arcgisJsApi.arcgisJsApiStrings.inches
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.metric
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeasurementViewModelProperties extends js.Object {
  /**
    * Specifies the current measurement tool to display. Setting its value to `area` activates the area measurement tool and it works for both [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) and [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). To measure distance in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) set the property to `distance` and in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) set it to `direct-line`. If this property is not set, the widget will not be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#activeTool)
    *
    * @default null
    */
  var activeTool: js.UndefOr[area | distance | `direct-line`] = js.native
  /**
    * View model of the active measurement widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#activeViewModel)
    */
  var activeViewModel: js.UndefOr[
    AreaMeasurement2DViewModel | AreaMeasurement3DViewModelProperties | DirectLineMeasurement3DViewModelProperties | DistanceMeasurement2DViewModel
  ] = js.native
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the area values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#areaUnit)
    */
  var areaUnit: js.UndefOr[
    metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares
  ] = js.native
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#linearUnit)
    */
  var linearUnit: js.UndefOr[
    metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_
  ] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}

object MeasurementViewModelProperties {
  @scala.inline
  def apply(): MeasurementViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasurementViewModelProperties]
  }
  @scala.inline
  implicit class MeasurementViewModelPropertiesOps[Self <: MeasurementViewModelProperties] (val x: Self) extends AnyVal {
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
    def setActiveTool(value: area | distance | `direct-line`): Self = this.set("activeTool", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveTool: Self = this.set("activeTool", js.undefined)
    @scala.inline
    def setActiveViewModel(
      value: AreaMeasurement2DViewModel | AreaMeasurement3DViewModelProperties | DirectLineMeasurement3DViewModelProperties | DistanceMeasurement2DViewModel
    ): Self = this.set("activeViewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveViewModel: Self = this.set("activeViewModel", js.undefined)
    @scala.inline
    def setAreaUnit(
      value: metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares
    ): Self = this.set("areaUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAreaUnit: Self = this.set("areaUnit", js.undefined)
    @scala.inline
    def setLinearUnit(
      value: metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_
    ): Self = this.set("linearUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinearUnit: Self = this.set("linearUnit", js.undefined)
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

