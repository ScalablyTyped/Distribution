package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a specialized interface for bitmaps containing IEEE doubles for their color components. In contrast to {@link XIeeeDoubleBitmap} , this
  * interface only permits read-only access.
  *
  * Use this interface for e.g. bitmaps that are calculated on-the-fly, or that are pure functional, and thus cannot be modified.
  *
  * If you get passed an instance of {@link XHalfFloatReadOnlyBitmap} that also supports the {@link XVolatileBitmap} interface, things become a bit more
  * complicated. When reading data, one has to check for both {@link VolatileContentDestroyedException} and mismatching {@link FloatingPointBitmapLayout}
  * return values. If either of them occurs, the whole bitmap read operation should be repeated.
  */
trait XIeeeDoubleReadOnlyBitmap extends XBitmap {
  /**
    * Query the memory layout for this bitmap.
    *
    * Please note that for volatile bitmaps, the memory layout might change between subsequent calls.
    */
  val MemoryLayout: FloatingPointBitmapLayout
  /**
    * Query the raw data of this bitmap.
    *
    * Query the raw data of this bitmap, in the format as defined by {@link getMemoryLayout()} . With the given rectangle, a subset of the whole bitmap can
    * be queried. When querying subsets of the bitmap, the same scanline padding takes place as when the whole bitmap is requested.
    *
    * Note that the bitmap memory layout might change for volatile bitmaps.
    * @param bitmapLayout The memory layout the returned data is in.
    * @param rect A rectangle, within the bounds of the bitmap, to retrieve the consent from.
    * @throws VolatileContentDestroyedException if the bitmap is volatile, and the content has been destroyed by the system.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if parts of the given rectangle are outside the permissible bitmap area.
    */
  def getData(
    bitmapLayout: js.Array[FloatingPointBitmapLayout],
    rect: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerRectangle2D
  ): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * Query the memory layout for this bitmap.
    *
    * Please note that for volatile bitmaps, the memory layout might change between subsequent calls.
    */
  def getMemoryLayout(): FloatingPointBitmapLayout
  /**
    * Get a single pixel of the bitmap, returning its color value.
    *
    * Note that the bitmap memory layout might change for volatile bitmaps.
    * @param bitmapLayout The memory layout the returned data is in.
    * @param pos A position, within the bounds of the bitmap, to retrieve the color from.
    * @throws VolatileContentDestroyedException if the bitmap is volatile, and the content has been destroyed by the system.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given position is outside the permissible bitmap area.
    */
  def getPixel(
    bitmapLayout: js.Array[FloatingPointBitmapLayout],
    pos: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerPoint2D
  ): activexDashInteropLib.SafeArray[scala.Double]
}

object XIeeeDoubleReadOnlyBitmap {
  @scala.inline
  def apply(
    MemoryLayout: FloatingPointBitmapLayout,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D,
    acquire: js.Function0[scala.Unit],
    getData: js.Function2[
      js.Array[FloatingPointBitmapLayout], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerRectangle2D, 
      activexDashInteropLib.SafeArray[scala.Double]
    ],
    getMemoryLayout: js.Function0[FloatingPointBitmapLayout],
    getPixel: js.Function2[
      js.Array[FloatingPointBitmapLayout], 
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
  ): XIeeeDoubleReadOnlyBitmap = {
    val __obj = js.Dynamic.literal(MemoryLayout = MemoryLayout, Size = Size, acquire = acquire, getData = getData, getMemoryLayout = getMemoryLayout, getPixel = getPixel, getScaledBitmap = getScaledBitmap, getSize = getSize, hasAlpha = hasAlpha, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XIeeeDoubleReadOnlyBitmap]
  }
}

