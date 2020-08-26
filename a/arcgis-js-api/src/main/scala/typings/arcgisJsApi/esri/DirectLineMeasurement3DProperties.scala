package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
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
trait DirectLineMeasurement3DProperties extends WidgetProperties {
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.native
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html#unit)
    */
  var unit: js.UndefOr[
    metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_
  ] = js.native
  /**
    * List of unit systems (imperial, metric) and specific units for displaying the distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html#unitOptions)
    */
  var unitOptions: js.UndefOr[
    js.Array[
      metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_
    ]
  ] = js.native
  /**
    * A reference to the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [DirectLineMeasurement3DViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html#viewModel)
    */
  var viewModel: js.UndefOr[DirectLineMeasurement3DViewModelProperties] = js.native
}

object DirectLineMeasurement3DProperties {
  @scala.inline
  def apply(): DirectLineMeasurement3DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectLineMeasurement3DProperties]
  }
  @scala.inline
  implicit class DirectLineMeasurement3DPropertiesOps[Self <: DirectLineMeasurement3DProperties] (val x: Self) extends AnyVal {
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
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    @scala.inline
    def setUnit(
      value: metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_
    ): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    @scala.inline
    def setUnitOptionsVarargs(
      value: (metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_)*
    ): Self = this.set("unitOptions", js.Array(value :_*))
    @scala.inline
    def setUnitOptions(
      value: js.Array[
          metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_
        ]
    ): Self = this.set("unitOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnitOptions: Self = this.set("unitOptions", js.undefined)
    @scala.inline
    def setView(value: SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    @scala.inline
    def setViewModel(value: DirectLineMeasurement3DViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
  
}

