package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConnectionsOnInterconnectRequest extends js.Object {
  /**
    * The ID of the interconnect.
    */
  var interconnectId: InterconnectId
}

object DescribeConnectionsOnInterconnectRequest {
  @scala.inline
  def apply(interconnectId: InterconnectId): DescribeConnectionsOnInterconnectRequest = {
    val __obj = js.Dynamic.literal(interconnectId = interconnectId)
  
    __obj.asInstanceOf[DescribeConnectionsOnInterconnectRequest]
  }
}

