package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides information about a graphical output device and offers a factory for the **graphics** which provides write operations on the device. */
trait XDevice
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the list of available font descriptors. */
  val FontDescriptors: activexDashInteropLib.SafeArray[FontDescriptor]
  /** returns information about the device. */
  val Info: DeviceInfo
  /**
    * creates a bitmap with the current device depth.
    *
    * If the specified area does not lie entirely in the device, the bits outside are not specified.
    */
  def createBitmap(nX: scala.Double, nY: scala.Double, nWidth: scala.Double, nHeight: scala.Double): XBitmap
  /**
    * creates a new device which is compatible with this one.
    *
    * If the device does not support the GETBITS device capability, this method returns `NULL` .
    */
  def createDevice(nWidth: scala.Double, nHeight: scala.Double): XDevice
  /**
    * creates a device compatible bitmap.
    *
    * The data of the bitmap is in process memory instead of in the device, so that the output operation is fast.
    */
  def createDisplayBitmap(Bitmap: XBitmap): XDisplayBitmap
  /** creates a new graphics whose output operation is directed to this device. */
  def createGraphics(): XGraphics
  /**
    * returns information about a font offered by this device.
    * @param aDescriptor specifies the description of a font. The unit of measure is pixel for this device.
    * @returns the font of this device.
    */
  def getFont(aDescriptor: FontDescriptor): XFont
  /** returns the list of available font descriptors. */
  def getFontDescriptors(): activexDashInteropLib.SafeArray[FontDescriptor]
  /** returns information about the device. */
  def getInfo(): DeviceInfo
}

