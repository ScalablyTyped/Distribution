package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BookmarksViewModel
  extends Accessor
     with GoTo {
  /**
    * The [Bookmark](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html) that is being navigated to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#activeBookmark)
    */
  val activeBookmark: Bookmark = js.native
  /**
    * A collection of [Bookmark](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#bookmarks)
    */
  var bookmarks: Collection[Bookmark] = js.native
  /**
    * The view model's state.  **Possible Values:** loading | disabled
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#state)
    *
    * @default disabled
    */
  val state: String = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#view)
    */
  var view: MapView = js.native
  /**
    * Zoom to a specific bookmark.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#goTo)
    *
    * @param Bookmark The bookmark to zoom to.
    *
    */
  def goTo(Bookmark: Bookmark): IPromise[_] = js.native
}

@JSGlobal("__esri.BookmarksViewModel")
@js.native
class BookmarksViewModelCls () extends BookmarksViewModel {
  def this(properties: BookmarksViewModelProperties) = this()
}

