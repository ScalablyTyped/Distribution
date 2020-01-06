package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMigrationMessage extends js.Object {
  /**
    * List of endpoints from which data should be migrated. For Redis (cluster mode disabled), list should have only one element.
    */
  var CustomerNodeEndpointList: typings.awsDashSdk.clientsElasticacheMod.CustomerNodeEndpointList = js.native
  /**
    * The ID of the replication group to which data should be migrated.
    */
  var ReplicationGroupId: String = js.native
}

object StartMigrationMessage {
  @scala.inline
  def apply(CustomerNodeEndpointList: CustomerNodeEndpointList, ReplicationGroupId: String): StartMigrationMessage = {
    val __obj = js.Dynamic.literal(CustomerNodeEndpointList = CustomerNodeEndpointList.asInstanceOf[js.Any], ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartMigrationMessage]
  }
}

