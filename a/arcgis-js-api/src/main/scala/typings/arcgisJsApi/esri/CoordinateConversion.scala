package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`expand-down`
import typings.arcgisJsApi.arcgisJsApiStrings.`expand-up`
import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.capture
import typings.arcgisJsApi.arcgisJsApiStrings.live
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoordinateConversion
  extends Widget_
     with GoTo {
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) containing every [Conversion](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Conversion.html) that the widget is currently displaying.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#conversions)
    */
  var conversions: Collection[Conversion] = js.native
  /**
    * Describes the location of the coordinates currently displayed by the widget as a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html). Setting this property will update all [conversions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#conversions).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#currentLocation)
    */
  var currentLocation: Point = js.native
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) containing every [Format](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html) that the widget is capable of displaying.  The default formats are `basemap`, `dd`, `ddm`, `dms`, `mgrs`, `usng`, `utm`, and `xy`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#formats)
    */
  var formats: Collection[Format] = js.native
  /**
    * Describes the current mode of the widget.
    *   * While in `live` mode, the widget will update as the cursor moves.
    *   * While in `capture` mode, the widget will update on mouse click and display a graphic marking the current location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#mode)
    *
    * @default live
    */
  var mode: live | capture = js.native
  /**
    * If this property is set to `true`, multiple conversions can be displayed.  For a simpler experience with only one conversion at a time, this property can be set to `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#multipleConversions)
    *
    * @default true
    */
  var multipleConversions: Boolean = js.native
  /**
    * Determines whether the widget should expand up or down.  If set to `auto` the widget will be oriented based on its position in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#orientation)
    *
    * @default auto
    */
  var orientation: auto | `expand-up` | `expand-down` = js.native
  /**
    * The number of milliseconds of delay before conversion requests will be sent to the [GeometryService](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html).  This only affects conversions that cannot be performed in the browser.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#requestDelay)
    *
    * @default 300
    */
  var requestDelay: Double = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * The view model for this widget. The view model contains the logic that controls the Coordinate Widget's behavior.  See the [CoordinateConversionViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#viewModel)
    */
  var viewModel: CoordinateConversionViewModel = js.native
  /**
    * Attempt to convert a string into a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html).  The format of the string must be specified.  A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of available formats can be obtained from the [formats](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#formats) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#reverseConvert)
    *
    * @param coordinate The coordinate string.
    * @param format Specifies the format of the input coordinate.
    *
    */
  def reverseConvert(coordinate: String, format: Format): js.Promise[Point] = js.native
}

