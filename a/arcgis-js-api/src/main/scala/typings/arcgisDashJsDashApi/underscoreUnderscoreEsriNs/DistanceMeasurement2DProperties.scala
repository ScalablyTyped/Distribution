package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`nautical-miles`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`us-feet`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.feet
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.imperial
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.inches
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.kilometers
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.meters
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.metric
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.miles
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.yards
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceMeasurement2DProperties extends WidgetProperties {
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the distance values.  **Possible Values:** metric | imperial | inches | feet | us-feet | yards | miles | nautical-miles | meters | kilometers
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D.html#unit)
    */
  var unit: js.UndefOr[
    metric | imperial | inches | feet | `us-feet` | yards | miles | `nautical-miles` | meters | kilometers
  ] = js.undefined
  /**
    * List of available units and unit systems (imperial, metric) for displaying the distance values. By default, the following units are included: `metric`, `imperial`, `inches`, `feet`, `us-feet`, `yards`, `miles`, `nautical-miles`, `meters`, `kilometers`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D.html#unitOptions)
    */
  var unitOptions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [DistanceMeasurement2DViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D.html#viewModel)
    */
  var viewModel: js.UndefOr[DistanceMeasurement2DViewModel] = js.undefined
}

object DistanceMeasurement2DProperties {
  @scala.inline
  def apply(
    container: String | HTMLElement = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    iconClass: String = null,
    id: String = null,
    label: String = null,
    unit: metric | imperial | inches | feet | `us-feet` | yards | miles | `nautical-miles` | meters | kilometers = null,
    unitOptions: js.Array[String] = null,
    view: MapViewProperties = null,
    viewModel: DistanceMeasurement2DViewModel = null
  ): DistanceMeasurement2DProperties = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (unitOptions != null) __obj.updateDynamic("unitOptions")(unitOptions)
    if (view != null) __obj.updateDynamic("view")(view)
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel)
    __obj.asInstanceOf[DistanceMeasurement2DProperties]
  }
}

