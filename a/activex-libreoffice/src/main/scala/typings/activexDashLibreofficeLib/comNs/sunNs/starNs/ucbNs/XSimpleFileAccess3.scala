package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is an extension to the interface {@link XSimpleFileAccess2} .
  * @since OOo 1.1.2
  */
trait XSimpleFileAccess3 extends XSimpleFileAccess2 {
  /**
    * Checks if a file is "hidden"
    * @param FileURL URL to be checked
    * @returns true, if the given File is "hidden", false otherwise
    */
  def isHidden(FileURL: java.lang.String): scala.Boolean
  /**
    * Sets the "hidden" of a file according to the boolean parameter, if the actual process has the right to do so and the used operation system supports
    * this operation.
    * @param FileURL URL of the file
    * @param bHidden true; "hidden" flag will be set, false; "hidden" flag will be reset
    */
  def setHidden(FileURL: java.lang.String, bHidden: scala.Boolean): scala.Unit
}

object XSimpleFileAccess3 {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    copy: (java.lang.String, java.lang.String) => scala.Unit,
    createFolder: java.lang.String => scala.Unit,
    exists: java.lang.String => scala.Boolean,
    getContentType: java.lang.String => java.lang.String,
    getDateTimeModified: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime,
    getFolderContents: (java.lang.String, scala.Boolean) => stdLib.SafeArray[java.lang.String],
    getSize: java.lang.String => scala.Double,
    isFolder: java.lang.String => scala.Boolean,
    isHidden: java.lang.String => scala.Boolean,
    isReadOnly: java.lang.String => scala.Boolean,
    kill: java.lang.String => scala.Unit,
    move: (java.lang.String, java.lang.String) => scala.Unit,
    openFileRead: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    openFileReadWrite: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream,
    openFileWrite: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setHidden: (java.lang.String, scala.Boolean) => scala.Unit,
    setInteractionHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler => scala.Unit,
    setReadOnly: (java.lang.String, scala.Boolean) => scala.Unit,
    writeFile: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream) => scala.Unit
  ): XSimpleFileAccess3 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), copy = js.Any.fromFunction2(copy), createFolder = js.Any.fromFunction1(createFolder), exists = js.Any.fromFunction1(exists), getContentType = js.Any.fromFunction1(getContentType), getDateTimeModified = js.Any.fromFunction1(getDateTimeModified), getFolderContents = js.Any.fromFunction2(getFolderContents), getSize = js.Any.fromFunction1(getSize), isFolder = js.Any.fromFunction1(isFolder), isHidden = js.Any.fromFunction1(isHidden), isReadOnly = js.Any.fromFunction1(isReadOnly), kill = js.Any.fromFunction1(kill), move = js.Any.fromFunction2(move), openFileRead = js.Any.fromFunction1(openFileRead), openFileReadWrite = js.Any.fromFunction1(openFileReadWrite), openFileWrite = js.Any.fromFunction1(openFileWrite), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setHidden = js.Any.fromFunction2(setHidden), setInteractionHandler = js.Any.fromFunction1(setInteractionHandler), setReadOnly = js.Any.fromFunction2(setReadOnly), writeFile = js.Any.fromFunction2(writeFile))
  
    __obj.asInstanceOf[XSimpleFileAccess3]
  }
}

