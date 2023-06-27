package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`bookmark-edit`
import typings.arcgisJsApi.arcgisJsApiStrings.`bookmark-select`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bookmarks
  extends StObject
     with Widget_
     with GoTo {
  
  /**
  		 * A collection of [Bookmark](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html)s.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#bookmarks)
  		 */
  var bookmarks: Collection[Bookmark] = js.native
  
  /**
  		 * Specifies how new bookmarks will be created if [editingEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#editingEnabled) is set to `true`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#defaultCreateOptions)
  		 */
  var defaultCreateOptions: BookmarkOptions = js.native
  
  /**
  		 * Specifies how bookmarks will be edited, if [editingEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#editingEnabled) is set to `true`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#defaultEditOptions)
  		 */
  var defaultEditOptions: BookmarkOptions = js.native
  
  /**
  		 * When true, the widget is visually withdrawn and cannot be interacted with.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#disabled)
  		 */
  var disabled: Boolean = js.native
  
  /**
  		 * Indicates whether the bookmarks are able to be edited.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#editingEnabled)
  		 */
  var editingEnabled: Boolean = js.native
  
  /**
  		 * Zoom to a specific bookmark.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#goTo)
  		 */
  def goTo(Bookmark: Bookmark): js.Promise[Any] = js.native
  
  /**
  		 * Indicates the heading level to use for the message "No bookmarks" when no bookmarks are available in this widget.
  		 *
  		 * @default 2
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#headingLevel)
  		 */
  var headingLevel: Double = js.native
  
  /**
  		 * The widget's default CSS icon class.
  		 *
  		 * @deprecated since 4.27. Use {@link module:esri/widgets/Bookmarks#icon icon} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#iconClass)
  		 */
  var iconClass: String = js.native
  
  @JSName("on")
  def on_bookmarkedit(name: `bookmark-edit`, eventHandler: BookmarksBookmarkEditEventHandler): IHandle = js.native
  @JSName("on")
  def on_bookmarkselect(name: `bookmark-select`, eventHandler: BookmarksBookmarkSelectEventHandler): IHandle = js.native
  
  /**
  		 * The view from which the widget will operate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#view)
  		 */
  var view: MapView | SceneView = js.native
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#viewModel)
  		 */
  var viewModel: BookmarksViewModel = js.native
  
  /**
  		 * The visible elements that are displayed within the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#visibleElements)
  		 */
  var visibleElements: BookmarksVisibleElements = js.native
}
