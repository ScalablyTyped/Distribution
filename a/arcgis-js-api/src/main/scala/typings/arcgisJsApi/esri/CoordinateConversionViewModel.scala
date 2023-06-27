package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.capture
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.live
import typings.arcgisJsApi.arcgisJsApiStrings.loading
import typings.arcgisJsApi.arcgisJsApiStrings.local
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.arcgisJsApiStrings.session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoordinateConversionViewModel
  extends StObject
     with Accessor
     with GoTo {
  
  /**
  		 * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) containing every [Conversion](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Conversion.html) that the widget is currently displaying.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#conversions)
  		 */
  var conversions: Collection[Conversion] = js.native
  
  /**
  		 * Attempt to convert a point into a [Position](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#Position).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#convert)
  		 */
  def convert(point: Point, format: Format): js.Promise[Position] = js.native
  
  /**
  		 * Describes the location of the coordinates currently displayed by the widget as a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#currentLocation)
  		 */
  var currentLocation: Point = js.native
  
  /**
  		 * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) containing every [Format](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html) that the widget is capable of displaying.
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
  		 *
  		 * @default live
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#mode)
  		 */
  var mode: live | capture = js.native
  
  /**
  		 * Attempt to convert a string into a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#reverseConvert)
  		 */
  def reverseConvert(coordinate: String, format: Format): js.Promise[Point] = js.native
  
  /**
  		 * The view model's state.
  		 *
  		 * @default disabled
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#state)
  		 */
  val state: ready | loading | disabled = js.native
  
  /**
  		 * If this property is set to `true`, sessionStorage or localStorage (depending on [storageType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#storageType)) will be used to hydrate and persist the CoordinateConversion widget's state.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#storageEnabled)
  		 */
  var storageEnabled: Boolean = js.native
  
  /**
  		 * This property determines whether sessionStorage or localStorage will be used to store widget state.
  		 *
  		 * @default "session"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#storageType)
  		 */
  var storageType: session | local = js.native
  
  /**
  		 * Update the input conversions based on the input point.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#updateConversions)
  		 */
  def updateConversions(conversions: js.Array[Conversion], location: Point): js.Promise[js.Array[Conversion]] = js.native
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#view)
  		 */
  var view: MapView | SceneView = js.native
}
