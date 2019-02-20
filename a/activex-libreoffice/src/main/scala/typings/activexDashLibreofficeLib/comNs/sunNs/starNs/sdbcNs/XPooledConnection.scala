package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines a pooled connection which can share a unused connection.
  *
  * <p>
  *
  * PoolConnections are handled by the connection pool.
  *
  * </p>
  *
  * <p>
  *
  * When the method
  *
  * com::sun::star::sdbc::XPooledConnection::getConnection()
  *
  * is called, the PooledConnection returns the connection which is pooled.
  *
  * </p>
  * @@see com::sun::star::sdbc::XConnection
  */
trait XPooledConnection
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * return the connection which is pooled
    * @returns the pooled {@link Connection} object
    * @throws SQLException if a database access error occurs.
    */
  val Connection: XConnection
  /**
    * return the connection which is pooled
    * @returns the pooled {@link Connection} object
    * @throws SQLException if a database access error occurs.
    */
  def getConnection(): XConnection
}

