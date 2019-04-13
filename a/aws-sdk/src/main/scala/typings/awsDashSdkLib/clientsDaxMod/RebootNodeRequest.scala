package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebootNodeRequest extends js.Object {
  /**
    * The name of the DAX cluster containing the node to be rebooted.
    */
  var ClusterName: String
  /**
    * The system-assigned ID of the node to be rebooted.
    */
  var NodeId: String
}

object RebootNodeRequest {
  @scala.inline
  def apply(ClusterName: String, NodeId: String): RebootNodeRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName, NodeId = NodeId)
  
    __obj.asInstanceOf[RebootNodeRequest]
  }
}

