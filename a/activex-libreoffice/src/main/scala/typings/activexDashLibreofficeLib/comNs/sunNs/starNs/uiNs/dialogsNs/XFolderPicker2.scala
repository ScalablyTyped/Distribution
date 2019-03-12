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
    acquire: () => scala.Unit,
    cancel: () => scala.Unit,
    execute: () => scala.Double,
    getDirectory: () => java.lang.String,
    getDisplayDirectory: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setDescription: java.lang.String => scala.Unit,
    setDisplayDirectory: java.lang.String => scala.Unit,
    setTitle: java.lang.String => scala.Unit
  ): XFolderPicker2 = {
    val __obj = js.Dynamic.literal(Directory = Directory, DisplayDirectory = DisplayDirectory, acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), execute = js.Any.fromFunction0(execute), getDirectory = js.Any.fromFunction0(getDirectory), getDisplayDirectory = js.Any.fromFunction0(getDisplayDirectory), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDescription = js.Any.fromFunction1(setDescription), setDisplayDirectory = js.Any.fromFunction1(setDisplayDirectory), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[XFolderPicker2]
  }
}

