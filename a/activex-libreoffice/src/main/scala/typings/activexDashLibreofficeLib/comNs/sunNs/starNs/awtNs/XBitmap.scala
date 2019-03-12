package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides a bitmap in the Microsoft DIB format. */
trait XBitmap
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the device independent bitmap. */
  val DIB: stdLib.SafeArray[scala.Double]
  /** returns the transparency mask of the device independent bitmap. */
  val MaskDIB: stdLib.SafeArray[scala.Double]
  /** returns the size of the bitmap in pixel. */
  val Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /** returns the device independent bitmap. */
  def getDIB(): stdLib.SafeArray[scala.Double]
  /** returns the transparency mask of the device independent bitmap. */
  def getMaskDIB(): stdLib.SafeArray[scala.Double]
  /** returns the size of the bitmap in pixel. */
  def getSize(): Size
}

object XBitmap {
  @scala.inline
  def apply(
    DIB: stdLib.SafeArray[scala.Double],
    MaskDIB: stdLib.SafeArray[scala.Double],
    Size: Size,
    acquire: () => scala.Unit,
    getDIB: () => stdLib.SafeArray[scala.Double],
    getMaskDIB: () => stdLib.SafeArray[scala.Double],
    getSize: () => Size,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XBitmap = {
    val __obj = js.Dynamic.literal(DIB = DIB, MaskDIB = MaskDIB, Size = Size, acquire = js.Any.fromFunction0(acquire), getDIB = js.Any.fromFunction0(getDIB), getMaskDIB = js.Any.fromFunction0(getMaskDIB), getSize = js.Any.fromFunction0(getSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XBitmap]
  }
}

