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
    acquire: js.Function0[scala.Unit],
    copy: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    createFolder: js.Function1[java.lang.String, scala.Unit],
    exists: js.Function1[java.lang.String, scala.Boolean],
    getContentType: js.Function1[java.lang.String, java.lang.String],
    getDateTimeModified: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime],
    getFolderContents: js.Function2[java.lang.String, scala.Boolean, activexDashInteropLib.SafeArray[java.lang.String]],
    getSize: js.Function1[java.lang.String, scala.Double],
    isFolder: js.Function1[java.lang.String, scala.Boolean],
    isReadOnly: js.Function1[java.lang.String, scala.Boolean],
    kill: js.Function1[java.lang.String, scala.Unit],
    move: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    openFileRead: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    openFileReadWrite: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream],
    openFileWrite: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setInteractionHandler: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler, 
      scala.Unit
    ],
    setReadOnly: js.Function2[java.lang.String, scala.Boolean, scala.Unit],
    writeFile: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      scala.Unit
    ]
  ): XSimpleFileAccess2 = {
    val __obj = js.Dynamic.literal(acquire = acquire, copy = copy, createFolder = createFolder, exists = exists, getContentType = getContentType, getDateTimeModified = getDateTimeModified, getFolderContents = getFolderContents, getSize = getSize, isFolder = isFolder, isReadOnly = isReadOnly, kill = kill, move = move, openFileRead = openFileRead, openFileReadWrite = openFileReadWrite, openFileWrite = openFileWrite, queryInterface = queryInterface, release = release, setInteractionHandler = setInteractionHandler, setReadOnly = setReadOnly, writeFile = writeFile)
  
    __obj.asInstanceOf[XSimpleFileAccess2]
  }
}

