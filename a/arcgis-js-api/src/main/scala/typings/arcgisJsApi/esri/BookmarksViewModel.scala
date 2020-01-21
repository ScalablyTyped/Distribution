package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
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
    * The view model's state.  **Possible Values:** loading | ready
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#state)
    *
    * @default ready
    */
  val state: String = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#view)
    */
  var view: MapView = js.native
  /**
    * Creates a new bookmark from based on the [BookmarkCreationOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#createBookmark)
    *
    * @param bookmarkCreationOptions Specifies how new bookmarks will be created. Can be used to enable/disable taking screenshots or capturing the extent when a new bookmark is added.
    *
    */
  def createBookmark(): js.Promise[Bookmark] = js.native
  def createBookmark(bookmarkCreationOptions: BookmarkCreationOptions): js.Promise[Bookmark] = js.native
  /**
    * Zoom to a specific bookmark.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#goTo)
    *
    * @param Bookmark The bookmark to zoom to.
    *
    */
  def goTo(Bookmark: Bookmark): js.Promise[_] = js.native
}

@JSGlobal("__esri.BookmarksViewModel")
@js.native
object BookmarksViewModel extends TopLevel[BookmarksViewModelConstructor]

