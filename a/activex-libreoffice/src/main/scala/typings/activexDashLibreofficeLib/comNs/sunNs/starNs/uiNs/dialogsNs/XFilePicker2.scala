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

