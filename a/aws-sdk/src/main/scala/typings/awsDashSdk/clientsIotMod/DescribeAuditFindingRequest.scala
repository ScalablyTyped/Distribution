package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAuditFindingRequest extends js.Object {
  /**
    * A unique identifier for a single audit finding. You can use this identifier to apply mitigation actions to the finding.
    */
  var findingId: FindingId
}

object DescribeAuditFindingRequest {
  @scala.inline
  def apply(findingId: FindingId): DescribeAuditFindingRequest = {
    val __obj = js.Dynamic.literal(findingId = findingId)
  
    __obj.asInstanceOf[DescribeAuditFindingRequest]
  }
}

