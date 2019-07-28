package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides information about a graphical output device and offers a factory for the **graphics** which provides write operations on the device. */
trait XDevice extends XInterface {
  /** returns the list of available font descriptors. */
  val FontDescriptors: SafeArray[FontDescriptor]
  /** returns information about the device. */
  val Info: DeviceInfo
  /**
    * creates a bitmap with the current device depth.
    *
    * If the specified area does not lie entirely in the device, the bits outside are not specified.
    */
  def createBitmap(nX: Double, nY: Double, nWidth: Double, nHeight: Double): XBitmap
  /**
    * creates a new device which is compatible with this one.
    *
    * If the device does not support the GETBITS device capability, this method returns `NULL` .
    */
  def createDevice(nWidth: Double, nHeight: Double): XDevice
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
  def getFontDescriptors(): SafeArray[FontDescriptor]
  /** returns information about the device. */
  def getInfo(): DeviceInfo
}

object XDevice {
  @scala.inline
  def apply(
    FontDescriptors: SafeArray[FontDescriptor],
    Info: DeviceInfo,
    acquire: () => Unit,
    createBitmap: (Double, Double, Double, Double) => XBitmap,
    createDevice: (Double, Double) => XDevice,
    createDisplayBitmap: XBitmap => XDisplayBitmap,
    createGraphics: () => XGraphics,
    getFont: FontDescriptor => XFont,
    getFontDescriptors: () => SafeArray[FontDescriptor],
    getInfo: () => DeviceInfo,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDevice = {
    val __obj = js.Dynamic.literal(FontDescriptors = FontDescriptors, Info = Info, acquire = js.Any.fromFunction0(acquire), createBitmap = js.Any.fromFunction4(createBitmap), createDevice = js.Any.fromFunction2(createDevice), createDisplayBitmap = js.Any.fromFunction1(createDisplayBitmap), createGraphics = js.Any.fromFunction0(createGraphics), getFont = js.Any.fromFunction1(getFont), getFontDescriptors = js.Any.fromFunction0(getFontDescriptors), getInfo = js.Any.fromFunction0(getInfo), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDevice]
  }
}

