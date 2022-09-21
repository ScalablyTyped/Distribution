package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides information about a graphical output device and offers a factory for the **graphics** which provides write operations on the device. */
trait XDevice
  extends StObject
     with XInterface {
  
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
  
  inline def apply(
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
    queryInterface: `type` => Any,
    release: () => Unit
  ): XDevice = {
    val __obj = js.Dynamic.literal(FontDescriptors = FontDescriptors.asInstanceOf[js.Any], Info = Info.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createBitmap = js.Any.fromFunction4(createBitmap), createDevice = js.Any.fromFunction2(createDevice), createDisplayBitmap = js.Any.fromFunction1(createDisplayBitmap), createGraphics = js.Any.fromFunction0(createGraphics), getFont = js.Any.fromFunction1(getFont), getFontDescriptors = js.Any.fromFunction0(getFontDescriptors), getInfo = js.Any.fromFunction0(getInfo), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDevice]
  }
  
  extension [Self <: XDevice](x: Self) {
    
    inline def setCreateBitmap(value: (Double, Double, Double, Double) => XBitmap): Self = StObject.set(x, "createBitmap", js.Any.fromFunction4(value))
    
    inline def setCreateDevice(value: (Double, Double) => XDevice): Self = StObject.set(x, "createDevice", js.Any.fromFunction2(value))
    
    inline def setCreateDisplayBitmap(value: XBitmap => XDisplayBitmap): Self = StObject.set(x, "createDisplayBitmap", js.Any.fromFunction1(value))
    
    inline def setCreateGraphics(value: () => XGraphics): Self = StObject.set(x, "createGraphics", js.Any.fromFunction0(value))
    
    inline def setFontDescriptors(value: SafeArray[FontDescriptor]): Self = StObject.set(x, "FontDescriptors", value.asInstanceOf[js.Any])
    
    inline def setGetFont(value: FontDescriptor => XFont): Self = StObject.set(x, "getFont", js.Any.fromFunction1(value))
    
    inline def setGetFontDescriptors(value: () => SafeArray[FontDescriptor]): Self = StObject.set(x, "getFontDescriptors", js.Any.fromFunction0(value))
    
    inline def setGetInfo(value: () => DeviceInfo): Self = StObject.set(x, "getInfo", js.Any.fromFunction0(value))
    
    inline def setInfo(value: DeviceInfo): Self = StObject.set(x, "Info", value.asInstanceOf[js.Any])
  }
}
