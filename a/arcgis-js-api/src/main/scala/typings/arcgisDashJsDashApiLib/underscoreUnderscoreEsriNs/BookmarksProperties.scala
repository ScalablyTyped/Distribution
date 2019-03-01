package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarksProperties
  extends WidgetProperties
     with GoToProperties {
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [BookmarksViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#viewModel)
    */
  var viewModel: js.UndefOr[BookmarksViewModelProperties] = js.undefined
}

object BookmarksProperties {
  @scala.inline
  def apply(
    container: java.lang.String | stdLib.HTMLElement = null,
    destroyed: js.UndefOr[scala.Boolean] = js.undefined,
    goToOverride: GoToOverride = null,
    id: java.lang.String = null,
    view: MapViewProperties = null,
    viewModel: BookmarksViewModelProperties = null
  ): BookmarksProperties = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed)
    if (goToOverride != null) __obj.updateDynamic("goToOverride")(goToOverride)
    if (id != null) __obj.updateDynamic("id")(id)
    if (view != null) __obj.updateDynamic("view")(view)
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel)
    __obj.asInstanceOf[BookmarksProperties]
  }
}

