package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.horizontal
import typings.arcgisJsApi.arcgisJsApiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationToggle extends Widget_ {
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle.html#iconClass)
    */
  var iconClass: String = js.native
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
  var layout: vertical | horizontal = js.native
  /**
    * A reference to the SceneView. Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle.html#view)
    */
  var view: SceneView = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [NavigationToggleViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle-NavigationToggleViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle.html#viewModel)
    */
  var viewModel: NavigationToggleViewModel = js.native
  /**
    * Toggles the navigation mode of the [view](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle.html#view) from `pan` to `rotate` or vice versa.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle.html#toggle)
    *
    *
    */
  def toggle(): Unit = js.native
}

