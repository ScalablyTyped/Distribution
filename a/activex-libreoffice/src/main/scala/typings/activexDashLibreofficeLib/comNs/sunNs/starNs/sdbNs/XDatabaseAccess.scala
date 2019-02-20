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

