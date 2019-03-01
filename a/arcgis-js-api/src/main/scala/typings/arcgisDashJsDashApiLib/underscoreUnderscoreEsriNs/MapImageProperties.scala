package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapImageProperties extends js.Object {
  /**
    * The extent of the exported map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.undefined
  /**
    * The requested image height in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#height)
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * URL to the returned image. The image format must be of a type supported by the HTML `<img>` tag.  **Possible Values:** gif | jpg | png | bmp
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#href)
    */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The opacity of the image. Value can be any number between `0` and `1` where `0` is 100% transparent, `0.5` is 50% transparent and `1` is fully opaque.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#opacity)
    *
    * @default 1
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Scale of the requested dynamic map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#scale)
    */
  var scale: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates if the requested image is visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#visible)
    *
    * @default true
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The requested image width in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#width)
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object MapImageProperties {
  @scala.inline
  def apply(
    extent: ExtentProperties = null,
    height: scala.Int | scala.Double = null,
    href: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    scale: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): MapImageProperties = {
    val __obj = js.Dynamic.literal()
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapImageProperties]
  }
}

