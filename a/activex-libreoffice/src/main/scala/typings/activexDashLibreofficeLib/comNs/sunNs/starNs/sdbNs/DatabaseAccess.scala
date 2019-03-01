package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a component, which controls DatabaseAccessConnections and acts like a shared {@link DataSource} .
  * @deprecated Deprecated
  */
trait DatabaseAccess
  extends XDatabaseAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with XCompletedConnection {
  /** is a list of arbitrary string tag/value pairs as connection arguments; normally at least a "user" and "password" property should be included. */
  var ConnectInfo: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /** indicates a database url of the form ; ` jdbc:subprotocol:subname` or ` sdbc:subprotocol:subname` */
  var ConnectURL: java.lang.String
  /** indicates that a password is always necessary. */
  var IsPasswordRequired: scala.Boolean
  /** determines whether modifications on the data access bean are allowed or not. */
  var IsReadOnly: scala.Boolean
  /** provides an object for formatting numbers. */
  var NumberFormatsSupplier: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XNumberFormatsSupplier
  /** defines a list of tables, on which the bean should have it's focus. If empty, all tables are rejected. */
  var TableFilter: activexDashInteropLib.SafeArray[java.lang.String]
  /** defines a list of table types, on which the bean should have it's focus. If empty, all tables types are rejected. */
  var TableTypeFilter: activexDashInteropLib.SafeArray[java.lang.String]
  /** is the title of the bean. */
  var Title: java.lang.String
  /** is the URL of the bean. */
  var URL: java.lang.String
}

object DatabaseAccess {
  @scala.inline
  def apply(
    ConnectInfo: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    ConnectURL: java.lang.String,
    IsPasswordRequired: scala.Boolean,
    IsReadOnly: scala.Boolean,
    LoginTimeout: scala.Double,
    NumberFormatsSupplier: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XNumberFormatsSupplier,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    TableFilter: activexDashInteropLib.SafeArray[java.lang.String],
    TableTypeFilter: activexDashInteropLib.SafeArray[java.lang.String],
    Title: java.lang.String,
    URL: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addDatabaseAccessListener: js.Function1[XDatabaseAccessListener, scala.Unit],
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
    getLoginTimeout: js.Function0[scala.Double],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    hasConnections: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeDatabaseAccessListener: js.Function1[XDatabaseAccessListener, scala.Unit],
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
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    suspendConnections: js.Function0[scala.Boolean]
  ): DatabaseAccess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ConnectInfo")(ConnectInfo)
    __obj.updateDynamic("ConnectURL")(ConnectURL)
    __obj.updateDynamic("IsPasswordRequired")(IsPasswordRequired)
    __obj.updateDynamic("IsReadOnly")(IsReadOnly)
    __obj.updateDynamic("LoginTimeout")(LoginTimeout)
    __obj.updateDynamic("NumberFormatsSupplier")(NumberFormatsSupplier)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("TableFilter")(TableFilter)
    __obj.updateDynamic("TableTypeFilter")(TableTypeFilter)
    __obj.updateDynamic("Title")(Title)
    __obj.updateDynamic("URL")(URL)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addDatabaseAccessListener")(addDatabaseAccessListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("connectWithCompletion")(connectWithCompletion)
    __obj.updateDynamic("getConnection")(getConnection)
    __obj.updateDynamic("getIsolatedConnection")(getIsolatedConnection)
    __obj.updateDynamic("getLoginTimeout")(getLoginTimeout)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("hasConnections")(hasConnections)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeDatabaseAccessListener")(removeDatabaseAccessListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setLoginTimeout")(setLoginTimeout)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("suspendConnections")(suspendConnections)
    __obj.asInstanceOf[DatabaseAccess]
  }
}

