package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BookmarkCreationOptions extends Object {
  /**
    * Indicates whether the extent of the current view will become the [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#extent) of a newly created bookmark. Default is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var captureExtent: js.UndefOr[Boolean] = js.native
  /**
    * An object that specifies the settings of the screenshot that will be used to create the bookmark's [thumbnail](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#thumbnail).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var screenshotSettings: js.UndefOr[BookmarkCreationOptionsScreenshotSettings] = js.native
  /**
    * Indicates whether a screenshot is taken when a new bookmark is created. The screenshot will be set as the [thumbnail](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#thumbnail) in the newly created bookmark. Default is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var takeScreenshot: js.UndefOr[Boolean] = js.native
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
  implicit class BookmarkCreationOptionsOps[Self <: BookmarkCreationOptions] (val x: Self) extends AnyVal {
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
    def setCaptureExtent(value: Boolean): Self = this.set("captureExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptureExtent: Self = this.set("captureExtent", js.undefined)
    @scala.inline
    def setScreenshotSettings(value: BookmarkCreationOptionsScreenshotSettings): Self = this.set("screenshotSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenshotSettings: Self = this.set("screenshotSettings", js.undefined)
    @scala.inline
    def setTakeScreenshot(value: Boolean): Self = this.set("takeScreenshot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTakeScreenshot: Self = this.set("takeScreenshot", js.undefined)
  }
  
}

