package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Makes it possible to end a dialog and set a help id.
  * @since OOo 3.0
  */
trait XDialog2 extends XDialog {
  /** hides the dialog and then causes {@link XDialog.execute()} to return with the given result value. */
  def endDialog(Result: scala.Double): scala.Unit
  /** sets the help id so that the standard help button action will show the appropriate help page. */
  def setHelpId(Id: java.lang.String): scala.Unit
}

object XDialog2 {
  @scala.inline
  def apply(
    Title: java.lang.String,
    acquire: () => scala.Unit,
    endDialog: scala.Double => scala.Unit,
    endExecute: () => scala.Unit,
    execute: () => scala.Double,
    getTitle: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setHelpId: java.lang.String => scala.Unit,
    setTitle: java.lang.String => scala.Unit
  ): XDialog2 = {
    val __obj = js.Dynamic.literal(Title = Title, acquire = js.Any.fromFunction0(acquire), endDialog = js.Any.fromFunction1(endDialog), endExecute = js.Any.fromFunction0(endExecute), execute = js.Any.fromFunction0(execute), getTitle = js.Any.fromFunction0(getTitle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setHelpId = js.Any.fromFunction1(setHelpId), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[XDialog2]
  }
}

