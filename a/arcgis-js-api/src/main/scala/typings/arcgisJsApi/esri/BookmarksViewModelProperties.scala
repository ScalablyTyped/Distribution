package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookmarksViewModelProperties
  extends StObject
     with GoToProperties {
  
  /**
    * Defines the abilities of the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#abilities)
    */
  var abilities: js.UndefOr[Abilities] = js.undefined
  
  /**
    * A collection of [Bookmark](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#bookmarks)
    */
  var bookmarks: js.UndefOr[CollectionProperties[BookmarkProperties]] = js.undefined
  
  /**
    * Specifies how new bookmarks will be created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#defaultCreateOptions)
    */
  var defaultCreateOptions: js.UndefOr[BookmarkOptions] = js.undefined
  
  /**
    * Specifies how bookmarks will be edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#defaultEditOptions)
    */
  var defaultEditOptions: js.UndefOr[BookmarkOptions] = js.undefined
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#view)
    */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
}
object BookmarksViewModelProperties {
  
  inline def apply(): BookmarksViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookmarksViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BookmarksViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setAbilities(value: Abilities): Self = StObject.set(x, "abilities", value.asInstanceOf[js.Any])
    
    inline def setAbilitiesUndefined: Self = StObject.set(x, "abilities", js.undefined)
    
    inline def setBookmarks(value: CollectionProperties[BookmarkProperties]): Self = StObject.set(x, "bookmarks", value.asInstanceOf[js.Any])
    
    inline def setBookmarksUndefined: Self = StObject.set(x, "bookmarks", js.undefined)
    
    inline def setBookmarksVarargs(value: BookmarkProperties*): Self = StObject.set(x, "bookmarks", js.Array(value*))
    
    inline def setDefaultCreateOptions(value: BookmarkOptions): Self = StObject.set(x, "defaultCreateOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultCreateOptionsUndefined: Self = StObject.set(x, "defaultCreateOptions", js.undefined)
    
    inline def setDefaultEditOptions(value: BookmarkOptions): Self = StObject.set(x, "defaultEditOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultEditOptionsUndefined: Self = StObject.set(x, "defaultEditOptions", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
