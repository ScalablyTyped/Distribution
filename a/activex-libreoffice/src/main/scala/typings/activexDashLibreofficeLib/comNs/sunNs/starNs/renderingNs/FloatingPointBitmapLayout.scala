package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure describes the memory layout of a bitmap having floating point color channels.
  *
  * This structure collects all necessary information to describe the memory layout of a bitmap having floating point color channels
  * @since OOo 2.0
  */
trait FloatingPointBitmapLayout extends js.Object {
  var ColorSpace: XColorSpace
  /**
    * Endianness of the pixel values.
    *
    * This value must be one of the Endianness constants
    */
  var Endianness: scala.Double
  /**
    * Format type of this bitmap.
    *
    * This value must be one of the {@link FloatingPointBitmapFormat} constants.
    */
  var Format: scala.Double
  /**
    * Number of color components per pixel.
    *
    * This value must not be negative
    */
  var NumComponents: scala.Double
  /**
    * Byte offset between the start of two consecutive planes.
    *
    * This value is permitted to be negative. If this value is zero, the bitmap is assumed to be in chunky format, otherwise it is assumed to be planar. The
    * difference between chunky and planar layout lies in the way how color channels are interleaved. For a chunky format, all channel data for a single
    * pixel lies consecutively in memory. For a planar layout, the first channel of all pixel is stored consecutive, followed by the second channel, and so
    * forth.
    */
  var PlaneStride: scala.Double
  /**
    * Number of data bytes per scanline.
    *
    * This value must not be negative
    */
  var ScanLineBytes: scala.Double
  /**
    * Byte offset between the start of two consecutive scanlines.
    *
    * This value is permitted to be negative, denoting a bitmap whose content is flipped at the x axis.
    */
  var ScanLineStride: scala.Double
  /**
    * Number of scanlines for this bitmap.
    *
    * This value must not be negative
    */
  var ScanLines: scala.Double
}

