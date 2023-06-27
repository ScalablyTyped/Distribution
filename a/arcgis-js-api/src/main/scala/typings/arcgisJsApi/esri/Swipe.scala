package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.horizontal
import typings.arcgisJsApi.arcgisJsApiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Swipe
  extends StObject
     with Widget_ {
  
  /**
  		 * The direction the Swipe widget moves across the view.
  		 *
  		 * @default "horizontal"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#direction)
  		 */
  var direction: horizontal | vertical = js.native
  
  /**
  		 * When `true`, sets the widget to a disabled state so the user cannot interact with it.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#disabled)
  		 */
  var disabled: Boolean = js.native
  
  /**
  		 * The text that shows in a tooltip when hovering over the handle of the Swipe widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#dragLabel)
  		 */
  var dragLabel: String = js.native
  
  /**
  		 * The widget's default CSS icon class.
  		 *
  		 * @deprecated since 4.27. Use {@link module:esri/widgets/Swipe#icon icon} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#iconClass)
  		 */
  var iconClass: String = js.native
  
  /**
  		 * A collection of [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)s that will show on the left or top side of the Swipe widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#leadingLayers)
  		 */
  var leadingLayers: Collection[Layer] = js.native
  
  /**
  		 * The position of the Swipe widget.
  		 *
  		 * @default 25
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#position)
  		 */
  var position: Double = js.native
  
  /**
  		 * A collection of [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)s that will show on the right or bottom side of the Swipe widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#trailingLayers)
  		 */
  var trailingLayers: Collection[Layer] = js.native
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#view)
  		 */
  var view: MapView = js.native
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#viewModel)
  		 */
  var viewModel: SwipeViewModel = js.native
  
  /**
  		 * The visible elements that are displayed within the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#visibleElements)
  		 */
  var visibleElements: widgetsSwipeVisibleElements = js.native
}
