package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentSummary extends js.Object {
  /**
    * Time the deployment completed.
    */
  var CompletedAt: js.UndefOr[Iso8601DateTime] = js.native
  /**
    * The name of the configuration.
    */
  var ConfigurationName: js.UndefOr[Name] = js.native
  /**
    * The version of the configuration.
    */
  var ConfigurationVersion: js.UndefOr[Version] = js.native
  /**
    * Total amount of time the deployment lasted.
    */
  var DeploymentDurationInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.native
  /**
    * The sequence number of the deployment.
    */
  var DeploymentNumber: js.UndefOr[Integer] = js.native
  /**
    * The amount of time AppConfig monitors for alarms before considering the deployment to be complete and no longer eligible for automatic roll back.
    */
  var FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.native
  /**
    * The percentage of targets to receive a deployed configuration during each interval.
    */
  var GrowthFactor: js.UndefOr[Percentage] = js.native
  /**
    * The algorithm used to define how percentage grows over time.
    */
  var GrowthType: js.UndefOr[typings.awsSdk.appconfigMod.GrowthType] = js.native
  /**
    * The percentage of targets for which the deployment is available.
    */
  var PercentageComplete: js.UndefOr[Percentage] = js.native
  /**
    * Time the deployment started.
    */
  var StartedAt: js.UndefOr[Iso8601DateTime] = js.native
  /**
    * The state of the deployment.
    */
  var State: js.UndefOr[DeploymentState] = js.native
}

object DeploymentSummary {
  @scala.inline
  def apply(
    CompletedAt: Iso8601DateTime = null,
    ConfigurationName: Name = null,
    ConfigurationVersion: Version = null,
    DeploymentDurationInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.undefined,
    DeploymentNumber: js.UndefOr[Integer] = js.undefined,
    FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.undefined,
    GrowthFactor: js.UndefOr[Percentage] = js.undefined,
    GrowthType: GrowthType = null,
    PercentageComplete: js.UndefOr[Percentage] = js.undefined,
    StartedAt: Iso8601DateTime = null,
    State: DeploymentState = null
  ): DeploymentSummary = {
    val __obj = js.Dynamic.literal()
    if (CompletedAt != null) __obj.updateDynamic("CompletedAt")(CompletedAt.asInstanceOf[js.Any])
    if (ConfigurationName != null) __obj.updateDynamic("ConfigurationName")(ConfigurationName.asInstanceOf[js.Any])
    if (ConfigurationVersion != null) __obj.updateDynamic("ConfigurationVersion")(ConfigurationVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(DeploymentDurationInMinutes)) __obj.updateDynamic("DeploymentDurationInMinutes")(DeploymentDurationInMinutes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DeploymentNumber)) __obj.updateDynamic("DeploymentNumber")(DeploymentNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FinalBakeTimeInMinutes)) __obj.updateDynamic("FinalBakeTimeInMinutes")(FinalBakeTimeInMinutes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(GrowthFactor)) __obj.updateDynamic("GrowthFactor")(GrowthFactor.get.asInstanceOf[js.Any])
    if (GrowthType != null) __obj.updateDynamic("GrowthType")(GrowthType.asInstanceOf[js.Any])
    if (!js.isUndefined(PercentageComplete)) __obj.updateDynamic("PercentageComplete")(PercentageComplete.get.asInstanceOf[js.Any])
    if (StartedAt != null) __obj.updateDynamic("StartedAt")(StartedAt.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentSummary]
  }
}

