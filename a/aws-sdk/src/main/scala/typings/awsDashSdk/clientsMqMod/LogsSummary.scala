package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogsSummary extends js.Object {
  /**
    * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
    */
  var Audit: js.UndefOr[__boolean] = js.undefined
  /**
    * The location of the CloudWatch Logs log group where audit logs are sent.
    */
  var AuditLogGroup: js.UndefOr[__string] = js.undefined
  /**
    * Enables general logging.
    */
  var General: js.UndefOr[__boolean] = js.undefined
  /**
    * The location of the CloudWatch Logs log group where general logs are sent.
    */
  var GeneralLogGroup: js.UndefOr[__string] = js.undefined
  /**
    * The list of information about logs pending to be deployed for the specified broker.
    */
  var Pending: js.UndefOr[PendingLogs] = js.undefined
}

object LogsSummary {
  @scala.inline
  def apply(
    Audit: js.UndefOr[Boolean] = js.undefined,
    AuditLogGroup: __string = null,
    General: js.UndefOr[Boolean] = js.undefined,
    GeneralLogGroup: __string = null,
    Pending: PendingLogs = null
  ): LogsSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Audit)) __obj.updateDynamic("Audit")(Audit)
    if (AuditLogGroup != null) __obj.updateDynamic("AuditLogGroup")(AuditLogGroup)
    if (!js.isUndefined(General)) __obj.updateDynamic("General")(General)
    if (GeneralLogGroup != null) __obj.updateDynamic("GeneralLogGroup")(GeneralLogGroup)
    if (Pending != null) __obj.updateDynamic("Pending")(Pending)
    __obj.asInstanceOf[LogsSummary]
  }
}

