package typings.activexLibreoffice.com_.sun.star.ui.dialogs

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies an interface for an executable dialog. */
@js.native
trait XExecutableDialog extends XInterface {
  
  /**
    * Executes (shows) the dialog.
    * @returns A status code of type {@link ExecutableDialogResults} .
    */
  def execute(): Double = js.native
  
  /**
    * Sets the title of the dialog.
    * @param aTitle Set an arbitrary title for the dialog, may be an empty string if the dialog should not have a title.
    */
  def setTitle(aTitle: String): Unit = js.native
}
object XExecutableDialog {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    execute: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTitle: String => Unit
  ): XExecutableDialog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[XExecutableDialog]
  }
  
  @scala.inline
  implicit class XExecutableDialogMutableBuilder[Self <: XExecutableDialog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Double): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetTitle(value: String => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
  }
}
