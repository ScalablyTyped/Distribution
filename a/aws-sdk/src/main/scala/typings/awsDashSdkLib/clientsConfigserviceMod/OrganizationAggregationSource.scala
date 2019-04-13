package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationAggregationSource extends js.Object {
  /**
    * If true, aggregate existing AWS Config regions and future regions.
    */
  var AllAwsRegions: js.UndefOr[Boolean] = js.undefined
  /**
    * The source regions being aggregated.
    */
  var AwsRegions: js.UndefOr[AggregatorRegionList] = js.undefined
  /**
    * ARN of the IAM role used to retreive AWS Organization details associated with the aggregator account.
    */
  var RoleArn: String
}

object OrganizationAggregationSource {
  @scala.inline
  def apply(
    RoleArn: String,
    AllAwsRegions: js.UndefOr[Boolean] = js.undefined,
    AwsRegions: AggregatorRegionList = null
  ): OrganizationAggregationSource = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn)
    if (!js.isUndefined(AllAwsRegions)) __obj.updateDynamic("AllAwsRegions")(AllAwsRegions)
    if (AwsRegions != null) __obj.updateDynamic("AwsRegions")(AwsRegions)
    __obj.asInstanceOf[OrganizationAggregationSource]
  }
}

