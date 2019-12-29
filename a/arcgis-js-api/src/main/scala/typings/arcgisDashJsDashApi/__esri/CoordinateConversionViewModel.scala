package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.capture
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.disabled
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.live
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.loading
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoordinateConversionViewModel
  extends Accessor
     with GoTo {
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) containing every [Conversion](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Conversion.html) that the widget is currently displaying.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#conversions)
    */
  var conversions: Collection[Conversion] = js.native
  /**
    * Describes the location of the coordinates currently displayed by the widget as a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html). Setting this property will update all [conversions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#conversions).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#currentLocation)
    */
  var currentLocation: Point = js.native
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) containing every [Format](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html) that the widget is capable of displaying.  The default formats are `basemap`, `dd`, `ddm`, `dms`, `mgrs`, `usng`, `utm`, and `xy`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#formats)
    */
  var formats: Collection[Format] = js.native
  /**
    * This symbol is used to visualize the location currently described by the widget when `capture` mode is active.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#locationSymbol)
    */
  var locationSymbol: SimpleMarkerSymbol | PictureMarkerSymbol = js.native
  /**
    * Describes the current mode of the widget.
    *   * While in `live` mode, the widget will update as the cursor moves.
    *   * While in `capture` mode, the widget will update on mouse click and display a graphic marking the current location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#mode)
    *
    * @default live
    */
  var mode: live | capture = js.native
  /**
    * The number of milliseconds of delay before conversion requests will be sent to the [GeometryService](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html).  This only affects conversions that cannot be performed in the browser.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#requestDelay)
    *
    * @default 300
    */
  var requestDelay: Double = js.native
  /**
    * The view model's state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#state)
    *
    * @default disabled
    */
  val state: ready | loading | disabled = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * Attempt to convert a point into a [Position](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#Position).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#convert)
    *
    * @param point The point to convert.
    * @param format The format that describes how the point should be converted.
    *
    */
  def convert(point: Point, format: Format): js.Promise[Position] = js.native
  /**
    * Attempt to convert a string into a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html).  The format of the string must be specified.  A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of available formats can be obtained from the [formats](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#formats) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#reverseConvert)
    *
    * @param coordinate The coordinate string.
    * @param format Specifies the format of the input coordinate.
    *
    */
  def reverseConvert(coordinate: String, format: Format): js.Promise[Point] = js.native
  /**
    * Update the input conversions based on the input point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#updateConversions)
    *
    * @param location A point that will be used to update each input conversion.
    * @param conversions An array of [Conversions](esri-widgets-CoordinateConversion-support-Conversion.html) to be updated.
    *
    */
  def updateConversions(location: Point, conversions: js.Array[Conversion]): js.Promise[js.Array[Conversion]] = js.native
}

@JSGlobal("__esri.CoordinateConversionViewModel")
@js.native
object CoordinateConversionViewModel extends TopLevel[CoordinateConversionViewModelConstructor]

