package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAuditStreamConfigurationRequest extends js.Object {
  /**
    * The ARN of the Amazon Kinesis data stream that receives the audit events.
    */
  var AuditStreamArn: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.AuditStreamArn] = js.undefined
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsDashSdk.clientsWorklinkMod.FleetArn
}

object UpdateAuditStreamConfigurationRequest {
  @scala.inline
  def apply(FleetArn: FleetArn, AuditStreamArn: AuditStreamArn = null): UpdateAuditStreamConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn)
    if (AuditStreamArn != null) __obj.updateDynamic("AuditStreamArn")(AuditStreamArn)
    __obj.asInstanceOf[UpdateAuditStreamConfigurationRequest]
  }
}

