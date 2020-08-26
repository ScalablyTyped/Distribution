package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.ui.dialogs.XExecutableDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface could be incomplete since I derived it from its places of use.
  * @since LibreOffice 4.1
  */
@js.native
trait AddressBookSourceDialog extends XExecutableDialog {
  def createWithDataSource(
    ParentWindow: XWindow,
    DataSource: XPropertySet,
    DataSourceName: String,
    Command: String,
    Title: String
  ): Unit = js.native
}

object AddressBookSourceDialog {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createWithDataSource: (XWindow, XPropertySet, String, String, String) => Unit,
    execute: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTitle: String => Unit
  ): AddressBookSourceDialog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createWithDataSource = js.Any.fromFunction5(createWithDataSource), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[AddressBookSourceDialog]
  }
  @scala.inline
  implicit class AddressBookSourceDialogOps[Self <: AddressBookSourceDialog] (val x: Self) extends AnyVal {
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
    def setCreateWithDataSource(value: (XWindow, XPropertySet, String, String, String) => Unit): Self = this.set("createWithDataSource", js.Any.fromFunction5(value))
  }
  
}

