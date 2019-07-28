package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConnectionsRequest extends js.Object {
  /**
    * The ID of the connection.
    */
  var connectionId: js.UndefOr[ConnectionId] = js.undefined
}

object DescribeConnectionsRequest {
  @scala.inline
  def apply(connectionId: ConnectionId = null): DescribeConnectionsRequest = {
    val __obj = js.Dynamic.literal()
    if (connectionId != null) __obj.updateDynamic("connectionId")(connectionId)
    __obj.asInstanceOf[DescribeConnectionsRequest]
  }
}

