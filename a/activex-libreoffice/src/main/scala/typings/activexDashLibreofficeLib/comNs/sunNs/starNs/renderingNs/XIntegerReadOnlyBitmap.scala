package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a specialized interface for bitmaps having integer color channels. In contrast to {@link XIntegerBitmap} , this interface only permits
  * read-only access.
  *
  * Use this interface for e.g. bitmaps that are calculated on-the-fly, or that are pure functional, and thus cannot be modified.
  *
  * If you get passed an instance of {@link XIntegerReadOnlyBitmap} that also supports the {@link XVolatileBitmap} interface, things become a bit more
  * complicated. When reading data, one has to check for both {@link VolatileContentDestroyedException} and mismatching {@link IntegerBitmapLayout} return
  * values. If either of them occurs, the whole bitmap read operation should be repeated, if you need consistent information.
  */
trait XIntegerReadOnlyBitmap extends XBitmap {
  /**
    * Query the memory layout for this bitmap.
    *
    * Please note that for volatile bitmaps, the memory layout might change between subsequent calls.
    */
  val MemoryLayout: IntegerBitmapLayout
  /**
    * Query the raw data of this bitmap.
    *
    * Query the raw data of this bitmap, in the format as defined by {@link getMemoryLayout()} . With the given rectangle, a subset of the whole bitmap can
    * be queried. If the internal data format's pixel are not integer multiples of bytes (i.e. if one pixel occupies less than a byte), the leftover content
    * of the bytes at the right of each scanline is filled with zeros. The details of the scanline padding are to be retrieved from the passed bitmap
    * layout.
    *
    * Note that the bitmap memory layout might change over time for volatile bitmaps.
    * @param bitmapLayout The memory layout the returned data is in. Note that the color space returned therein needs to always match the current color space
    * @param rect A rectangle, within the bounds of the bitmap, to retrieve the consent from.
    * @throws VolatileContentDestroyedException if the bitmap is volatile, and the content has been destroyed by the system.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if parts of the given rectangle are outside the permissible bitmap area.
    */
  def getData(
    bitmapLayout: js.Array[IntegerBitmapLayout],
    rect: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerRectangle2D
  ): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * Query the memory layout for this bitmap.
    *
    * Please note that for volatile bitmaps, the memory layout might change between subsequent calls.
    */
  def getMemoryLayout(): IntegerBitmapLayout
  /**
    * Get a single pixel of the bitmap, returning its color value.
    *
    * If the internal data format's pixel are not integer multiples of bytes (i.e. if one pixel occupies less than a byte - the case of more than one byte
    * per pixel is not specified), the color value is returned in the least significant bits of the single byte returned as the color. The details of the
    * returned pixel data are to be retrieved from the passed bitmap layout.
    *
    * Note that the bitmap memory layout might change for volatile bitmaps.
    * @param bitmapLayout The memory layout the returned data is in. Note that the color space returned therein needs to always match the current color space
    * @param pos A position, within the bounds of the bitmap, to retrieve the color from.
    * @throws VolatileContentDestroyedException if the bitmap is volatile, and the content has been destroyed by the system.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given position is outside the permissible bitmap area.
    */
  def getPixel(
    bitmapLayout: js.Array[IntegerBitmapLayout],
    pos: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerPoint2D
  ): activexDashInteropLib.SafeArray[scala.Double]
}

object XIntegerReadOnlyBitmap {
  @scala.inline
  def apply(
    MemoryLayout: IntegerBitmapLayout,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D,
    acquire: js.Function0[scala.Unit],
    getData: js.Function2[
      js.Array[IntegerBitmapLayout], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerRectangle2D, 
      activexDashInteropLib.SafeArray[scala.Double]
    ],
    getMemoryLayout: js.Function0[IntegerBitmapLayout],
    getPixel: js.Function2[
      js.Array[IntegerBitmapLayout], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerPoint2D, 
      activexDashInteropLib.SafeArray[scala.Double]
    ],
    getScaledBitmap: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealSize2D, 
      scala.Boolean, 
      XBitmap
    ],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D],
    hasAlpha: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XIntegerReadOnlyBitmap = {
    val __obj = js.Dynamic.literal(MemoryLayout = MemoryLayout, Size = Size, acquire = acquire, getData = getData, getMemoryLayout = getMemoryLayout, getPixel = getPixel, getScaledBitmap = getScaledBitmap, getSize = getSize, hasAlpha = hasAlpha, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XIntegerReadOnlyBitmap]
  }
}

