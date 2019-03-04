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
    acquire: js.Function0[scala.Unit],
    endDialog: js.Function1[scala.Double, scala.Unit],
    endExecute: js.Function0[scala.Unit],
    execute: js.Function0[scala.Double],
    getTitle: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setHelpId: js.Function1[java.lang.String, scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit]
  ): XDialog2 = {
    val __obj = js.Dynamic.literal(Title = Title, acquire = acquire, endDialog = endDialog, endExecute = endExecute, execute = execute, getTitle = getTitle, queryInterface = queryInterface, release = release, setHelpId = setHelpId, setTitle = setTitle)
  
    __obj.asInstanceOf[XDialog2]
  }
}

