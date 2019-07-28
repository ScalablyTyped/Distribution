package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerListViewModelProperties extends js.Object {
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html). Each list item can be modified according to its modifiable propeties. Actions can be added to list items using the [actionsSections](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#actionsSections) property of the ListItem.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#listItemCreatedFunction)
    */
  var listItemCreatedFunction: js.UndefOr[js.Function] = js.undefined
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
}

object LayerListViewModelProperties {
  @scala.inline
  def apply(listItemCreatedFunction: js.Function = null, view: MapViewProperties | SceneViewProperties = null): LayerListViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (listItemCreatedFunction != null) __obj.updateDynamic("listItemCreatedFunction")(listItemCreatedFunction)
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerListViewModelProperties]
  }
}

