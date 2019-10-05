package typings.arcgisDashJsDashApi.__esri

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectLineMeasurement3DProperties extends WidgetProperties {
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the distance values.  **Possible Values:** metric | imperial | inches | feet | us-feet | yards | miles | nautical-miles | meters | kilometers
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html#unit)
    */
  var unit: js.UndefOr[String] = js.undefined
  /**
    * List of unit systems (imperial, metric) and specific units for displaying the distance values. By default, the following units are included: `metric`, `imperial`, `inches`, `feet`, `us-feet`, `yards`, `miles`, `nautical-miles`, `meters`, `kilometers`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html#unitOptions)
    */
  var unitOptions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A reference to the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.undefined
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [DirectLineMeasurement3DViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html#viewModel)
    */
  var viewModel: js.UndefOr[DirectLineMeasurement3DViewModelProperties] = js.undefined
}

object DirectLineMeasurement3DProperties {
  @scala.inline
  def apply(
    container: String | HTMLElement = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    label: String = null,
    unit: String = null,
    unitOptions: js.Array[String] = null,
    view: SceneViewProperties = null,
    viewModel: DirectLineMeasurement3DViewModelProperties = null
  ): DirectLineMeasurement3DProperties = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (unitOptions != null) __obj.updateDynamic("unitOptions")(unitOptions)
    if (view != null) __obj.updateDynamic("view")(view)
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel)
    __obj.asInstanceOf[DirectLineMeasurement3DProperties]
  }
}

