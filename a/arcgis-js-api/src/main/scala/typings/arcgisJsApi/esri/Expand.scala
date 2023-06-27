package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.drawer
import typings.arcgisJsApi.arcgisJsApiStrings.floating
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expand
  extends StObject
     with Widget_ {
  
  /**
  		 * Automatically collapses the expand widget instance when the view's viewpoint updates.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#autoCollapse)
  		 */
  var autoCollapse: Boolean = js.native
  
  /**
  		 * When true, the Expand widget will close after the Escape key is pressed when the keyboard focus is within its content.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#closeOnEsc)
  		 */
  var closeOnEsc: Boolean | js.Function = js.native
  
  /**
  		 * Collapse the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#collapse)
  		 */
  def collapse(): scala.Unit = js.native
  
  /**
  		 * Calcite icon used to style the Expand button when the [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#content) can be collapsed.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#collapseIcon)
  		 */
  var collapseIcon: String = js.native
  
  /**
  		 * Icon font used to style the Expand button.
  		 *
  		 * @deprecated since 4.27. Use {@link module:esri/widgets/Expand#collapseIcon collapseIcon} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#collapseIconClass)
  		 */
  var collapseIconClass: String = js.native
  
  /**
  		 * Tooltip to display to indicate Expand widget can be collapsed.
  		 *
  		 * @default "Collapse" (English locale)
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#collapseTooltip)
  		 */
  var collapseTooltip: String = js.native
  
  /**
  		 * The content to display within the expanded Expand widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#content)
  		 */
  var content: Node | String | Widget_ = js.native
  
  /**
  		 * Expand the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#expand)
  		 */
  def expand(): scala.Unit = js.native
  
  /**
  		 * Calcite icon used when the widget is collapsed.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#expandIcon)
  		 */
  var expandIcon: String = js.native
  
  /**
  		 * Icon font used to style the Expand button.
  		 *
  		 * @deprecated since 4.27. Use {@link module:esri/widgets/Expand#expandIcon expandIcon} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#expandIconClass)
  		 */
  var expandIconClass: String = js.native
  
  /**
  		 * Tooltip to display to indicate Expand widget can be expanded.
  		 *
  		 * @default "Expand" (English locale)
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#expandTooltip)
  		 */
  var expandTooltip: String = js.native
  
  /**
  		 * Indicates whether the widget is currently expanded or not.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#expanded)
  		 */
  var expanded: Boolean = js.native
  
  /**
  		 * This value associates two or more Expand widget instances with each other, allowing one instance to auto collapse when another instance in the same group is expanded.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#group)
  		 */
  var group: String = js.native
  
  /**
  		 * A number to display at the corner of the widget to indicate the number of, for example, open issues or unread notices.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#iconNumber)
  		 */
  var iconNumber: Double = js.native
  
  /**
  		 * The mode in which the widget displays.
  		 *
  		 * @default "auto"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#mode)
  		 */
  var mode: auto | floating | drawer = js.native
  
  /**
  		 * Toggle the widget by expanding it if it's collapsed, or collapsing it if it's expanded.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#toggle)
  		 */
  def toggle(): scala.Unit = js.native
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#view)
  		 */
  var view: MapView | SceneView = js.native
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#viewModel)
  		 */
  var viewModel: ExpandViewModel = js.native
}
