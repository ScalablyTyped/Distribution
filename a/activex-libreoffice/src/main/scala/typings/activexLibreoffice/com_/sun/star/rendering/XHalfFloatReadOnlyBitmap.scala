package typings.activexLibreoffice.com_.sun.star.rendering

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.geometry.IntegerPoint2D
import typings.activexLibreoffice.com_.sun.star.geometry.IntegerRectangle2D
import typings.activexLibreoffice.com_.sun.star.geometry.IntegerSize2D
import typings.activexLibreoffice.com_.sun.star.geometry.RealSize2D
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specialized interface for bitmaps containing half floats as their color components. Half floats are 16 bit wide, and some high-end GPUs already have
  * them as supported frame buffer format. In contrast to {@link XHalfFloatBitmap} , this interface only permits read-only access.
  *
  * Use this interface for e.g. bitmaps that are calculated on-the-fly, or that are pure functional, and thus cannot be modified.
  *
  * If you get passed an instance of {@link XHalfFloatReadOnlyBitmap} that also supports the {@link XVolatileBitmap} interface, things become a bit more
  * complicated. When reading data, one has to check for both {@link VolatileContentDestroyedException} and mismatching {@link FloatingPointBitmapLayout}
  * return values. If either of them occurs, the whole bitmap read operation should be repeated.
  */
@js.native
trait XHalfFloatReadOnlyBitmap extends XBitmap {
  /** Query the memory layout for this bitmap. */
  val MemoryLayout: FloatingPointBitmapLayout = js.native
  /**
    * Query the raw data of this bitmap.
    *
    * Query the raw data of this bitmap, in the format as defined by {@link getMemoryLayout()} . With the given rectangle, a subset of the whole bitmap can
    * be queried. When querying subsets of the bitmap, the same scanline padding takes place as when the whole bitmap is requested. Note: as we currently
    * have no 16 bit float UNO data type, the values are transported as 16 bit integers across the API (which requires casting on both sides).
    * @throws VolatileContentDestroyedException if the bitmap is volatile, and the content has been destroyed by the system.
    */
  def getData(rect: IntegerRectangle2D): SafeArray[Double] = js.native
  /** Query the memory layout for this bitmap. */
  def getMemoryLayout(): FloatingPointBitmapLayout = js.native
  /**
    * Get a single pixel of the bitmap, returning its color value.
    * @throws VolatileContentDestroyedException if the bitmap is volatile, and the content has been destroyed by the system.
    */
  def getPixel(pos: IntegerPoint2D): SafeArray[Double] = js.native
}

object XHalfFloatReadOnlyBitmap {
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
    release: () => Unit
  ): XHalfFloatReadOnlyBitmap = {
    val __obj = js.Dynamic.literal(MemoryLayout = MemoryLayout.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getData = js.Any.fromFunction1(getData), getMemoryLayout = js.Any.fromFunction0(getMemoryLayout), getPixel = js.Any.fromFunction1(getPixel), getScaledBitmap = js.Any.fromFunction2(getScaledBitmap), getSize = js.Any.fromFunction0(getSize), hasAlpha = js.Any.fromFunction0(hasAlpha), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XHalfFloatReadOnlyBitmap]
  }
  @scala.inline
  implicit class XHalfFloatReadOnlyBitmapOps[Self <: XHalfFloatReadOnlyBitmap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMemoryLayout(value: FloatingPointBitmapLayout): Self = this.set("MemoryLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetData(value: IntegerRectangle2D => SafeArray[Double]): Self = this.set("getData", js.Any.fromFunction1(value))
    @scala.inline
    def setGetMemoryLayout(value: () => FloatingPointBitmapLayout): Self = this.set("getMemoryLayout", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPixel(value: IntegerPoint2D => SafeArray[Double]): Self = this.set("getPixel", js.Any.fromFunction1(value))
  }
  
}

