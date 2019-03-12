package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs

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
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCancellable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent

object XFilePicker3 {
  @scala.inline
  def apply(
    AvailableHeight: scala.Double,
    AvailableWidth: scala.Double,
    CurrentFilter: java.lang.String,
    DisplayDirectory: java.lang.String,
    Files: stdLib.SafeArray[java.lang.String],
    SelectedFiles: stdLib.SafeArray[java.lang.String],
    ShowState: scala.Boolean,
    SupportedImageFormats: stdLib.SafeArray[scala.Double],
    TargetColorDepth: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addFilePickerListener: XFilePickerListener => scala.Unit,
    appendFilter: (java.lang.String, java.lang.String) => scala.Unit,
    appendFilterGroup: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair]) => scala.Unit,
    cancel: () => scala.Unit,
    dispose: () => scala.Unit,
    execute: () => scala.Double,
    getAvailableHeight: () => scala.Double,
    getAvailableWidth: () => scala.Double,
    getCurrentFilter: () => java.lang.String,
    getDisplayDirectory: () => java.lang.String,
    getFiles: () => stdLib.SafeArray[java.lang.String],
    getSelectedFiles: () => stdLib.SafeArray[java.lang.String],
    getShowState: () => scala.Boolean,
    getSupportedImageFormats: () => stdLib.SafeArray[scala.Double],
    getTargetColorDepth: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeFilePickerListener: XFilePickerListener => scala.Unit,
    setCurrentFilter: java.lang.String => scala.Unit,
    setDefaultName: java.lang.String => scala.Unit,
    setDisplayDirectory: java.lang.String => scala.Unit,
    setImage: (scala.Double, js.Any) => scala.Unit,
    setMultiSelectionMode: scala.Boolean => scala.Unit,
    setShowState: scala.Boolean => scala.Boolean,
    setTitle: java.lang.String => scala.Unit
  ): XFilePicker3 = {
    val __obj = js.Dynamic.literal(AvailableHeight = AvailableHeight, AvailableWidth = AvailableWidth, CurrentFilter = CurrentFilter, DisplayDirectory = DisplayDirectory, Files = Files, SelectedFiles = SelectedFiles, ShowState = ShowState, SupportedImageFormats = SupportedImageFormats, TargetColorDepth = TargetColorDepth, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFilePickerListener = js.Any.fromFunction1(addFilePickerListener), appendFilter = js.Any.fromFunction2(appendFilter), appendFilterGroup = js.Any.fromFunction2(appendFilterGroup), cancel = js.Any.fromFunction0(cancel), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction0(execute), getAvailableHeight = js.Any.fromFunction0(getAvailableHeight), getAvailableWidth = js.Any.fromFunction0(getAvailableWidth), getCurrentFilter = js.Any.fromFunction0(getCurrentFilter), getDisplayDirectory = js.Any.fromFunction0(getDisplayDirectory), getFiles = js.Any.fromFunction0(getFiles), getSelectedFiles = js.Any.fromFunction0(getSelectedFiles), getShowState = js.Any.fromFunction0(getShowState), getSupportedImageFormats = js.Any.fromFunction0(getSupportedImageFormats), getTargetColorDepth = js.Any.fromFunction0(getTargetColorDepth), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFilePickerListener = js.Any.fromFunction1(removeFilePickerListener), setCurrentFilter = js.Any.fromFunction1(setCurrentFilter), setDefaultName = js.Any.fromFunction1(setDefaultName), setDisplayDirectory = js.Any.fromFunction1(setDisplayDirectory), setImage = js.Any.fromFunction2(setImage), setMultiSelectionMode = js.Any.fromFunction1(setMultiSelectionMode), setShowState = js.Any.fromFunction1(setShowState), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[XFilePicker3]
  }
}

