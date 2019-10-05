package typings.arcgisDashJsDashApi.__esri

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoordinateConversionProperties
  extends WidgetProperties
     with GoToProperties {
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) containing every [Conversion](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Conversion.html) that the widget is currently displaying.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#conversions)
    */
  var conversions: js.UndefOr[CollectionProperties[Conversion]] = js.undefined
  /**
    * Describes the location of the coordinates currently displayed by the widget as a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html). Setting this property will update all [conversions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#conversions).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#currentLocation)
    */
  var currentLocation: js.UndefOr[PointProperties] = js.undefined
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) containing every [Format](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html) that the widget is capable of displaying.  The default formats are `basemap`, `dd`, `ddm`, `dms`, `mgrs`, `usng`, `utm`, and `xy`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#formats)
    */
  var formats: js.UndefOr[CollectionProperties[Format]] = js.undefined
  /**
    * Describes the current mode of the widget.  **Possible Values:** live | capture
    *   * While in `live` mode, the widget will update as the cursor moves.
    *   * While in `capture` mode, the widget will update on mouse click and display a graphic marking the current location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#mode)
    *
    * @default live
    */
  var mode: js.UndefOr[String] = js.undefined
  /**
    * If this property is set to `true`, multiple conversions can be displayed.  For a simpler experience with only one conversion at a time, this property can be set to `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#multipleConversions)
    *
    * @default true
    */
  var multipleConversions: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines whether the widget should expand up or down.  If set to `auto` the widget will be oriented based on its position in the view.  **Possible Values:** auto | expand-up | expand-down
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#orientation)
    *
    * @default auto
    */
  var orientation: js.UndefOr[String] = js.undefined
  /**
    * The number of milliseconds of delay before conversion requests will be sent to the [GeometryService](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html).  This only affects conversions that cannot be performed in the browser.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#requestDelay)
    *
    * @default 300
    */
  var requestDelay: js.UndefOr[Double] = js.undefined
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
  /**
    * The view model for this widget. The view model contains the logic that controls the Coordinate Widget's behavior.  See the [CoordinateConversionViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#viewModel)
    */
  var viewModel: js.UndefOr[CoordinateConversionViewModelProperties] = js.undefined
}

object CoordinateConversionProperties {
  @scala.inline
  def apply(
    container: String | HTMLElement = null,
    conversions: CollectionProperties[Conversion] = null,
    currentLocation: PointProperties = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    formats: CollectionProperties[Format] = null,
    goToOverride: (/* view */ MapView | SceneView, /* goToParameters */ GoToParameters) => Unit = null,
    id: String = null,
    label: String = null,
    mode: String = null,
    multipleConversions: js.UndefOr[Boolean] = js.undefined,
    orientation: String = null,
    requestDelay: Int | Double = null,
    view: MapViewProperties | SceneViewProperties = null,
    viewModel: CoordinateConversionViewModelProperties = null
  ): CoordinateConversionProperties = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (conversions != null) __obj.updateDynamic("conversions")(conversions.asInstanceOf[js.Any])
    if (currentLocation != null) __obj.updateDynamic("currentLocation")(currentLocation)
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed)
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (goToOverride != null) __obj.updateDynamic("goToOverride")(js.Any.fromFunction2(goToOverride))
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (!js.isUndefined(multipleConversions)) __obj.updateDynamic("multipleConversions")(multipleConversions)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (requestDelay != null) __obj.updateDynamic("requestDelay")(requestDelay.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel)
    __obj.asInstanceOf[CoordinateConversionProperties]
  }
}

