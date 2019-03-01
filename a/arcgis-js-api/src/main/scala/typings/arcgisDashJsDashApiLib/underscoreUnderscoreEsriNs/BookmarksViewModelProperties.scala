package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarksViewModelProperties extends GoToProperties {
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
}

object BookmarksViewModelProperties {
  @scala.inline
  def apply(goToOverride: GoToOverride = null, view: MapViewProperties = null): BookmarksViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (goToOverride != null) __obj.updateDynamic("goToOverride")(goToOverride)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[BookmarksViewModelProperties]
  }
}

