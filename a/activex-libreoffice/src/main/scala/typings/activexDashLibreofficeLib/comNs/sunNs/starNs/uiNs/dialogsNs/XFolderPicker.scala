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
    acquire: js.Function0[scala.Unit],
    execute: js.Function0[scala.Double],
    getDirectory: js.Function0[java.lang.String],
    getDisplayDirectory: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDescription: js.Function1[java.lang.String, scala.Unit],
    setDisplayDirectory: js.Function1[java.lang.String, scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit]
  ): XFolderPicker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Directory")(Directory)
    __obj.updateDynamic("DisplayDirectory")(DisplayDirectory)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getDirectory")(getDirectory)
    __obj.updateDynamic("getDisplayDirectory")(getDisplayDirectory)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setDescription")(setDescription)
    __obj.updateDynamic("setDisplayDirectory")(setDisplayDirectory)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.asInstanceOf[XFolderPicker]
  }
}

