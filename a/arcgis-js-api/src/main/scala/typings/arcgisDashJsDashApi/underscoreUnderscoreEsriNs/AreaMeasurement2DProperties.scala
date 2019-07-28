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
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.hectares
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.imperial
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.metric
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaMeasurement2DProperties extends WidgetProperties {
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the area values.  **Possible Values:** metric | imperial | square-inches | square-feet | square-us-feet | square-yards | square-miles | square-meters | square-kilometers | acres | ares | hectares
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#unit)
    */
  var unit: js.UndefOr[
    metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares
  ] = js.undefined
  /**
    * List of available units and unit systems (imperial, metric) for displaying the area values. By default, the following units are included: `metric`, `imperial`, `square-inches`, `square-feet`, `square-us-feet`, `square-yards`, `square-miles`, `square-meters`, `square-kilometers`, `acres`, `ares`, `hectares`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#unitOptions)
    */
  var unitOptions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [AreaMeasurement2DViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#viewModel)
    */
  var viewModel: js.UndefOr[AreaMeasurement2DViewModel] = js.undefined
}

object AreaMeasurement2DProperties {
  @scala.inline
  def apply(
    container: String | HTMLElement = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    iconClass: String = null,
    id: String = null,
    label: String = null,
    unit: metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares = null,
    unitOptions: js.Array[String] = null,
    view: MapViewProperties = null,
    viewModel: AreaMeasurement2DViewModel = null
  ): AreaMeasurement2DProperties = {
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
    __obj.asInstanceOf[AreaMeasurement2DProperties]
  }
}

