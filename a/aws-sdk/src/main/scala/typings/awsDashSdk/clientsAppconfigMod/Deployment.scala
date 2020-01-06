package typings.awsDashSdk.clientsAppconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deployment extends js.Object {
  /**
    * The ID of the application that was deployed.
    */
  var ApplicationId: js.UndefOr[Id] = js.native
  /**
    * The time the deployment completed. 
    */
  var CompletedAt: js.UndefOr[Iso8601DateTime] = js.native
  /**
    * Information about the source location of the configuration.
    */
  var ConfigurationLocationUri: js.UndefOr[Uri] = js.native
  /**
    * The name of the configuration.
    */
  var ConfigurationName: js.UndefOr[Name] = js.native
  /**
    * The ID of the configuration profile that was deployed.
    */
  var ConfigurationProfileId: js.UndefOr[Id] = js.native
  /**
    * The configuration version that was deployed.
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
    * The ID of the deployment strategy that was deployed.
    */
  var DeploymentStrategyId: js.UndefOr[Id] = js.native
  /**
    * The description of the deployment.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsAppconfigMod.Description] = js.native
  /**
    * The ID of the environment that was deployed.
    */
  var EnvironmentId: js.UndefOr[Id] = js.native
  /**
    * The amount of time AppConfig monitored for alarms before considering the deployment to be complete and no longer eligible for automatic roll back.
    */
  var FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.native
  /**
    * The percentage of targets to receive a deployed configuration during each interval.
    */
  var GrowthFactor: js.UndefOr[Percentage] = js.native
  /**
    * The algorithm used to define how percentage grew over time.
    */
  var GrowthType: js.UndefOr[typings.awsDashSdk.clientsAppconfigMod.GrowthType] = js.native
  /**
    * The percentage of targets for which the deployment is available.
    */
  var PercentageComplete: js.UndefOr[Percentage] = js.native
  /**
    * The time the deployment started.
    */
  var StartedAt: js.UndefOr[Iso8601DateTime] = js.native
  /**
    * The state of the deployment.
    */
  var State: js.UndefOr[DeploymentState] = js.native
}

object Deployment {
  @scala.inline
  def apply(
    ApplicationId: Id = null,
    CompletedAt: Iso8601DateTime = null,
    ConfigurationLocationUri: Uri = null,
    ConfigurationName: Name = null,
    ConfigurationProfileId: Id = null,
    ConfigurationVersion: Version = null,
    DeploymentDurationInMinutes: Int | Double = null,
    DeploymentNumber: Int | Double = null,
    DeploymentStrategyId: Id = null,
    Description: Description = null,
    EnvironmentId: Id = null,
    FinalBakeTimeInMinutes: Int | Double = null,
    GrowthFactor: Int | Double = null,
    GrowthType: GrowthType = null,
    PercentageComplete: Int | Double = null,
    StartedAt: Iso8601DateTime = null,
    State: DeploymentState = null
  ): Deployment = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (CompletedAt != null) __obj.updateDynamic("CompletedAt")(CompletedAt.asInstanceOf[js.Any])
    if (ConfigurationLocationUri != null) __obj.updateDynamic("ConfigurationLocationUri")(ConfigurationLocationUri.asInstanceOf[js.Any])
    if (ConfigurationName != null) __obj.updateDynamic("ConfigurationName")(ConfigurationName.asInstanceOf[js.Any])
    if (ConfigurationProfileId != null) __obj.updateDynamic("ConfigurationProfileId")(ConfigurationProfileId.asInstanceOf[js.Any])
    if (ConfigurationVersion != null) __obj.updateDynamic("ConfigurationVersion")(ConfigurationVersion.asInstanceOf[js.Any])
    if (DeploymentDurationInMinutes != null) __obj.updateDynamic("DeploymentDurationInMinutes")(DeploymentDurationInMinutes.asInstanceOf[js.Any])
    if (DeploymentNumber != null) __obj.updateDynamic("DeploymentNumber")(DeploymentNumber.asInstanceOf[js.Any])
    if (DeploymentStrategyId != null) __obj.updateDynamic("DeploymentStrategyId")(DeploymentStrategyId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (EnvironmentId != null) __obj.updateDynamic("EnvironmentId")(EnvironmentId.asInstanceOf[js.Any])
    if (FinalBakeTimeInMinutes != null) __obj.updateDynamic("FinalBakeTimeInMinutes")(FinalBakeTimeInMinutes.asInstanceOf[js.Any])
    if (GrowthFactor != null) __obj.updateDynamic("GrowthFactor")(GrowthFactor.asInstanceOf[js.Any])
    if (GrowthType != null) __obj.updateDynamic("GrowthType")(GrowthType.asInstanceOf[js.Any])
    if (PercentageComplete != null) __obj.updateDynamic("PercentageComplete")(PercentageComplete.asInstanceOf[js.Any])
    if (StartedAt != null) __obj.updateDynamic("StartedAt")(StartedAt.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deployment]
  }
}

