package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebootReplicationInstanceMessage extends js.Object {
  /**
    * If this parameter is true, the reboot is conducted through a Multi-AZ failover. (If the instance isn't configured for Multi-AZ, then you can't specify true.)
    */
  var ForceFailover: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  var ReplicationInstanceArn: String
}

object RebootReplicationInstanceMessage {
  @scala.inline
  def apply(ReplicationInstanceArn: String, ForceFailover: js.UndefOr[scala.Boolean] = js.undefined): RebootReplicationInstanceMessage = {
    val __obj = js.Dynamic.literal(ReplicationInstanceArn = ReplicationInstanceArn)
    if (!js.isUndefined(ForceFailover)) __obj.updateDynamic("ForceFailover")(ForceFailover)
    __obj.asInstanceOf[RebootReplicationInstanceMessage]
  }
}

