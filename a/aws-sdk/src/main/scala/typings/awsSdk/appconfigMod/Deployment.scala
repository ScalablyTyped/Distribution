package typings.awsSdk.appconfigMod

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
  var Description: js.UndefOr[typings.awsSdk.appconfigMod.Description] = js.native
  /**
    * The ID of the environment that was deployed.
    */
  var EnvironmentId: js.UndefOr[Id] = js.native
  /**
    * A list containing all events related to a deployment. The most recent events are displayed first.
    */
  var EventLog: js.UndefOr[DeploymentEvents] = js.native
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
  var GrowthType: js.UndefOr[typings.awsSdk.appconfigMod.GrowthType] = js.native
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
  def apply(): Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployment]
  }
  @scala.inline
  implicit class DeploymentOps[Self <: Deployment] (val x: Self) extends AnyVal {
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
    def setApplicationId(value: Id): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationId: Self = this.set("ApplicationId", js.undefined)
    @scala.inline
    def setCompletedAt(value: Iso8601DateTime): Self = this.set("CompletedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletedAt: Self = this.set("CompletedAt", js.undefined)
    @scala.inline
    def setConfigurationLocationUri(value: Uri): Self = this.set("ConfigurationLocationUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationLocationUri: Self = this.set("ConfigurationLocationUri", js.undefined)
    @scala.inline
    def setConfigurationName(value: Name): Self = this.set("ConfigurationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationName: Self = this.set("ConfigurationName", js.undefined)
    @scala.inline
    def setConfigurationProfileId(value: Id): Self = this.set("ConfigurationProfileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationProfileId: Self = this.set("ConfigurationProfileId", js.undefined)
    @scala.inline
    def setConfigurationVersion(value: Version): Self = this.set("ConfigurationVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationVersion: Self = this.set("ConfigurationVersion", js.undefined)
    @scala.inline
    def setDeploymentDurationInMinutes(value: MinutesBetween0And24Hours): Self = this.set("DeploymentDurationInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentDurationInMinutes: Self = this.set("DeploymentDurationInMinutes", js.undefined)
    @scala.inline
    def setDeploymentNumber(value: Integer): Self = this.set("DeploymentNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentNumber: Self = this.set("DeploymentNumber", js.undefined)
    @scala.inline
    def setDeploymentStrategyId(value: Id): Self = this.set("DeploymentStrategyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentStrategyId: Self = this.set("DeploymentStrategyId", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setEnvironmentId(value: Id): Self = this.set("EnvironmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentId: Self = this.set("EnvironmentId", js.undefined)
    @scala.inline
    def setEventLogVarargs(value: DeploymentEvent*): Self = this.set("EventLog", js.Array(value :_*))
    @scala.inline
    def setEventLog(value: DeploymentEvents): Self = this.set("EventLog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventLog: Self = this.set("EventLog", js.undefined)
    @scala.inline
    def setFinalBakeTimeInMinutes(value: MinutesBetween0And24Hours): Self = this.set("FinalBakeTimeInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalBakeTimeInMinutes: Self = this.set("FinalBakeTimeInMinutes", js.undefined)
    @scala.inline
    def setGrowthFactor(value: Percentage): Self = this.set("GrowthFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrowthFactor: Self = this.set("GrowthFactor", js.undefined)
    @scala.inline
    def setGrowthType(value: GrowthType): Self = this.set("GrowthType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrowthType: Self = this.set("GrowthType", js.undefined)
    @scala.inline
    def setPercentageComplete(value: Percentage): Self = this.set("PercentageComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentageComplete: Self = this.set("PercentageComplete", js.undefined)
    @scala.inline
    def setStartedAt(value: Iso8601DateTime): Self = this.set("StartedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartedAt: Self = this.set("StartedAt", js.undefined)
    @scala.inline
    def setState(value: DeploymentState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
  
}

