package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * simplifies the accessing of data sources and it's corresponding database document.
  * @see DataSource
  * @see XDocumentDataSource
  */
trait DocumentDataSource
  extends DataSource
     with XDocumentDataSource

object DocumentDataSource {
  @scala.inline
  def apply(
    Bookmarks: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    DatabaseDocument: XOfficeDatabaseDocument,
    Info: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    IsPasswordRequired: scala.Boolean,
    IsReadOnly: scala.Boolean,
    LoginTimeout: scala.Double,
    Name: java.lang.String,
    NumberFormatsSupplier: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XNumberFormatsSupplier,
    Password: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    QueryDefinitions: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    Settings: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    SuppressVersionColumns: scala.Boolean,
    TableFilter: activexDashInteropLib.SafeArray[java.lang.String],
    TableTypeFilter: activexDashInteropLib.SafeArray[java.lang.String],
    URL: java.lang.String,
    User: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addFlushListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushListener, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    connectWithCompletion: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection
    ],
    flush: js.Function0[scala.Unit],
    getBookmarks: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getConnection: js.Function2[
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection
    ],
    getIsolatedConnection: js.Function2[
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection
    ],
    getIsolatedConnectionWithCompletion: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection
    ],
    getLoginTimeout: js.Function0[scala.Double],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getQueryDefinitions: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeFlushListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushListener, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setLoginTimeout: js.Function1[scala.Double, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): DocumentDataSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Bookmarks")(Bookmarks)
    __obj.updateDynamic("DatabaseDocument")(DatabaseDocument)
    __obj.updateDynamic("Info")(Info)
    __obj.updateDynamic("IsPasswordRequired")(IsPasswordRequired)
    __obj.updateDynamic("IsReadOnly")(IsReadOnly)
    __obj.updateDynamic("LoginTimeout")(LoginTimeout)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("NumberFormatsSupplier")(NumberFormatsSupplier)
    __obj.updateDynamic("Password")(Password)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("QueryDefinitions")(QueryDefinitions)
    __obj.updateDynamic("Settings")(Settings)
    __obj.updateDynamic("SuppressVersionColumns")(SuppressVersionColumns)
    __obj.updateDynamic("TableFilter")(TableFilter)
    __obj.updateDynamic("TableTypeFilter")(TableTypeFilter)
    __obj.updateDynamic("URL")(URL)
    __obj.updateDynamic("User")(User)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addFlushListener")(addFlushListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("connectWithCompletion")(connectWithCompletion)
    __obj.updateDynamic("flush")(flush)
    __obj.updateDynamic("getBookmarks")(getBookmarks)
    __obj.updateDynamic("getConnection")(getConnection)
    __obj.updateDynamic("getIsolatedConnection")(getIsolatedConnection)
    __obj.updateDynamic("getIsolatedConnectionWithCompletion")(getIsolatedConnectionWithCompletion)
    __obj.updateDynamic("getLoginTimeout")(getLoginTimeout)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getQueryDefinitions")(getQueryDefinitions)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeFlushListener")(removeFlushListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setLoginTimeout")(setLoginTimeout)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[DocumentDataSource]
  }
}

