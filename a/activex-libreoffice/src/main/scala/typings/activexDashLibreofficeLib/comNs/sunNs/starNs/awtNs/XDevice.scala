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

object XDevice {
  @scala.inline
  def apply(
    FontDescriptors: activexDashInteropLib.SafeArray[FontDescriptor],
    Info: DeviceInfo,
    acquire: js.Function0[scala.Unit],
    createBitmap: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, XBitmap],
    createDevice: js.Function2[scala.Double, scala.Double, XDevice],
    createDisplayBitmap: js.Function1[XBitmap, XDisplayBitmap],
    createGraphics: js.Function0[XGraphics],
    getFont: js.Function1[FontDescriptor, XFont],
    getFontDescriptors: js.Function0[activexDashInteropLib.SafeArray[FontDescriptor]],
    getInfo: js.Function0[DeviceInfo],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDevice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FontDescriptors")(FontDescriptors)
    __obj.updateDynamic("Info")(Info)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createBitmap")(createBitmap)
    __obj.updateDynamic("createDevice")(createDevice)
    __obj.updateDynamic("createDisplayBitmap")(createDisplayBitmap)
    __obj.updateDynamic("createGraphics")(createGraphics)
    __obj.updateDynamic("getFont")(getFont)
    __obj.updateDynamic("getFontDescriptors")(getFontDescriptors)
    __obj.updateDynamic("getInfo")(getInfo)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XDevice]
  }
}

