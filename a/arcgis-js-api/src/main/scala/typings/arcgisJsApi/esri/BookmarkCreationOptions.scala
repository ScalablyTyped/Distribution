package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookmarkCreationOptions
  extends StObject
     with Object {
  
  /**
    * Indicates whether the extent of the current view will become the [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#extent) of a newly created bookmark.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var captureExtent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * _Since 4.17_ Indicates whether the rotation of the current view will be saved in the [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#viewpoint) of a newly created bookmark.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var captureRotation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * _Since 4.17_ Indicates whether the scale of the current view will be saved in the [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#viewpoint) of a newly created bookmark.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var captureScale: js.UndefOr[Boolean] = js.undefined
  
  /**
    * _Since 4.17_ Indicates whether the viewpoint of the current view will become the [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#viewpoint) of a newly created bookmark.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var captureViewpoint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object that specifies the settings of the screenshot that will be used to create the bookmark's [thumbnail](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#thumbnail).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var screenshotSettings: js.UndefOr[BookmarkCreationOptionsScreenshotSettings] = js.undefined
  
  /**
    * Indicates whether a screenshot is taken when a new bookmark is created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var takeScreenshot: js.UndefOr[Boolean] = js.undefined
}
object BookmarkCreationOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): BookmarkCreationOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[BookmarkCreationOptions]
  }
  
  @scala.inline
  implicit class BookmarkCreationOptionsMutableBuilder[Self <: BookmarkCreationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptureExtent(value: Boolean): Self = StObject.set(x, "captureExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureExtentUndefined: Self = StObject.set(x, "captureExtent", js.undefined)
    
    @scala.inline
    def setCaptureRotation(value: Boolean): Self = StObject.set(x, "captureRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureRotationUndefined: Self = StObject.set(x, "captureRotation", js.undefined)
    
    @scala.inline
    def setCaptureScale(value: Boolean): Self = StObject.set(x, "captureScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureScaleUndefined: Self = StObject.set(x, "captureScale", js.undefined)
    
    @scala.inline
    def setCaptureViewpoint(value: Boolean): Self = StObject.set(x, "captureViewpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureViewpointUndefined: Self = StObject.set(x, "captureViewpoint", js.undefined)
    
    @scala.inline
    def setScreenshotSettings(value: BookmarkCreationOptionsScreenshotSettings): Self = StObject.set(x, "screenshotSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenshotSettingsUndefined: Self = StObject.set(x, "screenshotSettings", js.undefined)
    
    @scala.inline
    def setTakeScreenshot(value: Boolean): Self = StObject.set(x, "takeScreenshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTakeScreenshotUndefined: Self = StObject.set(x, "takeScreenshot", js.undefined)
  }
}
