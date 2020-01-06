package typings.awsDashSdk.clientsComputeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingGroupRecommendation extends js.Object {
  /**
    * The AWS account ID of the Auto Scaling group.
    */
  var accountId: js.UndefOr[AccountId] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Auto Scaling group.
    */
  var autoScalingGroupArn: js.UndefOr[AutoScalingGroupArn] = js.native
  /**
    * The name of the Auto Scaling group.
    */
  var autoScalingGroupName: js.UndefOr[AutoScalingGroupName] = js.native
  /**
    * An array of objects that describe the current configuration of the Auto Scaling group.
    */
  var currentConfiguration: js.UndefOr[AutoScalingGroupConfiguration] = js.native
  /**
    * The finding classification for the Auto Scaling group. Findings for Auto Scaling groups include:     NotOptimized —An Auto Scaling group is considered not optimized when AWS Compute Optimizer identifies a recommendation that can provide better performance for your workload.     Optimized —An Auto Scaling group is considered optimized when Compute Optimizer determines that the group is correctly provisioned to run your workload based on the chosen instance type. For optimized resources, Compute Optimizer might recommend a new generation instance type.    The values that are returned might be NOT_OPTIMIZED or OPTIMIZED. 
    */
  var finding: js.UndefOr[Finding] = js.native
  /**
    * The time stamp of when the Auto Scaling group recommendation was last refreshed.
    */
  var lastRefreshTimestamp: js.UndefOr[LastRefreshTimestamp] = js.native
  /**
    * The number of days for which utilization metrics were analyzed for the Auto Scaling group.
    */
  var lookBackPeriodInDays: js.UndefOr[LookBackPeriodInDays] = js.native
  /**
    * An array of objects that describe the recommendation options for the Auto Scaling group.
    */
  var recommendationOptions: js.UndefOr[AutoScalingGroupRecommendationOptions] = js.native
  /**
    * An array of objects that describe the utilization metrics of the Auto Scaling group.
    */
  var utilizationMetrics: js.UndefOr[UtilizationMetrics] = js.native
}

object AutoScalingGroupRecommendation {
  @scala.inline
  def apply(
    accountId: AccountId = null,
    autoScalingGroupArn: AutoScalingGroupArn = null,
    autoScalingGroupName: AutoScalingGroupName = null,
    currentConfiguration: AutoScalingGroupConfiguration = null,
    finding: Finding = null,
    lastRefreshTimestamp: LastRefreshTimestamp = null,
    lookBackPeriodInDays: Int | Double = null,
    recommendationOptions: AutoScalingGroupRecommendationOptions = null,
    utilizationMetrics: UtilizationMetrics = null
  ): AutoScalingGroupRecommendation = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (autoScalingGroupArn != null) __obj.updateDynamic("autoScalingGroupArn")(autoScalingGroupArn.asInstanceOf[js.Any])
    if (autoScalingGroupName != null) __obj.updateDynamic("autoScalingGroupName")(autoScalingGroupName.asInstanceOf[js.Any])
    if (currentConfiguration != null) __obj.updateDynamic("currentConfiguration")(currentConfiguration.asInstanceOf[js.Any])
    if (finding != null) __obj.updateDynamic("finding")(finding.asInstanceOf[js.Any])
    if (lastRefreshTimestamp != null) __obj.updateDynamic("lastRefreshTimestamp")(lastRefreshTimestamp.asInstanceOf[js.Any])
    if (lookBackPeriodInDays != null) __obj.updateDynamic("lookBackPeriodInDays")(lookBackPeriodInDays.asInstanceOf[js.Any])
    if (recommendationOptions != null) __obj.updateDynamic("recommendationOptions")(recommendationOptions.asInstanceOf[js.Any])
    if (utilizationMetrics != null) __obj.updateDynamic("utilizationMetrics")(utilizationMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScalingGroupRecommendation]
  }
}

