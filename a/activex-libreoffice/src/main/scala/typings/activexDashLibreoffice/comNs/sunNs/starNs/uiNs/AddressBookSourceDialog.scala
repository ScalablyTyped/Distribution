package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XWindow
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs.dialogsNs.XExecutableDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface could be incomplete since I derived it from its places of use.
  * @since LibreOffice 4.1
  */
trait AddressBookSourceDialog extends XExecutableDialog {
  def createWithDataSource(
    ParentWindow: XWindow,
    DataSource: XPropertySet,
    DataSourceName: String,
    Command: String,
    Title: String
  ): Unit
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
}

