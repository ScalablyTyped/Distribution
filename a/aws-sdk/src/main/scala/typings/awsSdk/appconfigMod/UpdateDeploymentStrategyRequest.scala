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
  def apply(DeploymentStrategyId: DeploymentStrategyId): UpdateDeploymentStrategyRequest = {
    val __obj = js.Dynamic.literal(DeploymentStrategyId = DeploymentStrategyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeploymentStrategyRequest]
  }
  @scala.inline
  implicit class UpdateDeploymentStrategyRequestOps[Self <: UpdateDeploymentStrategyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeploymentStrategyId(value: DeploymentStrategyId): Self = this.set("DeploymentStrategyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeploymentDurationInMinutes(value: MinutesBetween0And24Hours): Self = this.set("DeploymentDurationInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentDurationInMinutes: Self = this.set("DeploymentDurationInMinutes", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setFinalBakeTimeInMinutes(value: MinutesBetween0And24Hours): Self = this.set("FinalBakeTimeInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalBakeTimeInMinutes: Self = this.set("FinalBakeTimeInMinutes", js.undefined)
    @scala.inline
    def setGrowthFactor(value: GrowthFactor): Self = this.set("GrowthFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrowthFactor: Self = this.set("GrowthFactor", js.undefined)
    @scala.inline
    def setGrowthType(value: GrowthType): Self = this.set("GrowthType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrowthType: Self = this.set("GrowthType", js.undefined)
  }
  
}

