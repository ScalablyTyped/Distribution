package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specialized interface for bitmaps containing IEEE floats as their color components. */
trait XIeeeFloatBitmap extends XIeeeFloatReadOnlyBitmap {
  /**
    * Set raw data of a bitmap.
    *
    * Set raw data of a bitmap, in the format as defined by {@link getMemoryLayout()} . With the given rectangle, a subset of the bitmap can be changed.
    * When setting subsets of the bitmap, the same scanline padding takes place as when the whole bitmap is changed.
    *
    * When setting data on volatile bitmaps, always call isValid() before, and retrieve a new memory layout via {@link getMemoryLayout()} . At least under
    * Windows, the memory layout can change for the same bitmap, if the user e.g. switches the screen resolution. Thus, this method will throw an
    * IllegalArgumentException, if the memory layout changed between a call to {@link getMemoryLayout()} and {@link setData()} .
    * @param data Data to set
    * @param bitmapLayout Layout of the data to set. Must match this bitmap's current layout.
    * @param rect Destination rectangle, within the bounds of the bitmap, to set the data in.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if parts of the given rectangle are outside the permissible bitmap area.
    * @throws com::sun::star::lang::IllegalArgumentException if the given memory layout does not match this bitmap's layout, or if the given data sequence has
    */
  def setData(
    data: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double],
    bitmapLayout: FloatingPointBitmapLayout,
    rect: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerRectangle2D
  ): scala.Unit
  /**
    * Set a single pixel of the bitmap with the given color value.
    *
    * When setting data on volatile bitmaps, always call isValid() before, and retrieve a new memory layout via {@link getMemoryLayout()} . At least under
    * Windows, the memory layout can change for the same bitmap, if the user e.g. switches the screen resolution. Thus, this method will throw an
    * IllegalArgumentException, if the memory layout changed between a call to {@link getMemoryLayout()} and {@link setPixel()} .
    * @param color The color value(s) to set
    * @param bitmapLayout Layout of the color elements to set. Must match this bitmap's current layout.
    * @param pos Pixel position with the bounds of the bitmap to set.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given point is outside the permissible bitmap area.
    * @throws com::sun::star::lang::IllegalArgumentException if the given memory layout does not match this bitmap's layout, or if the given data sequence has
    */
  def setPixel(
    color: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double],
    bitmapLayout: FloatingPointBitmapLayout,
    pos: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerPoint2D
  ): scala.Unit
}

