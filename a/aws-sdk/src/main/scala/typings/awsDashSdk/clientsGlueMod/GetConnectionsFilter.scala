package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectionsFilter extends js.Object {
  /**
    * The type of connections to return. Currently, only JDBC is supported; SFTP is not supported.
    */
  var ConnectionType: js.UndefOr[typings.awsDashSdk.clientsGlueMod.ConnectionType] = js.undefined
  /**
    * A criteria string that must match the criteria recorded in the connection definition for that connection definition to be returned.
    */
  var MatchCriteria: js.UndefOr[typings.awsDashSdk.clientsGlueMod.MatchCriteria] = js.undefined
}

object GetConnectionsFilter {
  @scala.inline
  def apply(ConnectionType: ConnectionType = null, MatchCriteria: MatchCriteria = null): GetConnectionsFilter = {
    val __obj = js.Dynamic.literal()
    if (ConnectionType != null) __obj.updateDynamic("ConnectionType")(ConnectionType.asInstanceOf[js.Any])
    if (MatchCriteria != null) __obj.updateDynamic("MatchCriteria")(MatchCriteria)
    __obj.asInstanceOf[GetConnectionsFilter]
  }
}

