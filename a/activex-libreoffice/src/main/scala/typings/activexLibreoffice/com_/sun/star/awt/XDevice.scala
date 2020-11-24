package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides information about a graphical output device and offers a factory for the **graphics** which provides write operations on the device. */
@js.native
trait XDevice extends XInterface {
  
  /** returns the list of available font descriptors. */
  val FontDescriptors: SafeArray[FontDescriptor] = js.native
  
  /** returns information about the device. */
  val Info: DeviceInfo = js.native
  
  /**
    * creates a bitmap with the current device depth.
    *
    * If the specified area does not lie entirely in the device, the bits outside are not specified.
    */
  def createBitmap(nX: Double, nY: Double, nWidth: Double, nHeight: Double): XBitmap = js.native
  
  /**
    * creates a new device which is compatible with this one.
    *
    * If the device does not support the GETBITS device capability, this method returns `NULL` .
    */
  def createDevice(nWidth: Double, nHeight: Double): XDevice = js.native
  
  /**
    * creates a device compatible bitmap.
    *
    * The data of the bitmap is in process memory instead of in the device, so that the output operation is fast.
    */
  def createDisplayBitmap(Bitmap: XBitmap): XDisplayBitmap = js.native
  
  /** creates a new graphics whose output operation is directed to this device. */
  def createGraphics(): XGraphics = js.native
  
  /**
    * returns information about a font offered by this device.
    * @param aDescriptor specifies the description of a font. The unit of measure is pixel for this device.
    * @returns the font of this device.
    */
  def getFont(aDescriptor: FontDescriptor): XFont = js.native
  
  /** returns the list of available font descriptors. */
  def getFontDescriptors(): SafeArray[FontDescriptor] = js.native
  
  /** returns information about the device. */
  def getInfo(): DeviceInfo = js.native
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
    val __obj = js.Dynamic.literal(FontDescriptors = FontDescriptors.asInstanceOf[js.Any], Info = Info.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createBitmap = js.Any.fromFunction4(createBitmap), createDevice = js.Any.fromFunction2(createDevice), createDisplayBitmap = js.Any.fromFunction1(createDisplayBitmap), createGraphics = js.Any.fromFunction0(createGraphics), getFont = js.Any.fromFunction1(getFont), getFontDescriptors = js.Any.fromFunction0(getFontDescriptors), getInfo = js.Any.fromFunction0(getInfo), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDevice]
  }
  
  @scala.inline
  implicit class XDeviceOps[Self <: XDevice] (val x: Self) extends AnyVal {
    
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
    def setFontDescriptors(value: SafeArray[FontDescriptor]): Self = this.set("FontDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: DeviceInfo): Self = this.set("Info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateBitmap(value: (Double, Double, Double, Double) => XBitmap): Self = this.set("createBitmap", js.Any.fromFunction4(value))
    
    @scala.inline
    def setCreateDevice(value: (Double, Double) => XDevice): Self = this.set("createDevice", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateDisplayBitmap(value: XBitmap => XDisplayBitmap): Self = this.set("createDisplayBitmap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateGraphics(value: () => XGraphics): Self = this.set("createGraphics", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFont(value: FontDescriptor => XFont): Self = this.set("getFont", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFontDescriptors(value: () => SafeArray[FontDescriptor]): Self = this.set("getFontDescriptors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInfo(value: () => DeviceInfo): Self = this.set("getInfo", js.Any.fromFunction0(value))
  }
}
