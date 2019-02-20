package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a factory to create data access beans. Data access beans are shared among components, so if an already existing bean is requested, the existing one
  * is returned.
  * @deprecated Deprecated
  */
trait DatabaseAccessDataSource
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XDataSource
     with XCompletedConnection {
  /** determines the password handling. */
  var PasswordMode: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.RememberAuthentication
  /** locates the database access bean. */
  var URL: java.lang.String
}

