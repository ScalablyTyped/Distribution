package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountAggregationSource extends js.Object {
  /**
    * The 12-digit account ID of the account being aggregated. 
    */
  var AccountIds: AccountAggregationSourceAccountList
  /**
    * If true, aggregate existing AWS Config regions and future regions.
    */
  var AllAwsRegions: js.UndefOr[Boolean] = js.undefined
  /**
    * The source regions being aggregated.
    */
  var AwsRegions: js.UndefOr[AggregatorRegionList] = js.undefined
}

object AccountAggregationSource {
  @scala.inline
  def apply(
    AccountIds: AccountAggregationSourceAccountList,
    AllAwsRegions: js.UndefOr[scala.Boolean] = js.undefined,
    AwsRegions: AggregatorRegionList = null
  ): AccountAggregationSource = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds)
    if (!js.isUndefined(AllAwsRegions)) __obj.updateDynamic("AllAwsRegions")(AllAwsRegions)
    if (AwsRegions != null) __obj.updateDynamic("AwsRegions")(AwsRegions)
    __obj.asInstanceOf[AccountAggregationSource]
  }
}

