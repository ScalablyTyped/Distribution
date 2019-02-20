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

