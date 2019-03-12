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
    Info: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
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
    TableFilter: stdLib.SafeArray[java.lang.String],
    TableTypeFilter: stdLib.SafeArray[java.lang.String],
    URL: java.lang.String,
    User: java.lang.String,
    acquire: () => scala.Unit,
    addFlushListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushListener => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    connectWithCompletion: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    flush: () => scala.Unit,
    getBookmarks: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    getConnection: (java.lang.String, java.lang.String) => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    getIsolatedConnection: (java.lang.String, java.lang.String) => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    getIsolatedConnectionWithCompletion: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    getLoginTimeout: () => scala.Double,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getQueryDefinitions: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeFlushListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushListener => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setLoginTimeout: scala.Double => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): DocumentDataSource = {
    val __obj = js.Dynamic.literal(Bookmarks = Bookmarks, DatabaseDocument = DatabaseDocument, Info = Info, IsPasswordRequired = IsPasswordRequired, IsReadOnly = IsReadOnly, LoginTimeout = LoginTimeout, Name = Name, NumberFormatsSupplier = NumberFormatsSupplier, Password = Password, PropertySetInfo = PropertySetInfo, QueryDefinitions = QueryDefinitions, Settings = Settings, SuppressVersionColumns = SuppressVersionColumns, TableFilter = TableFilter, TableTypeFilter = TableTypeFilter, URL = URL, User = User, acquire = js.Any.fromFunction0(acquire), addFlushListener = js.Any.fromFunction1(addFlushListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), connectWithCompletion = js.Any.fromFunction1(connectWithCompletion), flush = js.Any.fromFunction0(flush), getBookmarks = js.Any.fromFunction0(getBookmarks), getConnection = js.Any.fromFunction2(getConnection), getIsolatedConnection = js.Any.fromFunction2(getIsolatedConnection), getIsolatedConnectionWithCompletion = js.Any.fromFunction1(getIsolatedConnectionWithCompletion), getLoginTimeout = js.Any.fromFunction0(getLoginTimeout), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getQueryDefinitions = js.Any.fromFunction0(getQueryDefinitions), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeFlushListener = js.Any.fromFunction1(removeFlushListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setLoginTimeout = js.Any.fromFunction1(setLoginTimeout), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[DocumentDataSource]
  }
}

