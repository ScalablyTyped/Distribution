package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typings.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typings.activexLibreoffice.com_.sun.star.util.XNumberFormatsSupplier
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a component, which controls DatabaseAccessConnections and acts like a shared {@link DataSource} .
  * @deprecated Deprecated
  */
@js.native
trait DatabaseAccess
  extends XDatabaseAccess
     with XPropertySet
     with XCompletedConnection {
  /** is a list of arbitrary string tag/value pairs as connection arguments; normally at least a "user" and "password" property should be included. */
  var ConnectInfo: SafeArray[PropertyValue] = js.native
  /** indicates a database url of the form ; ` jdbc:subprotocol:subname` or ` sdbc:subprotocol:subname` */
  var ConnectURL: String = js.native
  /** indicates that a password is always necessary. */
  var IsPasswordRequired: Boolean = js.native
  /** determines whether modifications on the data access bean are allowed or not. */
  var IsReadOnly: Boolean = js.native
  /** provides an object for formatting numbers. */
  var NumberFormatsSupplier: XNumberFormatsSupplier = js.native
  /** defines a list of tables, on which the bean should have it's focus. If empty, all tables are rejected. */
  var TableFilter: SafeArray[String] = js.native
  /** defines a list of table types, on which the bean should have it's focus. If empty, all tables types are rejected. */
  var TableTypeFilter: SafeArray[String] = js.native
  /** is the title of the bean. */
  var Title: String = js.native
  /** is the URL of the bean. */
  var URL: String = js.native
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
    val __obj = js.Dynamic.literal(ConnectInfo = ConnectInfo.asInstanceOf[js.Any], ConnectURL = ConnectURL.asInstanceOf[js.Any], IsPasswordRequired = IsPasswordRequired.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], LoginTimeout = LoginTimeout.asInstanceOf[js.Any], NumberFormatsSupplier = NumberFormatsSupplier.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TableFilter = TableFilter.asInstanceOf[js.Any], TableTypeFilter = TableTypeFilter.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addDatabaseAccessListener = js.Any.fromFunction1(addDatabaseAccessListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), connectWithCompletion = js.Any.fromFunction1(connectWithCompletion), getConnection = js.Any.fromFunction2(getConnection), getIsolatedConnection = js.Any.fromFunction2(getIsolatedConnection), getLoginTimeout = js.Any.fromFunction0(getLoginTimeout), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), hasConnections = js.Any.fromFunction0(hasConnections), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDatabaseAccessListener = js.Any.fromFunction1(removeDatabaseAccessListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setLoginTimeout = js.Any.fromFunction1(setLoginTimeout), setPropertyValue = js.Any.fromFunction2(setPropertyValue), suspendConnections = js.Any.fromFunction0(suspendConnections))
    __obj.asInstanceOf[DatabaseAccess]
  }
  @scala.inline
  implicit class DatabaseAccessOps[Self <: DatabaseAccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnectInfo(value: SafeArray[PropertyValue]): Self = this.set("ConnectInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectURL(value: String): Self = this.set("ConnectURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPasswordRequired(value: Boolean): Self = this.set("IsPasswordRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = this.set("IsReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberFormatsSupplier(value: XNumberFormatsSupplier): Self = this.set("NumberFormatsSupplier", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableFilter(value: SafeArray[String]): Self = this.set("TableFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableTypeFilter(value: SafeArray[String]): Self = this.set("TableTypeFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    @scala.inline
    def setURL(value: String): Self = this.set("URL", value.asInstanceOf[js.Any])
  }
  
}

