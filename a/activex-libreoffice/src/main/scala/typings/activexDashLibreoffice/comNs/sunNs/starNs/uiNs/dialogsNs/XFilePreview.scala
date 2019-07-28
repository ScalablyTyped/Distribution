package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs.dialogsNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** {@link FilePicker} that support the preview of various file formats should implement this interface. */
trait XFilePreview extends XInterface {
  /**
    * The method returns the available height of the preview window even if the window is invisible or could not be created. If a service implementation
    * doesn't support a file preview 0 will be returned.
    * @returns The height of the preview window in pixel.
    */
  val AvailableHeight: Double
  /**
    * The method returns the available width of the preview window even if the window is invisible or could not be created. If a service implementation
    * doesn't support a file preview 0 will be returned.
    * @returns The width of the preview window in pixel.
    */
  val AvailableWidth: Double
  /**
    * Returns the current show state of the preview.
    * @returns A value of `TRUE` if the preview window is visible. A value of `FALSE` if the preview window is invisible.
    */
  var ShowState: Boolean
  /**
    * The method returns all image formats that the preview supports.
    * @returns A sequence of all supported preview formats
    * @see com.sun.star.ui.dialogs.FilePreviewImageFormats
    */
  val SupportedImageFormats: SafeArray[Double]
  /**
    * The method returns the supported color depth of the target device.
    * @returns The color depth in bit, e.g. 8 bit, 16 bit, 32 bit.
    */
  val TargetColorDepth: Color
  /**
    * The method returns the available height of the preview window even if the window is invisible or could not be created. If a service implementation
    * doesn't support a file preview 0 will be returned.
    * @returns The height of the preview window in pixel.
    */
  def getAvailableHeight(): Double
  /**
    * The method returns the available width of the preview window even if the window is invisible or could not be created. If a service implementation
    * doesn't support a file preview 0 will be returned.
    * @returns The width of the preview window in pixel.
    */
  def getAvailableWidth(): Double
  /**
    * Returns the current show state of the preview.
    * @returns A value of `TRUE` if the preview window is visible. A value of `FALSE` if the preview window is invisible.
    */
  def getShowState(): Boolean
  /**
    * The method returns all image formats that the preview supports.
    * @returns A sequence of all supported preview formats
    * @see com.sun.star.ui.dialogs.FilePreviewImageFormats
    */
  def getSupportedImageFormats(): SafeArray[Double]
  /**
    * The method returns the supported color depth of the target device.
    * @returns The color depth in bit, e.g. 8 bit, 16 bit, 32 bit.
    */
  def getTargetColorDepth(): Color
  /**
    * Sets a new image. If the preview is currently hidden the image will be ignored. An empty any will clear the preview window.
    * @param aImageFormat Specifies the format of the data that will be delivered
    * @param aImage The image data, the image format defines how the image data have to be delivered
    * @see com.sun.star.ui.dialogs.FilePreviewImageFormats
    * @throws com::sun::star::lang::IllegalArgumentException If the specified image format is invalid or not supported by the preview implementation
    */
  def setImage(aImageFormat: Double, aImage: js.Any): Unit
  /**
    * Optionally sets the current show state of the preview. It is possible that the preview implementation doesn't support hiding the preview.
    * @param bShowState A value of `TRUE` shows the preview window. A value of `FALSE` hides the preview window.
    * @returns A value of `TRUE` on success. A value of `FALSE` if the operation fails for any reason or the preview implementation doesn't support hiding the p
    */
  def setShowState(bShowState: Boolean): Boolean
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
    val __obj = js.Dynamic.literal(AvailableHeight = AvailableHeight, AvailableWidth = AvailableWidth, ShowState = ShowState, SupportedImageFormats = SupportedImageFormats, TargetColorDepth = TargetColorDepth, acquire = js.Any.fromFunction0(acquire), getAvailableHeight = js.Any.fromFunction0(getAvailableHeight), getAvailableWidth = js.Any.fromFunction0(getAvailableWidth), getShowState = js.Any.fromFunction0(getShowState), getSupportedImageFormats = js.Any.fromFunction0(getSupportedImageFormats), getTargetColorDepth = js.Any.fromFunction0(getTargetColorDepth), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setImage = js.Any.fromFunction2(setImage), setShowState = js.Any.fromFunction1(setShowState))
  
    __obj.asInstanceOf[XFilePreview]
  }
}

