package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface could be incomplete since I derived it from its places of use.
  * @since LibreOffice 4.1
  */
trait AddressBookSourceDialog
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.XExecutableDialog {
  def createWithDataSource(
    ParentWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    DataSource: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    DataSourceName: java.lang.String,
    Command: java.lang.String,
    Title: java.lang.String
  ): scala.Unit
}

object AddressBookSourceDialog {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    createWithDataSource: (activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, java.lang.String, java.lang.String, java.lang.String) => scala.Unit,
    execute: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setTitle: java.lang.String => scala.Unit
  ): AddressBookSourceDialog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createWithDataSource = js.Any.fromFunction5(createWithDataSource), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[AddressBookSourceDialog]
  }
}

