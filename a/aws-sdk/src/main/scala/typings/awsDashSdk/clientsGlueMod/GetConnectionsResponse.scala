package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectionsResponse extends js.Object {
  /**
    * A list of requested connection definitions.
    */
  var ConnectionList: js.UndefOr[typings.awsDashSdk.clientsGlueMod.ConnectionList] = js.undefined
  /**
    * A continuation token, if the list of connections returned does not include the last of the filtered connections.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}

object GetConnectionsResponse {
  @scala.inline
  def apply(ConnectionList: ConnectionList = null, NextToken: Token = null): GetConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    if (ConnectionList != null) __obj.updateDynamic("ConnectionList")(ConnectionList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetConnectionsResponse]
  }
}

