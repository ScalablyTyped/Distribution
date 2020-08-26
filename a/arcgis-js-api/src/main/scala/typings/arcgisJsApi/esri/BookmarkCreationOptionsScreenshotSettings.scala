package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BookmarkCreationOptionsScreenshotSettings extends Object {
  /**
    * Used to take a screenshot of a subregion of the view. Defaults to the whole view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var area: js.UndefOr[BookmarkCreationOptionsScreenshotSettingsArea] = js.native
  /**
    * The height (in pixels) of the screenshot. Default is `128px`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * An optional list of layers to be included in the screenshot.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var layers: js.UndefOr[js.Array[Layer]] = js.native
  /**
    * The width (in pixels) of the screenshot. Default is `128px`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var width: js.UndefOr[Double] = js.native
}

object BookmarkCreationOptionsScreenshotSettings {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): BookmarkCreationOptionsScreenshotSettings = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[BookmarkCreationOptionsScreenshotSettings]
  }
  @scala.inline
  implicit class BookmarkCreationOptionsScreenshotSettingsOps[Self <: BookmarkCreationOptionsScreenshotSettings] (val x: Self) extends AnyVal {
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
    def setArea(value: BookmarkCreationOptionsScreenshotSettingsArea): Self = this.set("area", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArea: Self = this.set("area", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLayersVarargs(value: Layer*): Self = this.set("layers", js.Array(value :_*))
    @scala.inline
    def setLayers(value: js.Array[Layer]): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

