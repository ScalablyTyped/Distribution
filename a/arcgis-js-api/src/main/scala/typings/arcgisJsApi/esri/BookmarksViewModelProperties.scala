package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BookmarksViewModelProperties extends GoToProperties {
  
  /**
    * A collection of [Bookmark](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#bookmarks)
    */
  var bookmarks: js.UndefOr[CollectionProperties[BookmarkProperties]] = js.native
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.native
}
object BookmarksViewModelProperties {
  
  @scala.inline
  def apply(): BookmarksViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookmarksViewModelProperties]
  }
  
  @scala.inline
  implicit class BookmarksViewModelPropertiesOps[Self <: BookmarksViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBookmarksVarargs(value: BookmarkProperties*): Self = this.set("bookmarks", js.Array(value :_*))
    
    @scala.inline
    def setBookmarks(value: CollectionProperties[BookmarkProperties]): Self = this.set("bookmarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBookmarks: Self = this.set("bookmarks", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
