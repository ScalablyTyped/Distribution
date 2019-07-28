package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRemediationExecutionStatusRequest extends js.Object {
  /**
    * A list of AWS Config rule names.
    */
  var ConfigRuleName: StringWithCharLimit64
  /**
    * The maximum number of RemediationExecutionStatuses returned on each page. The default is maximum. If you specify 0, AWS Config uses the default. 
    */
  var Limit: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.Limit] = js.undefined
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[StringWithCharLimit256] = js.undefined
  /**
    * A list of resource keys to be processed with the current request. Each element in the list consists of the resource type and resource ID. 
    */
  var ResourceKeys: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ResourceKeys] = js.undefined
}

object DescribeRemediationExecutionStatusRequest {
  @scala.inline
  def apply(
    ConfigRuleName: StringWithCharLimit64,
    Limit: js.UndefOr[Limit] = js.undefined,
    NextToken: StringWithCharLimit256 = null,
    ResourceKeys: ResourceKeys = null
  ): DescribeRemediationExecutionStatusRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ResourceKeys != null) __obj.updateDynamic("ResourceKeys")(ResourceKeys)
    __obj.asInstanceOf[DescribeRemediationExecutionStatusRequest]
  }
}

