package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typings.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typings.activexLibreoffice.com_.sun.star.util.XFlushListener
import typings.activexLibreoffice.com_.sun.star.util.XNumberFormatsSupplier
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * simplifies the accessing of data sources and it's corresponding database document.
  * @see DataSource
  * @see XDocumentDataSource
  */
trait DocumentDataSource
  extends StObject
     with DataSource
     with XDocumentDataSource
object DocumentDataSource {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(Bookmarks = Bookmarks.asInstanceOf[js.Any], DatabaseDocument = DatabaseDocument.asInstanceOf[js.Any], Info = Info.asInstanceOf[js.Any], IsPasswordRequired = IsPasswordRequired.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], LoginTimeout = LoginTimeout.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberFormatsSupplier = NumberFormatsSupplier.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], QueryDefinitions = QueryDefinitions.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any], SuppressVersionColumns = SuppressVersionColumns.asInstanceOf[js.Any], TableFilter = TableFilter.asInstanceOf[js.Any], TableTypeFilter = TableTypeFilter.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addFlushListener = js.Any.fromFunction1(addFlushListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), connectWithCompletion = js.Any.fromFunction1(connectWithCompletion), flush = js.Any.fromFunction0(flush), getBookmarks = js.Any.fromFunction0(getBookmarks), getConnection = js.Any.fromFunction2(getConnection), getIsolatedConnection = js.Any.fromFunction2(getIsolatedConnection), getIsolatedConnectionWithCompletion = js.Any.fromFunction1(getIsolatedConnectionWithCompletion), getLoginTimeout = js.Any.fromFunction0(getLoginTimeout), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getQueryDefinitions = js.Any.fromFunction0(getQueryDefinitions), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeFlushListener = js.Any.fromFunction1(removeFlushListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setLoginTimeout = js.Any.fromFunction1(setLoginTimeout), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[DocumentDataSource]
  }
}
