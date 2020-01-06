package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRemediationExceptionsRequest extends js.Object {
  /**
    * The name of the AWS Config rule.
    */
  var ConfigRuleName: typings.awsDashSdk.clientsConfigserviceMod.ConfigRuleName = js.native
  /**
    * The maximum number of RemediationExceptionResourceKey returned on each page. The default is 25. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.Limit] = js.native
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * An exception list of resource exception keys to be processed with the current request. AWS Config adds exception for each resource key. For example, AWS Config adds 3 exceptions for 3 resource keys. 
    */
  var ResourceKeys: js.UndefOr[RemediationExceptionResourceKeys] = js.native
}

object DescribeRemediationExceptionsRequest {
  @scala.inline
  def apply(
    ConfigRuleName: ConfigRuleName,
    Limit: Int | Double = null,
    NextToken: String = null,
    ResourceKeys: RemediationExceptionResourceKeys = null
  ): DescribeRemediationExceptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ResourceKeys != null) __obj.updateDynamic("ResourceKeys")(ResourceKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRemediationExceptionsRequest]
  }
}

