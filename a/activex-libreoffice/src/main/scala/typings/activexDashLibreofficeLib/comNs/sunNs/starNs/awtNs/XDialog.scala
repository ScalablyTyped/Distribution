package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to show and hide a dialog and gives access to the title of the dialog. */
trait XDialog
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** gets the title of the dialog. */
  var Title: java.lang.String
  /** hides the dialog and then causes {@link XDialog.execute()} to return. */
  def endExecute(): scala.Unit
  /** shows the dialog. */
  def execute(): scala.Double
  /** gets the title of the dialog. */
  def getTitle(): java.lang.String
  /** sets the title of the dialog. */
  def setTitle(Title: java.lang.String): scala.Unit
}

