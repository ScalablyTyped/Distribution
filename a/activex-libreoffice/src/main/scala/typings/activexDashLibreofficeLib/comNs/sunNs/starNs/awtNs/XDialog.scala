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
    acquire: js.Function0[scala.Unit],
    endExecute: js.Function0[scala.Unit],
    execute: js.Function0[scala.Double],
    getTitle: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit]
  ): XDialog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Title")(Title)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("endExecute")(endExecute)
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getTitle")(getTitle)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.asInstanceOf[XDialog]
  }
}

