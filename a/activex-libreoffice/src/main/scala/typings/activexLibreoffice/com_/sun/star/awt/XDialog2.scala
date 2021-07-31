package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Makes it possible to end a dialog and set a help id.
  * @since OOo 3.0
  */
trait XDialog2
  extends StObject
     with XDialog {
  
  /** hides the dialog and then causes {@link XDialog.execute()} to return with the given result value. */
  def endDialog(Result: Double): Unit
  
  /** sets the help id so that the standard help button action will show the appropriate help page. */
  def setHelpId(Id: String): Unit
}
object XDialog2 {
  
  @scala.inline
  def apply(
    Title: String,
    acquire: () => Unit,
    endDialog: Double => Unit,
    endExecute: () => Unit,
    execute: () => Double,
    getTitle: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setHelpId: String => Unit,
    setTitle: String => Unit
  ): XDialog2 = {
    val __obj = js.Dynamic.literal(Title = Title.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), endDialog = js.Any.fromFunction1(endDialog), endExecute = js.Any.fromFunction0(endExecute), execute = js.Any.fromFunction0(execute), getTitle = js.Any.fromFunction0(getTitle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setHelpId = js.Any.fromFunction1(setHelpId), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[XDialog2]
  }
  
  @scala.inline
  implicit class XDialog2MutableBuilder[Self <: XDialog2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndDialog(value: Double => Unit): Self = StObject.set(x, "endDialog", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHelpId(value: String => Unit): Self = StObject.set(x, "setHelpId", js.Any.fromFunction1(value))
  }
}
