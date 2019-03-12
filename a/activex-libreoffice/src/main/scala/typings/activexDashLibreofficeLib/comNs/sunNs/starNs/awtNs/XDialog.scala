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

object XDialog {
  @scala.inline
  def apply(
    Title: java.lang.String,
    acquire: () => scala.Unit,
    endExecute: () => scala.Unit,
    execute: () => scala.Double,
    getTitle: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setTitle: java.lang.String => scala.Unit
  ): XDialog = {
    val __obj = js.Dynamic.literal(Title = Title, acquire = js.Any.fromFunction0(acquire), endExecute = js.Any.fromFunction0(endExecute), execute = js.Any.fromFunction0(execute), getTitle = js.Any.fromFunction0(getTitle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[XDialog]
  }
}

