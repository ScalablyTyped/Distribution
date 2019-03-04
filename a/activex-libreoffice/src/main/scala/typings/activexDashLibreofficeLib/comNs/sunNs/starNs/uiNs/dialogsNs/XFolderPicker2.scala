package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a unified interface for the new-style {@link FolderPicker} service to implement.
  * @since LibreOffice 4.0
  */
trait XFolderPicker2
  extends XFolderPicker
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCancellable

object XFolderPicker2 {
  @scala.inline
  def apply(
    Directory: java.lang.String,
    DisplayDirectory: java.lang.String,
    acquire: js.Function0[scala.Unit],
    cancel: js.Function0[scala.Unit],
    execute: js.Function0[scala.Double],
    getDirectory: js.Function0[java.lang.String],
    getDisplayDirectory: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDescription: js.Function1[java.lang.String, scala.Unit],
    setDisplayDirectory: js.Function1[java.lang.String, scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit]
  ): XFolderPicker2 = {
    val __obj = js.Dynamic.literal(Directory = Directory, DisplayDirectory = DisplayDirectory, acquire = acquire, cancel = cancel, execute = execute, getDirectory = getDirectory, getDisplayDirectory = getDisplayDirectory, queryInterface = queryInterface, release = release, setDescription = setDescription, setDisplayDirectory = setDisplayDirectory, setTitle = setTitle)
  
    __obj.asInstanceOf[XFolderPicker2]
  }
}

