package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewTakeScreenshotOptions
  extends stdLib.Object {
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
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The height of the screenshot (defaults to the area height). The width will be derived automatically if left unspecified, according to the aspect ratio of the screenshot area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#takeScreenshot)
    */
  var height: js.UndefOr[scala.Double] = js.undefined
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
  var quality: js.UndefOr[scala.Double] = js.undefined
  /**
    * The width of the screenshot (defaults to the area width). The height will be derived automatically if left unspecified, according to the aspect ratio of the of the screenshot area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#takeScreenshot)
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object MapViewTakeScreenshotOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    area: MapViewTakeScreenshotOptionsArea = null,
    format: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    layers: js.Array[Layer] = null,
    quality: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): MapViewTakeScreenshotOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (area != null) __obj.updateDynamic("area")(area)
    if (format != null) __obj.updateDynamic("format")(format)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapViewTakeScreenshotOptions]
  }
}

