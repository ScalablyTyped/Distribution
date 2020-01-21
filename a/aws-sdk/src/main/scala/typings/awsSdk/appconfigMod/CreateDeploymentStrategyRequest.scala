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
    * The algorithm used to define how percentage grows over time.
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
    ReplicateTo: ReplicateTo,
    Description: Description = null,
    FinalBakeTimeInMinutes: Int | Double = null,
    GrowthType: GrowthType = null,
    Tags: TagMap = null
  ): CreateDeploymentStrategyRequest = {
    val __obj = js.Dynamic.literal(DeploymentDurationInMinutes = DeploymentDurationInMinutes.asInstanceOf[js.Any], GrowthFactor = GrowthFactor.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReplicateTo = ReplicateTo.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (FinalBakeTimeInMinutes != null) __obj.updateDynamic("FinalBakeTimeInMinutes")(FinalBakeTimeInMinutes.asInstanceOf[js.Any])
    if (GrowthType != null) __obj.updateDynamic("GrowthType")(GrowthType.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentStrategyRequest]
  }
}

