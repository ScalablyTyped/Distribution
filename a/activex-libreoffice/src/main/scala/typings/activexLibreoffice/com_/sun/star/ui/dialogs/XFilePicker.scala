package typings.activexLibreoffice.com_.sun.star.ui.dialogs

import typings.activexLibreoffice.`type`
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies an interface for a {@link FilePicker} */
trait XFilePicker extends XExecutableDialog {
  /**
    * Returns the directory that the file dialog is currently showing or was last showing before closing the dialog with Ok. If the user did cancel the
    * dialog, the returned value is undefined.
    * @returns The directory in URL format, must conform to [Rfc1738]{@link url="http://www.w3.org/Addressing/rfc1738.txt"} .
    */
  var DisplayDirectory: String
  /**
    * Returns a sequence of the selected files including path information in URL format, conforming to [Rfc1738]{@link
    * url="http://www.w3.org/Addressing/rfc1738.txt"} .
    *
    * If the user closed the dialog with cancel an empty sequence will be returned.
    *
    * ;
    *
    * If the dialog is in execution mode and a single file is selected the complete URL of this file will be returned.
    *
    * If the dialog is in execution mode and the selected file name is false or any other error occurs an empty sequence will be returned.
    * @deprecated Deprecateduse com::sun::star::ui::dialogs::XFilePicker2::getSelectedFiles instead
    * @returns The complete path of the file or directory currently selected in URL format. This always returns only the first entry of the sequence. ;   **Note
    */
  val Files: SafeArray[String]
  /**
    * Returns the directory that the file dialog is currently showing or was last showing before closing the dialog with Ok. If the user did cancel the
    * dialog, the returned value is undefined.
    * @returns The directory in URL format, must conform to [Rfc1738]{@link url="http://www.w3.org/Addressing/rfc1738.txt"} .
    */
  def getDisplayDirectory(): String
  /**
    * Returns a sequence of the selected files including path information in URL format, conforming to [Rfc1738]{@link
    * url="http://www.w3.org/Addressing/rfc1738.txt"} .
    *
    * If the user closed the dialog with cancel an empty sequence will be returned.
    *
    * ;
    *
    * If the dialog is in execution mode and a single file is selected the complete URL of this file will be returned.
    *
    * If the dialog is in execution mode and the selected file name is false or any other error occurs an empty sequence will be returned.
    * @deprecated Deprecateduse com::sun::star::ui::dialogs::XFilePicker2::getSelectedFiles instead
    * @returns The complete path of the file or directory currently selected in URL format. This always returns only the first entry of the sequence. ;   **Note
    */
  def getFiles(): SafeArray[String]
  /**
    * Sets the default string that appears in the file name box of a {@link FilePicker} .
    * @param aName  Specifies the default file name, displayed when the {@link FilePicker} is shown. The implementation may accept any string, and does not ha
    */
  def setDefaultName(aName: String): Unit
  /**
    * Sets the directory that the file dialog initially displays.
    * @param aDirectory Specifies the initial directory in URL format. The given URL must conform to [Rfc1738]{@link url="http://www.w3.org/Addressing/rfc1738
    * @throws com::sun::star::lang::IllegalArgumentException if the URL is invalid (doesn't conform to [Rfc1738]{@link url="http://www.w3.org/Addressing/rfc173
    */
  def setDisplayDirectory(aDirectory: String): Unit
  /**
    * Enable/disable multi-selection mode
    *
    * If the multi-selection mode is enabled, multiple files may be selected by the user else only one file selection at a time is possible
    * @param bMode  A value of `TRUE` enables the multi-selection mode.  A value of `FALSE` disables the multi-selection mode, this is the default.
    */
  def setMultiSelectionMode(bMode: Boolean): Unit
}

object XFilePicker {
  @scala.inline
  def apply(
    DisplayDirectory: String,
    Files: SafeArray[String],
    acquire: () => Unit,
    execute: () => Double,
    getDisplayDirectory: () => String,
    getFiles: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDefaultName: String => Unit,
    setDisplayDirectory: String => Unit,
    setMultiSelectionMode: Boolean => Unit,
    setTitle: String => Unit
  ): XFilePicker = {
    val __obj = js.Dynamic.literal(DisplayDirectory = DisplayDirectory.asInstanceOf[js.Any], Files = Files.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), execute = js.Any.fromFunction0(execute), getDisplayDirectory = js.Any.fromFunction0(getDisplayDirectory), getFiles = js.Any.fromFunction0(getFiles), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDefaultName = js.Any.fromFunction1(setDefaultName), setDisplayDirectory = js.Any.fromFunction1(setDisplayDirectory), setMultiSelectionMode = js.Any.fromFunction1(setMultiSelectionMode), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[XFilePicker]
  }
}

