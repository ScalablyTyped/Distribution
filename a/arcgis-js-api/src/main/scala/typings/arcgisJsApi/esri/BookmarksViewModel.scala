package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.loading
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BookmarksViewModel
  extends StObject
     with Accessor
     with GoTo {
  
  /**
  		 * Defines the abilities of the widget.
  		 *
  		 * @deprecated since 4.27. Use {@link module:esri/widgets/Bookmarks/BookmarksViewModel#capabilities capabilities} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#abilities)
  		 */
  var abilities: BookmarksCapabilities = js.native
  
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
  		 * Defines the capabilities of the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#capabilities)
  		 */
  var capabilities: BookmarksCapabilities = js.native
  
  /**
  		 * Creates a new bookmark from the [defaultCreateOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#defaultCreateOptions), unless otherwise specified.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#createBookmark)
  		 */
  def createBookmark(): js.Promise[Bookmark] = js.native
  def createBookmark(options: BookmarkOptions): js.Promise[Bookmark] = js.native
  
  /**
  		 * Specifies how new bookmarks will be created.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#defaultCreateOptions)
  		 */
  var defaultCreateOptions: BookmarkOptions = js.native
  
  /**
  		 * Specifies how bookmarks will be edited.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#defaultEditOptions)
  		 */
  var defaultEditOptions: BookmarkOptions = js.native
  
  /**
  		 * Edits the given bookmark.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#editBookmark)
  		 */
  def editBookmark(bookmark: Bookmark): js.Promise[Bookmark] = js.native
  def editBookmark(bookmark: Bookmark, options: BookmarkOptions): js.Promise[Bookmark] = js.native
  
  /**
  		 * Zoom to a specific bookmark.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#goTo)
  		 */
  def goTo(bookmark: Bookmark): js.Promise[Any] = js.native
  
  /**
  		 * The view model's state.
  		 *
  		 * @default ready
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#state)
  		 */
  val state: loading | ready = js.native
  
  /**
  		 * The view from which the widget will operate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#view)
  		 */
  var view: MapView | SceneView = js.native
}
