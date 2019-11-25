package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkCreationOptionsScreenshotSettings extends Object {
  /**
    * Used to take a screenshot of a subregion of the view. Defaults to the whole view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var area: js.UndefOr[BookmarkCreationOptionsScreenshotSettingsArea] = js.undefined
  /**
    * The height (in pixels) of the screenshot. Default is `128px`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * An optional list of layers to be included in the screenshot.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var layers: js.UndefOr[js.Array[Layer]] = js.undefined
  /**
    * The width (in pixels) of the screenshot. Default is `128px`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var width: js.UndefOr[Double] = js.undefined
}

object BookmarkCreationOptionsScreenshotSettings {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    area: BookmarkCreationOptionsScreenshotSettingsArea = null,
    height: Int | Double = null,
    layers: js.Array[Layer] = null,
    width: Int | Double = null
  ): BookmarkCreationOptionsScreenshotSettings = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarkCreationOptionsScreenshotSettings]
  }
}

