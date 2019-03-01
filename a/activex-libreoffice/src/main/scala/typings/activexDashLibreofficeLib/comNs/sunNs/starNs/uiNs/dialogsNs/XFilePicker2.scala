package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extends file picker interface to workaround some design problems. */
trait XFilePicker2 extends XFilePicker {
  /**
    * Returns a sequence of the selected files including path information in URL format, conforming to [Rfc1738]{@link
    * url="http://www.w3.org/Addressing/rfc1738.txt"} .
    *
    * If the user closed the dialog with cancel an empty sequence will be returned.
    *
    * ;
    *
    * If the user closed the dialog with OK a list of all selected files will be returned.
    *
    *  Instead to the method {@link getFiles()} of base interface {@link XFilePicker} the new method return full qualified URLs for every selected file.
    * @returns A list of all selected file as complete URLs.  ;   **Notes for the implementation of a FileSave dialog:** If there exists a checkbox "Automatic F
    */
  val SelectedFiles: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Returns a sequence of the selected files including path information in URL format, conforming to [Rfc1738]{@link
    * url="http://www.w3.org/Addressing/rfc1738.txt"} .
    *
    * If the user closed the dialog with cancel an empty sequence will be returned.
    *
    * ;
    *
    * If the user closed the dialog with OK a list of all selected files will be returned.
    *
    *  Instead to the method {@link getFiles()} of base interface {@link XFilePicker} the new method return full qualified URLs for every selected file.
    * @returns A list of all selected file as complete URLs.  ;   **Notes for the implementation of a FileSave dialog:** If there exists a checkbox "Automatic F
    */
  def getSelectedFiles(): activexDashInteropLib.SafeArray[java.lang.String]
}

object XFilePicker2 {
  @scala.inline
  def apply(
    DisplayDirectory: java.lang.String,
    Files: activexDashInteropLib.SafeArray[java.lang.String],
    SelectedFiles: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    execute: js.Function0[scala.Double],
    getDisplayDirectory: js.Function0[java.lang.String],
    getFiles: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getSelectedFiles: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDefaultName: js.Function1[java.lang.String, scala.Unit],
    setDisplayDirectory: js.Function1[java.lang.String, scala.Unit],
    setMultiSelectionMode: js.Function1[scala.Boolean, scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit]
  ): XFilePicker2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DisplayDirectory")(DisplayDirectory)
    __obj.updateDynamic("Files")(Files)
    __obj.updateDynamic("SelectedFiles")(SelectedFiles)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getDisplayDirectory")(getDisplayDirectory)
    __obj.updateDynamic("getFiles")(getFiles)
    __obj.updateDynamic("getSelectedFiles")(getSelectedFiles)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setDefaultName")(setDefaultName)
    __obj.updateDynamic("setDisplayDirectory")(setDisplayDirectory)
    __obj.updateDynamic("setMultiSelectionMode")(setMultiSelectionMode)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.asInstanceOf[XFilePicker2]
  }
}

