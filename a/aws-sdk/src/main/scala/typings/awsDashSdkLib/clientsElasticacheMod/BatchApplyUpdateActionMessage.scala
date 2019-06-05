package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchApplyUpdateActionMessage extends js.Object {
  /**
    * The replication group IDs
    */
  var ReplicationGroupIds: ReplicationGroupIdList
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: String
}

object BatchApplyUpdateActionMessage {
  @scala.inline
  def apply(ReplicationGroupIds: ReplicationGroupIdList, ServiceUpdateName: String): BatchApplyUpdateActionMessage = {
    val __obj = js.Dynamic.literal(ReplicationGroupIds = ReplicationGroupIds, ServiceUpdateName = ServiceUpdateName)
  
    __obj.asInstanceOf[BatchApplyUpdateActionMessage]
  }
}

