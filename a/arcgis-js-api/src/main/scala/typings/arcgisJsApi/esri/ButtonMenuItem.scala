package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `ButtonMenuItem` class provides the underlying menu functionality to create and customize new menu items within the [FeatureTable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html) widget's [ButtonMenu](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenu.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html)
  */
@js.native
trait ButtonMenuItem extends js.Object {
  /**
    * Indicates whether to automatically close the menu's item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html#autoCloseMenu)
    *
    * @default false
    */
  var autoCloseMenu: Boolean = js.native
  /**
    * A function that executes on the ButtonMenuItem's `click` event. If applicable, it provides the developer with access to the input `ButtonMenuItem` and its properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html#clickFunction)
    */
  @JSName("clickFunction")
  var clickFunction_Original: ButtonMenuItemClickFunction = js.native
  /**
    * Adds a CSS class to the menu button's DOM node.  ![featuretable widget menu items](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featuretable/button-menu-icon-class.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html#iconClass)
    */
  var iconClass: String = js.native
  /**
    * An array of individual [menu items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html).  The following image shows a custom menu item with two nested menu items within it.  ![Custom nested menu items](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featuretable/combine-nested-items.jpg)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html#items)
    */
  var items: js.Array[ButtonMenuItem] = js.native
  /**
    * The label of the menu item. This can be used in conjunction with the [iconClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html#iconClass) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html#label)
    */
  var label: String = js.native
  /**
    * Indicates if the menu content is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html#open)
    *
    * @default false
    */
  var open: Boolean = js.native
  /**
    * Indicates whether the menu item is selected. This is useful in use-cases when needing to apply a toggled state to individual menu items. An example of this can be seen in the default menu's `Show/hide columns` button. Use this in combination when [selectionEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html#selectionEnabled) is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html#selected)
    *
    * @default false
    */
  var selected: Boolean = js.native
  /**
    * Indicates whether a toggled state should be applied to individual menu items. An example of this can be seen with the invididual items nested under the default menu's `Show/hide columns`. Use this in combination with the [selected](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html#selected) property.  ![Show/hide columns](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featuretable/selection-enabled.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html#selectionEnabled)
    *
    * @default false
    */
  var selectionEnabled: Boolean = js.native
  /**
    * A function that executes on the ButtonMenuItem's `click` event. If applicable, it provides the developer with access to the input `ButtonMenuItem` and its properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html#clickFunction)
    */
  def clickFunction(event: js.Any): Unit = js.native
}

