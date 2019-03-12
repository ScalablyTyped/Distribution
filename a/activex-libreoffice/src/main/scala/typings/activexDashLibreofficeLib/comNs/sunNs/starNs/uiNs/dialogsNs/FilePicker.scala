package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A {@link FilePicker} .
  *
  * It is **NOT** recommended to cache a reference to a file picker instance. Due to restrictions by the underlying system there can be specific
  * limitations possible. To overcome these problems it's recommended to create a new instance on demand.
  * @see XFilePicker
  */
trait FilePicker extends XFilePicker3 {
  /**
    * Provides the ability to choose between different custom templates that do extend the subset of common controls a {@link FilePicker} usually supports.
    * Implementers may omit this interface if the FileOpen dialog doesn't support custom templates. In this case a createInstance will create an ordinary
    * FileOpen dialog with only the common {@link FilePicker} elements. The client has to provide one of the specified constants in {@link
    * TemplateDescription} . ; ;
    *
    * **Notes for the implementation of a FileSave dialog:** The implementation of a FileSave dialog should automatically check for existence of a file and
    * issue a warning if a file with the same name already exist.
    * @see com.sun.star.ui.dialogs.TemplateDescription
    */
  def createWithMode(Mode: scala.Double): scala.Unit
}

object FilePicker {
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
    createWithMode: scala.Double => scala.Unit,
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
  ): FilePicker = {
    val __obj = js.Dynamic.literal(AvailableHeight = AvailableHeight, AvailableWidth = AvailableWidth, CurrentFilter = CurrentFilter, DisplayDirectory = DisplayDirectory, Files = Files, SelectedFiles = SelectedFiles, ShowState = ShowState, SupportedImageFormats = SupportedImageFormats, TargetColorDepth = TargetColorDepth, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFilePickerListener = js.Any.fromFunction1(addFilePickerListener), appendFilter = js.Any.fromFunction2(appendFilter), appendFilterGroup = js.Any.fromFunction2(appendFilterGroup), cancel = js.Any.fromFunction0(cancel), createWithMode = js.Any.fromFunction1(createWithMode), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction0(execute), getAvailableHeight = js.Any.fromFunction0(getAvailableHeight), getAvailableWidth = js.Any.fromFunction0(getAvailableWidth), getCurrentFilter = js.Any.fromFunction0(getCurrentFilter), getDisplayDirectory = js.Any.fromFunction0(getDisplayDirectory), getFiles = js.Any.fromFunction0(getFiles), getSelectedFiles = js.Any.fromFunction0(getSelectedFiles), getShowState = js.Any.fromFunction0(getShowState), getSupportedImageFormats = js.Any.fromFunction0(getSupportedImageFormats), getTargetColorDepth = js.Any.fromFunction0(getTargetColorDepth), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFilePickerListener = js.Any.fromFunction1(removeFilePickerListener), setCurrentFilter = js.Any.fromFunction1(setCurrentFilter), setDefaultName = js.Any.fromFunction1(setDefaultName), setDisplayDirectory = js.Any.fromFunction1(setDisplayDirectory), setImage = js.Any.fromFunction2(setImage), setMultiSelectionMode = js.Any.fromFunction1(setMultiSelectionMode), setShowState = js.Any.fromFunction1(setShowState), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[FilePicker]
  }
}

