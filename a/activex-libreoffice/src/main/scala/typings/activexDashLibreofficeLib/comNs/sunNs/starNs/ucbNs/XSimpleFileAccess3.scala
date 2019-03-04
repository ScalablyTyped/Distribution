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
    acquire: js.Function0[scala.Unit],
    copy: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    createFolder: js.Function1[java.lang.String, scala.Unit],
    exists: js.Function1[java.lang.String, scala.Boolean],
    getContentType: js.Function1[java.lang.String, java.lang.String],
    getDateTimeModified: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime],
    getFolderContents: js.Function2[java.lang.String, scala.Boolean, activexDashInteropLib.SafeArray[java.lang.String]],
    getSize: js.Function1[java.lang.String, scala.Double],
    isFolder: js.Function1[java.lang.String, scala.Boolean],
    isHidden: js.Function1[java.lang.String, scala.Boolean],
    isReadOnly: js.Function1[java.lang.String, scala.Boolean],
    kill: js.Function1[java.lang.String, scala.Unit],
    move: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    openFileRead: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    openFileReadWrite: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream],
    openFileWrite: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setHidden: js.Function2[java.lang.String, scala.Boolean, scala.Unit],
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
  ): XSimpleFileAccess3 = {
    val __obj = js.Dynamic.literal(acquire = acquire, copy = copy, createFolder = createFolder, exists = exists, getContentType = getContentType, getDateTimeModified = getDateTimeModified, getFolderContents = getFolderContents, getSize = getSize, isFolder = isFolder, isHidden = isHidden, isReadOnly = isReadOnly, kill = kill, move = move, openFileRead = openFileRead, openFileReadWrite = openFileReadWrite, openFileWrite = openFileWrite, queryInterface = queryInterface, release = release, setHidden = setHidden, setInteractionHandler = setInteractionHandler, setReadOnly = setReadOnly, writeFile = writeFile)
  
    __obj.asInstanceOf[XSimpleFileAccess3]
  }
}

