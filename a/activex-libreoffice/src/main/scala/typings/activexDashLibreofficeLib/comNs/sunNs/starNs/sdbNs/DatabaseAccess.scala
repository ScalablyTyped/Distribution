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

