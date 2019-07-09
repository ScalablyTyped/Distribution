package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PixelBlock extends Accessor {
  /**
    * The height (or number of rows) of the PixelBlock in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#height)
    */
  var height: scala.Double = js.native
  /**
    * Bit Mask. All pixels are valid when mask is null.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#mask)
    */
  var mask: js.Array[scala.Double] | stdLib.Uint8Array = js.native
  /**
    * Indicates whether mask should be used as alpha values. If no (default), a pixel is valid when corresponding mask value is truthy
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#maskIsAlpha)
    */
  var maskIsAlpha: scala.Boolean = js.native
  /**
    * The pixel type.  **Possible Values:** s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#pixelType)
    */
  var pixelType: java.lang.String = js.native
  /**
    * A two dimensional array representing the pixels from the Image Service displayed on the client. The length of the first dimension is the same as the number of bands in the layer. The length of the second dimension is [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#height) * [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#width). The length of each band is the same. The pixels in each band are arranged row by row in this format: `[p_00, p_10, p_20, ... p_10, p_11, ...]` where `p_xy` is the pixel value at the column `x` and row `y`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#pixels)
    */
  var pixels: js.Array[scala.Double] | stdLib.Int8Array | stdLib.Uint8Array | stdLib.Uint8ClampedArray | stdLib.Int16Array | stdLib.Uint16Array | stdLib.Int32Array | stdLib.Uint32Array | stdLib.Float32Array | stdLib.Float64Array = js.native
  /**
    * An array of objects containing numeric statistical properties. Each object has the following specification if defined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#statistics)
    */
  var statistics: js.Array[PixelBlockStatistics] = js.native
  /**
    * Number of valid pixels
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#validPixelCount)
    */
  var validPixelCount: scala.Double = js.native
  /**
    * The width (or number of columns) of the PixelBlock in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#width)
    */
  var width: scala.Double = js.native
  /**
    * Adds another plane to the PixelBlock.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#addData)
    *
    * @param planeData The data to add to the PixelBlock.
    * @param planeData.pixels A two dimensional array representing the pixels to add.
    * @param planeData.statistics An array of objects containing numeric statistical properties. See [statistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#statistics) for details on the specifications of each object.
    *
    */
  def addData(planeData: PixelBlockAddDataPlaneData): scala.Unit = js.native
  /**
    * Returns pixels and masks using a single array in bip format (e.g. [p_00_r, p_00_g, p_00_b, p_00_a, p_10_r, p_10_g, p_10_b, p_10_a, .....]). Use this method to get an unsigned 8 bit pixel array. The result can be used to create a webgl texture.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#getAsRGBA)
    *
    *
    */
  def getAsRGBA(): stdLib.Uint8ClampedArray = js.native
  /**
    * Similar to [getAsRGBA](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#getAsRGBA), but returns floating point data. The result can be used to create a webgl texture (OES_texture_float).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#getAsRGBAFloat)
    *
    *
    */
  def getAsRGBAFloat(): stdLib.Float32Array = js.native
  /**
    * Returns the plane band count of the PixelBlock.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#getPlaneCount)
    *
    *
    */
  def getPlaneCount(): scala.Double = js.native
}

@JSGlobal("__esri.PixelBlock")
@js.native
class PixelBlockCls () extends PixelBlock {
  def this(properties: PixelBlockProperties) = this()
}

