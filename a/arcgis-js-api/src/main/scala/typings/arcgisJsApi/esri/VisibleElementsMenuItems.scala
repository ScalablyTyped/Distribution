package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisibleElementsMenuItems extends Object {
  /**
    * Indicates whether to display the `Clear selection` menu item. Default value is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#VisibleElements)
    */
  var clearSelection: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether to display the `Refresh data` menu item. Default value is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#VisibleElements)
    */
  var refreshData: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether to enable toggling column visibility within the menu. Default value is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#VisibleElements)
    */
  var toggleColumns: js.UndefOr[js.Any] = js.undefined
}

object VisibleElementsMenuItems {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    clearSelection: js.UndefOr[Boolean] = js.undefined,
    refreshData: js.UndefOr[Boolean] = js.undefined,
    toggleColumns: js.Any = null
  ): VisibleElementsMenuItems = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(clearSelection)) __obj.updateDynamic("clearSelection")(clearSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshData)) __obj.updateDynamic("refreshData")(refreshData.asInstanceOf[js.Any])
    if (toggleColumns != null) __obj.updateDynamic("toggleColumns")(toggleColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibleElementsMenuItems]
  }
}

