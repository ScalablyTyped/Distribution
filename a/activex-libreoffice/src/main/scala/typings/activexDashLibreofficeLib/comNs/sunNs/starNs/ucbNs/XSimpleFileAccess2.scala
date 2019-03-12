package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is an extension to the interface {@link XSimpleFileAccess} . */
trait XSimpleFileAccess2 extends XSimpleFileAccess {
  /**
    * Overwrites the file content with the given data.
    *
    * If the file does not exist, it will be created.
    * @param FileURL File to write
    * @param data A stream containing the data for the file to be (over-)written
    */
  def writeFile(FileURL: java.lang.String, data: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream): scala.Unit
}

object XSimpleFileAccess2 {
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
    isReadOnly: java.lang.String => scala.Boolean,
    kill: java.lang.String => scala.Unit,
    move: (java.lang.String, java.lang.String) => scala.Unit,
    openFileRead: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    openFileReadWrite: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream,
    openFileWrite: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setInteractionHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler => scala.Unit,
    setReadOnly: (java.lang.String, scala.Boolean) => scala.Unit,
    writeFile: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream) => scala.Unit
  ): XSimpleFileAccess2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), copy = js.Any.fromFunction2(copy), createFolder = js.Any.fromFunction1(createFolder), exists = js.Any.fromFunction1(exists), getContentType = js.Any.fromFunction1(getContentType), getDateTimeModified = js.Any.fromFunction1(getDateTimeModified), getFolderContents = js.Any.fromFunction2(getFolderContents), getSize = js.Any.fromFunction1(getSize), isFolder = js.Any.fromFunction1(isFolder), isReadOnly = js.Any.fromFunction1(isReadOnly), kill = js.Any.fromFunction1(kill), move = js.Any.fromFunction2(move), openFileRead = js.Any.fromFunction1(openFileRead), openFileReadWrite = js.Any.fromFunction1(openFileReadWrite), openFileWrite = js.Any.fromFunction1(openFileWrite), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setInteractionHandler = js.Any.fromFunction1(setInteractionHandler), setReadOnly = js.Any.fromFunction2(setReadOnly), writeFile = js.Any.fromFunction2(writeFile))
  
    __obj.asInstanceOf[XSimpleFileAccess2]
  }
}

