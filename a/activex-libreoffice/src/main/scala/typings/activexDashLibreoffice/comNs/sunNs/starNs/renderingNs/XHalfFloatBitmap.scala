package typings.activexDashLibreoffice.comNs.sunNs.starNs.renderingNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.geometryNs.IntegerPoint2D
import typings.activexDashLibreoffice.comNs.sunNs.starNs.geometryNs.IntegerRectangle2D
import typings.activexDashLibreoffice.comNs.sunNs.starNs.geometryNs.IntegerSize2D
import typings.activexDashLibreoffice.comNs.sunNs.starNs.geometryNs.RealSize2D
import typings.std.SafeArray
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
  def setData(data: SeqEquiv[Double], bitmapLayout: FloatingPointBitmapLayout, rect: IntegerRectangle2D): Unit
  /**
    * Set a single pixel of the bitmap with the given color value.
    *
    * When setting data on volatile bitmaps, always call isValid() before, and retrieve a new memory layout via {@link getMemoryLayout()} . At least under
    * Windows, the memory layout can change for the same bitmap, if the user e.g. switches the screen resolution. Thus, this method will throw an
    * IllegalArgumentException, if the memory layout changed between a call to {@link getMemoryLayout()} and {@link setData()} .
    */
  def setPixel(color: SeqEquiv[Double], bitmapLayout: FloatingPointBitmapLayout, pos: IntegerPoint2D): Unit
}

object XHalfFloatBitmap {
  @scala.inline
  def apply(
    MemoryLayout: FloatingPointBitmapLayout,
    Size: IntegerSize2D,
    acquire: () => Unit,
    getData: IntegerRectangle2D => SafeArray[Double],
    getMemoryLayout: () => FloatingPointBitmapLayout,
    getPixel: IntegerPoint2D => SafeArray[Double],
    getScaledBitmap: (RealSize2D, Boolean) => XBitmap,
    getSize: () => IntegerSize2D,
    hasAlpha: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setData: (SeqEquiv[Double], FloatingPointBitmapLayout, IntegerRectangle2D) => Unit,
    setPixel: (SeqEquiv[Double], FloatingPointBitmapLayout, IntegerPoint2D) => Unit
  ): XHalfFloatBitmap = {
    val __obj = js.Dynamic.literal(MemoryLayout = MemoryLayout, Size = Size, acquire = js.Any.fromFunction0(acquire), getData = js.Any.fromFunction1(getData), getMemoryLayout = js.Any.fromFunction0(getMemoryLayout), getPixel = js.Any.fromFunction1(getPixel), getScaledBitmap = js.Any.fromFunction2(getScaledBitmap), getSize = js.Any.fromFunction0(getSize), hasAlpha = js.Any.fromFunction0(hasAlpha), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setData = js.Any.fromFunction3(setData), setPixel = js.Any.fromFunction3(setPixel))
  
    __obj.asInstanceOf[XHalfFloatBitmap]
  }
}

