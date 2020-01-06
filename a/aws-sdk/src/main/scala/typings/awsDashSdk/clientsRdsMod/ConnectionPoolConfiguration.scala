package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionPoolConfiguration extends js.Object {
  /**
    * The number of seconds for a proxy to wait for a connection to become available in the connection pool. Only applies when the proxy has opened its maximum number of connections and all connections are busy with client sessions. Default: 120 Constraints: between 1 and 3600, or 0 representing unlimited
    */
  var ConnectionBorrowTimeout: js.UndefOr[IntegerOptional] = js.native
  /**
    *  One or more SQL statements for the proxy to run when opening each new database connection. Typically used with SET statements to make sure that each connection has identical settings such as time zone and character set. For multiple statements, use semicolons as the separator. You can also include multiple variables in a single SET statement, such as SET x=1, y=2.  Default: no initialization query
    */
  var InitQuery: js.UndefOr[String] = js.native
  /**
    * The maximum size of the connection pool for each target in a target group. For Aurora MySQL, it is expressed as a percentage of the max_connections setting for the RDS DB instance or Aurora DB cluster used by the target group. Default: 100 Constraints: between 1 and 100
    */
  var MaxConnectionsPercent: js.UndefOr[IntegerOptional] = js.native
  /**
    *  Controls how actively the proxy closes idle database connections in the connection pool. A high value enables the proxy to leave a high percentage of idle connections open. A low value causes the proxy to close idle client connections and return the underlying database connections to the connection pool. For Aurora MySQL, it is expressed as a percentage of the max_connections setting for the RDS DB instance or Aurora DB cluster used by the target group.  Default: 50 Constraints: between 0 and MaxConnectionsPercent 
    */
  var MaxIdleConnectionsPercent: js.UndefOr[IntegerOptional] = js.native
  /**
    * Each item in the list represents a class of SQL operations that normally cause all later statements in a session using a proxy to be pinned to the same underlying database connection. Including an item in the list exempts that class of SQL operations from the pinning behavior. Default: no session pinning filters
    */
  var SessionPinningFilters: js.UndefOr[StringList] = js.native
}

object ConnectionPoolConfiguration {
  @scala.inline
  def apply(
    ConnectionBorrowTimeout: Int | scala.Double = null,
    InitQuery: String = null,
    MaxConnectionsPercent: Int | scala.Double = null,
    MaxIdleConnectionsPercent: Int | scala.Double = null,
    SessionPinningFilters: StringList = null
  ): ConnectionPoolConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ConnectionBorrowTimeout != null) __obj.updateDynamic("ConnectionBorrowTimeout")(ConnectionBorrowTimeout.asInstanceOf[js.Any])
    if (InitQuery != null) __obj.updateDynamic("InitQuery")(InitQuery.asInstanceOf[js.Any])
    if (MaxConnectionsPercent != null) __obj.updateDynamic("MaxConnectionsPercent")(MaxConnectionsPercent.asInstanceOf[js.Any])
    if (MaxIdleConnectionsPercent != null) __obj.updateDynamic("MaxIdleConnectionsPercent")(MaxIdleConnectionsPercent.asInstanceOf[js.Any])
    if (SessionPinningFilters != null) __obj.updateDynamic("SessionPinningFilters")(SessionPinningFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionPoolConfiguration]
  }
}

