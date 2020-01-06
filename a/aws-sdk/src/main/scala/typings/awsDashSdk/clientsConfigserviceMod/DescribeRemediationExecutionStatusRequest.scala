package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRemediationExecutionStatusRequest extends js.Object {
  /**
    * A list of AWS Config rule names.
    */
  var ConfigRuleName: typings.awsDashSdk.clientsConfigserviceMod.ConfigRuleName = js.native
  /**
    * The maximum number of RemediationExecutionStatuses returned on each page. The default is maximum. If you specify 0, AWS Config uses the default. 
    */
  var Limit: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.Limit] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * A list of resource keys to be processed with the current request. Each element in the list consists of the resource type and resource ID. 
    */
  var ResourceKeys: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ResourceKeys] = js.native
}

object DescribeRemediationExecutionStatusRequest {
  @scala.inline
  def apply(
    ConfigRuleName: ConfigRuleName,
    Limit: Int | Double = null,
    NextToken: String = null,
    ResourceKeys: ResourceKeys = null
  ): DescribeRemediationExecutionStatusRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ResourceKeys != null) __obj.updateDynamic("ResourceKeys")(ResourceKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRemediationExecutionStatusRequest]
  }
}

