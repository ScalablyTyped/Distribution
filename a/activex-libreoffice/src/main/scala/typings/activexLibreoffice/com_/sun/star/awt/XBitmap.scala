package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
  val Size: typings.activexLibreoffice.com_.sun.star.awt.Size
  /** returns the device independent bitmap. */
  def getDIB(): SafeArray[Double]
  /** returns the transparency mask of the device independent bitmap. */
  def getMaskDIB(): SafeArray[Double]
  /** returns the size of the bitmap in pixel. */
  def getSize(): typings.activexLibreoffice.com_.sun.star.awt.Size
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
    val __obj = js.Dynamic.literal(DIB = DIB.asInstanceOf[js.Any], MaskDIB = MaskDIB.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDIB = js.Any.fromFunction0(getDIB), getMaskDIB = js.Any.fromFunction0(getMaskDIB), getSize = js.Any.fromFunction0(getSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XBitmap]
  }
}

