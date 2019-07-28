package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XConnection
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.XInteractionHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XNumberFormatsSupplier
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a component, which controls DatabaseAccessConnections and acts like a shared {@link DataSource} .
  * @deprecated Deprecated
  */
trait DatabaseAccess
  extends XDatabaseAccess
     with XPropertySet
     with XCompletedConnection {
  /** is a list of arbitrary string tag/value pairs as connection arguments; normally at least a "user" and "password" property should be included. */
  var ConnectInfo: SafeArray[PropertyValue]
  /** indicates a database url of the form ; ` jdbc:subprotocol:subname` or ` sdbc:subprotocol:subname` */
  var ConnectURL: String
  /** indicates that a password is always necessary. */
  var IsPasswordRequired: Boolean
  /** determines whether modifications on the data access bean are allowed or not. */
  var IsReadOnly: Boolean
  /** provides an object for formatting numbers. */
  var NumberFormatsSupplier: XNumberFormatsSupplier
  /** defines a list of tables, on which the bean should have it's focus. If empty, all tables are rejected. */
  var TableFilter: SafeArray[String]
  /** defines a list of table types, on which the bean should have it's focus. If empty, all tables types are rejected. */
  var TableTypeFilter: SafeArray[String]
  /** is the title of the bean. */
  var Title: String
  /** is the URL of the bean. */
  var URL: String
}

object DatabaseAccess {
  @scala.inline
  def apply(
    ConnectInfo: SafeArray[PropertyValue],
    ConnectURL: String,
    IsPasswordRequired: Boolean,
    IsReadOnly: Boolean,
    LoginTimeout: Double,
    NumberFormatsSupplier: XNumberFormatsSupplier,
    PropertySetInfo: XPropertySetInfo,
    TableFilter: SafeArray[String],
    TableTypeFilter: SafeArray[String],
    Title: String,
    URL: String,
    acquire: () => Unit,
    addDatabaseAccessListener: XDatabaseAccessListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    connectWithCompletion: XInteractionHandler => XConnection,
    getConnection: (String, String) => XConnection,
    getIsolatedConnection: (String, String) => XConnection,
    getLoginTimeout: () => Double,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    hasConnections: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeDatabaseAccessListener: XDatabaseAccessListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setLoginTimeout: Double => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    suspendConnections: () => Boolean
  ): DatabaseAccess = {
    val __obj = js.Dynamic.literal(ConnectInfo = ConnectInfo, ConnectURL = ConnectURL, IsPasswordRequired = IsPasswordRequired, IsReadOnly = IsReadOnly, LoginTimeout = LoginTimeout, NumberFormatsSupplier = NumberFormatsSupplier, PropertySetInfo = PropertySetInfo, TableFilter = TableFilter, TableTypeFilter = TableTypeFilter, Title = Title, URL = URL, acquire = js.Any.fromFunction0(acquire), addDatabaseAccessListener = js.Any.fromFunction1(addDatabaseAccessListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), connectWithCompletion = js.Any.fromFunction1(connectWithCompletion), getConnection = js.Any.fromFunction2(getConnection), getIsolatedConnection = js.Any.fromFunction2(getIsolatedConnection), getLoginTimeout = js.Any.fromFunction0(getLoginTimeout), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), hasConnections = js.Any.fromFunction0(hasConnections), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDatabaseAccessListener = js.Any.fromFunction1(removeDatabaseAccessListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setLoginTimeout = js.Any.fromFunction1(setLoginTimeout), setPropertyValue = js.Any.fromFunction2(setPropertyValue), suspendConnections = js.Any.fromFunction0(suspendConnections))
  
    __obj.asInstanceOf[DatabaseAccess]
  }
}

