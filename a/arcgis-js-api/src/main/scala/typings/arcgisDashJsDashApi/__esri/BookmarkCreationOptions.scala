package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkCreationOptions extends Object {
  /**
    * Indicates whether the extent of the current view will become the [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#extent) of a newly created bookmark. Default is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var captureExtent: js.UndefOr[Boolean] = js.undefined
  /**
    * An object that specifies the settings of the screenshot that will be used to create the bookmark's [thumbnail](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#thumbnail).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var screenshotSettings: js.UndefOr[BookmarkCreationOptionsScreenshotSettings] = js.undefined
  /**
    * Indicates whether a screenshot is taken when a new bookmark is created. The screenshot will be set as the [thumbnail](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#thumbnail) in the newly created bookmark. Default is `true`.
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
    propertyIsEnumerable: PropertyKey => Boolean,
    captureExtent: js.UndefOr[Boolean] = js.undefined,
    screenshotSettings: BookmarkCreationOptionsScreenshotSettings = null,
    takeScreenshot: js.UndefOr[Boolean] = js.undefined
  ): BookmarkCreationOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(captureExtent)) __obj.updateDynamic("captureExtent")(captureExtent)
    if (screenshotSettings != null) __obj.updateDynamic("screenshotSettings")(screenshotSettings)
    if (!js.isUndefined(takeScreenshot)) __obj.updateDynamic("takeScreenshot")(takeScreenshot)
    __obj.asInstanceOf[BookmarkCreationOptions]
  }
}

