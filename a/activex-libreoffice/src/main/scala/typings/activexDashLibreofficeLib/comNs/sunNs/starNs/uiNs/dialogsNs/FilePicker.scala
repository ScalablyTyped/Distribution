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
    Files: activexDashInteropLib.SafeArray[java.lang.String],
    SelectedFiles: activexDashInteropLib.SafeArray[java.lang.String],
    ShowState: scala.Boolean,
    SupportedImageFormats: activexDashInteropLib.SafeArray[scala.Double],
    TargetColorDepth: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addFilePickerListener: js.Function1[XFilePickerListener, scala.Unit],
    appendFilter: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    appendFilterGroup: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair], 
      scala.Unit
    ],
    cancel: js.Function0[scala.Unit],
    createWithMode: js.Function1[scala.Double, scala.Unit],
    dispose: js.Function0[scala.Unit],
    execute: js.Function0[scala.Double],
    getAvailableHeight: js.Function0[scala.Double],
    getAvailableWidth: js.Function0[scala.Double],
    getCurrentFilter: js.Function0[java.lang.String],
    getDisplayDirectory: js.Function0[java.lang.String],
    getFiles: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getSelectedFiles: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getShowState: js.Function0[scala.Boolean],
    getSupportedImageFormats: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getTargetColorDepth: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeFilePickerListener: js.Function1[XFilePickerListener, scala.Unit],
    setCurrentFilter: js.Function1[java.lang.String, scala.Unit],
    setDefaultName: js.Function1[java.lang.String, scala.Unit],
    setDisplayDirectory: js.Function1[java.lang.String, scala.Unit],
    setImage: js.Function2[scala.Double, js.Any, scala.Unit],
    setMultiSelectionMode: js.Function1[scala.Boolean, scala.Unit],
    setShowState: js.Function1[scala.Boolean, scala.Boolean],
    setTitle: js.Function1[java.lang.String, scala.Unit]
  ): FilePicker = {
    val __obj = js.Dynamic.literal(AvailableHeight = AvailableHeight, AvailableWidth = AvailableWidth, CurrentFilter = CurrentFilter, DisplayDirectory = DisplayDirectory, Files = Files, SelectedFiles = SelectedFiles, ShowState = ShowState, SupportedImageFormats = SupportedImageFormats, TargetColorDepth = TargetColorDepth, acquire = acquire, addEventListener = addEventListener, addFilePickerListener = addFilePickerListener, appendFilter = appendFilter, appendFilterGroup = appendFilterGroup, cancel = cancel, createWithMode = createWithMode, dispose = dispose, execute = execute, getAvailableHeight = getAvailableHeight, getAvailableWidth = getAvailableWidth, getCurrentFilter = getCurrentFilter, getDisplayDirectory = getDisplayDirectory, getFiles = getFiles, getSelectedFiles = getSelectedFiles, getShowState = getShowState, getSupportedImageFormats = getSupportedImageFormats, getTargetColorDepth = getTargetColorDepth, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removeFilePickerListener = removeFilePickerListener, setCurrentFilter = setCurrentFilter, setDefaultName = setDefaultName, setDisplayDirectory = setDisplayDirectory, setImage = setImage, setMultiSelectionMode = setMultiSelectionMode, setShowState = setShowState, setTitle = setTitle)
  
    __obj.asInstanceOf[FilePicker]
  }
}

