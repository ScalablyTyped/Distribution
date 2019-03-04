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
    acquire: js.Function0[scala.Unit],
    createWithDataSource: js.Function5[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      scala.Unit
    ],
    execute: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit]
  ): AddressBookSourceDialog = {
    val __obj = js.Dynamic.literal(acquire = acquire, createWithDataSource = createWithDataSource, execute = execute, queryInterface = queryInterface, release = release, setTitle = setTitle)
  
    __obj.asInstanceOf[AddressBookSourceDialog]
  }
}

