package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeHostedConnectionsRequest extends js.Object {
  /**
    * The ID of the interconnect or LAG.
    */
  var connectionId: ConnectionId
}

object DescribeHostedConnectionsRequest {
  @scala.inline
  def apply(connectionId: ConnectionId): DescribeHostedConnectionsRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId)
  
    __obj.asInstanceOf[DescribeHostedConnectionsRequest]
  }
}

