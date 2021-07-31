package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookmarksProperties
  extends StObject
     with WidgetProperties
     with GoToProperties {
  
  /**
    * Specifies how new bookmarks will be created if [editingEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#editingEnabled) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#bookmarkCreationOptions)
    */
  var bookmarkCreationOptions: js.UndefOr[BookmarkCreationOptions] = js.undefined
  
  /**
    * A collection of [Bookmark](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#bookmarks)
    */
  var bookmarks: js.UndefOr[CollectionProperties[BookmarkProperties]] = js.undefined
  
  /**
    * When true, the widget is visually withdrawn and cannot be interacted with.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#disabled)
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the bookmarks are able to be edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#editingEnabled)
    */
  var editingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#viewModel)
    */
  var viewModel: js.UndefOr[BookmarksViewModelProperties] = js.undefined
  
  /**
    * The visible elements that are displayed within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#visibleElements)
    */
  var visibleElements: js.UndefOr[BookmarksVisibleElements] = js.undefined
}
object BookmarksProperties {
  
  @scala.inline
  def apply(): BookmarksProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookmarksProperties]
  }
  
  @scala.inline
  implicit class BookmarksPropertiesMutableBuilder[Self <: BookmarksProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBookmarkCreationOptions(value: BookmarkCreationOptions): Self = StObject.set(x, "bookmarkCreationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookmarkCreationOptionsUndefined: Self = StObject.set(x, "bookmarkCreationOptions", js.undefined)
    
    @scala.inline
    def setBookmarks(value: CollectionProperties[BookmarkProperties]): Self = StObject.set(x, "bookmarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookmarksUndefined: Self = StObject.set(x, "bookmarks", js.undefined)
    
    @scala.inline
    def setBookmarksVarargs(value: BookmarkProperties*): Self = StObject.set(x, "bookmarks", js.Array(value :_*))
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setEditingEnabled(value: Boolean): Self = StObject.set(x, "editingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditingEnabledUndefined: Self = StObject.set(x, "editingEnabled", js.undefined)
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModel(value: BookmarksViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setVisibleElements(value: BookmarksVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}
