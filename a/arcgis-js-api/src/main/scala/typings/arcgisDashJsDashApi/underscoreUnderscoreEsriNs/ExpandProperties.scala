package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandProperties extends WidgetProperties {
  /**
    * Automatically collapses the expand widget instance when the view's viewpoint updates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#autoCollapse)
    *
    * @default false
    */
  var autoCollapse: js.UndefOr[Boolean] = js.undefined
  /**
    * Icon font used to style the Expand button.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#collapseIconClass)
    */
  var collapseIconClass: js.UndefOr[String] = js.undefined
  /**
    * Tooltip to display to indicate Expand widget can be collapsed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#collapseTooltip)
    *
    * @default "Collapse" (English locale)
    */
  var collapseTooltip: js.UndefOr[String] = js.undefined
  /**
    * The content to display within the expanded Expand widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#content)
    */
  var content: js.UndefOr[Node | String | WidgetProperties] = js.undefined
  /**
    * Icon font used to style the Expand button. Will automatically use the [content's](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#content) iconClass if it has one.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#expandIconClass)
    */
  var expandIconClass: js.UndefOr[String] = js.undefined
  /**
    * Tooltip to display to indicate Expand widget can be expanded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#expandTooltip)
    *
    * @default "Expand" (English locale)
    */
  var expandTooltip: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the widget is currently expanded or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#expanded)
    *
    * @default false
    */
  var expanded: js.UndefOr[Boolean] = js.undefined
  /**
    * This value associates two or more Expand widget instances with each other, allowing one instance to auto collapse when another instance in the same group is expanded. For auto collapsing to take effect, all instances of the group must be included in the [view.ui](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#ui).  For example, if you place multiple Expand instances in the top-left of the view's ui, you can assign them to a group called `top-left`. If one Expand instance is expanded and the user clicks on a different instance in the `top-left` group, then the first instance is collapsed, allowing the content of the second instance to be fully visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#group)
    */
  var group: js.UndefOr[String] = js.undefined
  /**
    * A number to display at the corner of the widget to indicate the number of, for example, open issues or unread notices.  ![expand widget icon number](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/expand-with-iconnumber.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#iconNumber)
    */
  var iconNumber: js.UndefOr[Double] = js.undefined
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
  var mode: js.UndefOr[String] = js.undefined
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [ExpandViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand-ExpandViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#viewModel)
    */
  var viewModel: js.UndefOr[ExpandViewModelProperties] = js.undefined
}

object ExpandProperties {
  @scala.inline
  def apply(
    autoCollapse: js.UndefOr[Boolean] = js.undefined,
    collapseIconClass: String = null,
    collapseTooltip: String = null,
    container: String | HTMLElement = null,
    content: Node | String | WidgetProperties = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    expandIconClass: String = null,
    expandTooltip: String = null,
    expanded: js.UndefOr[Boolean] = js.undefined,
    group: String = null,
    iconNumber: Int | Double = null,
    id: String = null,
    label: String = null,
    mode: String = null,
    view: MapViewProperties | SceneViewProperties = null,
    viewModel: ExpandViewModelProperties = null
  ): ExpandProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCollapse)) __obj.updateDynamic("autoCollapse")(autoCollapse)
    if (collapseIconClass != null) __obj.updateDynamic("collapseIconClass")(collapseIconClass)
    if (collapseTooltip != null) __obj.updateDynamic("collapseTooltip")(collapseTooltip)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed)
    if (expandIconClass != null) __obj.updateDynamic("expandIconClass")(expandIconClass)
    if (expandTooltip != null) __obj.updateDynamic("expandTooltip")(expandTooltip)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (group != null) __obj.updateDynamic("group")(group)
    if (iconNumber != null) __obj.updateDynamic("iconNumber")(iconNumber.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel)
    __obj.asInstanceOf[ExpandProperties]
  }
}

