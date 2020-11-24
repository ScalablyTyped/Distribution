package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Makes it possible to end a dialog and set a help id.
  * @since OOo 3.0
  */
@js.native
trait XDialog2 extends XDialog {
  
  /** hides the dialog and then causes {@link XDialog.execute()} to return with the given result value. */
  def endDialog(Result: Double): Unit = js.native
  
  /** sets the help id so that the standard help button action will show the appropriate help page. */
  def setHelpId(Id: String): Unit = js.native
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
  implicit class XDialog2Ops[Self <: XDialog2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndDialog(value: Double => Unit): Self = this.set("endDialog", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHelpId(value: String => Unit): Self = this.set("setHelpId", js.Any.fromFunction1(value))
  }
}
