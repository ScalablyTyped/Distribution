package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a connection (session) with a specific database. Within the context of a {@link Connection} , SQL statements are executed and results are
  * returned.
  *
  * A {@link Connection} 's database is able to provide information describing its tables, its supported SQL grammar, its stored procedures, and the
  * capabilities of this connection. This information is obtained with the {@link com.sun.star.sdbc.XConnection.getMetaData()} method.
  *
  * ** Note: ** By default the {@link Connection} automatically commits changes after executing each statement. If auto commit has been disabled, an
  * explicit commit must be done or database changes will not be saved.
  * @see com.sun.star.sdbc.XStatement
  * @see com.sun.star.sdbc.XResultSet
  * @see com.sun.star.sdbc.XDatabaseMetaData
  */
trait Connection
  extends XConnection
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with XWarningsSupplier

