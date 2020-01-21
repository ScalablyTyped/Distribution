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
    * The algorithm used to define how percentage grows over time.
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

