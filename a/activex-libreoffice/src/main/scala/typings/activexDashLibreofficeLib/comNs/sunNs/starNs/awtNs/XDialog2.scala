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

