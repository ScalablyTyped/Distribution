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
    acquire: js.Function0[scala.Unit],
    addDatabaseAccessListener: js.Function1[XDatabaseAccessListener, scala.Unit],
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
    hasConnections: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeDatabaseAccessListener: js.Function1[XDatabaseAccessListener, scala.Unit],
    setLoginTimeout: js.Function1[scala.Double, scala.Unit],
    suspendConnections: js.Function0[scala.Boolean]
  ): XDatabaseAccess = {
    val __obj = js.Dynamic.literal(LoginTimeout = LoginTimeout, acquire = acquire, addDatabaseAccessListener = addDatabaseAccessListener, getConnection = getConnection, getIsolatedConnection = getIsolatedConnection, getLoginTimeout = getLoginTimeout, hasConnections = hasConnections, queryInterface = queryInterface, release = release, removeDatabaseAccessListener = removeDatabaseAccessListener, setLoginTimeout = setLoginTimeout, suspendConnections = suspendConnections)
  
    __obj.asInstanceOf[XDatabaseAccess]
  }
}

