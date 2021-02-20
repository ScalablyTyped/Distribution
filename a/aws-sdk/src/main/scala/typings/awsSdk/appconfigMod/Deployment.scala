package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deployment extends StObject {
  
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
  implicit class DeploymentMutableBuilder[Self <: Deployment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    @scala.inline
    def setCompletedAt(value: Iso8601DateTime): Self = StObject.set(x, "CompletedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedAtUndefined: Self = StObject.set(x, "CompletedAt", js.undefined)
    
    @scala.inline
    def setConfigurationLocationUri(value: Uri): Self = StObject.set(x, "ConfigurationLocationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationLocationUriUndefined: Self = StObject.set(x, "ConfigurationLocationUri", js.undefined)
    
    @scala.inline
    def setConfigurationName(value: Name): Self = StObject.set(x, "ConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationNameUndefined: Self = StObject.set(x, "ConfigurationName", js.undefined)
    
    @scala.inline
    def setConfigurationProfileId(value: Id): Self = StObject.set(x, "ConfigurationProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationProfileIdUndefined: Self = StObject.set(x, "ConfigurationProfileId", js.undefined)
    
    @scala.inline
    def setConfigurationVersion(value: Version): Self = StObject.set(x, "ConfigurationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationVersionUndefined: Self = StObject.set(x, "ConfigurationVersion", js.undefined)
    
    @scala.inline
    def setDeploymentDurationInMinutes(value: MinutesBetween0And24Hours): Self = StObject.set(x, "DeploymentDurationInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentDurationInMinutesUndefined: Self = StObject.set(x, "DeploymentDurationInMinutes", js.undefined)
    
    @scala.inline
    def setDeploymentNumber(value: Integer): Self = StObject.set(x, "DeploymentNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentNumberUndefined: Self = StObject.set(x, "DeploymentNumber", js.undefined)
    
    @scala.inline
    def setDeploymentStrategyId(value: Id): Self = StObject.set(x, "DeploymentStrategyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentStrategyIdUndefined: Self = StObject.set(x, "DeploymentStrategyId", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEnvironmentId(value: Id): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentIdUndefined: Self = StObject.set(x, "EnvironmentId", js.undefined)
    
    @scala.inline
    def setEventLog(value: DeploymentEvents): Self = StObject.set(x, "EventLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventLogUndefined: Self = StObject.set(x, "EventLog", js.undefined)
    
    @scala.inline
    def setEventLogVarargs(value: DeploymentEvent*): Self = StObject.set(x, "EventLog", js.Array(value :_*))
    
    @scala.inline
    def setFinalBakeTimeInMinutes(value: MinutesBetween0And24Hours): Self = StObject.set(x, "FinalBakeTimeInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalBakeTimeInMinutesUndefined: Self = StObject.set(x, "FinalBakeTimeInMinutes", js.undefined)
    
    @scala.inline
    def setGrowthFactor(value: Percentage): Self = StObject.set(x, "GrowthFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrowthFactorUndefined: Self = StObject.set(x, "GrowthFactor", js.undefined)
    
    @scala.inline
    def setGrowthType(value: GrowthType): Self = StObject.set(x, "GrowthType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrowthTypeUndefined: Self = StObject.set(x, "GrowthType", js.undefined)
    
    @scala.inline
    def setPercentageComplete(value: Percentage): Self = StObject.set(x, "PercentageComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentageCompleteUndefined: Self = StObject.set(x, "PercentageComplete", js.undefined)
    
    @scala.inline
    def setStartedAt(value: Iso8601DateTime): Self = StObject.set(x, "StartedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedAtUndefined: Self = StObject.set(x, "StartedAt", js.undefined)
    
    @scala.inline
    def setState(value: DeploymentState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
