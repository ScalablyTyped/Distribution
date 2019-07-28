package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAuditStreamConfigurationResponse extends js.Object {
  /**
    * The ARN of the Amazon Kinesis data stream that will receive the audit events.
    */
  var AuditStreamArn: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.AuditStreamArn] = js.undefined
}

object DescribeAuditStreamConfigurationResponse {
  @scala.inline
  def apply(AuditStreamArn: AuditStreamArn = null): DescribeAuditStreamConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (AuditStreamArn != null) __obj.updateDynamic("AuditStreamArn")(AuditStreamArn)
    __obj.asInstanceOf[DescribeAuditStreamConfigurationResponse]
  }
}

