package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonMenu extends Widget_ {
  /**
    * Adds a CSS class to the menu button's DOM node.  ![featuretable widget menu items](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featuretable/button-menu-icon-class.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenu.html#iconClass)
    */
  var iconClass: String = js.native
  /**
    * An array of individual [menu items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenu.html#items)
    */
  var items: js.Array[ButtonMenuItem] = js.native
  /**
    * Indicates if the menu content is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenu.html#open)
    *
    * @default false
    */
  var open: Boolean = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [ButtonMenuViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenu.html#viewModel)
    */
  var viewModel: ButtonMenuViewModel = js.native
}

