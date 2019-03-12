package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies a {@link FolderPicker} interface. */
trait XFolderPicker extends XExecutableDialog {
  /**
    * Returns the selected directory as url conforming to [Rfc1738]{@link url="http://www.w3.org/Addressing/rfc1738.txt"} .
    * @returns The selected directory as url if the user did close the dialog with Ok else the returned value is undefined.
    */
  val Directory: java.lang.String
  /**
    * Returns the root directory that the {@link FolderPicker} is showing. The return value is undefined if the client did not choose a root directory or
    * the previously specified root directory doesn't exist.
    * @returns The directory in url format.
    */
  var DisplayDirectory: java.lang.String
  /**
    * Returns the selected directory as url conforming to [Rfc1738]{@link url="http://www.w3.org/Addressing/rfc1738.txt"} .
    * @returns The selected directory as url if the user did close the dialog with Ok else the returned value is undefined.
    */
  def getDirectory(): java.lang.String
  /**
    * Returns the root directory that the {@link FolderPicker} is showing. The return value is undefined if the client did not choose a root directory or
    * the previously specified root directory doesn't exist.
    * @returns The directory in url format.
    */
  def getDisplayDirectory(): java.lang.String
  /**
    * The implementation may optionally show the given text as a description for the user within the dialog, e.g. "Please select a directory". If the client
    * doesn't set a description the dialog may show a default description.
    */
  def setDescription(aDescription: java.lang.String): scala.Unit
  /**
    * Sets the root directory that the {@link FolderPicker} should display. It is not specified which root directory the {@link FolderPicker} chooses if the
    * specified root directory doesn't exist.
    * @param aDirectory Specifies the root directory in url format, conforming to [Rfc1738]{@link url="http://www.w3.org/Addressing/rfc1738.txt"} .
    * @throws com::sun::star::lang::IllegalArgumentException if the given url is invalid.
    */
  def setDisplayDirectory(aDirectory: java.lang.String): scala.Unit
}

object XFolderPicker {
  @scala.inline
  def apply(
    Directory: java.lang.String,
    DisplayDirectory: java.lang.String,
    acquire: () => scala.Unit,
    execute: () => scala.Double,
    getDirectory: () => java.lang.String,
    getDisplayDirectory: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setDescription: java.lang.String => scala.Unit,
    setDisplayDirectory: java.lang.String => scala.Unit,
    setTitle: java.lang.String => scala.Unit
  ): XFolderPicker = {
    val __obj = js.Dynamic.literal(Directory = Directory, DisplayDirectory = DisplayDirectory, acquire = js.Any.fromFunction0(acquire), execute = js.Any.fromFunction0(execute), getDirectory = js.Any.fromFunction0(getDirectory), getDisplayDirectory = js.Any.fromFunction0(getDisplayDirectory), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDescription = js.Any.fromFunction1(setDescription), setDisplayDirectory = js.Any.fromFunction1(setDisplayDirectory), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[XFolderPicker]
  }
}

