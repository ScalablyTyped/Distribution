package typings.activexLibreoffice.com_.sun.star.ui.dialogs

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.util.XCancellable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a unified interface for the new-style {@link FolderPicker} service to implement.
  * @since LibreOffice 4.0
  */
trait XFolderPicker2
  extends StObject
     with XFolderPicker
     with XCancellable
object XFolderPicker2 {
  
  inline def apply(
    Directory: String,
    DisplayDirectory: String,
    acquire: () => Unit,
    cancel: () => Unit,
    execute: () => Double,
    getDirectory: () => String,
    getDisplayDirectory: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDescription: String => Unit,
    setDisplayDirectory: String => Unit,
    setTitle: String => Unit
  ): XFolderPicker2 = {
    val __obj = js.Dynamic.literal(Directory = Directory.asInstanceOf[js.Any], DisplayDirectory = DisplayDirectory.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), execute = js.Any.fromFunction0(execute), getDirectory = js.Any.fromFunction0(getDirectory), getDisplayDirectory = js.Any.fromFunction0(getDisplayDirectory), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDescription = js.Any.fromFunction1(setDescription), setDisplayDirectory = js.Any.fromFunction1(setDisplayDirectory), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[XFolderPicker2]
  }
}
