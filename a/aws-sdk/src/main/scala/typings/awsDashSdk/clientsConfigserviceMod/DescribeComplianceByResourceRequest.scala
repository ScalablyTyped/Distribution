package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeComplianceByResourceRequest extends js.Object {
  /**
    * Filters the results by compliance. The allowed values are COMPLIANT, NON_COMPLIANT, and INSUFFICIENT_DATA.
    */
  var ComplianceTypes: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ComplianceTypes] = js.native
  /**
    * The maximum number of evaluation results returned on each page. The default is 10. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.Limit] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.NextToken] = js.native
  /**
    * The ID of the AWS resource for which you want compliance information. You can specify only one resource ID. If you specify a resource ID, you must also specify a type for ResourceType.
    */
  var ResourceId: js.UndefOr[BaseResourceId] = js.native
  /**
    * The types of AWS resources for which you want compliance information (for example, AWS::EC2::Instance). For this action, you can specify that the resource type is an AWS account by specifying AWS::::Account.
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.native
}

object DescribeComplianceByResourceRequest {
  @scala.inline
  def apply(
    ComplianceTypes: ComplianceTypes = null,
    Limit: Int | Double = null,
    NextToken: NextToken = null,
    ResourceId: BaseResourceId = null,
    ResourceType: StringWithCharLimit256 = null
  ): DescribeComplianceByResourceRequest = {
    val __obj = js.Dynamic.literal()
    if (ComplianceTypes != null) __obj.updateDynamic("ComplianceTypes")(ComplianceTypes.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeComplianceByResourceRequest]
  }
}

