package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchStopUpdateActionMessage extends js.Object {
  /**
    * The replication group IDs
    */
  var ReplicationGroupIds: ReplicationGroupIdList
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: String
}

object BatchStopUpdateActionMessage {
  @scala.inline
  def apply(ReplicationGroupIds: ReplicationGroupIdList, ServiceUpdateName: String): BatchStopUpdateActionMessage = {
    val __obj = js.Dynamic.literal(ReplicationGroupIds = ReplicationGroupIds, ServiceUpdateName = ServiceUpdateName)
  
    __obj.asInstanceOf[BatchStopUpdateActionMessage]
  }
}

