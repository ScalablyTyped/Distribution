package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartOnDemandAuditTaskRequest extends js.Object {
  /**
    * Which checks are performed during the audit. The checks you specify must be enabled for your account or an exception occurs. Use DescribeAccountAuditConfiguration to see the list of all checks, including those that are enabled or UpdateAccountAuditConfiguration to select which checks are enabled.
    */
  var targetCheckNames: TargetAuditCheckNames
}

object StartOnDemandAuditTaskRequest {
  @scala.inline
  def apply(targetCheckNames: TargetAuditCheckNames): StartOnDemandAuditTaskRequest = {
    val __obj = js.Dynamic.literal(targetCheckNames = targetCheckNames)
  
    __obj.asInstanceOf[StartOnDemandAuditTaskRequest]
  }
}

