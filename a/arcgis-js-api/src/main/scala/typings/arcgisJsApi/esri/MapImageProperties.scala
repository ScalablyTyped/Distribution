package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.bmp
import typings.arcgisJsApi.arcgisJsApiStrings.gif
import typings.arcgisJsApi.arcgisJsApiStrings.jpg
import typings.arcgisJsApi.arcgisJsApiStrings.png
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
  var height: js.UndefOr[Double] = js.undefined
  /**
    * URL to the returned image. The image format must be of a type supported by the HTML `<img>` tag.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#href)
    */
  var href: js.UndefOr[gif | jpg | png | bmp] = js.undefined
  /**
    * The opacity of the image. Value can be any number between `0` and `1` where `0` is 100% transparent, `0.5` is 50% transparent and `1` is fully opaque.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#opacity)
    *
    * @default 1
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * Scale of the requested dynamic map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#scale)
    */
  var scale: js.UndefOr[Double] = js.undefined
  /**
    * Indicates if the requested image is visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#visible)
    *
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * The requested image width in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#width)
    */
  var width: js.UndefOr[Double] = js.undefined
}

object MapImageProperties {
  @scala.inline
  def apply(
    extent: ExtentProperties = null,
    height: js.UndefOr[Double] = js.undefined,
    href: gif | jpg | png | bmp = null,
    opacity: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): MapImageProperties = {
    val __obj = js.Dynamic.literal()
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapImageProperties]
  }
}

