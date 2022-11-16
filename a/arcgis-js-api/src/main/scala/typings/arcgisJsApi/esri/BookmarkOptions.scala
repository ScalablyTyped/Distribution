package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookmarkOptions extends StObject {
  
  /**
    * _Since 4.17_ Indicates whether the rotation of the current view will be saved in the [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#viewpoint) of a newly created or modified bookmark.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkOptions)
    */
  var captureRotation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * _Since 4.17_ Indicates whether the scale of the current view will be saved in the [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#viewpoint) of a newly created or modified bookmark.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkOptions)
    */
  var captureScale: js.UndefOr[Boolean] = js.undefined
  
  /**
    * _Since 4.22_ Indicates whether the time extent of the current view will be saved in the [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#timeExtent) of a newly created or modified bookmark.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkOptions)
    */
  var captureTimeExtent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * _Since 4.17_ Indicates whether the viewpoint of the current view will become the [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#viewpoint) of a newly created or modified bookmark.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkOptions)
    */
  var captureViewpoint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object that specifies the settings of the screenshot that will be used to create the bookmark's [thumbnail](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#thumbnail).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkOptions)
    */
  var screenshotSettings: js.UndefOr[BookmarkOptionsScreenshotSettings] = js.undefined
  
  /**
    * Indicates whether a screenshot is taken when a new bookmark is created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkOptions)
    */
  var takeScreenshot: js.UndefOr[Boolean] = js.undefined
}
object BookmarkOptions {
  
  inline def apply(): BookmarkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookmarkOptions]
  }
  
  extension [Self <: BookmarkOptions](x: Self) {
    
    inline def setCaptureRotation(value: Boolean): Self = StObject.set(x, "captureRotation", value.asInstanceOf[js.Any])
    
    inline def setCaptureRotationUndefined: Self = StObject.set(x, "captureRotation", js.undefined)
    
    inline def setCaptureScale(value: Boolean): Self = StObject.set(x, "captureScale", value.asInstanceOf[js.Any])
    
    inline def setCaptureScaleUndefined: Self = StObject.set(x, "captureScale", js.undefined)
    
    inline def setCaptureTimeExtent(value: Boolean): Self = StObject.set(x, "captureTimeExtent", value.asInstanceOf[js.Any])
    
    inline def setCaptureTimeExtentUndefined: Self = StObject.set(x, "captureTimeExtent", js.undefined)
    
    inline def setCaptureViewpoint(value: Boolean): Self = StObject.set(x, "captureViewpoint", value.asInstanceOf[js.Any])
    
    inline def setCaptureViewpointUndefined: Self = StObject.set(x, "captureViewpoint", js.undefined)
    
    inline def setScreenshotSettings(value: BookmarkOptionsScreenshotSettings): Self = StObject.set(x, "screenshotSettings", value.asInstanceOf[js.Any])
    
    inline def setScreenshotSettingsUndefined: Self = StObject.set(x, "screenshotSettings", js.undefined)
    
    inline def setTakeScreenshot(value: Boolean): Self = StObject.set(x, "takeScreenshot", value.asInstanceOf[js.Any])
    
    inline def setTakeScreenshotUndefined: Self = StObject.set(x, "takeScreenshot", js.undefined)
  }
}
