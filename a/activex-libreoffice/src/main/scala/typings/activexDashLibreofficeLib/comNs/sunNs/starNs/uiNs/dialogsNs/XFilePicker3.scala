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
  ): XFilePicker3 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AvailableHeight")(AvailableHeight)
    __obj.updateDynamic("AvailableWidth")(AvailableWidth)
    __obj.updateDynamic("CurrentFilter")(CurrentFilter)
    __obj.updateDynamic("DisplayDirectory")(DisplayDirectory)
    __obj.updateDynamic("Files")(Files)
    __obj.updateDynamic("SelectedFiles")(SelectedFiles)
    __obj.updateDynamic("ShowState")(ShowState)
    __obj.updateDynamic("SupportedImageFormats")(SupportedImageFormats)
    __obj.updateDynamic("TargetColorDepth")(TargetColorDepth)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addFilePickerListener")(addFilePickerListener)
    __obj.updateDynamic("appendFilter")(appendFilter)
    __obj.updateDynamic("appendFilterGroup")(appendFilterGroup)
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getAvailableHeight")(getAvailableHeight)
    __obj.updateDynamic("getAvailableWidth")(getAvailableWidth)
    __obj.updateDynamic("getCurrentFilter")(getCurrentFilter)
    __obj.updateDynamic("getDisplayDirectory")(getDisplayDirectory)
    __obj.updateDynamic("getFiles")(getFiles)
    __obj.updateDynamic("getSelectedFiles")(getSelectedFiles)
    __obj.updateDynamic("getShowState")(getShowState)
    __obj.updateDynamic("getSupportedImageFormats")(getSupportedImageFormats)
    __obj.updateDynamic("getTargetColorDepth")(getTargetColorDepth)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeFilePickerListener")(removeFilePickerListener)
    __obj.updateDynamic("setCurrentFilter")(setCurrentFilter)
    __obj.updateDynamic("setDefaultName")(setDefaultName)
    __obj.updateDynamic("setDisplayDirectory")(setDisplayDirectory)
    __obj.updateDynamic("setImage")(setImage)
    __obj.updateDynamic("setMultiSelectionMode")(setMultiSelectionMode)
    __obj.updateDynamic("setShowState")(setShowState)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.asInstanceOf[XFilePicker3]
  }
}

