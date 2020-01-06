package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeComplianceByResourceResponse extends js.Object {
  /**
    * Indicates whether the specified AWS resource complies with all of the AWS Config rules that evaluate it.
    */
  var ComplianceByResources: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ComplianceByResources] = js.native
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.NextToken] = js.native
}

object DescribeComplianceByResourceResponse {
  @scala.inline
  def apply(ComplianceByResources: ComplianceByResources = null, NextToken: NextToken = null): DescribeComplianceByResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (ComplianceByResources != null) __obj.updateDynamic("ComplianceByResources")(ComplianceByResources.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeComplianceByResourceResponse]
  }
}

