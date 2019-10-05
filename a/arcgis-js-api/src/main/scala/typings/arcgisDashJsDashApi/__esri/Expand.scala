package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expand extends Widget {
  /**
    * Automatically collapses the expand widget instance when the view's viewpoint updates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#autoCollapse)
    *
    * @default false
    */
  var autoCollapse: Boolean = js.native
  /**
    * Icon font used to style the Expand button.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#collapseIconClass)
    */
  var collapseIconClass: String = js.native
  /**
    * Tooltip to display to indicate Expand widget can be collapsed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#collapseTooltip)
    *
    * @default "Collapse" (English locale)
    */
  var collapseTooltip: String = js.native
  /**
    * The content to display within the expanded Expand widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#content)
    */
  var content: Node | String | Widget = js.native
  /**
    * Icon font used to style the Expand button. Will automatically use the [content's](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#content) iconClass if it has one.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#expandIconClass)
    */
  var expandIconClass: String = js.native
  /**
    * Tooltip to display to indicate Expand widget can be expanded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#expandTooltip)
    *
    * @default "Expand" (English locale)
    */
  var expandTooltip: String = js.native
  /**
    * Indicates whether the widget is currently expanded or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#expanded)
    *
    * @default false
    */
  var expanded: Boolean = js.native
  /**
    * This value associates two or more Expand widget instances with each other, allowing one instance to auto collapse when another instance in the same group is expanded. For auto collapsing to take effect, all instances of the group must be included in the [view.ui](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#ui).  For example, if you place multiple Expand instances in the top-left of the view's ui, you can assign them to a group called `top-left`. If one Expand instance is expanded and the user clicks on a different instance in the `top-left` group, then the first instance is collapsed, allowing the content of the second instance to be fully visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#group)
    */
  var group: String = js.native
  /**
    * A number to display at the corner of the widget to indicate the number of, for example, open issues or unread notices.  ![expand widget icon number](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/expand-with-iconnumber.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#iconNumber)
    */
  var iconNumber: Double = js.native
  /**
    * The mode in which the widget displays. These modes are listed below.
    *
    * mode | description
    * ---------------|------------
    * auto | This is the default mode. It is responsive to browser size changes and will update based on whether the widget is viewed in a desktop or mobile application.
    * floating | Use this mode if you wish to always display the widget as floating regardless of browser size.
    * drawer | Use this mode if you wish to always display the widget in a panel regardless of browser size.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#mode)
    *
    * @default "auto"
    */
  var mode: String = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [ExpandViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand-ExpandViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#viewModel)
    */
  var viewModel: ExpandViewModel = js.native
  /**
    * Collapse the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#collapse)
    *
    *
    */
  def collapse(): Unit = js.native
  /**
    * Expand the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#expand)
    *
    *
    */
  def expand(): Unit = js.native
  /**
    * *This method is primarily used by developers when implementing custom widgets.* It must be implemented by subclasses for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#render)
    *
    *
    */
  def render(): js.Any = js.native
  /**
    * Toggle the widget by expanding it if it's collapsed, or collapsing it if it's expanded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#toggle)
    *
    *
    */
  def toggle(): Unit = js.native
}

@JSGlobal("__esri.Expand")
@js.native
object Expand extends TopLevel[ExpandConstructor]

