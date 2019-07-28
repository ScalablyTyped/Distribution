package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAggregateComplianceDetailsByConfigRuleRequest extends js.Object {
  /**
    * The 12-digit account ID of the source account.
    */
  var AccountId: typings.awsDashSdk.clientsConfigserviceMod.AccountId
  /**
    * The source region from where the data is aggregated.
    */
  var AwsRegion: typings.awsDashSdk.clientsConfigserviceMod.AwsRegion
  /**
    * The resource compliance status.  For the GetAggregateComplianceDetailsByConfigRuleRequest data type, AWS Config supports only the COMPLIANT and NON_COMPLIANT. AWS Config does not support the NOT_APPLICABLE and INSUFFICIENT_DATA values. 
    */
  var ComplianceType: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ComplianceType] = js.undefined
  /**
    * The name of the AWS Config rule for which you want compliance information.
    */
  var ConfigRuleName: typings.awsDashSdk.clientsConfigserviceMod.ConfigRuleName
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typings.awsDashSdk.clientsConfigserviceMod.ConfigurationAggregatorName
  /**
    * The maximum number of evaluation results returned on each page. The default is 50. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.Limit] = js.undefined
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.NextToken] = js.undefined
}

object GetAggregateComplianceDetailsByConfigRuleRequest {
  @scala.inline
  def apply(
    AccountId: AccountId,
    AwsRegion: AwsRegion,
    ConfigRuleName: ConfigRuleName,
    ConfigurationAggregatorName: ConfigurationAggregatorName,
    ComplianceType: ComplianceType = null,
    Limit: js.UndefOr[Limit] = js.undefined,
    NextToken: NextToken = null
  ): GetAggregateComplianceDetailsByConfigRuleRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, AwsRegion = AwsRegion, ConfigRuleName = ConfigRuleName, ConfigurationAggregatorName = ConfigurationAggregatorName)
    if (ComplianceType != null) __obj.updateDynamic("ComplianceType")(ComplianceType.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetAggregateComplianceDetailsByConfigRuleRequest]
  }
}

