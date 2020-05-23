package typings.activexLibreoffice.com_.sun.star.ui.dialogs

import typings.activexLibreoffice.`type`
import typings.std.SafeArray
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
  val SelectedFiles: SafeArray[String]
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
  def getSelectedFiles(): SafeArray[String]
}

object XFilePicker2 {
  @scala.inline
  def apply(
    DisplayDirectory: String,
    Files: SafeArray[String],
    SelectedFiles: SafeArray[String],
    acquire: () => Unit,
    execute: () => Double,
    getDisplayDirectory: () => String,
    getFiles: () => SafeArray[String],
    getSelectedFiles: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDefaultName: String => Unit,
    setDisplayDirectory: String => Unit,
    setMultiSelectionMode: Boolean => Unit,
    setTitle: String => Unit
  ): XFilePicker2 = {
    val __obj = js.Dynamic.literal(DisplayDirectory = DisplayDirectory.asInstanceOf[js.Any], Files = Files.asInstanceOf[js.Any], SelectedFiles = SelectedFiles.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), execute = js.Any.fromFunction0(execute), getDisplayDirectory = js.Any.fromFunction0(getDisplayDirectory), getFiles = js.Any.fromFunction0(getFiles), getSelectedFiles = js.Any.fromFunction0(getSelectedFiles), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDefaultName = js.Any.fromFunction1(setDefaultName), setDisplayDirectory = js.Any.fromFunction1(setDisplayDirectory), setMultiSelectionMode = js.Any.fromFunction1(setMultiSelectionMode), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[XFilePicker2]
  }
}

