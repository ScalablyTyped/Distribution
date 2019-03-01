package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specialized interface for bitmaps containing half floats as their color components.
  *
  * Half floats are 16 bit wide, and newer GPUs already have them as supported frame buffer format.
  */
trait XHalfFloatBitmap extends XHalfFloatReadOnlyBitmap {
  /**
    * Set raw data of a bitmap.
    *
    * Set raw data of a bitmap, in the format as defined by {@link getMemoryLayout()} . With the given rectangle, a subset of the bitmap can be changed.
    * When setting subsets of the bitmap, the same scanline padding takes place as when the whole bitmap is changed.
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
    * IllegalArgumentException, if the memory layout changed between a call to {@link getMemoryLayout()} and {@link setData()} .
    */
  def setPixel(
    color: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double],
    bitmapLayout: FloatingPointBitmapLayout,
    pos: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerPoint2D
  ): scala.Unit
}

object XHalfFloatBitmap {
  @scala.inline
  def apply(
    MemoryLayout: FloatingPointBitmapLayout,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D,
    acquire: js.Function0[scala.Unit],
    getData: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerRectangle2D, 
      activexDashInteropLib.SafeArray[scala.Double]
    ],
    getMemoryLayout: js.Function0[FloatingPointBitmapLayout],
    getPixel: js.Function1[
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
    release: js.Function0[scala.Unit],
    setData: js.Function3[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      FloatingPointBitmapLayout, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerRectangle2D, 
      scala.Unit
    ],
    setPixel: js.Function3[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      FloatingPointBitmapLayout, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerPoint2D, 
      scala.Unit
    ]
  ): XHalfFloatBitmap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MemoryLayout")(MemoryLayout)
    __obj.updateDynamic("Size")(Size)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getData")(getData)
    __obj.updateDynamic("getMemoryLayout")(getMemoryLayout)
    __obj.updateDynamic("getPixel")(getPixel)
    __obj.updateDynamic("getScaledBitmap")(getScaledBitmap)
    __obj.updateDynamic("getSize")(getSize)
    __obj.updateDynamic("hasAlpha")(hasAlpha)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setData")(setData)
    __obj.updateDynamic("setPixel")(setPixel)
    __obj.asInstanceOf[XHalfFloatBitmap]
  }
}

