package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is not to be used anymore
  * @deprecated Deprecated
  */
trait XDatabaseAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XDataSource {
  def addDatabaseAccessListener(listener: XDatabaseAccessListener): scala.Unit
  def getIsolatedConnection(user: java.lang.String, password: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection
  def hasConnections(): scala.Boolean
  def removeDatabaseAccessListener(listener: XDatabaseAccessListener): scala.Unit
  def suspendConnections(): scala.Boolean
}

object XDatabaseAccess {
  @scala.inline
  def apply(
    LoginTimeout: scala.Double,
    acquire: () => scala.Unit,
    addDatabaseAccessListener: XDatabaseAccessListener => scala.Unit,
    getConnection: (java.lang.String, java.lang.String) => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    getIsolatedConnection: (java.lang.String, java.lang.String) => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    getLoginTimeout: () => scala.Double,
    hasConnections: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeDatabaseAccessListener: XDatabaseAccessListener => scala.Unit,
    setLoginTimeout: scala.Double => scala.Unit,
    suspendConnections: () => scala.Boolean
  ): XDatabaseAccess = {
    val __obj = js.Dynamic.literal(LoginTimeout = LoginTimeout, acquire = js.Any.fromFunction0(acquire), addDatabaseAccessListener = js.Any.fromFunction1(addDatabaseAccessListener), getConnection = js.Any.fromFunction2(getConnection), getIsolatedConnection = js.Any.fromFunction2(getIsolatedConnection), getLoginTimeout = js.Any.fromFunction0(getLoginTimeout), hasConnections = js.Any.fromFunction0(hasConnections), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDatabaseAccessListener = js.Any.fromFunction1(removeDatabaseAccessListener), setLoginTimeout = js.Any.fromFunction1(setLoginTimeout), suspendConnections = js.Any.fromFunction0(suspendConnections))
  
    __obj.asInstanceOf[XDatabaseAccess]
  }
}

