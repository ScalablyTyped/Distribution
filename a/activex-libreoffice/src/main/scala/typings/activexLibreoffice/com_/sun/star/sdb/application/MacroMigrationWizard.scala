package typings.activexLibreoffice.com_.sun.star.sdb.application

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.sdb.XOfficeDatabaseDocument
import typings.activexLibreoffice.com_.sun.star.ui.dialogs.XExecutableDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
@js.native
trait MacroMigrationWizard extends XExecutableDialog {
  def createWithDocument(Document: XOfficeDatabaseDocument): Unit = js.native
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
  @scala.inline
  implicit class MacroMigrationWizardOps[Self <: MacroMigrationWizard] (val x: Self) extends AnyVal {
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
    def setCreateWithDocument(value: XOfficeDatabaseDocument => Unit): Self = this.set("createWithDocument", js.Any.fromFunction1(value))
  }
  
}

