package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewTakeScreenshotOptions extends Object {
  /**
    * Specifies whether to take a screenshot of a specific area of the view. The area coordinates are relative to the origin of the padded view (see [padding](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#padding)) and will be clipped to the view size. Defaults to the whole view (padding excluded).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#takeScreenshot)
    */
  var area: js.UndefOr[SceneViewTakeScreenshotOptionsArea] = js.undefined
  /**
    * The format of the resulting encoded data url.  **Possible values**: jpg | png.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#takeScreenshot)
    *
    * @default jpg
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * The height of the screenshot (defaults to the area height). The width will be derived automatically if left unspecified, according to the aspect ratio of the screenshot area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#takeScreenshot)
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Indicates whether view padding should be ignored. Set this property to `true` to allow padded areas to be included in the screenshot.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#takeScreenshot)
    */
  var ignorePadding: js.UndefOr[Boolean] = js.undefined
  /**
    * The quality (0 to 100) of the encoded image when encoding as `jpg`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#takeScreenshot)
    *
    * @default 98
    */
  var quality: js.UndefOr[Double] = js.undefined
  /**
    * The width of the screenshot (defaults to the area width). The height will be derived automatically if left unspecified, according to the aspect ratio of the of the screenshot area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#takeScreenshot)
    */
  var width: js.UndefOr[Double] = js.undefined
}

object SceneViewTakeScreenshotOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    area: SceneViewTakeScreenshotOptionsArea = null,
    format: String = null,
    height: Int | Double = null,
    ignorePadding: js.UndefOr[Boolean] = js.undefined,
    quality: Int | Double = null,
    width: Int | Double = null
  ): SceneViewTakeScreenshotOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (area != null) __obj.updateDynamic("area")(area)
    if (format != null) __obj.updateDynamic("format")(format)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(ignorePadding)) __obj.updateDynamic("ignorePadding")(ignorePadding)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewTakeScreenshotOptions]
  }
}

