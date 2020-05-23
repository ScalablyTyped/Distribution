package typings.activexLibreoffice.com_.sun.star.ui.dialogs

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.StringPair
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.activexLibreoffice.com_.sun.star.util.XCancellable
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides unified interface for {@link FilePicker} service.
  * @since LibreOffice 4.1
  */
trait XFilePicker3
  extends XFilePicker2
     with XFilePickerNotifier
     with XFilterManager
     with XFilePreview
     with XFilterGroupManager
     with XCancellable
     with XComponent

object XFilePicker3 {
  @scala.inline
  def apply(
    AvailableHeight: Double,
    AvailableWidth: Double,
    CurrentFilter: String,
    DisplayDirectory: String,
    Files: SafeArray[String],
    SelectedFiles: SafeArray[String],
    ShowState: Boolean,
    SupportedImageFormats: SafeArray[Double],
    TargetColorDepth: Color,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addFilePickerListener: XFilePickerListener => Unit,
    appendFilter: (String, String) => Unit,
    appendFilterGroup: (String, SeqEquiv[StringPair]) => Unit,
    cancel: () => Unit,
    dispose: () => Unit,
    execute: () => Double,
    getAvailableHeight: () => Double,
    getAvailableWidth: () => Double,
    getCurrentFilter: () => String,
    getDisplayDirectory: () => String,
    getFiles: () => SafeArray[String],
    getSelectedFiles: () => SafeArray[String],
    getShowState: () => Boolean,
    getSupportedImageFormats: () => SafeArray[Double],
    getTargetColorDepth: () => Color,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeFilePickerListener: XFilePickerListener => Unit,
    setCurrentFilter: String => Unit,
    setDefaultName: String => Unit,
    setDisplayDirectory: String => Unit,
    setImage: (Double, js.Any) => Unit,
    setMultiSelectionMode: Boolean => Unit,
    setShowState: Boolean => Boolean,
    setTitle: String => Unit
  ): XFilePicker3 = {
    val __obj = js.Dynamic.literal(AvailableHeight = AvailableHeight.asInstanceOf[js.Any], AvailableWidth = AvailableWidth.asInstanceOf[js.Any], CurrentFilter = CurrentFilter.asInstanceOf[js.Any], DisplayDirectory = DisplayDirectory.asInstanceOf[js.Any], Files = Files.asInstanceOf[js.Any], SelectedFiles = SelectedFiles.asInstanceOf[js.Any], ShowState = ShowState.asInstanceOf[js.Any], SupportedImageFormats = SupportedImageFormats.asInstanceOf[js.Any], TargetColorDepth = TargetColorDepth.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFilePickerListener = js.Any.fromFunction1(addFilePickerListener), appendFilter = js.Any.fromFunction2(appendFilter), appendFilterGroup = js.Any.fromFunction2(appendFilterGroup), cancel = js.Any.fromFunction0(cancel), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction0(execute), getAvailableHeight = js.Any.fromFunction0(getAvailableHeight), getAvailableWidth = js.Any.fromFunction0(getAvailableWidth), getCurrentFilter = js.Any.fromFunction0(getCurrentFilter), getDisplayDirectory = js.Any.fromFunction0(getDisplayDirectory), getFiles = js.Any.fromFunction0(getFiles), getSelectedFiles = js.Any.fromFunction0(getSelectedFiles), getShowState = js.Any.fromFunction0(getShowState), getSupportedImageFormats = js.Any.fromFunction0(getSupportedImageFormats), getTargetColorDepth = js.Any.fromFunction0(getTargetColorDepth), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFilePickerListener = js.Any.fromFunction1(removeFilePickerListener), setCurrentFilter = js.Any.fromFunction1(setCurrentFilter), setDefaultName = js.Any.fromFunction1(setDefaultName), setDisplayDirectory = js.Any.fromFunction1(setDisplayDirectory), setImage = js.Any.fromFunction2(setImage), setMultiSelectionMode = js.Any.fromFunction1(setMultiSelectionMode), setShowState = js.Any.fromFunction1(setShowState), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[XFilePicker3]
  }
}

