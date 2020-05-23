package typings.activexLibreoffice.com_.sun.star.sdb.application

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.sdb.XOfficeDatabaseDocument
import typings.activexLibreoffice.com_.sun.star.ui.dialogs.XExecutableDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait MacroMigrationWizard extends XExecutableDialog {
  def createWithDocument(Document: XOfficeDatabaseDocument): Unit
}

object MacroMigrationWizard {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createWithDocument: XOfficeDatabaseDocument => Unit,
    execute: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTitle: String => Unit
  ): MacroMigrationWizard = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createWithDocument = js.Any.fromFunction1(createWithDocument), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[MacroMigrationWizard]
  }
}

