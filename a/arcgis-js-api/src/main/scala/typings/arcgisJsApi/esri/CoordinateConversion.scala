package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`expand-down`
import typings.arcgisJsApi.arcgisJsApiStrings.`expand-up`
import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.capture
import typings.arcgisJsApi.arcgisJsApiStrings.live
import typings.arcgisJsApi.arcgisJsApiStrings.local
import typings.arcgisJsApi.arcgisJsApiStrings.session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoordinateConversion
  extends StObject
     with Widget_
     with GoTo {
  
  /**
  		 * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) containing every [Conversion](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Conversion.html) that the widget is currently displaying.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#conversions)
  		 */
  var conversions: Collection[Conversion] = js.native
  
  /**
  		 * Describes the location of the coordinates currently displayed by the widget as a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#currentLocation)
  		 */
  val currentLocation: Point = js.native
  
  /**
  		 * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) containing every [Format](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html) that the widget is capable of displaying.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#formats)
  		 */
  var formats: Collection[Format] = js.native
  
  /**
  		 * Indicates the heading level to use for the coordinate input and coordinate settings headings.
  		 *
  		 * @default 4
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#headingLevel)
  		 */
  var headingLevel: Double = js.native
  
  /**
  		 * This symbol is used to visualize the location currently described by the widget when `capture` mode is active.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#locationSymbol)
  		 */
  var locationSymbol: SimpleMarkerSymbol | PictureMarkerSymbol = js.native
  
  /**
  		 * Describes the current mode of the widget.
  		 *
  		 * @default live
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#mode)
  		 */
  var mode: live | capture = js.native
  
  /**
  		 * If this property is set to `true`, multiple conversions can be displayed.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#multipleConversions)
  		 */
  var multipleConversions: Boolean = js.native
  
  /**
  		 * Determines whether the widget should expand up or down.
  		 *
  		 * @default auto
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#orientation)
  		 */
  var orientation: auto | `expand-up` | `expand-down` = js.native
  
  /**
  		 * Attempt to convert a string into a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#reverseConvert)
  		 */
  def reverseConvert(coordinate: String, format: Format): js.Promise[Point] = js.native
  
  /**
  		 * If this property is set to `true`, sessionStorage or localStorage (depending on [storageType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#storageType)) will be used to hydrate and persist the CoordinateConversion widget's state.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#storageEnabled)
  		 */
  var storageEnabled: Boolean = js.native
  
  /**
  		 * This property determines whether sessionStorage or localStorage will be used to store widget state.
  		 *
  		 * @default "session"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#storageType)
  		 */
  var storageType: session | local = js.native
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#view)
  		 */
  var view: MapView | SceneView = js.native
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#viewModel)
  		 */
  var viewModel: CoordinateConversionViewModel = js.native
  
  /**
  		 * The visible elements that are displayed within the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#visibleElements)
  		 */
  var visibleElements: CoordinateConversionVisibleElements = js.native
}
