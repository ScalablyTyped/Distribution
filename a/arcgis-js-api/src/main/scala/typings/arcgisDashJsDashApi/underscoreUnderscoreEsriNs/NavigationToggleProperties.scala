package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationToggleProperties extends WidgetProperties {
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  /**
    * Sets the layout of the widget to either `horizontal` or `vertical`. See the table below for a list of possible values.
    *
    * Possible Value | Example
    * ---------------|--------
    * vertical | ![navigation-toggle](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/navigation-toggle.png)
    * horizontal | ![navigation-toggle-horizontal](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/navigation-toggle-horizontal.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle.html#layout)
    *
    * @default vertical
    */
  var layout: js.UndefOr[String] = js.undefined
  /**
    * A reference to the SceneView. Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.undefined
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [NavigationToggleViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle-NavigationToggleViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle.html#viewModel)
    */
  var viewModel: js.UndefOr[NavigationToggleViewModelProperties] = js.undefined
}

object NavigationToggleProperties {
  @scala.inline
  def apply(
    container: String | HTMLElement = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    iconClass: String = null,
    id: String = null,
    label: String = null,
    layout: String = null,
    view: SceneViewProperties = null,
    viewModel: NavigationToggleViewModelProperties = null
  ): NavigationToggleProperties = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (view != null) __obj.updateDynamic("view")(view)
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel)
    __obj.asInstanceOf[NavigationToggleProperties]
  }
}

