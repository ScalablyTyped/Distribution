package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait MacroMigrationWizard
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.XExecutableDialog {
  def createWithDocument(Document: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.XOfficeDatabaseDocument): scala.Unit
}

object MacroMigrationWizard {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    createWithDocument: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.XOfficeDatabaseDocument => scala.Unit,
    execute: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setTitle: java.lang.String => scala.Unit
  ): MacroMigrationWizard = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createWithDocument = js.Any.fromFunction1(createWithDocument), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[MacroMigrationWizard]
  }
}

