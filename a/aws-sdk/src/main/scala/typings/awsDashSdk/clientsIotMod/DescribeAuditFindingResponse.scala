package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAuditFindingResponse extends js.Object {
  var finding: js.UndefOr[AuditFinding] = js.undefined
}

object DescribeAuditFindingResponse {
  @scala.inline
  def apply(finding: AuditFinding = null): DescribeAuditFindingResponse = {
    val __obj = js.Dynamic.literal()
    if (finding != null) __obj.updateDynamic("finding")(finding)
    __obj.asInstanceOf[DescribeAuditFindingResponse]
  }
}

