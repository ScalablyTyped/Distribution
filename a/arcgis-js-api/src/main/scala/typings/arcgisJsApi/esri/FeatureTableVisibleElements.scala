package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureTableVisibleElements extends Object {
  /**
    * Indicates whether to display the feature table's header information. Default value is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#VisibleElements)
    */
  var header: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether to display the feature table's menu.Default value is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#VisibleElements)
    */
  var menu: js.UndefOr[Boolean] = js.undefined
  /**
    * The menu items within the feature table menu. This image shows the individual items within the widget's menu.  ![featuretable widget menu items](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featuretable/menuitems.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#VisibleElements)
    */
  var menuItems: js.UndefOr[VisibleElementsMenuItems] = js.undefined
}

object FeatureTableVisibleElements {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    header: js.UndefOr[Boolean] = js.undefined,
    menu: js.UndefOr[Boolean] = js.undefined,
    menuItems: VisibleElementsMenuItems = null
  ): FeatureTableVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.get.asInstanceOf[js.Any])
    if (!js.isUndefined(menu)) __obj.updateDynamic("menu")(menu.get.asInstanceOf[js.Any])
    if (menuItems != null) __obj.updateDynamic("menuItems")(menuItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureTableVisibleElements]
  }
}

