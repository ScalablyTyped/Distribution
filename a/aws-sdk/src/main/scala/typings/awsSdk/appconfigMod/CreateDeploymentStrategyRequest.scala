package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentStrategyRequest extends js.Object {
  /**
    * Total amount of time for a deployment to last.
    */
  var DeploymentDurationInMinutes: MinutesBetween0And24Hours = js.native
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
  var GrowthFactor: typings.awsSdk.appconfigMod.GrowthFactor = js.native
  /**
    * The algorithm used to define how percentage grows over time. AWS AppConfig supports the following growth types:  Linear: For this type, AppConfig processes the deployment by dividing the total number of targets by the value specified for Step percentage. For example, a linear deployment that uses a Step percentage of 10 deploys the configuration to 10 percent of the hosts. After those deployments are complete, the system deploys the configuration to the next 10 percent. This continues until 100% of the targets have successfully received the configuration.  Exponential: For this type, AppConfig processes the deployment exponentially using the following formula: G*(2^N). In this formula, G is the growth factor specified by the user and N is the number of steps until the configuration is deployed to all targets. For example, if you specify a growth factor of 2, then the system rolls out the configuration as follows:  2*(2^0)   2*(2^1)   2*(2^2)  Expressed numerically, the deployment rolls out as follows: 2% of the targets, 4% of the targets, 8% of the targets, and continues until the configuration has been deployed to all targets.
    */
  var GrowthType: js.UndefOr[typings.awsSdk.appconfigMod.GrowthType] = js.native
  /**
    * A name for the deployment strategy.
    */
  var Name: typings.awsSdk.appconfigMod.Name = js.native
  /**
    * Save the deployment strategy to a Systems Manager (SSM) document.
    */
  var ReplicateTo: typings.awsSdk.appconfigMod.ReplicateTo = js.native
  /**
    * Metadata to assign to the deployment strategy. Tags help organize and categorize your AppConfig resources. Each tag consists of a key and an optional value, both of which you define.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object CreateDeploymentStrategyRequest {
  @scala.inline
  def apply(
    DeploymentDurationInMinutes: MinutesBetween0And24Hours,
    GrowthFactor: GrowthFactor,
    Name: Name,
    ReplicateTo: ReplicateTo
  ): CreateDeploymentStrategyRequest = {
    val __obj = js.Dynamic.literal(DeploymentDurationInMinutes = DeploymentDurationInMinutes.asInstanceOf[js.Any], GrowthFactor = GrowthFactor.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReplicateTo = ReplicateTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentStrategyRequest]
  }
  @scala.inline
  implicit class CreateDeploymentStrategyRequestOps[Self <: CreateDeploymentStrategyRequest] (val x: Self) extends AnyVal {
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
    def setDeploymentDurationInMinutes(value: MinutesBetween0And24Hours): Self = this.set("DeploymentDurationInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrowthFactor(value: GrowthFactor): Self = this.set("GrowthFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplicateTo(value: ReplicateTo): Self = this.set("ReplicateTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setFinalBakeTimeInMinutes(value: MinutesBetween0And24Hours): Self = this.set("FinalBakeTimeInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalBakeTimeInMinutes: Self = this.set("FinalBakeTimeInMinutes", js.undefined)
    @scala.inline
    def setGrowthType(value: GrowthType): Self = this.set("GrowthType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrowthType: Self = this.set("GrowthType", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

