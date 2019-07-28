package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XConnection
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.XInteractionHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XFlushListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XNumberFormatsSupplier
import typings.std.SafeArray
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
    Bookmarks: XNameAccess,
    DatabaseDocument: XOfficeDatabaseDocument,
    Info: SafeArray[PropertyValue],
    IsPasswordRequired: Boolean,
    IsReadOnly: Boolean,
    LoginTimeout: Double,
    Name: String,
    NumberFormatsSupplier: XNumberFormatsSupplier,
    Password: String,
    PropertySetInfo: XPropertySetInfo,
    QueryDefinitions: XNameAccess,
    Settings: XPropertySet,
    SuppressVersionColumns: Boolean,
    TableFilter: SafeArray[String],
    TableTypeFilter: SafeArray[String],
    URL: String,
    User: String,
    acquire: () => Unit,
    addFlushListener: XFlushListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    connectWithCompletion: XInteractionHandler => XConnection,
    flush: () => Unit,
    getBookmarks: () => XNameAccess,
    getConnection: (String, String) => XConnection,
    getIsolatedConnection: (String, String) => XConnection,
    getIsolatedConnectionWithCompletion: XInteractionHandler => XConnection,
    getLoginTimeout: () => Double,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getQueryDefinitions: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeFlushListener: XFlushListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setLoginTimeout: Double => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): DocumentDataSource = {
    val __obj = js.Dynamic.literal(Bookmarks = Bookmarks, DatabaseDocument = DatabaseDocument, Info = Info, IsPasswordRequired = IsPasswordRequired, IsReadOnly = IsReadOnly, LoginTimeout = LoginTimeout, Name = Name, NumberFormatsSupplier = NumberFormatsSupplier, Password = Password, PropertySetInfo = PropertySetInfo, QueryDefinitions = QueryDefinitions, Settings = Settings, SuppressVersionColumns = SuppressVersionColumns, TableFilter = TableFilter, TableTypeFilter = TableTypeFilter, URL = URL, User = User, acquire = js.Any.fromFunction0(acquire), addFlushListener = js.Any.fromFunction1(addFlushListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), connectWithCompletion = js.Any.fromFunction1(connectWithCompletion), flush = js.Any.fromFunction0(flush), getBookmarks = js.Any.fromFunction0(getBookmarks), getConnection = js.Any.fromFunction2(getConnection), getIsolatedConnection = js.Any.fromFunction2(getIsolatedConnection), getIsolatedConnectionWithCompletion = js.Any.fromFunction1(getIsolatedConnectionWithCompletion), getLoginTimeout = js.Any.fromFunction0(getLoginTimeout), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getQueryDefinitions = js.Any.fromFunction0(getQueryDefinitions), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeFlushListener = js.Any.fromFunction1(removeFlushListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setLoginTimeout = js.Any.fromFunction1(setLoginTimeout), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[DocumentDataSource]
  }
}

