package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateReplicationGroupResult extends js.Object {
  var ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
}

object CreateReplicationGroupResult {
  @scala.inline
  def apply(ReplicationGroup: ReplicationGroup = null): CreateReplicationGroupResult = {
    val __obj = js.Dynamic.literal()
    if (ReplicationGroup != null) __obj.updateDynamic("ReplicationGroup")(ReplicationGroup)
    __obj.asInstanceOf[CreateReplicationGroupResult]
  }
}

