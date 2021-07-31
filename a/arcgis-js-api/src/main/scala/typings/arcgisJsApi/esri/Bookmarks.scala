package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`bookmark-edit`
import typings.arcgisJsApi.arcgisJsApiStrings.`bookmark-select`
import typings.arcgisJsApi.arcgisJsApiStrings.`select-bookmark`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bookmarks
  extends StObject
     with Widget_
     with GoTo {
  
  /**
    * Specifies how new bookmarks will be created if [editingEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#editingEnabled) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#bookmarkCreationOptions)
    */
  var bookmarkCreationOptions: BookmarkCreationOptions = js.native
  
  /**
    * A collection of [Bookmark](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#bookmarks)
    */
  var bookmarks: Collection[Bookmark] = js.native
  
  /**
    * When true, the widget is visually withdrawn and cannot be interacted with.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#disabled)
    */
  var disabled: Boolean = js.native
  
  /**
    * Indicates whether the bookmarks are able to be edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#editingEnabled)
    */
  var editingEnabled: Boolean = js.native
  
  /**
    * Zoom to a specific bookmark.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#goTo)
    */
  def goTo(Bookmark: Bookmark): js.Promise[js.Any] = js.native
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#iconClass)
    */
  var iconClass: String = js.native
  
  @JSName("on")
  def on_bookmarkedit(name: `bookmark-edit`, eventHandler: BookmarksBookmarkEditEventHandler): IHandle = js.native
  @JSName("on")
  def on_bookmarkselect(name: `bookmark-select`, eventHandler: BookmarksBookmarkSelectEventHandler): IHandle = js.native
  @JSName("on")
  def on_selectbookmark(name: `select-bookmark`, eventHandler: BookmarksSelectBookmarkEventHandler): IHandle = js.native
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#view)
    */
  var view: MapView = js.native
  
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
