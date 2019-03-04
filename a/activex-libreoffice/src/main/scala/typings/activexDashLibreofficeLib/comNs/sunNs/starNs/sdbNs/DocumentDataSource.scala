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
    val __obj = js.Dynamic.literal(Bookmarks = Bookmarks, DatabaseDocument = DatabaseDocument, Info = Info, IsPasswordRequired = IsPasswordRequired, IsReadOnly = IsReadOnly, LoginTimeout = LoginTimeout, Name = Name, NumberFormatsSupplier = NumberFormatsSupplier, Password = Password, PropertySetInfo = PropertySetInfo, QueryDefinitions = QueryDefinitions, Settings = Settings, SuppressVersionColumns = SuppressVersionColumns, TableFilter = TableFilter, TableTypeFilter = TableTypeFilter, URL = URL, User = User, acquire = acquire, addFlushListener = addFlushListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, connectWithCompletion = connectWithCompletion, flush = flush, getBookmarks = getBookmarks, getConnection = getConnection, getIsolatedConnection = getIsolatedConnection, getIsolatedConnectionWithCompletion = getIsolatedConnectionWithCompletion, getLoginTimeout = getLoginTimeout, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getQueryDefinitions = getQueryDefinitions, queryInterface = queryInterface, release = release, removeFlushListener = removeFlushListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setLoginTimeout = setLoginTimeout, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[DocumentDataSource]
  }
}

