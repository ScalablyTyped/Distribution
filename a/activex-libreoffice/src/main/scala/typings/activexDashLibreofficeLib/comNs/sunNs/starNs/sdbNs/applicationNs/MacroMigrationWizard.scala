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
    acquire: js.Function0[scala.Unit],
    createWithDocument: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.XOfficeDatabaseDocument, 
      scala.Unit
    ],
    execute: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit]
  ): MacroMigrationWizard = {
    val __obj = js.Dynamic.literal(acquire = acquire, createWithDocument = createWithDocument, execute = execute, queryInterface = queryInterface, release = release, setTitle = setTitle)
  
    __obj.asInstanceOf[MacroMigrationWizard]
  }
}

