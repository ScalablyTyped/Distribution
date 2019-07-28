package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetComplianceDetailsByResourceRequest extends js.Object {
  /**
    * Filters the results by compliance. The allowed values are COMPLIANT, NON_COMPLIANT, and NOT_APPLICABLE.
    */
  var ComplianceTypes: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ComplianceTypes] = js.undefined
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The ID of the AWS resource for which you want compliance information.
    */
  var ResourceId: BaseResourceId
  /**
    * The type of the AWS resource for which you want compliance information.
    */
  var ResourceType: StringWithCharLimit256
}

object GetComplianceDetailsByResourceRequest {
  @scala.inline
  def apply(
    ResourceId: BaseResourceId,
    ResourceType: StringWithCharLimit256,
    ComplianceTypes: ComplianceTypes = null,
    NextToken: String = null
  ): GetComplianceDetailsByResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId, ResourceType = ResourceType)
    if (ComplianceTypes != null) __obj.updateDynamic("ComplianceTypes")(ComplianceTypes)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetComplianceDetailsByResourceRequest]
  }
}

