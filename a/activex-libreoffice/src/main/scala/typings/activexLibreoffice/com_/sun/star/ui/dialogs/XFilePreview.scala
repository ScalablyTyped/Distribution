package typings.activexLibreoffice.com_.sun.star.ui.dialogs

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** {@link FilePicker} that support the preview of various file formats should implement this interface. */
@js.native
trait XFilePreview extends XInterface {
  
  /**
    * The method returns the available height of the preview window even if the window is invisible or could not be created. If a service implementation
    * doesn't support a file preview 0 will be returned.
    * @returns The height of the preview window in pixel.
    */
  val AvailableHeight: Double = js.native
  
  /**
    * The method returns the available width of the preview window even if the window is invisible or could not be created. If a service implementation
    * doesn't support a file preview 0 will be returned.
    * @returns The width of the preview window in pixel.
    */
  val AvailableWidth: Double = js.native
  
  /**
    * Returns the current show state of the preview.
    * @returns A value of `TRUE` if the preview window is visible. A value of `FALSE` if the preview window is invisible.
    */
  var ShowState: Boolean = js.native
  
  /**
    * The method returns all image formats that the preview supports.
    * @returns A sequence of all supported preview formats
    * @see com.sun.star.ui.dialogs.FilePreviewImageFormats
    */
  val SupportedImageFormats: SafeArray[Double] = js.native
  
  /**
    * The method returns the supported color depth of the target device.
    * @returns The color depth in bit, e.g. 8 bit, 16 bit, 32 bit.
    */
  val TargetColorDepth: Color = js.native
  
  /**
    * The method returns the available height of the preview window even if the window is invisible or could not be created. If a service implementation
    * doesn't support a file preview 0 will be returned.
    * @returns The height of the preview window in pixel.
    */
  def getAvailableHeight(): Double = js.native
  
  /**
    * The method returns the available width of the preview window even if the window is invisible or could not be created. If a service implementation
    * doesn't support a file preview 0 will be returned.
    * @returns The width of the preview window in pixel.
    */
  def getAvailableWidth(): Double = js.native
  
  /**
    * Returns the current show state of the preview.
    * @returns A value of `TRUE` if the preview window is visible. A value of `FALSE` if the preview window is invisible.
    */
  def getShowState(): Boolean = js.native
  
  /**
    * The method returns all image formats that the preview supports.
    * @returns A sequence of all supported preview formats
    * @see com.sun.star.ui.dialogs.FilePreviewImageFormats
    */
  def getSupportedImageFormats(): SafeArray[Double] = js.native
  
  /**
    * The method returns the supported color depth of the target device.
    * @returns The color depth in bit, e.g. 8 bit, 16 bit, 32 bit.
    */
  def getTargetColorDepth(): Color = js.native
  
  /**
    * Sets a new image. If the preview is currently hidden the image will be ignored. An empty any will clear the preview window.
    * @param aImageFormat Specifies the format of the data that will be delivered
    * @param aImage The image data, the image format defines how the image data have to be delivered
    * @see com.sun.star.ui.dialogs.FilePreviewImageFormats
    * @throws com::sun::star::lang::IllegalArgumentException If the specified image format is invalid or not supported by the preview implementation
    */
  def setImage(aImageFormat: Double, aImage: js.Any): Unit = js.native
  
  /**
    * Optionally sets the current show state of the preview. It is possible that the preview implementation doesn't support hiding the preview.
    * @param bShowState A value of `TRUE` shows the preview window. A value of `FALSE` hides the preview window.
    * @returns A value of `TRUE` on success. A value of `FALSE` if the operation fails for any reason or the preview implementation doesn't support hiding the p
    */
  def setShowState(bShowState: Boolean): Boolean = js.native
}
object XFilePreview {
  
  @scala.inline
  def apply(
    AvailableHeight: Double,
    AvailableWidth: Double,
    ShowState: Boolean,
    SupportedImageFormats: SafeArray[Double],
    TargetColorDepth: Color,
    acquire: () => Unit,
    getAvailableHeight: () => Double,
    getAvailableWidth: () => Double,
    getShowState: () => Boolean,
    getSupportedImageFormats: () => SafeArray[Double],
    getTargetColorDepth: () => Color,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setImage: (Double, js.Any) => Unit,
    setShowState: Boolean => Boolean
  ): XFilePreview = {
    val __obj = js.Dynamic.literal(AvailableHeight = AvailableHeight.asInstanceOf[js.Any], AvailableWidth = AvailableWidth.asInstanceOf[js.Any], ShowState = ShowState.asInstanceOf[js.Any], SupportedImageFormats = SupportedImageFormats.asInstanceOf[js.Any], TargetColorDepth = TargetColorDepth.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAvailableHeight = js.Any.fromFunction0(getAvailableHeight), getAvailableWidth = js.Any.fromFunction0(getAvailableWidth), getShowState = js.Any.fromFunction0(getShowState), getSupportedImageFormats = js.Any.fromFunction0(getSupportedImageFormats), getTargetColorDepth = js.Any.fromFunction0(getTargetColorDepth), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setImage = js.Any.fromFunction2(setImage), setShowState = js.Any.fromFunction1(setShowState))
    __obj.asInstanceOf[XFilePreview]
  }
  
  @scala.inline
  implicit class XFilePreviewMutableBuilder[Self <: XFilePreview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableHeight(value: Double): Self = StObject.set(x, "AvailableHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableWidth(value: Double): Self = StObject.set(x, "AvailableWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAvailableHeight(value: () => Double): Self = StObject.set(x, "getAvailableHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAvailableWidth(value: () => Double): Self = StObject.set(x, "getAvailableWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetShowState(value: () => Boolean): Self = StObject.set(x, "getShowState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSupportedImageFormats(value: () => SafeArray[Double]): Self = StObject.set(x, "getSupportedImageFormats", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTargetColorDepth(value: () => Color): Self = StObject.set(x, "getTargetColorDepth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetImage(value: (Double, js.Any) => Unit): Self = StObject.set(x, "setImage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetShowState(value: Boolean => Boolean): Self = StObject.set(x, "setShowState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowState(value: Boolean): Self = StObject.set(x, "ShowState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedImageFormats(value: SafeArray[Double]): Self = StObject.set(x, "SupportedImageFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetColorDepth(value: Color): Self = StObject.set(x, "TargetColorDepth", value.asInstanceOf[js.Any])
  }
}
