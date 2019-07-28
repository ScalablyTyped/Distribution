package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
trait XPooledConnection extends XInterface {
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

object XPooledConnection {
  @scala.inline
  def apply(
    Connection: XConnection,
    acquire: () => Unit,
    getConnection: () => XConnection,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPooledConnection = {
    val __obj = js.Dynamic.literal(Connection = Connection, acquire = js.Any.fromFunction0(acquire), getConnection = js.Any.fromFunction0(getConnection), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XPooledConnection]
  }
}

