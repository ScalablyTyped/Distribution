package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDeploymentStrategyRequest extends js.Object {
  /**
    * Total amount of time for a deployment to last.
    */
  var DeploymentDurationInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.native
  /**
    * The deployment strategy ID.
    */
  var DeploymentStrategyId: typings.awsSdk.appconfigMod.DeploymentStrategyId = js.native
  /**
    * A description of the deployment strategy.
    */
  var Description: js.UndefOr[typings.awsSdk.appconfigMod.Description] = js.native
  /**
    * The amount of time AppConfig monitors for alarms before considering the deployment to be complete and no longer eligible for automatic roll back.
    */
  var FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.native
  /**
    * The percentage of targets to receive a deployed configuration during each interval.
    */
  var GrowthFactor: js.UndefOr[typings.awsSdk.appconfigMod.GrowthFactor] = js.native
  /**
    * The algorithm used to define how percentage grows over time. AWS AppConfig supports the following growth types:  Linear: For this type, AppConfig processes the deployment by increments of the growth factor evenly distributed over the deployment time. For example, a linear deployment that uses a growth factor of 20 initially makes the configuration available to 20 percent of the targets. After 1/5th of the deployment time has passed, the system updates the percentage to 40 percent. This continues until 100% of the targets are set to receive the deployed configuration.  Exponential: For this type, AppConfig processes the deployment exponentially using the following formula: G*(2^N). In this formula, G is the growth factor specified by the user and N is the number of steps until the configuration is deployed to all targets. For example, if you specify a growth factor of 2, then the system rolls out the configuration as follows:  2*(2^0)   2*(2^1)   2*(2^2)  Expressed numerically, the deployment rolls out as follows: 2% of the targets, 4% of the targets, 8% of the targets, and continues until the configuration has been deployed to all targets.
    */
  var GrowthType: js.UndefOr[typings.awsSdk.appconfigMod.GrowthType] = js.native
}

object UpdateDeploymentStrategyRequest {
  @scala.inline
  def apply(
    DeploymentStrategyId: DeploymentStrategyId,
    DeploymentDurationInMinutes: Int | Double = null,
    Description: Description = null,
    FinalBakeTimeInMinutes: Int | Double = null,
    GrowthFactor: Int | Double = null,
    GrowthType: GrowthType = null
  ): UpdateDeploymentStrategyRequest = {
    val __obj = js.Dynamic.literal(DeploymentStrategyId = DeploymentStrategyId.asInstanceOf[js.Any])
    if (DeploymentDurationInMinutes != null) __obj.updateDynamic("DeploymentDurationInMinutes")(DeploymentDurationInMinutes.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (FinalBakeTimeInMinutes != null) __obj.updateDynamic("FinalBakeTimeInMinutes")(FinalBakeTimeInMinutes.asInstanceOf[js.Any])
    if (GrowthFactor != null) __obj.updateDynamic("GrowthFactor")(GrowthFactor.asInstanceOf[js.Any])
    if (GrowthType != null) __obj.updateDynamic("GrowthType")(GrowthType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeploymentStrategyRequest]
  }
}

