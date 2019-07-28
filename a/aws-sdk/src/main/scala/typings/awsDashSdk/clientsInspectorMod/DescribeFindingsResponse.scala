package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFindingsResponse extends js.Object {
  /**
    * Finding details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems
  /**
    * Information about the finding.
    */
  var findings: FindingList
}

object DescribeFindingsResponse {
  @scala.inline
  def apply(failedItems: FailedItems, findings: FindingList): DescribeFindingsResponse = {
    val __obj = js.Dynamic.literal(failedItems = failedItems, findings = findings)
  
    __obj.asInstanceOf[DescribeFindingsResponse]
  }
}

