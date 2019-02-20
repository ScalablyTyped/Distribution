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

