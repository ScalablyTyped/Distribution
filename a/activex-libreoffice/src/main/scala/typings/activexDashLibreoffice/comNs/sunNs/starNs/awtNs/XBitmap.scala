package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides a bitmap in the Microsoft DIB format. */
trait XBitmap extends XInterface {
  /** returns the device independent bitmap. */
  val DIB: SafeArray[Double]
  /** returns the transparency mask of the device independent bitmap. */
  val MaskDIB: SafeArray[Double]
  /** returns the size of the bitmap in pixel. */
  val Size: typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
  /** returns the device independent bitmap. */
  def getDIB(): SafeArray[Double]
  /** returns the transparency mask of the device independent bitmap. */
  def getMaskDIB(): SafeArray[Double]
  /** returns the size of the bitmap in pixel. */
  def getSize(): typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
}

object XBitmap {
  @scala.inline
  def apply(
    DIB: SafeArray[Double],
    MaskDIB: SafeArray[Double],
    Size: Size,
    acquire: () => Unit,
    getDIB: () => SafeArray[Double],
    getMaskDIB: () => SafeArray[Double],
    getSize: () => Size,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XBitmap = {
    val __obj = js.Dynamic.literal(DIB = DIB, MaskDIB = MaskDIB, Size = Size, acquire = js.Any.fromFunction0(acquire), getDIB = js.Any.fromFunction0(getDIB), getMaskDIB = js.Any.fromFunction0(getMaskDIB), getSize = js.Any.fromFunction0(getSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XBitmap]
  }
}

