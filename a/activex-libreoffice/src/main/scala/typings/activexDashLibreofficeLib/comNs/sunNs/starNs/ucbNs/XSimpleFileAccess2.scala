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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("createFolder")(createFolder)
    __obj.updateDynamic("exists")(exists)
    __obj.updateDynamic("getContentType")(getContentType)
    __obj.updateDynamic("getDateTimeModified")(getDateTimeModified)
    __obj.updateDynamic("getFolderContents")(getFolderContents)
    __obj.updateDynamic("getSize")(getSize)
    __obj.updateDynamic("isFolder")(isFolder)
    __obj.updateDynamic("isReadOnly")(isReadOnly)
    __obj.updateDynamic("kill")(kill)
    __obj.updateDynamic("move")(move)
    __obj.updateDynamic("openFileRead")(openFileRead)
    __obj.updateDynamic("openFileReadWrite")(openFileReadWrite)
    __obj.updateDynamic("openFileWrite")(openFileWrite)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setInteractionHandler")(setInteractionHandler)
    __obj.updateDynamic("setReadOnly")(setReadOnly)
    __obj.updateDynamic("writeFile")(writeFile)
    __obj.asInstanceOf[XSimpleFileAccess2]
  }
}

