package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PictureMarkerSymbolProperties extends MarkerSymbolProperties {
  /**
    * The height of the image in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).  The maximum allowed height of a picture marker symbol is 200px. If you set any value higher than 200px, then the image will be scaled down to a height of 200px while preserving the aspect ratio of the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#height)
    *
    * @default 12
    */
  var height: js.UndefOr[Double | String] = js.undefined
  /**
    * The URL to an image or SVG document. To avoid CORS issues with this symbol, do one of the following:
    *   * Make certain that the [image](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#url) is hosted on a [CORS enabled server](https://enable-cors.org/server.html).
    *   * Use an [image](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#url) hosted on the same domain as the application.
    *   * Install a proxy.
    *
    *
    * > **Known Limitations**
    *   * Using this property to render SVG documents as images is not supported in IE11.
    *   * SVG documents must include a definition for width and height to load properly in Firefox.
    *   * Animated gif/png images are not supported. See the [Custom WebGL layer view](https://developers.arcgis.com/javascript/latest/sample-code/custom-gl-visuals/index.html) sample to learn how to accomplish this using WebGL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * The width of the image in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).  The maximum allowed width of a picture marker symbol is 200px. If you set any value higher than 200px, then the image will be scaled down to a width of 200px while preserving the aspect ratio of the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#width)
    *
    * @default 12
    */
  var width: js.UndefOr[Double | String] = js.undefined
}

object PictureMarkerSymbolProperties {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    color: Color | js.Array[Double] | String = null,
    height: Double | String = null,
    url: String = null,
    width: Double | String = null,
    xoffset: Double | String = null,
    yoffset: Double | String = null
  ): PictureMarkerSymbolProperties = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xoffset != null) __obj.updateDynamic("xoffset")(xoffset.asInstanceOf[js.Any])
    if (yoffset != null) __obj.updateDynamic("yoffset")(yoffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureMarkerSymbolProperties]
  }
}

