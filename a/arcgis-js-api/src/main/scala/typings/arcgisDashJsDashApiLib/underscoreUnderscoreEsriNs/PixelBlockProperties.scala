package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PixelBlockProperties extends js.Object {
  /**
    * The height (or number of rows) of the PixelBlock in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#height)
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * An array of numbers representing pixels to show and pixels to hide from the view. The length of this array is [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#height) * [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#width). It's arranged row by row in this format: `[p_00, p_10, p_20, ... p_10, p_11, .....]` where `p_xy` is the pixel value at the column `x` and row `y`.  The mask is per pixel, not per band. Items in the mask array with a value of `0` indicates [pixels](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#pixels) to not display in the view at that index. Items with a value of `1` indicate to display the [pixels](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#pixels) at there corresponding indices.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#mask)
    */
  var mask: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * The pixel type.  **Possible Values:** s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#pixelType)
    */
  var pixelType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A two dimensional array representing the pixels from the Image Service displayed on the client. The length of the first dimension is the same as the number of bands in the layer. The length of the second dimension is [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#height) * [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#width). The length of each band is the same. The pixels in each band are arranged row by row in this format: `[p_00, p_10, p_20, ... p_10, p_11, ...]` where `p_xy` is the pixel value at the column `x` and row `y`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#pixels)
    */
  var pixels: js.UndefOr[js.Array[js.Array[scala.Double]]] = js.undefined
  /**
    * An array of objects containing numeric statistical properties. Each object has the following specification if defined:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#statistics)
    */
  var statistics: js.UndefOr[js.Array[PixelBlockStatistics]] = js.undefined
  /**
    * The width (or number of columns) of the PixelBlock in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#width)
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object PixelBlockProperties {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    mask: js.Array[scala.Double] = null,
    pixelType: java.lang.String = null,
    pixels: js.Array[js.Array[scala.Double]] = null,
    statistics: js.Array[PixelBlockStatistics] = null,
    width: scala.Int | scala.Double = null
  ): PixelBlockProperties = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask)
    if (pixelType != null) __obj.updateDynamic("pixelType")(pixelType)
    if (pixels != null) __obj.updateDynamic("pixels")(pixels)
    if (statistics != null) __obj.updateDynamic("statistics")(statistics)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PixelBlockProperties]
  }
}

