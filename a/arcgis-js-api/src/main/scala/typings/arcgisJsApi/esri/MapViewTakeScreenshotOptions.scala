package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewTakeScreenshotOptions extends Object {
  /**
    * Specifies whether to take a screenshot of a specific area of the view. The area coordinates are relative to the origin of the padded view (see [padding](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#padding)) and will be clipped to the view size. Defaults to the whole view (padding excluded).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#takeScreenshot)
    */
  var area: js.UndefOr[MapViewTakeScreenshotOptionsArea] = js.undefined
  /**
    * The format of the resulting encoded data url.  **Possible values**: jpg | png.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#takeScreenshot)
    *
    * @default jpg
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * The height of the screenshot (defaults to the area height). The width will be derived automatically if left unspecified, according to the aspect ratio of the screenshot area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#takeScreenshot)
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Indicates whether to ignore the background color set in the [initial view properties](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#initialViewProperties) of the web map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#takeScreenshot)
    *
    * @default false
    */
  var ignoreBackground: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether view padding should be ignored. Set this property to `true` to allow padded areas to be included in the screenshot.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#takeScreenshot)
    *
    * @default false
    */
  var ignorePadding: js.UndefOr[Boolean] = js.undefined
  /**
    * When used, only the visible layers in this list will be included in the output.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#takeScreenshot)
    */
  var layers: js.UndefOr[js.Array[Layer]] = js.undefined
  /**
    * The quality (0 to 100) of the encoded image when encoding as `jpg`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#takeScreenshot)
    *
    * @default 98
    */
  var quality: js.UndefOr[Double] = js.undefined
  /**
    * The width of the screenshot (defaults to the area width). The height will be derived automatically if left unspecified, according to the aspect ratio of the of the screenshot area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#takeScreenshot)
    */
  var width: js.UndefOr[Double] = js.undefined
}

object MapViewTakeScreenshotOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    area: MapViewTakeScreenshotOptionsArea = null,
    format: String = null,
    height: js.UndefOr[Double] = js.undefined,
    ignoreBackground: js.UndefOr[Boolean] = js.undefined,
    ignorePadding: js.UndefOr[Boolean] = js.undefined,
    layers: js.Array[Layer] = null,
    quality: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): MapViewTakeScreenshotOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreBackground)) __obj.updateDynamic("ignoreBackground")(ignoreBackground.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignorePadding)) __obj.updateDynamic("ignorePadding")(ignorePadding.get.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapViewTakeScreenshotOptions]
  }
}

