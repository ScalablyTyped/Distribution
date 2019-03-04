package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides a bitmap in the Microsoft DIB format. */
trait XBitmap
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the device independent bitmap. */
  val DIB: activexDashInteropLib.SafeArray[scala.Double]
  /** returns the transparency mask of the device independent bitmap. */
  val MaskDIB: activexDashInteropLib.SafeArray[scala.Double]
  /** returns the size of the bitmap in pixel. */
  val Size: Size
  /** returns the device independent bitmap. */
  def getDIB(): activexDashInteropLib.SafeArray[scala.Double]
  /** returns the transparency mask of the device independent bitmap. */
  def getMaskDIB(): activexDashInteropLib.SafeArray[scala.Double]
  /** returns the size of the bitmap in pixel. */
  def getSize(): Size
}

object XBitmap {
  @scala.inline
  def apply(
    DIB: activexDashInteropLib.SafeArray[scala.Double],
    MaskDIB: activexDashInteropLib.SafeArray[scala.Double],
    Size: Size,
    acquire: js.Function0[scala.Unit],
    getDIB: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getMaskDIB: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getSize: js.Function0[Size],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XBitmap = {
    val __obj = js.Dynamic.literal(DIB = DIB, MaskDIB = MaskDIB, Size = Size, acquire = acquire, getDIB = getDIB, getMaskDIB = getMaskDIB, getSize = getSize, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XBitmap]
  }
}

