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

object XPooledConnection {
  @scala.inline
  def apply(
    Connection: XConnection,
    acquire: js.Function0[scala.Unit],
    getConnection: js.Function0[XConnection],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XPooledConnection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Connection")(Connection)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getConnection")(getConnection)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XPooledConnection]
  }
}

